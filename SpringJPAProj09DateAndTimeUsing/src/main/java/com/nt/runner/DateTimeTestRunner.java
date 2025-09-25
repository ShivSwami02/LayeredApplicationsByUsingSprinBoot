package com.nt.runner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.service.IArtistServiceMang;
@Component
public class DateTimeTestRunner implements CommandLineRunner {

	@Autowired
	private IArtistServiceMang artistService;
	@Override
	public void run(String... args) throws Exception {
//		try {
//			LocalDate dob=LocalDate.of(2002, 11, 7);
//			LocalDate doj=LocalDate.of(2025, 05, 12);
//			LocalTime dot=LocalTime.of(12, 45);
//			Artist artist=new Artist("Shiva", "Hyd", dob,doj,dot);
//			String msg=artistService.registerArtist(artist);
//			System.out.println(msg);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			artistService.showAllArtist().forEach(System.out::println);
//			Optional<Artist> showArtistByID = artistService.showArtistByID(100);
//		    System.out.println(showArtistByID);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			Double age=artistService.showArtistAgeById(100);
//			System.out.println("THe Age Of Artist Is:"+age);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		try {
			Double experience=artistService.showArtistExperienceById(100);
			System.out.println("THe working experience is:"+experience);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
