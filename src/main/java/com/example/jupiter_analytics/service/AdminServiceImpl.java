package com.example.jupiter_analytics.service;

import com.example.jupiter_analytics.model.RegisteredEmployer;
import com.example.jupiter_analytics.model.User;
import com.example.jupiter_analytics.repository.RegisteredEmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class AdminServiceImpl implements AdminService {

    @Autowired
    private RegisteredEmployerRepository registeredEmployerRepository;

    @Override
    public User onboardingEmployer(RegisteredEmployer employer) {
        RegisteredEmployer registeredEmployer = registeredEmployerRepository.findByEmail(employer.getEmail());
        if(registeredEmployer != null) {
            throw new RuntimeException("Employer already exists");
        } else {
            registeredEmployerRepository.save(employer);
            User user = new User();
            user.setEmail(employer.getEmail());

            String password = generatePassword(employer);
            user.setPassword(password);

            user.setLastLogin(null);
            user.setStatus("Active");
            user.setRole("Employer");
            return user;
        }
    }

    private String generatePassword(RegisteredEmployer employer) {
        String password = UUID.randomUUID().toString().substring(0, 8);
        return password;
    }
}
