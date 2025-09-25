package com.nt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("obclass")
public class ObjectClassSender {
	@Autowired
	private JmsTemplate template;

	Employee emp=new Employee(1, "Swami", 123456D);
	@Scheduled(cron = "0/10 * * * * *")
     public void sendObject() {
    	 template.convertAndSend("des11",emp);
    	 System.out.println("Object Send Successfully...");
     }
}
