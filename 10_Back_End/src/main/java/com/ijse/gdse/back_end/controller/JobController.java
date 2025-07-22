package com.ijse.gdse.back_end.controller;

import com.ijse.gdse.back_end.dto.JobDTO;
import com.ijse.gdse.back_end.entity.Job;
import com.ijse.gdse.back_end.repository.JobRepository;
import com.ijse.gdse.back_end.service.JobService;
import com.ijse.gdse.back_end.service.impl.JobServiceImpl;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/job")
@RestController
@CrossOrigin
public class JobController {

    @Autowired
    private JobServiceImpl jobService;
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("create")
    public void createJob(@RequestBody JobDTO jobDTO) {
        jobRepository.save(modelMapper.map(jobDTO, Job.class));
    }

    @PutMapping("update")
    public void updateJob(@RequestBody JobDTO jobDTO) {
        jobService.updateJob(jobDTO);
    }

    @DeleteMapping("delete/{id}")
    public void deleteJob(@PathVariable Integer id) {
        jobService.deleteJob(id);
    }

    @GetMapping("getall")
    public List<JobDTO> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PatchMapping("status/{id}")
    public void changeStatus(@PathVariable String id) {
        jobService.changeJobStatus(id);
    }

    @GetMapping("search/{keyword}")
    public List<JobDTO> searchJob(@PathVariable("keyword") String keyword) {
        return jobService.getAllJobsByKeyword(keyword);
    }

    // ✅ Paginated endpoint
    @GetMapping("/paginated")
    public Page<JobDTO> getPaginatedJobs(@RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "5") int size) {
        return jobService.getPaginatedJobs(PageRequest.of(page, size));
    }

}
