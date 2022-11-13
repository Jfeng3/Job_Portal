package com.example.jupiter_analytics.service;

import com.example.jupiter_analytics.model.RegisteredEmployer;
import com.example.jupiter_analytics.model.LoginUser;
import com.example.jupiter_analytics.repository.LoginUserRepository;
import com.example.jupiter_analytics.repository.RegisteredEmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private RegisteredEmployerRepository registeredEmployerRepository;

    @Autowired
    private LoginUserRepository loginUserRepository;
    @Override
    public LoginUser onboardingEmployer(RegisteredEmployer employer) {
        RegisteredEmployer registeredEmployer = registeredEmployerRepository.findByEmail(employer.getEmail());
        if(registeredEmployer != null) {
            throw new RuntimeException("Employer already exists");
        } else {
            registeredEmployerRepository.save(employer);
            LoginUser user = new LoginUser();
            user.setEmail(employer.getEmail());

            String password = generatePassword(employer);
            user.setPassword(password);

            user.setLastLogin(null);
            user.setStatus("Active");
            user.setRole("Employer");
            return loginUserRepository.save(user);
        }
    }

    private String generatePassword(RegisteredEmployer employer) {
        String password = UUID.randomUUID().toString().substring(0, 8);
        return password;
    }
}
