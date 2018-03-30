package com.navanga.altar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navanga.altar.dao.BankDAO;
import com.navanga.altar.service.BankService;

@Service("bankService")
public class BankServiceImpl implements BankService {

	@Autowired
	private BankDAO bankDAO;
	
	@Override
	public double getCurrentInterestRate() {
		return bankDAO.getInterestRate();
	}

}
