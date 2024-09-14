package BankAccountExample;

public class SavingAccount extends BankAccount {

	protected double limit;
	
	SavingAccount(double limit){
		this.limit = limit;
	}
	
	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	@Override
	public void withdraw() {
		if(balance != 0 && balance >= amount) {
			if(amount > 0 && amount <= limit) {
				balance = balance - amount;
				System.out.println("Balance :" + balance);
			}
			else {
				System.out.println("Withdraw Limit :" + this.limit);
			}
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
}