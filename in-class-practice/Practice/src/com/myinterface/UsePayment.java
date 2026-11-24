package com.myinterface;

public class UsePayment {

	public static void main(String[] args) {
		CreditCardPayment ccp = new CreditCardPayment();
		ccp.pay(1000);
		
		Payment p1 = new UpiPayment();
		p1.pay(500);
		
		
	}

}
