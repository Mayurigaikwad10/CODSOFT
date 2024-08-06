package com.example3;

public class AtmMachine {


		// TODO Auto-generated method stub
//		 1.
//		 Create a class to represent the ATM machine.
//		 2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
//		 checking the balance.
//		 3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
//		 checkBalance().
//		 4. Create a class to represent the user's bank account, which stores the account balance.
//		 5. Connect the ATM class with the user's bank account class to access and modify the account
//		 balance.
//		 6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals)

	    private BankAccount account;

	    public AtmMachine(BankAccount account) {
	        this.account = account;
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && account.getBalance() >= amount) {
	            account.decreaseBalance(amount);
	            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
	        } else {
	            System.out.println("Insufficient funds or invalid amount.");
	        }
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            account.increaseBalance(amount);
	            System.out.println("Deposit successful. New balance: " + account.getBalance());
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void checkBalance() {
	        System.out.println("Current balance: " + account.getBalance());
	    }
	}
