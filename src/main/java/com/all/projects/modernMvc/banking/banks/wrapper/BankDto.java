package com.all.projects.modernMvc.banking.banks.wrapper;

import com.all.projects.modernMvc.banking.enums.Country;
import com.all.projects.modernMvc.banking.enums.Currency;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankDto {
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
}
