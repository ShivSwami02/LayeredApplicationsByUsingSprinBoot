package com.nt.service;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;


@Service
public class JobSeekerMangService implements IJobSeekerMangService {

	@Autowired
	private IJobSeekerRepository jsRepo;
	
	@Override
	public String registerJobSeeker(JobSeeker js) {
		System.out.println("get Proxy class name:"+jsRepo.getClass()+"...."+Arrays.toString(jsRepo.getClass().getInterfaces())+"...."+Arrays.toString(jsRepo.getClass().getDeclaredMethods()));
		JobSeeker savedObj=jsRepo.save(js);
		//get the generated id value
		int id=savedObj.getId();
		return "Job Seeker Object is Saved with id value:"+id;
	}

	@Override
	public long checkAvalilabilityCountById(int id) {
		
		return jsRepo.count();
	}

	@Override
	public boolean checkJobSeekerAvailability(int id) {
		return jsRepo.existsById(id);
		
	}

	@Override
	public Iterable<JobSeeker> showAllJobSeeker() {
		Iterable<JobSeeker> js=jsRepo.findAll();
		return js;
	}

	@Override
	public Iterable<JobSeeker> showAllJobSeekersByIds(Iterable<Integer> ids) {
		
		return jsRepo.findAllById(ids);
	}

	@Override
	public JobSeeker showJobSeekerById(int id) {
		JobSeeker js=new JobSeeker();
		js.setQlfy("MTEC");
	     
		JobSeeker j=jsRepo.findById(id).orElse(js);
		return j;
	}

	@Override
	public String updateOrUpdate(JobSeeker js) {
		jsRepo.save(js);
		
		return "The JobSeekerIs Saved/Updated:";
	}

	@Override
	public String removeJobSeekerById(int id) {
		Optional<JobSeeker>js=jsRepo.findById(id);
		if(js.isEmpty()) {
			return "THe JobSeeker Is Not Found";
		}
		else {
			jsRepo.deleteById(id);
			return "THe JobSeeker Is Found ANd Deleted";
		}
		
	}
	@Override
	public String removeJobSeeker(JobSeeker js) {
		Optional<JobSeeker> j=jsRepo.findById(js.getId());
		if(j.isPresent()) {
			jsRepo.delete(js);
			return js.getId()+" of id The JobSeeker IS Found and Deleted Successfully";
		}
		else
		return js.getId()+" of id JobSeeker Object is Not Found To delete";
	}
	@Override
	public String removeJobSeekerByIds(Iterable<Integer> ids) {
		Iterable<JobSeeker> list=jsRepo.findAllById(ids);
		long count=StreamSupport.stream(list.spliterator(), false).count();
		return count+" records deleted from database..";
	}
	@Override
	public String removeAllJobSeekers() {
		jsRepo.deleteAll();
		return "All Job seekers Are Removed From  Database.";
	}
}
