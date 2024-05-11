package com.all.projects.modernMvc.banking.banks.wrapper;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankContactInformation {

    private String bankEmail;
    private String bankLandLine;
    private String bankPhoneNumber;
}
