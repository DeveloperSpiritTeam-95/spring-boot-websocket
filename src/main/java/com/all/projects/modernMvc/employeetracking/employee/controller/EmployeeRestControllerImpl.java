package com.all.projects.modernMvc.employeetracking.employee.controller;

import com.all.projects.configuration.ResponseWithError;
import com.all.projects.modernMvc.employeetracking.employee.model.Employee;
import com.all.projects.modernMvc.employeetracking.employee.service.EmployeeService;
import com.all.projects.modernMvc.employeetracking.employee.wrappers.EmployeeDto;
import com.all.projects.modernMvc.employeetracking.util.AllPageResponse;
import com.all.projects.modernMvc.employeetracking.util.PageRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRestControllerImpl implements EmployeeRestController {

    @Autowired
    private EmployeeService service;

    @Override
    public ResponseWithError<String> createEmployee(EmployeeDto employeeDto) {
        return service.createEmployee(employeeDto);
    }

    @Override
    public ResponseWithError<String> updateEmployee(EmployeeDto employeeDto) {
        return this.service.updateEmployee(employeeDto);
    }

    @Override
    public ResponseWithError<Employee> getEmployeeById(String employeeId) {
        return this.service.getEmployeeById(employeeId);
    }

    @Override
    public ResponseWithError<Employee> getEmployeeByEmpCode(String empCode) {
        return this.service.getEmployeeByEmpCode(empCode);
    }

    @Override
    public ResponseWithError<List<Employee>> getAllEmployees() {
        return this.service.getAllEmployees();
    }

    @Override
    public ResponseWithError<String> deleteEmployee(String employeeId) {
        return this.service.deleteEmployee(employeeId);
    }

    @Override
    public ResponseWithError<AllPageResponse> findBySearchString(PageRequestDto pageRequestDto) {
        return this.service.findByPagination(pageRequestDto);
    }

}
