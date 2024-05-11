package com.all.projects.modernMvc.banking.banks.repository;

import com.all.projects.modernMvc.banking.banks.model.Banks;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankRepository extends MongoRepository<Banks,String> {
}
