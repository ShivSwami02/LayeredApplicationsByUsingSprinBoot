package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BankingApplication;
import com.nt.service.IBankAppMangService;
@Component
public class VersionaningAndTimeStampingTest implements CommandLineRunner {

	@Autowired
	private IBankAppMangService service;
	@Override
	public void run(String... args) throws Exception {
//		try {
//			BankingApplication acc=new BankingApplication("Swami", "Pune", 98456d);
//			String msg=service.createBankAccount(acc);
//			System.out.println(msg);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			String msg=service.withdrawMoneyFromAccno(1, 12000);
//			System.out.println(msg);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			String msg=service.depositAmount(2, 10000);
//			System.out.println(msg);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			String msg=service.sendMonyFromAccount(2, 33, 50000d);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
