import java.util.ArrayList;
import java.util.List;

public class FacebookAccount {
	private String nume;
	private int varsta;
	private String locatieCurenta;
	private List<FacebookAccount> prieteni;

	public FacebookAccount(String nume, int varsta, String locatieCurenta) {
		this.nume = nume;
		this.varsta = varsta;
		this.locatieCurenta = locatieCurenta;
		this.prieteni= new ArrayList<FacebookAccount>();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getLocatieCurenta() {
		return locatieCurenta;
	}

	public void setLocatieCurenta(String locatieCurenta) {
		this.locatieCurenta = locatieCurenta;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public List<FacebookAccount> getPrieteni() {
		return prieteni;
	}

	public void setPrieteni(List<FacebookAccount> prieteni) {
		this.prieteni = prieteni;
	}

	public void adaugaPrieten(FacebookAccount prieten) {
		this.prieteni.add(prieten);
		prieten.prieteni.add(this);
	}

	public void stergePrieten(FacebookAccount prieten) {
		if (this.prieteni.isEmpty() == true) {
			System.out.println("nu exista nici un prieten");
		} else {
			if (this.prieteni.contains(prieten) == true) {
				this.prieteni.remove(prieten);
				prieten.prieteni.remove(this);
			} else {
				System.out.println("nu exista acest prieten");
			}
		}
	}
	
	public String toString(){
		return this.nume+ " are "+this.varsta+" si este in "+this.locatieCurenta; 
	}
}
