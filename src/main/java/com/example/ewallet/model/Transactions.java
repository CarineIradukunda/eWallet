package com.example.ewallet.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transactions {
  @Id

  private int ewalnbr;
  private java.sql.Timestamp createdDate;
  private String amount;

  public int getEwalnbr() {
    return ewalnbr;
  }

  public void setEwalnbr(int ewalnbr) {
    this.ewalnbr = ewalnbr;
  }

  public java.sql.Timestamp getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(java.sql.Timestamp createdDate) {
    this.createdDate = createdDate;
  }


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

}
