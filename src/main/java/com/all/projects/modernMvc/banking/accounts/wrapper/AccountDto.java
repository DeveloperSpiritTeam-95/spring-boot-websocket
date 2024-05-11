package com.all.projects.modernMvc.banking.accounts.wrapper;

import com.all.projects.modernMvc.banking.enums.AccountStatus;
import com.all.projects.modernMvc.banking.enums.AccountType;
import com.all.projects.modernMvc.banking.enums.Currency;
import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    private String accountId;
    private String bankId;
    private AccountType accountType;
    private double initialDeposit;
    private Currency currency;
    private LocalDate openDate;
    private AccountStatus status;
}
