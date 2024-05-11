package com.all.projects.modernMvc.employeetracking.employee.service;

import com.all.projects.configuration.ResponseWithError;
import com.all.projects.modernMvc.employeetracking.employee.model.Employee;
import com.all.projects.modernMvc.employeetracking.employee.wrappers.EmployeeDto;
import com.all.projects.modernMvc.employeetracking.util.AllPageResponse;
import com.all.projects.modernMvc.employeetracking.util.PageRequestDto;

import java.util.List;

public interface EmployeeService {

    ResponseWithError<String> createEmployee(EmployeeDto employeeDto);

    ResponseWithError<String> updateEmployee(EmployeeDto employeeDto);

    ResponseWithError<Employee> getEmployeeById(String employeeId);

    ResponseWithError<Employee> getEmployeeByEmpCode(String empCode);

    ResponseWithError<List<Employee>> getAllEmployees();

    ResponseWithError<String> deleteEmployee(String employeeId);

    ResponseWithError<AllPageResponse> findByPagination(PageRequestDto pageRequestDto);
}
