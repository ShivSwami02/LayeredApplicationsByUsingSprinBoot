package com.nt.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;
@Service("iPurchese")
public class PurcheseOrderImpl implements IPurcheseOrder {
	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String fromMail;
	@Override
	public String purchese(String[] items, double[] price, String[] email) throws Exception {
		double billamt=0.0;
		for(double p:price){
			billamt+=p;
		}
		String msg=Arrays.toString(items)+"\n Are Purchesed and Price of Each One Is "+Arrays.toString(price)+"\n After Purchesing All This Total Bill Amount Is:"+billamt+"\n Thank You Visit Again....";
		
		String status=sendMail(msg,email);
		return msg+"....."+status;
	}
	
	public String sendMail(String msg,String[] toEmails)throws Exception {
		MimeMessage message=sender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message,true);
		helper.setFrom(fromMail);
		helper.setCc(toEmails);
		helper.setSubject("Open It To Know!!!!!!");
		helper.setSentDate(new Date());
		helper.setText(msg);
		helper.addAttachment("College.jpg", new ClassPathResource("College.jpg"));
		sender.send(message);
		return "Email Is Send Successfully";
	}

}
