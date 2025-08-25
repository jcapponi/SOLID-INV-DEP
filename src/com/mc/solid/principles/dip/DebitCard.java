package com.mc.solid.principles.dip;

public class DebitCard implements BankCard {
	public void doTransaction(int amount) {
		System.out.println("Transacción pagado con DebitCard " + amount);
	}
}
