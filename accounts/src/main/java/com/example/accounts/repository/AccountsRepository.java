package com.example.accounts.repository;

import com.example.accounts.model.Accounts;
import org.springframework.data.repository.CrudRepository;

public interface AccountsRepository extends CrudRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);
}
