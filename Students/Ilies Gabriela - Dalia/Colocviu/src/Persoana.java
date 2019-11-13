
public class Persoana {
	private int id;
	private String nume;
	private String nrTelefon;

	public Persoana(int id, String nume, String nrTelefon) {
		this.id = id;
		this.nume = nume;
		this.nrTelefon = nrTelefon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}
}
