package com.full.springsecurity.controller;

import com.full.springsecurity.entity.AccountTransaction;
import com.full.springsecurity.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController {

    @Autowired
    private AccountTransactionRepository accountTransactionsRepository;

    @GetMapping("/myBalance")
    public List<AccountTransaction> getBalanceDetails(@RequestParam Integer id) {
        List<AccountTransaction> accountTransactions = accountTransactionsRepository.
                findByCustomerIdOrderByTransactionDateDesc(id);
        if (accountTransactions != null) {
            return accountTransactions;
        } else {
            return null;
        }
    }
}
