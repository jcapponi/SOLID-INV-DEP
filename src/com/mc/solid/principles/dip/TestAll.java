package com.mc.solid.principles.dip;

public class TestAll {

	public static void main(String[] args) {
		
		BankCard check = new Check();
		//Check check = new Check();
		ShoppingMall shoppingMall = new ShoppingMall(check);
		shoppingMall.doPayment(700);
	
		BankCard pp = new CreditCard();
		shoppingMall = new ShoppingMall(pp);
		shoppingMall.doPayment(15000);
	
		BankCard debitCard = new DebitCard();
		shoppingMall = new ShoppingMall(debitCard);
		shoppingMall.doPayment(5000);
	
	}
	
	
}
