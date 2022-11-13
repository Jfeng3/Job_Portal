package com.example.jupiter_analytics.repository;

import com.example.jupiter_analytics.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
