/*******************************************************************
 * BankAccounts.java
 * This class is the savings account.
 ******************************************************************/
package BankAccount;

public class Savings extends BankAccount
{
	private double intRate;
	public Savings(double BalanceAmount, double intR)
	{
		super(BalanceAmount);
		this.intRate = intR;
	}
	public void addInterest()
	{
		balance += balance * intRate;
	}
	public void display()
	{
		System.out.printf("Savings account balance = $ %.2f \n", balance);
	}
}// end Savings class
