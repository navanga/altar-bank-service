package com.navanga.altar.dao.impl;

import org.springframework.stereotype.Component;

import com.navanga.altar.dao.BankDAO;

@Component("bankDAO")
public class BankDAOImpl implements BankDAO {

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 3.84;
	}

}
