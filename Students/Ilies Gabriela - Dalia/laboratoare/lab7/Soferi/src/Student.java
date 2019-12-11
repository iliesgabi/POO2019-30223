
public class Student implements Cloneable {
	private String nume;
	private String prenume;
	private Masina masina;
	
	
	public Student(String nume, String prenume, Masina masina) {
		this.nume = nume;
		this.prenume = prenume;
		this.masina = masina;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Masina getMasina() {
		return masina;
	}

	public Student DeepClone() throws CloneNotSupportedException{
		Student student=(Student)super.clone();
		student.masina= (Masina)masina.clone();
		return student;
	}
	
	public Student ShallowClone() throws CloneNotSupportedException {
		return (Student)super.clone();
	}
	
	public void vopsesteMasina(String culoare) {
		this.masina.setCuloare(culoare);
	}
	
	public String toString() {
		return this.nume+" "+this.prenume+" are o masina marca "+ this.masina.getMarca()+" de culoarea "+this.masina.getCuloare();
	}
}
