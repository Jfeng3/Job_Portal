package com.example.jupiter_analytics.service;

import com.example.jupiter_analytics.model.JobPost;
import com.example.jupiter_analytics.model.LoginUser;
import com.example.jupiter_analytics.repository.JobPostRepository;
import com.example.jupiter_analytics.repository.LoginUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobPostServiceImpl implements JobPostService {
    
    @Autowired
    JobPostRepository jobPostRepository;

    @Autowired
    LoginUserRepository loginUserRepository;

    @Override
    public JobPost createJobPost(JobPost jobPost) {

        // we want to make sure the jobPost by some loginUser
        LoginUser employer = loginUserRepository.findByEmail(jobPost.getPostedBy());
        if (employer == null) {
            throw new RuntimeException("Employer does not exist");
        } else {
            return jobPostRepository.save(jobPost);
        }

    }

}
