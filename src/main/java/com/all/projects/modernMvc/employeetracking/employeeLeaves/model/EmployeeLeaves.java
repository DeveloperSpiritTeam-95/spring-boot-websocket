package com.all.projects.modernMvc.employeetracking.employeeLeaves.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@Builder
@Document
public class EmployeeLeaves {
    @Id
    private String employeeLeaveId;
    private String employeeId;
    private int totalLeaves;
    private int leavesTaken;
    private int remainingLeaves;
    private String statusDate;
    private int totalWFHDays;
    private int TakenWFH;
    private int remainingWFH;
    private int totalOptHolidays;
    private int optHolidaysTaken;
    private int remainingOptHolidays;
    private String profileId;
}
