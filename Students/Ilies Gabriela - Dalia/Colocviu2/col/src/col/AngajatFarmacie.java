package col;

import java.util.Date;
import java.util.HashMap;

public class AngajatFarmacie implements AtributiiAngajat {
	private String nume;
	private Integer id;
	private Date dataAngajarii;
	private Double bonusSalariu;
	private Integer reteteProcesate;;
	
	public AngajatFarmacie() {
		
	}
	
	public AngajatFarmacie(String nume, Integer id, Date dataAngajarii) {
		this.setNume(nume);
		this.id=id;
		this.dataAngajarii=dataAngajarii;
		this.bonusSalariu=0.0;
		this.reteteProcesate=0;
	}

	@Override
	public void addMedicamente(Medicament medicament, Farmacie farmacie) {
		HashMap<Medicament,Integer> medicamente=farmacie.getStocMedicamente();
		medicamente.put(medicament,10);
		farmacie.setStocMedicamente(medicamente);
	}

	@Override
	public void removeMedicamente(Medicament medicament, Farmacie farmacie) {
		HashMap<Medicament,Integer> medicamente=farmacie.getStocMedicamente();
		medicamente.remove(medicament);
		farmacie.setStocMedicamente(medicamente);
	}

	@Override
	public boolean verificaStoc(Medicament medicament, Farmacie farmacie) {
		if (farmacie.getStocMedicamente().get(medicament)>0)
			return true;
		return false;
	}

	@Override
	public boolean seVinde(Medicament medicament, Farmacie farmacie) {
		if (farmacie.getStocMedicamente().containsKey(medicament)==true)
			return true;
		return false;
	}

	@Override
	public Double procesareReteta(Pacient pacient) {
		int cost=0;
		for(Medicament med: pacient.getReteta()) {
			cost+=med.getPret();
		}
		this.bonusSalariu=cost*0.015;
		this.reteteProcesate++;
		return this.bonusSalariu;
	}

	@Override
	public void modificaStoc(Medicament medicament, Farmacie farmacie) {
		HashMap<Medicament,Integer> medicamente=farmacie.getStocMedicamente();
		int key= medicamente.get(medicament);
		if (key>1)
			key--;
		else
			medicamente.remove(medicament);
		farmacie.setStocMedicamente(medicamente);
	}
	
	public Double getBonus() {
		return this.bonusSalariu;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
}
