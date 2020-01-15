package col;

public interface AtributiiAngajat {
	public void addMedicamente(Medicament medicament, Farmacie farmacie);
	public void removeMedicamente(Medicament medicament, Farmacie farmacie);
	public boolean verificaStoc(Medicament medicament, Farmacie farmacie);
	public boolean seVinde(Medicament medicament, Farmacie farmacie);
	public Double procesareReteta(Pacient pacient);
	public void modificaStoc(Medicament medicament, Farmacie farmacie);
}
