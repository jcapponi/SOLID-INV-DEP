package com.mc.solid.principles.dip;

public class TestPaymentDebitcard {
	
	public static void main(String[] args) {
		BankCard bankCard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPayment(5000);
	}

}
