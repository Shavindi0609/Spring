package com.ijse.gdse.back_end.repository;

import com.ijse.gdse.back_end.entity.Job;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

    @Transactional
    @Modifying
    @Query(value = "UPDDATE Job SET status='Deactivate' WHERE id=?1",nativeQuery = true)

    void updateStatus(String id);

    List<Job> findJobByJobTitleContainingIgnoreCase(String keyword);
}
