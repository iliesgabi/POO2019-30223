package col;

public class PacientCuAfectiuneAcuta extends Pacient{

	
	public PacientCuAfectiuneAcuta(String nume, String prenume, int varsta, String sex) {
		super(nume, prenume, varsta, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void calculareGradSeveritate() {
		int grad=0;
		grad+=this.getReteta().size();
		this.setGradSeveritate(grad);
	}

}
