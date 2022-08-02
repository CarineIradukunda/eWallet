package com.example.ewallet.controller;


import com.example.ewallet.model.Eusers;
import com.example.ewallet.repository.EusersRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class eusersController {

    final Logger Log = LoggerFactory.getLogger(this.getClass());

    final EusersRepository repository;


    public eusersController(EusersRepository repository) {
        this.repository = repository;
    }

    @PostMapping("user/add")
    public Object GetAdd(@RequestBody Eusers eusers) {
        ObjectMapper mapper = new ObjectMapper();
        String names = "";
        String pin = "";


        try {

            return repository.AddUser(eusers.getNames(),eusers.getPin());


        } catch (Exception e) {
            Log.info("---------------------------");
            Log.info("Exception: " + e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
        }

}}
