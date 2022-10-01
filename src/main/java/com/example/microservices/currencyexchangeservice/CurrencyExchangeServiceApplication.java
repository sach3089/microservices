package com.example.microservices.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class CurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}
	
//	@EventListener(ApplicationReadyEvent.class)
//	public void doSomethingAfterStartup() {
//		CurrencyExchaneHandler handler = new CurrencyExchaneHandler("doller", "inr", 75.5);
//		handler.setName("currency-handler-thread");
//		handler.start();
//	}

}
