package com.all.projects.modernMvc.employeetracking.employeeLeaves.repository;

import com.all.projects.modernMvc.employeetracking.employeeLeaves.model.EmployeeLeaves;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EmployeeLeavesRepository extends MongoRepository<EmployeeLeaves, String> {

    Optional<EmployeeLeaves> findByEmployeeId(String employeeLeavesId);
}
