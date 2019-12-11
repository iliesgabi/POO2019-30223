
public class PrindemExceptia {
	public static void main(String argv[]) {
		Obiect obiect = null;
		try {
			System.out.print(obiect.getNumeObiect());
		} catch (NullPointerException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
