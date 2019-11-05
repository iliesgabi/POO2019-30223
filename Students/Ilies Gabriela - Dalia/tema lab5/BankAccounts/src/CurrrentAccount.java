
public class CurrrentAccount extends Account {
	private double overdraftLimit;

	public CurrrentAccount(int number, int overdraftLimit) {
		super(number);
		this.overdraftLimit = overdraftLimit;
	}

	public void extragereNumerar(double sum) {
		if (this.getBalance() > this.overdraftLimit && this.getBalance() - sum > this.overdraftLimit) {
			this.withdraw(sum);
		} else {
			System.out.print("nu se mai pot extrage bani");
		}
	}

	public boolean sendLetter() {
		if (this.getBalance() < 0) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Account " + getAccountNumber() + "balance = " + getBalance() + ": " + "overdraftLimit = "
				+ overdraftLimit;
	}
}
