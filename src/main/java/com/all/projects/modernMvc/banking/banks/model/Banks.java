package com.all.projects.modernMvc.banking.banks.model;


import com.all.projects.modernMvc.banking.accounts.model.Accounts;
import com.all.projects.modernMvc.banking.banks.wrapper.BankContactInformation;
import com.all.projects.modernMvc.banking.enums.Country;
import com.all.projects.modernMvc.banking.enums.Currency;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
@Document
public class Banks {
    @Id
    private String bankId;
    private String bankName;
    private String bankCode;
    private String branchName;
    private String branchCode;
    private String ifscCode;
    private String address;
    private String city;
    private String state;
    private Country country = Country.INDIA;
    private Currency currencySupport;
    private String postalCode;
    private BankContactInformation bankContactInformation;
    private String openingHours;
    private String managerName;
    private String manageContact;
    private List<Accounts> accounts;
}
