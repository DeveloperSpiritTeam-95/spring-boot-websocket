package com.all.projects.modernMvc.banking.accounts.wrapper;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonalInfo {

    private String customerName;
    private String panNumber;
    private String aadhaarNumber;
    private String customerAddress;
    private String dateOfBirth;
    private String phoneNumber;
    private String email;
    private String initialDeposit;
    private String signature;

}
