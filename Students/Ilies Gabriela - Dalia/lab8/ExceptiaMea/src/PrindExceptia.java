
public class PrindExceptia {
	public static void main(String argv[]){
		Integer[] coef = { 2, -4, 4 };
		Polinom polinom=new Polinom(coef,3);
		
		try {
		polinom.verificareCoeficienti();
		} catch (NumarNegativ e) {
			System.out.print(e.getMesaj());
		}
	} 
}
