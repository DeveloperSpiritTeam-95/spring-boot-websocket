package com.all.projects.modernMvc.banking.banks.controller;

import com.all.projects.configuration.ResponseWithError;
import com.all.projects.modernMvc.banking.banks.service.BankService;
import com.all.projects.modernMvc.banking.banks.wrapper.BankDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/banks")
public class BankController {

    @Autowired
    private BankService service;

    @PostMapping("/create")
    public ResponseWithError<String> saveBank(@RequestBody BankDto input){
        return this.service.saveBank(input);
    }


}
