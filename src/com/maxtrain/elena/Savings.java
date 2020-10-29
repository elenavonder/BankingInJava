package com.maxtrain.elena;

//extends is the same as : (inheritance) in C#
public class Savings extends Account {
	//Setting it to $0.01 interest
	private double intrate = 0.01;

	public double getIntrate() {
		return intrate;
	}

	public void setIntrate(double intrate) {
		if(this.intrate < 0) {
			return;
		}
		this.intrate = intrate;
		
	}
	
	public double payInterest(int months) {
		var interest = this.getBalance() * (this.getIntrate()/12) * months;
		this.Deposit(interest);
		return interest;
	}
	
	//This constructor is calling the default constructor in the Account class that is also calling the constructor calling
	//the constructor with one parameter
	public Savings() {
		super();
	}
	
	//Savings constructor that takes one String parameter, we want to pass description to Account class. 
	//We do this by using "super" to talk to the constructor in the Account class with one parameter that talks to the other constructor.
	public Savings(String description) {
		super(description);
	}
	
}
