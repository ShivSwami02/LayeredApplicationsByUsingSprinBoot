package com.nt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.Entity.JobSeeker;



public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {
	
	@Transactional
	@Modifying
	@Query(value="insert into JPA_JS_TAB values(SEQ_GEN1.nextval,:add,:name,:qulyfy,:expSal)",nativeQuery=true)
	public int insertJobSeeker(String name,String add,String qulyfy,double expSal);

	@Query(value="select sysDate from dual",nativeQuery=true)
	
	public String showSystemDate();

	@Query(value="create table TEMP (Col1 number (5))",nativeQuery=true)
	@Modifying
	@Transactional
	public int createTempTable();
}
