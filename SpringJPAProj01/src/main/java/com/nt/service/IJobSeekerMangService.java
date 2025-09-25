package com.nt.service;

import com.nt.entity.JobSeeker;

public interface IJobSeekerMangService {

	public String registerJobSeeker(JobSeeker js);
	
	public long checkAvalilabilityCountById(int id);
	
	public boolean checkJobSeekerAvailability(int id);
	
	public Iterable<JobSeeker> showAllJobSeeker();
	
	public Iterable<JobSeeker> showAllJobSeekersByIds(Iterable<Integer>ids);
	
	public JobSeeker showJobSeekerById(int id);
	
	public String updateOrUpdate(JobSeeker js);
	
	public String removeJobSeekerById(int id);
	
	public String removeJobSeeker(JobSeeker js);
	
	public String removeJobSeekerByIds(Iterable<Integer> ids);
	
	public String removeAllJobSeekers();
}
