package com.nt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component("receiver")
public class ObjectClassReceiver {
	
	@JmsListener(destination = "des11")
	 public void getObject(Employee e) {
    	 System.out.println("Received Oject Data::"+e);
    	 
     }
}
