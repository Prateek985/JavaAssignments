package Constructor;

public class BankAccount {

	String AccountNumber;
	double balance;

	public BankAccount(String AccountNumber,double balance)
	{
		this.AccountNumber = AccountNumber;
		this.balance = balance;
		System.out.println("The value of Account number = "+AccountNumber);
		System.out.println("The value of balance = "+balance);
	}
	
	public double deposit(double balance)
	{
		double newbalance;
		this.balance = balance;
		newbalance = balance+1000.845;
		return newbalance;
	}
	public double withdraw(double balance)
	{
		double newbalance;
		this.balance = balance;
		newbalance = balance-1000.47;
		return newbalance;
	}
	public static void main(String[] args)
	{
		BankAccount bank1 = new BankAccount("012457896541",4521.457);
		double depositbal1 = bank1.deposit(10000);
		double withdrawbal1 =bank1.withdraw(20000);
		System.out.println("The First Deposit amount balance of the account = "+depositbal1);
		System.out.println("The First Withdraw amount balance of the account = "+withdrawbal1);
		double depositbal2 = bank1.deposit(29000);
		double withdrawbal2 = bank1.withdraw(35000);
		System.out.println("The Second Deposit amount balance of the account = "+depositbal2);
		System.out.println("The Second Withdraw amount balance of the account = "+withdrawbal2);
		double depositbal3 = bank1.deposit(50000.478);
		double withdrawbal3 = bank1.withdraw(85000.865);
		System.out.println("The Final deposit balance of the account = "+depositbal3);
		System.out.println("The Final withdraw balance of the account = "+withdrawbal3);
		
	}

}
