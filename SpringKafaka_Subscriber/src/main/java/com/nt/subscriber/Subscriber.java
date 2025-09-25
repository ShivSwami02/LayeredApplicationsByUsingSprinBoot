package com.nt.subscriber;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber {

	@KafkaListener(topics = "${app.tpc.name}",groupId = "grp3")
	private void readmsg(String msg) {
		System.out.println(msg);
	}

}
