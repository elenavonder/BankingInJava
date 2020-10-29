package com.maxtrain.elena;

public class Account {

	private static int NextId = 1;
	public int id;
	public String description;
	public double balance;
	
	//Reading the id value
	//This method makes the data accessible outside of class
	public int getId() {
		return id;
	}
	
	//Set the id value
	//This method makes the data accessible outside of class
	private void setId(int ID) {
		this.id = ID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		if (balance <= 0) {
			
		}
		this.balance = balance;
	}
	
	public Boolean transfer (double amount, Account ToAccount) {
		var withdrawOk = this.Withdraw(amount);
		if(withdrawOk) {
			ToAccount.Deposit(amount);
			return true;
		}
		return false;
	}
	
	public Boolean Withdraw (double amount) {
		if(amount <= 0) {
			return false;
		}
		if(amount > this.getBalance()) {
			return false;
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}
	
	public Boolean Deposit(double amount) {
	   if (amount <= 0) {
		   return false;
	   }
	   this.setBalance(this.getBalance() + amount);
	   return true;
	}
	
	public Account (String description) {
		//this.id = Account.NextId++;
		this.setId(Account.NextId++);
		this.setDescription("New Account");
		this.setBalance(0);
	}
	
	public Account() {
		this("New Account");
	}
}
