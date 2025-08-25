package com.mc.solid.principles.dip;

public class ShoppingMall {
	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doPayment(int amount) {
		bankCard.doTransaction(amount);
	}
}
