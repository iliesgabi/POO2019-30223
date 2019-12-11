
public class Client {
	public static void main(String argv[]) {
		Account conturileMele[] = new Account[10];
		conturileMele[0] = new Account(1);
		conturileMele[1] = new SavingsAccount(2, 250);
		conturileMele[2] = new CurrrentAccount(3, 20000);

		Bank banca = new Bank(conturileMele, 3);
		SavingsAccount contBurse = new SavingsAccount(4, 100);
		banca.openAccount(contBurse);

		System.out.println("nr de conturi dupa deschiderea unui cont nou " + banca.getNrConturi());

		banca.closeAccount(conturileMele[0]);
		System.out.println("nr de conturi dupa inchiderea unui cont " + banca.getNrConturi());

		banca.updateConturi();
		Account[] conturiNoi = banca.getConturi();
		for (int i = 0; i < banca.getNrConturi(); i++)
			System.out.println(
					"nr card " + conturiNoi[i].getAccountNumber() + " suma din cont " + conturiNoi[i].getBalance());

		System.out.println("starea conturilor dupa plata dividendelor:");
		banca.payDividend(500);
		conturiNoi = banca.getConturi();
		for (int i = 0; i < banca.getNrConturi(); i++)
			System.out.println(
					"nr card " + conturiNoi[i].getAccountNumber() + " suma din cont " + conturiNoi[i].getBalance());

	}
}
