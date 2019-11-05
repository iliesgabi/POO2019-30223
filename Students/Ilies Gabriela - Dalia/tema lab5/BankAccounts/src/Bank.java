
public class Bank {
	private Account conturi[]=new Account[50];
	private int nrConturi;

	Bank(Account[] conturi, int nrConturi) {
		this.conturi = conturi;
		this.nrConturi = nrConturi;
	}

	public int getNrConturi() {
		return nrConturi;
	}

	public Account[] getConturi() {
		return conturi;
	}

	public void openAccount(Account cont) {
		conturi[nrConturi] = cont;
		nrConturi++;
	}

	public void closeAccount(Account cont) {
		int nrCont = 0;
		for (int i = 0; i < this.nrConturi; i++) {
			if (conturi[i].getAccountNumber() == cont.getAccountNumber()) {
				nrCont = i;
				break;
			}
		}
		for (int i = nrCont; i < this.nrConturi; i++)
			conturi[i] = conturi[i + 1];
		
		this.nrConturi--;
	}

	public void payDividend(double sum) {
		for (int i = 0; i < nrConturi; i++) {
			conturi[i].deposit(sum);
		}
	}

	public void updateConturi() {
		for (int i = 0; i < nrConturi; i++) {
			if (conturi[i] instanceof SavingsAccount) {
				((SavingsAccount) conturi[i]).addInterest(250);
			} else {
				if (conturi[i] instanceof CurrrentAccount) {
					((CurrrentAccount) conturi[i]).sendLetter();
				}
			}
		}
	}

}
