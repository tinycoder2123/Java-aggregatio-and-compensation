/*******************************************************************
 * BankAccount.java
 * This class sets up bank accounts.
 ******************************************************************/

package BankAccount;
public  abstract class BankAccount 
{
	protected double balance;
	public BankAccount(double balanceAmount)
	{
		this.balance = balanceAmount;
		if (balance < 0)
		{
			balance = 0;
		}
	}
	public void deposit(double depo)
	{
		balance += depo;
	}
	public void withdraw (double draw)
	{
		balance -= draw;
		if (balance < 0)
		{
			balance = 0;
		}
	}
	public abstract void display();
}// end BankAccount class
