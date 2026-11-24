package com.myinterface;

public interface Payment {
	static final double minPayment = 1000;
	
	void pay(double amount);
}
