
public class Angajat extends Persoana implements Comparable {
	private String dataAngajare;
	private int nrClientiServiti;

	public Angajat(int id, String nume, String nrTelefon, String dataAngajare, int nrClientiServiti) {
		super(id, nume, nrTelefon);
		this.dataAngajare = dataAngajare;
		this.nrClientiServiti = nrClientiServiti;
	}

	public String toString() {
		return "Angajatul " + this.getNume() + " a cazat " + this.nrClientiServiti + " clienti";
	}

	public void cazeazaClient(Client client, Camera camera, String regim, String data) {
		camera.adaugaClient(client, regim);
		client.setDataCheckIn(data);
		client.setNrCamera(camera.getNrIdentificare());
		this.nrClientiServiti++;
	}

	public void decazeazaClient(Client client, Camera camera, String data) {
		camera.scoateClient(client);
		client.setDataCheckOut(data);
		this.nrClientiServiti++;
	}

	@Override
	public int compareTo(Object o) {
		if (this.nrClientiServiti == ((Angajat) o).nrClientiServiti) {
			return 0;
		} else if (this.nrClientiServiti < ((Angajat) o).nrClientiServiti) {
			return -1;
		} else {
			return 1;
		}
	}

}
