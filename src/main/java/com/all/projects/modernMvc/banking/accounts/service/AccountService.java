package com.all.projects.modernMvc.banking.accounts.service;

import com.all.projects.modernMvc.banking.accounts.repository.AccountsRepository;
import com.all.projects.modernMvc.banking.banks.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountsRepository accountRepository;

    @Autowired
    private BankRepository bankRepository;


}
