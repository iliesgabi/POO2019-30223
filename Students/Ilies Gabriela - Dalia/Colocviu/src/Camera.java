
public class Camera {
	private int nrIdentificare;
	private int capacitate;
	private int pretPerNoapte;
	private int pretSingle;
	private Client[] client;
	private int nrOaspeti;
	private boolean single;

	public Camera(int nrIdentificare, int capacitate, int pretPerNoapte, int pretSingle) {
		this.nrIdentificare = nrIdentificare;
		this.capacitate = capacitate;
		this.pretPerNoapte = pretPerNoapte;
		this.pretSingle = pretSingle;
		this.nrOaspeti = 0;
		this.client = new Client[capacitate];
	}

	public void adaugaClient(Client client, String regim) {
		if (this.capacitate > this.nrOaspeti) {
			this.client[this.nrOaspeti] = client;
			this.nrOaspeti++;
			if (regim.equals("single")) {
				this.single = true;
			} else {
				this.single = false;
			}
		} else
			System.out.print("camera plina");
	}

	public void scoateClient(Client client) {
		if (this.single == true) {
			this.nrOaspeti = 0;
		} else {
			int aux = 0;
			for (int i = 0; i < this.nrOaspeti; i++) {
				if (client.getId() == this.client[i].getId()) {
					aux = i;
					break;
				}
			}
			for (int i = aux; i < this.nrOaspeti - 1; i++) {
				this.client[i] = this.client[i + 1];
			}
			this.nrOaspeti--;
		}
	}

	public int calculeazaPret(int nrNopti, int discount) {
		if (this.single == true) {
			return (this.pretSingle * nrNopti - discount);
		} else {
			return (this.pretPerNoapte * nrNopti - discount);
		}
	}

	public boolean esteOcupata() {
		if (this.capacitate == this.nrOaspeti) {
			return true;
		} else {
			return false;
		}
	}

	public int getNrIdentificare() {
		return nrIdentificare;
	}

	public int getNrOaspeti() {
		return nrOaspeti;
	}
	
	public Client[] getClient()
	{
		return client;
	}
}
