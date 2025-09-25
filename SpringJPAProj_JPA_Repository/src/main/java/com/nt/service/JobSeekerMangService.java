package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.Entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Service("jobMang")
public class JobSeekerMangService implements IJobMangService{

	@Autowired
	private IJobSeekerRepository jsRepo;

	@Override
	public String deleteJobSeekerByIds(List<Integer> ids) {
		List<JobSeeker> list=jsRepo.findAllById(ids);
		jsRepo.deleteAllByIdInBatch(ids);
		return list.size()+" Records Are Deleted Successfully";
	}

	@Override
	public List<JobSeeker> showJobSeekerByExampleData(JobSeeker js, boolean ascOrder, String... param) {
		Sort sort=Sort.by(ascOrder?Direction.ASC:Direction.DESC,param);
		System.out.println(sort);
		Example<JobSeeker> example=Example.of(js);
		System.out.println(example);
		
		List<JobSeeker> list=jsRepo.findAll(example,sort);
		
		return list;
	}

	@Override
	public JobSeeker findJobSeekerById(Integer id) {
		JobSeeker js=jsRepo.getReferenceById(id);
		return js;
	}
	@Override
	public JobSeeker showJobSeekerById(Integer id) {
		JobSeeker js=jsRepo.getById(id);
		return js;
	}
}
