package com.all.projects.modernMvc.banking.accounts.repository;

import com.all.projects.modernMvc.banking.accounts.model.Accounts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountsRepository extends MongoRepository<Accounts,String> {
}
