package com.example.ewallet.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity




public class Eusers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String Names;
    private Integer balance;
    private String pin;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ewallnbr;

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Integer getEwallnbr() {
        return ewallnbr;
    }

    public void setEwallnbr(Integer ewallnbr) {
        this.ewallnbr = ewallnbr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
