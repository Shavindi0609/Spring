package com.ijse.gdse.back_end.service;

import com.ijse.gdse.back_end.dto.JobDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface JobService {
    public void saveJob(JobDTO jobDTO);

    void updateJob(JobDTO jobDTO);

    void deleteJob(Integer id);

    List<JobDTO> getAllJobs();

    public void changeJobStatus(String id);

    public List<JobDTO> getAllJobsByKeyword(String keyword);

    Page<JobDTO> getPaginatedJobs(Pageable pageable);
}
