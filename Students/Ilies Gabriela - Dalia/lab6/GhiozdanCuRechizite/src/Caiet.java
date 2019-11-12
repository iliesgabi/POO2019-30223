
public class Caiet extends Rechizita {
	public Caiet(String eticheta) {
		this.eticheta = eticheta;
	}

	public String getNume() {
		String caiet = "Caiet ";
		caiet = caiet.concat(this.eticheta);
		return caiet;

	}
}
