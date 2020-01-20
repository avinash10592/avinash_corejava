/**
 * 
 */
package com.nisum.corejava.objectsandclass.examples;

/**
 * @author Nisum
 *
 */
public class Account {

	int acc_no;
	String name;
	float amount;

	// Method to initialize object
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}

	// deposit method
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println("deposited amount " + amt);

	}

	// withdraw method
	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println("withdrawn amount " + amt);
		}
	}

	// method to check the balance of the account
	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}

	// method to display the values of an object
	void display() {
		System.out.println("Account Deatils");
		System.out.println("Account no: " + acc_no + " " + "Name: " + name);
	}
}

class Test {
	// Creating a test class to deposit and withdraw amount
	public static void main(String[] args) {
		Account acc = new Account();
		acc.insert(832345, "Ankit", 1000);
		acc.display();
		acc.checkBalance();
		acc.deposit(40000);
		acc.checkBalance();
		acc.withdraw(15000);
		acc.checkBalance();
	}
}