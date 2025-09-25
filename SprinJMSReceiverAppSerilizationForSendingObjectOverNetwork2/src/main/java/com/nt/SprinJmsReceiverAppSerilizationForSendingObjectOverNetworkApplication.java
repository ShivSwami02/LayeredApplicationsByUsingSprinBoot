package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SprinJmsReceiverAppSerilizationForSendingObjectOverNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinJmsReceiverAppSerilizationForSendingObjectOverNetworkApplication.class, args);
	}

}
