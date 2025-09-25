package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.book.ProductBookSend;
@Component
public class RunnerTsetProduct implements CommandLineRunner {
	@Autowired
	private ProductBookSend send1;
	@Override
	public void run(String... args) throws Exception {
		
		send1.sendProduct1();

	}

}
