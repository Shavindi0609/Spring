package com.ijse.gdse.back_end.service.impl;


import com.ijse.gdse.back_end.dto.JobDTO;
import com.ijse.gdse.back_end.entity.Job;
import com.ijse.gdse.back_end.repository.JobRepository;
import com.ijse.gdse.back_end.service.JobService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//public class JobServiceImpl implements JobService {
//
//
//    @Autowired
//    private  JobRepository jobRepository;
//
//    @Autowired
//    private  ModelMapper modelMapper;
//
//    @Override
//    public void saveJob(JobDTO jobDTO) {
//        jobRepository.save(modelMapper.map(jobDTO, Job.class));
//    }
//
//    public void updateJob(JobDTO jobDTO) {
//        jobRepository.save(modelMapper.map(jobDTO, Job.class));
//    }
//}

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public void saveJob(JobDTO jobDTO) {
        jobRepository.save(modelMapper.map(jobDTO, Job.class));
    }

    @Override
    public void updateJob(JobDTO jobDTO) {
        if (jobDTO.getId() != null && jobRepository.existsById(jobDTO.getId())) {
            jobRepository.save(modelMapper.map(jobDTO, Job.class));
        } else {
            throw new RuntimeException("Job with ID " + jobDTO.getId() + " does not exist.");
        }
    }


    @Override
    public List<JobDTO> getAllJobs() {
        List<Job> allJobs=jobRepository.findAll();
        return modelMapper.map(allJobs,new TypeToken<List<JobDTO>>(){}.getType());
    }

    public void changeJobStatus(String id) {
        jobRepository. updateStatus(id);
    }

    public List<JobDTO> getAllJobsByKeyword(String keyword) {
       List<Job> list = jobRepository.findJobByJobTitleContainingIgnoreCase(keyword);
       return modelMapper.map(list,new TypeToken<List<JobDTO>>(){}.getType());
    }
}

