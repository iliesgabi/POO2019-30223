package col;

import java.util.ArrayList;

public abstract  class Pacient implements Comparable{
	private String nume;
	private String prenume;
	private int varsta;
	private String sex;
	private ArrayList<Medicament> reteta;
	private int gradSeveritate;
	
	public Pacient(String nume, String prenume, int varsta, String sex) {
		this.setNume(nume);
		this.setPrenume(prenume);
		this.setVarsta(varsta);
		this.setSex(sex);
	}
	
	public ArrayList<Medicament> getReteta() {
		return reteta;
	}
	public void setReteta(ArrayList<Medicament> medicamente) {
		this.reteta = medicamente;
	}

	public int getGradSeveritate() {
		return gradSeveritate;
	}

	public void setGradSeveritate(int gradSeveritate) {
		this.gradSeveritate = gradSeveritate;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public String toString() {
		String mesaj="Medicamentele lui " + this.nume+ " sunt: ";
		for(Medicament it: this.reteta) {
			mesaj= mesaj+ " "+it.getDenumire();
		}
		return mesaj;
	}
}
