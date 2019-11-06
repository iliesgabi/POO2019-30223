
public class Ghiozdan {
	private Rechizita[] rechizite;
	private int nrRechizite;

	public Ghiozdan(Rechizita[] rechizite, int nrRechizite) {
		this.rechizite = rechizite;
		this.nrRechizite = nrRechizite;
	}

	public Rechizita[] getRechizite() {
		return this.rechizite;
	}

	public void add(Caiet caiet) {
		rechizite[nrRechizite] = caiet;
		nrRechizite++;
	}

	public void add(Manual manual) {
		rechizite[nrRechizite] = manual;
		nrRechizite++;
	}

	public void listItems() {
		for (int i = 0; i < this.nrRechizite; i++)
			System.out.println(this.rechizite[i].getNume());
	}

	public void listManual() {
		for (int i = 0; i < this.nrRechizite; i++)
			if (rechizite[i] instanceof Manual)
				System.out.println(rechizite[i].getNume());
	}

	public void listCaiet() {
		for (int i = 0; i < this.nrRechizite; i++)
			if (rechizite[i] instanceof Caiet)
				System.out.println(rechizite[i].getNume());
	}

	public int getNrRechizite() {
		return nrRechizite;
	}

	public int getNrManuale() {
		int nrManuale = 0;
		for (int i = 0; i < this.nrRechizite; i++)
			if (rechizite[i] instanceof Manual)
				nrManuale++;
		return nrManuale;
	}

	public int getNrCaiete() {
		int nrCaiete = 0;
		for (int i = 0; i < this.nrRechizite; i++)
			if (rechizite[i] instanceof Caiet)
				nrCaiete++;
		return nrCaiete;
	}

}
