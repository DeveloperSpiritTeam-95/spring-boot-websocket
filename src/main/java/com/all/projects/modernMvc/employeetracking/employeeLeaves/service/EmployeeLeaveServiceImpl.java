package com.all.projects.modernMvc.employeetracking.employeeLeaves.service;

import com.all.projects.modernMvc.employeetracking.employeeLeaves.repository.EmployeeLeavesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeLeaveServiceImpl implements EmployeeLeaveService{

    @Autowired
    private EmployeeLeavesRepository employeeLeavesRepository;


}
