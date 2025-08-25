package com.mc.solid.principles.dip;

public class TestPaymentCreditcard {
	
	public static void main(String[] args) {
		BankCard bankCard = new CreditCard();
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPayment(5000);
	}
}
