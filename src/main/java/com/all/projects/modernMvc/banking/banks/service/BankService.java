package com.all.projects.modernMvc.banking.banks.service;

import com.all.projects.configuration.ResponseWithError;
import com.all.projects.modernMvc.banking.banks.model.Banks;
import com.all.projects.modernMvc.banking.banks.repository.BankRepository;
import com.all.projects.modernMvc.banking.banks.wrapper.BankDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BankService {

    @Autowired
    private BankRepository repository;

    public ResponseWithError<String> saveBank(BankDto input){
        Banks bank = new Banks();
        if (input != null) {

            bank.setBankId(UUID.randomUUID().toString());
            bank.setBankName(input.getBankName());
            bank.setBankCode(input.getBankCode());
            bank.setBranchName(input.getBranchName());
            bank.setBranchCode(input.getBranchCode());
            bank.setIfscCode(input.getIfscCode());
            bank.setCity(input.getCity());
            bank.setState(input.getState());
            bank.setCountry(input.getCountry());
            bank.setCurrencySupport(input.getCurrencySupport());
            bank.setPostalCode(input.getPostalCode());
            bank.setBankContactInformation(input.getBankContactInformation());
            bank.setOpeningHours(input.getOpeningHours());
            bank.setManagerName(input.getManagerName());
            bank.setManageContact(input.getManageContact());

            this.repository.save(bank);
            return ResponseWithError.of("Bank created Success -> "+bank.getBankId());
        }
        return ResponseWithError.ofError("Bank Not Created");
    }


}
