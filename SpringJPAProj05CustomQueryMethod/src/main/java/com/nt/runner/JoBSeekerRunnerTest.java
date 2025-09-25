package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;


@Component("testRunner")
public class JoBSeekerRunnerTest implements CommandLineRunner{

	@Autowired
	private IJobSeekerRepository jsRepo;
	@Override
	public void run(String... args) throws Exception {
//		try {
//			jsRepo.searchJobSeekerByIncomeRanges(200000D, 700000D).forEach(System.out::println);;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			jsRepo.searchJobSeekerByQualification(List.of("MCA","BA English","MBA Finance")).forEach(System.out::println);;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			List<Object[]> js=jsRepo.searchJobSeekerByExapectedSalaryRanges(400000, 900000);
			js.forEach(row->System.out.println(Arrays.toString(row)));
			System.out.println();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

			}

}
