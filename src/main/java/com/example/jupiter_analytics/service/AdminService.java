package com.example.jupiter_analytics.service;

import com.example.jupiter_analytics.model.RegisteredEmployer;
import com.example.jupiter_analytics.model.User;

public interface AdminService {

    // what is a registered employer?
    // what is a user?

    // you first start with an registered employer, after the onboarding ,
    // you create user and send credentials
    User onboardingEmployer(RegisteredEmployer employer);
}
