package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IRepository;
@Service
public class JobSeekerService implements IJobSeekerService {

	@Autowired
	private IRepository repo;
	@Override
	public List<JobSeeker> findJobSeekerById() {
		
		return repo.findAll();
	}

}
