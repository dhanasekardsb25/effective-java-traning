package com.banking;

public class BankOperation {

	public BankAccount createAccount(String accNo, String name, String password, float balance, float interestRate) {

		BankAccount bankAccount = new BankAccount();
		
		bankAccount.setAccountNumber(accNo);
		bankAccount.setName(name);
		bankAccount.setPassword(password);
		bankAccount.setBalance(balance);
		bankAccount.setInterestRate(interestRate);
		

		return bankAccount;

	}

	public BankAccount deposit(String accNo, int amt, BankAccount bankobj) {

		if (amt > 0) {
			bankobj.setBalance(bankobj.getBalance() + amt);
			System.out.println("DEPOSIT OPERATION : Success  : Current Balance " + bankobj.getBalance());
		} else {
			System.out.println("Deposit amount cannot be less than zero");
		}
		
		
		
		return bankobj;

	}

	public BankAccount withdraw(String accNo, int amt, BankAccount bankobj, String password) {

		if (bankobj.getPassword().equals(password)) {
			if (amt > 0 && amt < bankobj.getBalance()) {
				bankobj.setBalance(bankobj.getBalance() - amt);
				System.out.println("WITHDRAW OPERATION : Success  : Current Balance " + bankobj.getBalance());
			} else {
				System.out.println("Withdraw amount cannot be less than zero or greater than the amount available");
			}
		} else {
			System.out.println("Invalid Password");
		}

		return bankobj;

	}
	
	public BankAccount creditInterest(String accNo,BankAccount bankobj) {
		
		float creditAmt = (bankobj.getBalance()*bankobj.getInterestRate())/1200;
		System.out.println("Credit Interest Amount " + creditAmt);
		bankobj.setBalance(bankobj.getBalance() + creditAmt);
		System.out.println("New Balance " + bankobj.getBalance());
		
		return bankobj;
		
	}

}
