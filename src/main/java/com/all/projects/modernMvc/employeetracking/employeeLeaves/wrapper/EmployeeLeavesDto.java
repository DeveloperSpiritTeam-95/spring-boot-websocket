package com.all.projects.modernMvc.employeetracking.employeeLeaves.wrapper;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@Builder
public class EmployeeLeavesDto {
    private String employeeLeaveId;
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
