package com.ar.cac.tpfinal.controllers;

import com.ar.cac.tpfinal.entities.Account;
import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value ="/api/accounts")
public class AccountController {
    @Autowired
    private AccountService service;

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAccounts());
    }


}
