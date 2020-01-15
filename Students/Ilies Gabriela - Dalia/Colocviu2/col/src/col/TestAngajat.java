package col;

import junit.framework.TestCase;

public class TestAngajat extends TestCase{
	
	private AngajatFarmacie angajat;
	public void testAddMedicament(Medicament medicament, Farmacie farmacie) {
		angajat= new AngajatFarmacie();
		int size= farmacie.getStocMedicamente().size();
		angajat.addMedicamente(medicament, farmacie);
		size++;
		assertEquals(size,farmacie.getStocMedicamente().size());
	}
	
	public void testRemoveMedicament(Medicament medicament, Farmacie farmacie) {
		angajat= new AngajatFarmacie();
		int size= farmacie.getStocMedicamente().size();
		angajat.removeMedicamente(medicament, farmacie);
		size--;
		assertEquals(size,farmacie.getStocMedicamente().size());
	}
	
	public void testVerificareStoc(Medicament medicament, Farmacie farmacie) {
		angajat= new AngajatFarmacie();
		assertEquals(farmacie.getStocMedicamente().get(medicament)>0,angajat.verificaStoc(medicament, farmacie));
	}
	
	public void testSeVinde(Medicament medicament, Farmacie farmacie) {
		angajat= new AngajatFarmacie();
		assertEquals(farmacie.getStocMedicamente().containsKey(medicament),angajat.seVinde(medicament, farmacie));
	}
	
	public void testProcesareReteta(Pacient pacient) {
		angajat= new AngajatFarmacie();
		int cost=0;
		for(Medicament med: pacient.getReteta()) {
			cost+=med.getPret();
		}
		Double bonus=cost*0.015;
		angajat.procesareReteta(pacient);
		assertEquals(bonus,angajat.getBonus());
	}
	
	public void testModificaStoc(Medicament medicament, Farmacie farmacie) {
		
	}
}
