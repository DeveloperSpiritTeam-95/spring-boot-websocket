package com.all.projects.modernMvc.employeetracking.fuctions;

import com.all.projects.modernMvc.employeetracking.employee.model.Employee;
import com.all.projects.modernMvc.employeetracking.employee.repository.EmployeeRepository;
import com.all.projects.modernMvc.employeetracking.employee.wrappers.EmployeeDto;
import com.all.projects.modernMvc.employeetracking.util.AllPageResponse;
import com.all.projects.modernMvc.employeetracking.util.PageRequestDto;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class EmployeeUseTo {

    private static EmployeeRepository employeeRepository;

    public EmployeeUseTo(EmployeeRepository repository){
        employeeRepository = repository;
    }



    // get employee by id
    public static Employee getEmployeeById(String employeeId){
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        return employee.orElseGet(Employee::new);
    }


    // get employee by code
    public static Employee getEmployeeByCode(String empCode){
        Optional<Employee> employee = employeeRepository.findByEmpCode(empCode);
        return employee.orElseGet(Employee::new);
    }

    // get all employees
    public static @NotNull List<Employee> getAllEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        if (employees.isEmpty())
            return new ArrayList<>();
        else
            return employees;
    }


    // delete employee
    public static boolean deleteEmployee(String employeeId){
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()) {
            employeeRepository.delete(employee.get());
            return true;
        }
        else
            return false;
    }


    // update employee
    public static @NotNull Employee updateEmployee(@NotNull EmployeeDto employeeDto){
        Optional<Employee> employee = employeeRepository.findById(employeeDto.getEmployeeId());
        if (employee.isPresent()){
            employee.get().setEmployeeId(employeeDto.getEmployeeId());
            employee.get().setEmpCode(employeeDto.getEmpCode());
            employee.get().setFirstName(employeeDto.getFirstName());
            employee.get().setLastName(employeeDto.getLastName());
            employee.get().setFatherName(employeeDto.getFatherName());
            employee.get().setDateOfBirth(employeeDto.getDateOfBirth());
            employee.get().setDateOfJoining(employeeDto.getDateOfJoining());
            employee.get().setEmailId(employeeDto.getEmailId());
            employee.get().setCompanyEmailId(employeeDto.getCompanyEmailId());
            employee.get().setPhoneNumber(employeeDto.getPhoneNumber());
            employee.get().setAlternativeNumber(employeeDto.getAlternativeNumber());
            employee.get().setPosition(employeeDto.getPosition());
            employee.get().setTeam(employeeDto.getTeam());
            employee.get().setAadhaarNumber(employeeDto.getAadhaarNumber());
            employee.get().setPanCard(employeeDto.getPanCard());
            employee.get().setStatus(employeeDto.getStatus());
            employee.get().setCreatePassword(employeeDto.getCreatePassword());
            employee.get().setConfirmPassword(employeeDto.getConfirmPassword());
            employee.get().setSalary(employeeDto.getSalary());
            employee.get().setAddress(employeeDto.getAddress());
            employee.get().setMakeAsAdmin(employeeDto.isMakeAsAdmin());
            return employee.get();
        }
        return new Employee();
    }


    // create employee
    public static @NotNull Employee createEmployee(@NotNull EmployeeDto employeeDto) {
            Employee employee = new Employee();
            employee.setEmployeeId(UUID.randomUUID().toString());
            employee.setEmpCode(employeeDto.getEmpCode());
            employee.setFirstName(employeeDto.getFirstName());
            employee.setLastName(employeeDto.getLastName());
            employee.setFatherName(employeeDto.getFatherName());
            employee.setDateOfBirth(employeeDto.getDateOfBirth());
            employee.setDateOfJoining(employeeDto.getDateOfJoining());
            employee.setEmailId(employeeDto.getEmailId());
            employee.setCompanyEmailId(employeeDto.getCompanyEmailId());
            employee.setPhoneNumber(employeeDto.getPhoneNumber());
            employee.setAlternativeNumber(employeeDto.getAlternativeNumber());
            employee.setPosition(employeeDto.getPosition());
            employee.setTeam(employeeDto.getTeam());
            employee.setAadhaarNumber(employeeDto.getAadhaarNumber());
            employee.setPanCard(employeeDto.getPanCard());
            employee.setStatus(employeeDto.getStatus());
            employee.setCreatePassword(employeeDto.getCreatePassword());
            employee.setConfirmPassword(employeeDto.getConfirmPassword());
            employee.setSalary(employeeDto.getSalary());
            employee.setAddress(employeeDto.getAddress());
            employee.setMakeAsAdmin(false);
            return employee;
    }



    // pagination employee
    @Contract("_ -> new")
    public static @NotNull AllPageResponse findByPagination(@NotNull PageRequestDto pageRequestDto){
        Page<Employee> result;

        PageRequest pageRequest = PageRequest.of(pageRequestDto.getPage(), pageRequestDto.getSize(),
                Sort.by("empCode").ascending());

        

        if (pageRequestDto.getSearch() != null && !pageRequestDto.getSearch().isEmpty()){
            result = employeeRepository.findBySearchString(pageRequestDto.getSearch(), pageRequest);
        }else {
            result = employeeRepository.findAll(pageRequest);
        }

        if (result != null && !result.getContent().isEmpty()){
            List<Employee> records = result.getContent();
            return new AllPageResponse(result.getTotalElements(),records);
        }else
            return new AllPageResponse();

    }

    public static boolean phoneNumberExist(String number){
        Optional<Employee> phoneNumberExist = employeeRepository.findByPhoneNumber(number);
        return phoneNumberExist.isPresent();
    }

    public static boolean employeeCodeExist(String empCode){
        Optional<Employee> employeeExist = employeeRepository.findByEmpCode(empCode);
        return employeeExist.isPresent();
    }


    public static boolean personalEmailExist(String email){
        Optional<Employee> emailExist = employeeRepository.findByEmailId(email);
        return emailExist.isPresent();
    }

    public static boolean professionalEmailExist(String companyEmail){
        Optional<Employee> companyEmailExist = employeeRepository.findByCompanyEmailId(companyEmail);
        return companyEmailExist.isPresent();
    }


}
