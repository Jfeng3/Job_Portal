package com.example.jupiter_analytics.controller;


import com.example.jupiter_analytics.model.RegisteredEmployer;
import com.example.jupiter_analytics.model.LoginUser;
import com.example.jupiter_analytics.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/onboarding")
    public ResponseEntity<String> onboardingEmployer(@RequestBody RegisteredEmployer registeredEmployer) {
       LoginUser user= adminService.onboardingEmployer(registeredEmployer);
       if(user.getId()!= null) {
           return ResponseEntity.ok("Employer onboarding successful");
       } else {
           return ResponseEntity.badRequest().body("Employer onboarding failed");
       }
    }
}
