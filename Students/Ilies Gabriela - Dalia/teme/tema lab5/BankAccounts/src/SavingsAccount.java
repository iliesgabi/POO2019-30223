
public class SavingsAccount extends Account {
	private double interest;

	public SavingsAccount(int number, double interest) {
		super(number);
		this.interest = interest;
	}

	public void addInterest(double interest) {
		this.deposit(interest);
	}

	public String toString() {
		return "Account " + getAccountNumber() + "balance = " + getBalance() + ": " + "interest = " + interest;
	}
}
