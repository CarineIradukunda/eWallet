package com.example.ewallet.controller;

import com.example.ewallet.model.Transactions;
import com.example.ewallet.repository.TransactionsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class transactionController {

    final Logger Log = LoggerFactory.getLogger(this.getClass());

    final TransactionsRepository repository;


    public transactionController(TransactionsRepository repository) {
        this.repository = repository;
    }

    @PostMapping("transaction/add")
    public Object GetAddTra(@RequestBody Transactions transactions) {
        ObjectMapper mapper = new ObjectMapper();
        String ewalnbr = "";
        String amount = "";



        try {


            return repository.Addtra(transactions.getEwalnbr(),transactions.getAmount());


        } catch (Exception e) {
            Log.info("---------------------------");
            Log.info("Exception: " + e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
        }

    }}
