
public class PrindemExceptia {

	public static void main(String argv[]) {

		Integer[] vector=new Integer[5];
		try {
			System.out.print(vector[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
