package com.example.microservices.currencyexchangeservice;

import java.math.BigDecimal;

//import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
    
	@Autowired
	private CurrencyExchangeRepository repo;
	
	@Autowired
	private CurrencyExchnageService  exchangeService;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from , @PathVariable String to) {
		
		CurrencyExchange currexc  = repo.findByFromAndTo(from, to);
		if(currexc== null) {
			throw new RuntimeException("data not found for " + from + " to " + to);
		}
		return currexc;
	}
	
	@PostMapping("/currency-exchange/from/{from}/to/{to}/rate/{rate}")
	public ResponseEntity<String> addCurrencyExchangeRate(@PathVariable String from, @PathVariable String to, 
			@PathVariable BigDecimal rate){
		CurrencyExchange ex = exchangeService.addNewCurrencyRate(from,to,rate);
		return new ResponseEntity<String>(HttpStatus.CREATED);
		 
	}
}
