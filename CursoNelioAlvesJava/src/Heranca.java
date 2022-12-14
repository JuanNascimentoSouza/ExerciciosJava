package Package;

import Entities2.Account;
import Entities2.BusinessAccount;
import Entities2.SavingsAccount;

public class Heranca {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPSCALING
		
		Account acc1 = bacc;
		System.out.println(acc1);
		Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
		System.out.println(acc2);
		Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		if (acc3 instanceof BusinessAccount) {
		BusinessAccount acc5 = (BusinessAccount) acc3;
		acc5.loan(200.0);
		System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
	}
}
