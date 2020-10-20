package com.app;

import com.banking.BankAccount;
import com.banking.BankOperation;

public class TestBankDetails {

	public static void main(String[] args) {
		
		BankOperation bankOp = new BankOperation();
		BankAccount bankobj = bankOp.createAccount("Dhanasekar","123456789", "testapp123", 10000, 4);
		
		// Deposit Amount
		bankOp.deposit("123456789", 100, bankobj);
		
		// Withdraw Amount
		bankOp.withdraw("123456789", 100, bankobj,"testapp123");
		
		// Credit Interest
		bankOp.creditInterest("123456789", bankobj);

	}

}
