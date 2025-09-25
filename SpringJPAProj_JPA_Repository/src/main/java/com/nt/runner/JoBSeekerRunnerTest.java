package com.nt.runner;

import java.util.List;
import com.nt.service.JobSeekerMangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.JobSeeker;
import com.nt.service.IJobMangService;

@Component("testRunner")
public class JoBSeekerRunnerTest implements CommandLineRunner{

    private final JobSeekerMangService jobMang;
	@Autowired
	private IJobMangService jsService;

    JoBSeekerRunnerTest(JobSeekerMangService jobMang) {
        this.jobMang = jobMang;
    }
	
	@Override
	public void run(String... args) throws Exception {
//		try {
//			String list=jsService.deleteJobSeekerByIds(List.of(113,2,112,4,5,107,200,108));
//			System.out.println(list);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			JobSeeker js=new JobSeeker();
//			js.setAdd("Hyd");
//			List<JobSeeker> list=jsService.showJobSeekerByExampleData(js, true,"add");
//			System.out.println("JoBSeekerRunnerTest.run()");
//			System.out.println(list);
//		    list.forEach(System.out::println);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			JobSeeker js=jsService.findJobSeekerById(111);
//			System.out.println(js);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			JobSeeker js=jsService.showJobSeekerById(109);
			System.out.println(js);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
