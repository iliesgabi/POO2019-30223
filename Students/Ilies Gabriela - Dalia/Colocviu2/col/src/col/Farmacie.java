package col;

import java.util.ArrayList;
import java.util.HashMap;

public class Farmacie {
	private String denumire;
	private String adresa;
	private String nrTelefon;
	private String website;
	private ArrayList<AngajatFarmacie> angajati;
	private HashMap<AngajatFarmacie, Integer> angajatiRetete;
	private HashMap<Medicament,Integer > stocMedicamente;

	
	public Farmacie(String denumire, String adresa, String nrTelefon, String website) {
		stocMedicamente=new HashMap<Medicament,Integer >();
		angajatiRetete= new HashMap<AngajatFarmacie, Integer>();
		setAngajati(new ArrayList<AngajatFarmacie>());
		this.denumire=denumire;
		this.adresa=adresa;
		this.nrTelefon=nrTelefon;
		this.website=website;
	}


	public HashMap<Medicament,Integer> getStocMedicamente() {
		return stocMedicamente;
	}


	public void setStocMedicamente(HashMap<Medicament,Integer> stocMedicamente) {
		this.stocMedicamente = stocMedicamente;
	}


	public ArrayList<AngajatFarmacie> getAngajati() {
		return angajati;
	}


	public void setAngajati(ArrayList<AngajatFarmacie> angajati) {
		this.angajati = angajati;
	}
	
	public void listAngajati() {
		System.out.println("angajatii sunt:");
		for(AngajatFarmacie angajat: this.angajati) {
			System.out.println(angajat.getNume());
		}
	}
	
	
}
