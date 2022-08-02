package com.example.ewallet.repository;

import com.example.ewallet.model.Eusers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface EusersRepository extends JpaRepository<Eusers, Long> {

        /*
    ADD A USER
     */

    @Transactional
    @Modifying  //allows to modify
    @Query(
            //query to add a user
            //accepts names and pin and takes 1000 as a default value on balance
            value = "INSERT INTO Eusers(Names,balance,pin) VALUES(:names,1000,:pin)",nativeQuery = true
    )
    //method to add user(registration)
    Eusers AddUser(@Param("names") String Names, @Param("pin") String pin);


}