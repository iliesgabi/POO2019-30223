
public class AtelierAuto {
	public static void main(String argv[]) throws CloneNotSupportedException {
		Masina masina = new Masina("Audi", "negru");
		Student student = new Student("Pop", "Cezar", masina);

		System.out.println(student.toString());
		
		
		Student studentClonat1 = student.DeepClone();
		Student studentClonat2 = student.ShallowClone();
		studentClonat1.vopsesteMasina("gri");
		studentClonat2.vopsesteMasina("albstra");
		
		
		System.out.println(studentClonat1.toString());
		System.out.println(studentClonat2.toString());
		
	}
}
