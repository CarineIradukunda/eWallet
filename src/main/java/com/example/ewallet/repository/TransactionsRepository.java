package com.example.ewallet.repository;

import com.example.ewallet.model.Eusers;
import com.example.ewallet.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
    @Transactional
    @Modifying  //allows to modify
    @Query(
            //query to add a transaction
            //accepts tid and amount
            value = "INSERT INTO transactions(ewalnbr,amount) VALUES(:ewalnbr,:amount)",nativeQuery = true
    )
        //method to add a transaction
    Eusers Addtra(@Param("ewalnbr") int ewalnbr, @Param("amount") String amount);
}