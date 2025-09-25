package com.nt.service;

import java.util.List;

import com.nt.Entity.JobSeeker;

public interface IJobMangService {

	public String deleteJobSeekerByIds(List<Integer> ids);
	
	public List<JobSeeker> showJobSeekerByExampleData(JobSeeker js,boolean ascOrder,String ...param);
	
	public JobSeeker findJobSeekerById(Integer id);
	
	public JobSeeker showJobSeekerById(Integer id);
}
