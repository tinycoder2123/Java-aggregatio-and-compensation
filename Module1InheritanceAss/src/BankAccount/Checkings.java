/*******************************************************************
 * Checkings.java
 * This class is the checkings account.
 ******************************************************************/
package BankAccount;

public class Checkings extends BankAccount
{
	public Checkings(double balanceAmount)
	{
		super(balanceAmount);
	}
	public void writeACheck(double draw)
	{
		super.withdraw(draw + 1);
	}
	public void display()
	{
		System.out.printf("Checking account balance = $ %.2f \n", balance);
	}
}// end Checkings class
