
public class Persoana implements Comparable {
	private String nume;
	private String prenume;
	private int varsta;

	public Persoana(String nume, String prenume, int varsta) {
		this.setNume(nume);
		this.setPrenume(prenume);
		this.varsta = varsta;
	}

	@Override
	public int compareTo(Object arg0) {
		if (this.varsta == ((Persoana) arg0).getVarsta()) {
			return 0;
		} else {
			if (this.varsta > ((Persoana) arg0).getVarsta()) {
				return 1;
			} else
				return -1;
		}

	}
	
	public String toString() {
		return (this.nume+" "+this.prenume+" are "+this.varsta+ " de ani");
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getVarsta() {
		return varsta;
	}

}
