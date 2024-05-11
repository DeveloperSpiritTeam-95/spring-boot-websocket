package com.all.projects.modernMvc.employeetracking.fuctions;

import com.all.projects.modernMvc.employeetracking.employeeLeaves.model.EmployeeLeaves;
import com.all.projects.modernMvc.employeetracking.employeeLeaves.repository.EmployeeLeavesRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeLeaveUseTo {

    private static EmployeeLeavesRepository employeeLeavesRepository;

    public EmployeeLeaveUseTo(EmployeeLeavesRepository repository){
        employeeLeavesRepository = repository;
    }

    public static EmployeeLeaves getEmployeeLeavesById(String employeeLeavesId){
        Optional<EmployeeLeaves> employeeLeaves = employeeLeavesRepository.findById(employeeLeavesId);
        return employeeLeaves.orElseGet(EmployeeLeaves::new);
    }

    public static EmployeeLeaves getEmployeeLeavesByEmpId(String employeeId){
        Optional<EmployeeLeaves> employeeLeaves = employeeLeavesRepository.findByEmployeeId(employeeId);
        return employeeLeaves.orElseGet(EmployeeLeaves::new);
    }

    public static @NotNull List<EmployeeLeaves> getAllEmployeeLeaves(){
        List<EmployeeLeaves> employeeLeaves = employeeLeavesRepository.findAll();
        if (employeeLeaves.isEmpty())
            return new ArrayList<>();
        else
            return employeeLeaves;
    }

    public static boolean deleteEmployeeLeaves(String employeeId){
        Optional<EmployeeLeaves> employeeLeaves = employeeLeavesRepository.findByEmployeeId(employeeId);
        if (employeeLeaves.isPresent()) {
            employeeLeavesRepository.delete(employeeLeaves.get());
            return true;
        }
        else
            return false;
    }






}
