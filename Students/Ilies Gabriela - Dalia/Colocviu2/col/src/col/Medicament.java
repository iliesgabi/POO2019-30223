package col;

public class Medicament {
	private String producator;
	private String denumire;
	private Double pret;
	private Double gramaj;
	
	public Medicament(String producator,String denumire,Double pret, Double gramaj) {
		this.setDenumire(denumire);
		this.gramaj=gramaj;
		this.setPret(pret);
		this.producator=producator;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public Double getPret() {
		return pret;
	}

	public void setPret(Double pret) {
		this.pret = pret;
	}
}
