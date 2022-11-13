package com.example.jupiter_analytics.service;

import com.example.jupiter_analytics.model.JobPost;
import org.springframework.stereotype.Service;

public interface JobPostService {
    JobPost createJobPost(JobPost jobPost);
}
