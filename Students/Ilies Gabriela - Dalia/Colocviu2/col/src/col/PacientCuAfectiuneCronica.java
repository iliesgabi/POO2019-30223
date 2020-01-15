package col;

public class PacientCuAfectiuneCronica extends Pacient {

	public PacientCuAfectiuneCronica(String nume, String prenume, int varsta, String sex) {
		super(nume, prenume, varsta, sex);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void calculareGradSeveritate() {
		int grad=1;
		grad+=this.getReteta().size();
		this.setGradSeveritate(grad);
	}
}
