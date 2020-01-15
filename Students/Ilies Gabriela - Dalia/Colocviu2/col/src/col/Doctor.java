package col;

import java.util.ArrayList;
import java.util.Random;

public class Doctor{
	public Pacient oferaConsultatie(Pacient pacient) {
		Random rand = new Random(); 
		int random=rand.nextInt(2);
		if (random==0)
			pacient= new PacientCuAfectiuneAcuta(pacient.getNume(), pacient.getPrenume(), pacient.getVarsta(), pacient.getSex());
		else
			pacient= new PacientCuAfectiuneCronica(pacient.getNume(), pacient.getPrenume(), pacient.getVarsta(), pacient.getSex());
		return pacient;
	}
	
	public void creareReteta(ArrayList<Medicament> medicamente, Pacient pacient) {
		pacient.setReteta(medicamente);
	}

}
