package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

	public List<JobSeeker> findByNameEquals(String name);	
	public List<JobSeeker> findByNameIs(String name);	
	public List<JobSeeker> findByname(String name);
	public List<JobSeeker> findByNameStartingWith(String startwith);
	public List<JobSeeker> findByNameEndingWith(String endStr);
	public List<JobSeeker> findByNameContaining(String contanStr);
	public List<JobSeeker> findByNameContainingIgnoreCase(String str);
	public List<JobSeeker> findByNameStartingWithIgnoreCase(String strWith);
	public List<JobSeeker> findByexpectedSalaryBetween(double start ,double end);
	public List<JobSeeker> findByNameLikeIgnoreCase(String pattern);
	public List<JobSeeker> findByQulyfyInOrderByQulyfyAsc(List<String> qulyfy);
	public List<JobSeeker> findByExpectedSalaryGreaterThanEqualAndExpectedSalaryLessThanEqual(double sal1,double sal2);
	
	public List<JobSeeker> findByadd(String add);
	public List<JobSeeker> findByAddIs(String add);
	public List<JobSeeker> findByAddEquals(String add);
	
	public List<JobSeeker> findByAddStartingWith(String srtname);
	public List<JobSeeker> findByAddEndingWith(String endWith);
	public List<JobSeeker> findByAddContaining(String containStr);
}
