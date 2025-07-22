package com.ijse.gdse.back_end.service;

import com.ijse.gdse.back_end.dto.JobDTO;

import java.util.List;

public interface JobService {
    public void saveJob(JobDTO jobDTO);

    void updateJob(JobDTO jobDTO);

    List<JobDTO> getAllJobs();

    public void changeJobStatus(String id);

    public List<JobDTO> getAllJobsByKeyword(String keyword);
}
