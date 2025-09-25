package com.nt.model;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ProductListnerReceiverClass {
	@JmsListener(destination = "prod1")
	public void getProdDetails(Product prod) {
		System.out.println(prod);
	}
}
