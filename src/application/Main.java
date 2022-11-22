package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Account acc1 = new Account(1, "Alex", 1000.00);
		acc1.withraw(100.00);
		System.out.println(acc1.getBalance());
		Account acc3= new SavingsAccount(3, "Mathew",1000.00, 0.01);
		acc3.withraw(100.00);
		System.out.println(acc3.getBalance());
		Account acc4= new BusinessAccount(4, "Marcos", 1000.00, 200.00);
		acc4.withraw(100.00);
		System.out.println(acc4.getBalance());


		
		
		
		
		
		/*
		Account acc1 = new Account(1, "Alex", 1000.00);
		//Upcasting
		Account acc2= new BusinessAccount(2, "Marcos", 0.0, 300.00);
		Account acc3= new SavingsAccount(3, "Mathew",0.0, 0.01);
		//como se o resto fosse desconsiderado, os metodos q não forem da account

		//acc2.loan
		//Downcasting 
		//pede pra fazer o casting 
		BusinessAccount bacc2= (BusinessAccount) acc2;
		bacc2.loan(100.00); consigo fazer o loan qnd eu converto ela pra Business Account
		BusinessAccount bacc3= (BusinessAccount) acc3;
		 bacc3.loan(200.00); dá uma exceção	
		 if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5= (BusinessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}*/
	}

}
