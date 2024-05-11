package com.all.projects.modernMvc.employeetracking.employee.repository;

import com.all.projects.modernMvc.employeetracking.employee.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    @Query("{empCode: ?0}")
    Optional<Employee> findByEmpCode(String empCode);

    @Query("{phoneNumber: ?0}")
    Optional<Employee> findByPhoneNumber(String phone);

    @Query("{emailId: ?0}")
    Optional<Employee> findByEmailId(String email);

    @Query("{companyEmailId: ?0}")
    Optional<Employee> findByCompanyEmailId(String email);


    @Query("{'$or':[{'firstName':{$regex:?0,$options:'i'}}," + "{'empCode':{$regex:?0,$options:'i'}},"+
            "{'position':{$regex:?0,$options:'i'}},"+"{'team':{$regex:?0,$options:'i'}},"+
            "{'status':{$regex:?0,$options:'i'}}]}")
    Page<Employee> findBySearchString(String search, Pageable pageable);
}
