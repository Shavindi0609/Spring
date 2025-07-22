package com.ijse.gdse.back_end.controller;

import com.ijse.gdse.back_end.dto.JobDTO;
import com.ijse.gdse.back_end.service.impl.JobServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/job")
@RestController
@RequiredArgsConstructor
public class JobController {

    private final JobServiceImpl jobService;

    @PostMapping("create")
    public void createJob(@RequestBody JobDTO jobDTO) {
        jobService.saveJob(jobDTO);
    }
}
