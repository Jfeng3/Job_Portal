package com.example.jupiter_analytics.repository;

import com.example.jupiter_analytics.model.RegisteredEmployer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegisteredEmployerRepository extends JpaRepository<RegisteredEmployer, Long> {

    @Query("SELECT r FROM RegisteredEmployer r WHERE r.email = ?1")
    RegisteredEmployer findByEmail(String email);

    // should findByEmail already exisit without given this query?

    //finAll() is already given by JpaRepository

}

