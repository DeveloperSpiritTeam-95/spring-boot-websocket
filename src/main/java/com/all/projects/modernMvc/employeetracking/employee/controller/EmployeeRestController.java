package com.all.projects.modernMvc.employeetracking.employee.controller;

import com.all.projects.configuration.ResponseWithError;
import com.all.projects.modernMvc.employeetracking.employee.model.Employee;
import com.all.projects.modernMvc.employeetracking.employee.wrappers.EmployeeDto;
import com.all.projects.modernMvc.employeetracking.util.AllPageResponse;
import com.all.projects.modernMvc.employeetracking.util.PageRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employees")
public interface EmployeeRestController {

    @PostMapping(value = "/createEmployee")
     ResponseWithError<String> createEmployee(@RequestBody EmployeeDto employeeDto);

    @PutMapping("/updateEmployee")
    ResponseWithError<String> updateEmployee(@RequestBody EmployeeDto employeeDto);

    @GetMapping("/getEmployeeById/{employeeId}")
    ResponseWithError<Employee> getEmployeeById(@PathVariable("employeeId") String employeeId);

    @GetMapping("/getEmployeeByEmpCode/{empCode}")
    ResponseWithError<Employee> getEmployeeByEmpCode(@PathVariable("empCode") String empCode);

    @GetMapping("/getAllEmployees")
    ResponseWithError<List<Employee>> getAllEmployees();

    @DeleteMapping("/deleteEmployeeById/{employeeId}")
    ResponseWithError<String> deleteEmployee(@PathVariable("employeeId") String employeeId);

    @GetMapping("/searchByNamePagination")
    ResponseWithError<AllPageResponse> findBySearchString(@RequestBody PageRequestDto pageRequestDto);
}
