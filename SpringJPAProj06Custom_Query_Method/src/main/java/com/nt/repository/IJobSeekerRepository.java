package com.nt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.Entity.JobSeeker;



public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {
	@Query("from JobSeeker where expectedSalary>=:sal1 And expectedSalary<=:sal2")
	public List<JobSeeker> searchJobSeekersByRangBetSal(double sal1,double sal2);
  	@Query("select id,name,expectedSalary from JobSeeker where expectedSalary>=:sal1 And expectedSalary<=:sal2")
	public List<Object[]> serachJobSeekerRangeBetSal(double sal1,double sal2);
	@Query("select name from JobSeeker where expectedSalary>=:sal1 And expectedSalary<=:sal2")
  	public List<String> searchJobSeekerNameBySalaRange(double sal1,double sal2);

	//for the single row for Entity Query operation
	@Query("from JobSeeker where expectedSalary>=:sal1 And expectedSalary<=:sal2")
	public Optional<JobSeeker> displayJobSeeker(double sal1,double sal2);
	//for the Scalar Operation by salecting(Specific Multiple Col Values)
	@Query("select id,name,expectedSalary from JobSeeker where expectedSalary>=:sal1 And expectedSalary<=:sal2")
	public Object displayJobSeekerData(double sal1,double sal2);
	//for the Scalar Operation for specific single column value
	@Query("select name from JobSeeker where expectedSalary>=:sal1 And expectedSalary<=:sal2")
	public Optional<String> displayJobSeekerName(double sal1,double sal2);

	
	//geting the information about how many jobseeker are available in jobseeker
	@Query("select count(distinct id)from JobSeeker")
	public int fetchJobSeekerCountInDB();
	
	//geting Aggregate Data 
	@Query("select count(*),min(expectedSalary),max(expectedSalary),sum(expectedSalary),avg(expectedSalary) from JobSeeker")
	public Object fetchJobSeekerAggregateData();

	
	//hike expected Salary from JobSeeker (Modifying expected Salary)
	
	@Modifying
	@Transactional
	@Query("update JobSeeker set expectedSalary=expectedSalary+(expectedSalary*:persent/100.0) where name=:name")
	public int hikeExpectedSalaryOfJobSeeker(String name,double persent);
	
	@Modifying
	@Transactional
	@Query("delete from JobSeeker where name=:name")
	public int deleteJobSeekerDatabyName(String name);
}
