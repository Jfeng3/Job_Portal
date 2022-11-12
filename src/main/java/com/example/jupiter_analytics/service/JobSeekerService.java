package com.example.jupiter_analytics.service;

import com.example.jupiter_analytics.model.JobSeeker;

import java.util.List;

public interface JobSeekerService {

    JobSeeker createJobSeeker(JobSeeker jobSeeker);

    List<JobSeeker> listJobSeekers();
}
