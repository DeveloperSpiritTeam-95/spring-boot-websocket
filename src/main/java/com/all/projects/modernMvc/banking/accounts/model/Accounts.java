package com.all.projects.modernMvc.banking.accounts.model;

import com.all.projects.modernMvc.banking.accounts.wrapper.PersonalInfo;
import com.all.projects.modernMvc.banking.enums.AccountStatus;
import com.all.projects.modernMvc.banking.enums.AccountType;
import com.all.projects.modernMvc.banking.enums.Currency;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
@Document
public class Accounts {
    @Id
    private String accountId;
    private String bankId;
    private PersonalInfo personalInfo;
    private String accountNumber;
    private AccountType accountType;
    private double initialDeposit;
    private BigDecimal balance;
    private Currency currency;
    private LocalDate openDate;
    private AccountStatus status;
}
