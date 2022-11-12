package com.example.jupiter_analytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class JupiterAnalyticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JupiterAnalyticsApplication.class, args);
    }
//    Job Portal:
//
//    Admin
//    Onboarding of Employer
//
//    Employer:
//    Post a job
//    Search for candidates
//    Send request
//    Schedule interview
//
//    JobSeeker:
//    Create Account
//    upload resume
//    Search job
//    Apply for Job
    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.example.jupiter_analytics")).build();
    }

}
