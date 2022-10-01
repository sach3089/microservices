//package com.example.microservices.currencyexchangeservice;
//
//import java.util.concurrent.ExecutorService;
//
//import org.hibernate.internal.build.AllowSysOut;
//
//public class CurrencyExchaneHandler extends Thread{
//	
//	private String currencyA;
//	private String currencyB;
//	private double strength;
//	private ExecutorService executor;
//	
//	
//	
//	
//	public CurrencyExchaneHandler(String currencyA, String currencyB, double strength) {
//		super();
//		this.currencyA = currencyA;
//		this.currencyB = currencyB;
//		this.strength = strength;
//	}
//
//
//
//
//	public void run() {
//		while(true) {
//			System.out.println("handler thread called for checking of two currency");
//			System.out.println(Thread.currentThread().getName());
//			System.out.println(Thread.currentThread().getState());
//			try {
//				Thread.sleep(5000);
//				System.out.println(Thread.currentThread().getState());
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("thread started after 5 seconds");
//			/*Runnable worker = new CurrencyExchangeWorker();
//			executor.execute(worker);*/
//			CurrencyExchangeWorker ex = new CurrencyExchangeWorker();
//			ex.run();
//		}
//	}
//	
//
//}
