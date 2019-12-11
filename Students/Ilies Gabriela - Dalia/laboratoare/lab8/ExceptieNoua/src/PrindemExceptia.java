
public class PrindemExceptia {
	public static void main(String argv[]) {

		try {
			String nrTelefon = new String("0756474701100");
			if (nrTelefon.length() > 10) {
				throw new NumarGresit("prea multe cifre");
			}
		} catch (NumarGresit e) {
			e.getMessage();
		} finally {
			System.out.print("s-a ajuns aici");
		}
	}
}
