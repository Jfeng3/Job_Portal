package com.example.jupiter_analytics.service;

import com.example.jupiter_analytics.model.JobSeeker;
import com.example.jupiter_analytics.repository.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerServiceImpl implements JobSeekerService{

    @Autowired
    private JobSeekerRepository jobSeekerRepository;

    @Override
    public JobSeeker createJobSeeker(JobSeeker jobSeeker) {
        return jobSeekerRepository.save(jobSeeker);
    }

    @Override
    public List<JobSeeker> listJobSeekers() {
        return jobSeekerRepository.findAll();
    }
}
