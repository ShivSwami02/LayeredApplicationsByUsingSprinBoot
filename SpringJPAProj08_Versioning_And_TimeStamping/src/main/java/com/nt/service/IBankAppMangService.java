package com.nt.service;

import com.nt.entity.BankingApplication;

public interface IBankAppMangService {
	
	public String createBankAccount(BankingApplication acc);
	
	public String withdrawMoneyFromAccno(Integer accno,double amt);
	
	public String depositAmount(Integer accno,double amount);
	
	public String sendMonyFromAccount(Integer senderAcc,Integer recerverAccno,Double amt);

}
