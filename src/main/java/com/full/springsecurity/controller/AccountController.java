package com.full.springsecurity.controller;

import com.full.springsecurity.entity.Account;
import com.full.springsecurity.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountsRepository;

    @GetMapping("/myAccount")
    public Account getAccountDetails(@RequestParam Integer id) {
        Account accounts = accountsRepository.findByCustomerId(id);
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }
    }
}
