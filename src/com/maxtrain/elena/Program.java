package com.maxtrain.elena;

public class Program {

	public static void main(String[] args) {
		
		var acct1 = new Savings("Primary Savings Account");
		var acct2 = new Account("Secondary Account");
		
		acct1.Deposit(500);
		var success = acct1.transfer(200, acct2);
		if (success) {
			System.out.println("Acct1 balance is " + acct1.getBalance());
			System.out.println("Acct2 balance is " + acct2.getBalance());
		}
		
		//Pay interest on acct1
		acct1.setIntrate(.12);
		acct1.payInterest(1);
		System.out.println("Acct1 balance after interest " + acct1.getBalance());
	}

}
