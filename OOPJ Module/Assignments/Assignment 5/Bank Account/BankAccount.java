// 1) Create a base class BankAccount with methods like deposit() and withdraw().
//	Derive a class SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal amount.
//	Write a program that demonstrates the use of overridden methods 
//	and proper access modifiers & return the details.

package BankAccountExample;

public class BankAccount {
	
	double amount;
	double balance;
	
	public BankAccount() {
	
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit() {
		System.out.println("Deposit: ");
	}
	
	public void withdraw() {
		if (balance != 0 && balance >= amount) {
		balance = balance - amount;
		System.out.println("Balance: "+ this.balance);
		}
		else {
			System.out.println("Insufficient Balance in Account");
		}
	}
}