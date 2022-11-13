package com.example.jupiter_analytics.controller;

import com.example.jupiter_analytics.model.JobPost;
import com.example.jupiter_analytics.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobpost")
public class JobPostController {

    @Autowired
    JobPostService jobPostService;

    @PostMapping("/create")
    public ResponseEntity<String> createJobPost(@RequestBody JobPost jobPost) {
        JobPost jobPostCreated = jobPostService.createJobPost(jobPost);
        if(jobPost.getId() != null) {
            return ResponseEntity.ok("Job post created successfully");
        } else {
            return ResponseEntity.badRequest().body("Job post creation failed");
        }
    }
}
