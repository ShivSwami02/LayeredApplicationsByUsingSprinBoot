package com.nt.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.nt.model.Product;

@Component("product")
public class ProductBookSend {
	
	@Autowired
	private JmsTemplate template;
	
	Product prod=new Product(1212, "Mouse", "Hyderabad", 1200, 12345678D);
	
	public void sendProduct1() {
		template.convertAndSend("prod1", prod);
		System.out.println("THe Product Sended Successfully...");
	}
}
