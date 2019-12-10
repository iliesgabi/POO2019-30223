
public class Pet {
	private String nume;
	private int varsta;
	private String numeStapan;
	
	public Pet(String nume, int varsta, String numeStapan) {
		this.nume=nume;
		this.varsta=varsta;
		this.numeStapan=numeStapan;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public String getNumeStapan() {
		return numeStapan;
	}
	public void setNumeStapan(String numeStapan) {
		this.numeStapan = numeStapan;
	}
	public String toString() {
		return this.nume+" are "+this.varsta+ " ani"; 
	}
}
