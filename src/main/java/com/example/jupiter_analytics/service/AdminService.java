package com.example.jupiter_analytics.service;

import com.example.jupiter_analytics.model.RegisteredEmployer;
import com.example.jupiter_analytics.model.LoginUser;


public interface AdminService {

    // what is a registered employer?
    // what is a user?

    // you first start with an registered employer, after the onboarding ,
    // you create user and send credentials
    LoginUser onboardingEmployer(RegisteredEmployer employer);
}
