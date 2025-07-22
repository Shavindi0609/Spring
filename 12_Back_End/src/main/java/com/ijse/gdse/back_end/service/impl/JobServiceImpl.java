package com.ijse.gdse.back_end.service.impl;


import com.ijse.gdse.back_end.dto.JobDTO;
import com.ijse.gdse.back_end.entity.Job;
import com.ijse.gdse.back_end.repository.JobRepository;
import com.ijse.gdse.back_end.service.JobService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {


    private final JobRepository jobRepository;
    private final ModelMapper modelMapper;

    @Override
    public void saveJob(JobDTO jobDTO) {
        jobRepository.save(modelMapper.map(jobDTO, Job.class));
    }
}
