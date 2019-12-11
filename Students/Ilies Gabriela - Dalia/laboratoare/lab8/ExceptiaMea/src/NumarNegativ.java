
public class NumarNegativ extends Exception {
	private String mesaj;

	public NumarNegativ() {
		super("Numarul nu e pozitiv");
	}

	public NumarNegativ(String mesaj) {
		super(mesaj);
		this.mesaj=mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}
}
