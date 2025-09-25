package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankingApplication;
import com.nt.repository.IBankApplicationRepo;

@Service
public class IBankMangServiceImpl implements IBankAppMangService{

	@Autowired
	private IBankApplicationRepo accnoRepo;
	@Override
	public String createBankAccount(BankingApplication acc) {
		
		long accno=accnoRepo.save(acc).getAcno();
		return "The Account Is Creted And the Account Number is:"+accno;
	}
	
	@Override
	public String withdrawMoneyFromAccno(Integer accno, double amt) {
		Optional<BankingApplication> acc=accnoRepo.findById(accno);
		if(acc.isEmpty()) {
			return "Invalid Account Number!!!";
		}
		else {
		BankingApplication account=acc.get();
		account.setBalance(account.getBalance()-amt);
		accnoRepo.save(account);
		return accno+" acnumber from this account the amount of withdrow is Successfully:"+amt;
		}
		
	}
	@Override
	public String depositAmount(Integer accno, double amount) {
		Optional<BankingApplication> opt=accnoRepo.findById(accno);
		if(opt.isEmpty()) {
			return "Invalid Account Number!!!";
		}
		else {
			BankingApplication account=opt.get();
			account.setBalance(account.getBalance()+amount);
			accnoRepo.save(account);
			return amount+" Amount is Deposited Successfully from accno"+accno;
		}
	}
	@Override
	public String sendMonyFromAccount(Integer senderAcc, Integer recerverAccno, Double amt) {
		Optional<BankingApplication> sender=accnoRepo.findById(senderAcc);
		Optional<BankingApplication> reciver=accnoRepo.findById(recerverAccno);
		
		if(sender.isEmpty()||reciver.isEmpty()) {
		     if(sender.isEmpty()) return "Sender Accnount Number Is Invalid";
		     else return "Receiver Account Number Is Invalid";
		}
		else {
			withdrawMoneyFromAccno(senderAcc, amt);
			depositAmount(recerverAccno, amt);
			return "The Money Is Send From"+senderAcc+" TO Recever Accno:"+recerverAccno+" Is Successully Amount is+"+amt;
		}
	}

}
