package com.ar.cac.tpfinal.services;

import com.ar.cac.tpfinal.entities.Account;
import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.repositories.AccountRepository;
import com.ar.cac.tpfinal.repositories.UserRepository;

import java.util.List;

public class AccountService {
    private AccountRepository repository;

    public AccountService (AccountRepository repository) {
        this.repository = repository;
    }

    public List<Account> getAccounts() {
        List<Account> accounts = repository.findAll();
        return accounts;
    }
}
