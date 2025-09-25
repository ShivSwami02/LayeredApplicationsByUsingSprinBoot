package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.BankingApplication;

public interface IBankApplicationRepo extends JpaRepository<BankingApplication, Integer> {

}
