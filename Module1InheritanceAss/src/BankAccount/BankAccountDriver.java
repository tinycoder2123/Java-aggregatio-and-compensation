/*******************************************************************
 * BankAccountDriver.java
 * This class is the main driver for all classes.
 ******************************************************************/
package BankAccount;

public class BankAccountDriver 
{
	public static void main(String[] args) 
	{
		BankAccount[] accounts = new BankAccount[100];
		  accounts[0] = new Savings(1100, .05);
		  accounts[0].deposit(100);
		  accounts[0].withdraw(200);
		  ((Savings) accounts[0]).addInterest();
		  accounts[1] = new Checkings(-100);
		  accounts[1].deposit(50);
		  accounts[2] = new Checkings(200);
		  accounts[2].withdraw(210);
		  accounts[2].deposit(100);
		  ((Checkings) accounts[2]).writeACheck(50);
		 for (int i=0; i<accounts.length && accounts[i] != null; i++)
		  {
		    accounts[i].display();
		  }
	} 
}// end BankAccountDriver class