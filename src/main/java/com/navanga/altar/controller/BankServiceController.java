package com.navanga.altar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navanga.altar.service.BankService;

@RestController
@RequestMapping("bank")
public class BankServiceController {

	@Autowired
	private BankService bankservice;
	
	@RequestMapping("/ping")
	public String ping() {
		return "Hello from Bank Service";
	}
	
	@RequestMapping("/rate")
	public String getRate() {
		double rate = bankservice.getCurrentInterestRate();
		return String.valueOf(rate);
	}
	
}
