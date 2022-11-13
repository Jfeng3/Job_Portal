package com.example.jupiter_analytics.repository;

import com.example.jupiter_analytics.model.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginUserRepository extends JpaRepository<LoginUser, Long> {
    @Query("SELECT u FROM LoginUser u WHERE u.email = ?1")
    LoginUser findByEmail(String email);

}
