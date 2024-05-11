package com.all.projects.modernMvc.employeetracking.employee.wrappers;

import com.all.projects.modernMvc.employeetracking.enums.Status;
import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
public class EmployeeDto {
    private String employeeId;
    @Indexed
    private String empCode;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String dateOfBirth;
    private String dateOfJoining;
    @Indexed
    private String emailId;
    @Indexed
    private String companyEmailId;
    @Indexed
    private String phoneNumber;
    private String alternativeNumber;
    private String position;
    private String team;
    @Indexed
    private String aadhaarNumber;
    @Indexed
    private String panCard;
    private Status status;
    private String createPassword;
    private String confirmPassword;
    private String salary;
    private String address;
    private boolean makeAsAdmin;
}
