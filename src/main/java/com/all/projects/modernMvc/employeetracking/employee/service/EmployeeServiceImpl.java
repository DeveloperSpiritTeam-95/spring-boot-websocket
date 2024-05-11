package com.all.projects.modernMvc.employeetracking.employee.service;

import com.all.projects.configuration.ResponseWithError;
import com.all.projects.modernMvc.employeetracking.employee.model.Employee;
import com.all.projects.modernMvc.employeetracking.employee.repository.EmployeeRepository;
import com.all.projects.modernMvc.employeetracking.employee.wrappers.EmployeeDto;
import com.all.projects.modernMvc.employeetracking.fuctions.EmployeeUseTo;
import com.all.projects.modernMvc.employeetracking.fuctions.ValidateField;
import com.all.projects.modernMvc.employeetracking.util.AllPageResponse;
import com.all.projects.modernMvc.employeetracking.util.PageRequestDto;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    // employee creation
    @Override
    public ResponseWithError<String> createEmployee(@NotNull EmployeeDto employeeDto) {
        if (EmployeeUseTo.phoneNumberExist(employeeDto.getPhoneNumber()))
            return ResponseWithError.ofError("PhoneNumber already Exist",HttpStatus.BAD_REQUEST);

        if (EmployeeUseTo.personalEmailExist(employeeDto.getEmailId()) ||
                EmployeeUseTo.professionalEmailExist(employeeDto.getCompanyEmailId())){
            return ResponseWithError.ofError("Email Already Exist",HttpStatus.BAD_REQUEST);
        }else {
            if (EmployeeUseTo.employeeCodeExist(employeeDto.getEmpCode())) {
                return ResponseWithError.ofError("Employee Code Already Exist choose Different.", HttpStatus.BAD_REQUEST);
            } else {
                if (ValidateField.validateEmployeeDetails(employeeDto)) {
                    if (ValidateField.validateEmail(employeeDto.getEmailId()) && ValidateField.validateEmail(employeeDto.getCompanyEmailId())) {
                        if (ValidateField.validatePhoneNumber(employeeDto.getPhoneNumber())) {
                            if (ValidateField.validatePassword(employeeDto.getCreatePassword())) {

                                this.employeeRepository.save(EmployeeUseTo.createEmployee(employeeDto));
                                return ResponseWithError.of("Employee Created Success " + employeeDto.getEmpCode());

                            } else {
                                return ResponseWithError.ofError("Employee Password Doesn't match Pattern.", HttpStatus.BAD_REQUEST);
                            }
                        } else {
                            return ResponseWithError.ofError("Check Your PhoneNumber.", HttpStatus.BAD_REQUEST);
                        }
                    } else {
                        return ResponseWithError.ofError("Email Id Not Valid in Pattern.", HttpStatus.BAD_REQUEST);
                    }
                } else {
                    return ResponseWithError.ofError("Employee Details Doesn't In Proper Format.", HttpStatus.BAD_REQUEST);
                }
            }
        }
    }

    // update employee
    @Override
    public ResponseWithError<String> updateEmployee(EmployeeDto employeeDto) {
        if (ValidateField.validateEmployeeDetails(employeeDto)){
            if (ValidateField.validatePhoneNumber(employeeDto.getPhoneNumber())) {
                if (ValidateField.validatePassword(employeeDto.getCreatePassword())) {
                    this.employeeRepository.save(EmployeeUseTo.updateEmployee(employeeDto));
                    return ResponseWithError.of("Employee Update Success " + employeeDto.getEmpCode());
                }else {
                    return ResponseWithError.of("Employee Password Doesn't match Pattern.");
                }
            }else {
                return ResponseWithError.of("Check Your PhoneNumber.");
            }
        }else {
            return ResponseWithError.of("Employee Details Doesn't In Proper Format.");
        }
    }

    // get employee by id
    @Override
    public ResponseWithError<Employee> getEmployeeById(@NotNull String employeeId) {
        if (!employeeId.isEmpty()){
            return ResponseWithError.of(EmployeeUseTo.getEmployeeById(employeeId));
        }else
            return ResponseWithError.ofError("Employee Id Not Found.");
    }

    // get employee by emp code
    @Override
    public ResponseWithError<Employee> getEmployeeByEmpCode(@NotNull String empCode) {
        if (!empCode.isEmpty()){
            return ResponseWithError.of(EmployeeUseTo.getEmployeeByCode(empCode));
        }else
            return ResponseWithError.ofError("Employee Code Not Found.");
    }


    // get all employees
    @Override
    public ResponseWithError<List<Employee>> getAllEmployees() {
        List<Employee> employees = EmployeeUseTo.getAllEmployees();
        if (!employees.isEmpty())
            return ResponseWithError.of(employees);
        else
            return ResponseWithError.ofError("Employees Not Exist.");
    }

    // delete employee
    @Override
    public ResponseWithError<String> deleteEmployee(String employeeId) {
        if (EmployeeUseTo.deleteEmployee(employeeId))
            return ResponseWithError.of("Employee Deleted "+employeeId);
        else
            return ResponseWithError.ofError("Employee Not Found.");
    }

    @Override
    public ResponseWithError<AllPageResponse> findByPagination(PageRequestDto pageRequestDto) {
        return ResponseWithError.of(EmployeeUseTo.findByPagination(pageRequestDto));
    }
}
