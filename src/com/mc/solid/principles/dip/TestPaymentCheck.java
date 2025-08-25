package com.mc.solid.principles.dip;

public class TestPaymentCheck {
	
	public static void main(String[] args) {
		BankCard bankCard = new Check();
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPayment(700);
	}
}
