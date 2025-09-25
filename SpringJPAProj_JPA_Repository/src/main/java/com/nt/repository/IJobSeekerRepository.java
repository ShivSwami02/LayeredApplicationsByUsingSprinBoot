package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

}
