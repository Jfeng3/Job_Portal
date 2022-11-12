package com.example.jupiter_analytics.controller;

import com.example.jupiter_analytics.model.JobSeeker;
import com.example.jupiter_analytics.service.JobSeekerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobseeker")
public class JobSeekerController {

    @Autowired
    private JobSeekerServiceImpl jobSeekerService;

    @PostMapping("/")
    ResponseEntity<JobSeeker> createJobSeeker(@RequestBody JobSeeker jobSeeker) {
        JobSeeker jobSeekerResponse = jobSeekerService.createJobSeeker(jobSeeker);
        return ResponseEntity.status(HttpStatus.CREATED).body(jobSeekerResponse);
    }

    @GetMapping("/")
    ResponseEntity<List<JobSeeker>> listJobSeekers(){
        List<JobSeeker> jobSeekerList = jobSeekerService.listJobSeekers();
        return ResponseEntity.status(HttpStatus.OK).body(jobSeekerList);
    }
}
