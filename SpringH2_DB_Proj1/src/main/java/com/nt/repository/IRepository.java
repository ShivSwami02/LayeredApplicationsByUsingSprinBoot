package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.JobSeeker;

public interface IRepository extends JpaRepository<JobSeeker, Integer> {

}
