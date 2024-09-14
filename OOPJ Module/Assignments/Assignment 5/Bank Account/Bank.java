package BankAccountExample;

public class Bank {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		ba.setBalance(50000);
		ba.getBalance();
		
		ba.setAmount(10000);
		ba.getAmount();
		
		ba.withdraw();
		
		SavingAccount sa = new SavingAccount(12000);
		
		sa.setBalance(50000);
		sa.getBalance();
		
		sa.setAmount(5000);
		sa.getAmount();
		
		
		sa.withdraw();
		
		
	}
}
