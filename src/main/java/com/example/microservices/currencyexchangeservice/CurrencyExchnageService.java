package com.example.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchnageService {
	
	@Autowired
	private Environment env;

	@Autowired
	private CurrencyExchangeRepository repo;
	
	public CurrencyExchange addNewCurrencyRate(String from, String to, BigDecimal rate) {
		
		String port = env.getProperty("local.server.port");
		CurrencyExchange newExch = new CurrencyExchange();
		newExch.setFrom(from);
		newExch.setTo(to);
		newExch.setConversionMultiple(rate);
		newExch.setPort(port);
		CurrencyExchange curr =repo.save(newExch);
		return curr;
	}
   
	
}
