
public class AruncaExceptii {

	public static void g(Integer x) throws NumarPreaMic {
		if (x < 10)
			throw new NumarPreaMic();
		else
			System.out.println("numar mai mare decat 10");
	}

	public static void f(Integer[] vector) throws NumarPreaMic, NumarGresit {
		try {
			for (int i = 0; i < vector.length; i++) {
				g(vector[i]);
			}
		} catch (NumarPreaMic e) {
			e.getMessage();
			throw new NumarGresit();
		}
	}
}
