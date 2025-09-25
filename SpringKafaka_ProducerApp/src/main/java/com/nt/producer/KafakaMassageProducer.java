package com.nt.producer;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
@Component
public class KafakaMassageProducer implements CommandLineRunner{

	@Autowired
	private KafkaTemplate<String, String> template;
	@Value("${app.tpc.name}")
	private String tpcName;
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String msg=null;
		do {
			System.out.println("Enter the massage:");
			msg=sc.nextLine();
			template.send(tpcName,msg);
		}
		while(!msg.equals("end"));
		
	}

}
