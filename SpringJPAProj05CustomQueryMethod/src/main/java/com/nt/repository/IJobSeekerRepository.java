package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.Entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {
	
	//@Query("SELECT js FROM JobSeeker js where js.expectedSalary>=?1 AND  js.expectedSalary<=?2")
	//@Query("FROM JobSeeker where expectedSalary>=?1 And expectedSalary<=?2")
	@Query("from JobSeeker where expectedSalary>=:sal1 and expectedSalary<=:sal2")
	public List<JobSeeker> searchJobSeekerByIncomeRanges(double sal1,double sal2);
	
	@Query("from JobSeeker where qulyfy IN:qulyfication")
	public List<JobSeeker> searchJobSeekerByQualification(List<String> qulyfication);

	@Query("SELECT id,name,add,expectedSalary from JobSeeker where expectedSalary Between :start and :end")
	public List<Object[]> searchJobSeekerByExapectedSalaryRanges(double start,double end);

}
