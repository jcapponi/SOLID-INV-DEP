package com.mc.solid.principles.dip;

public class Check implements BankCard {

	@Override
	public void doTransaction(int amount) {
		System.out.println("Transacción pagada con Cheque " + amount);

		
	}
	
	

}
