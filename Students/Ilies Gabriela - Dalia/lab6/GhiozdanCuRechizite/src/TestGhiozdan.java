
public class TestGhiozdan {
	public static void main(String argv[]) {
		Rechizita[] rechizite = new Rechizita[10];
		int nrRechizite = 5;
		rechizite[0] = new Manual("Mate");
		rechizite[1] = new Caiet("Mate");
		rechizite[2] = new Manual("Info");
		rechizite[3] = new Caiet("Info");
		rechizite[4] = new Manual("Chimie");

		Caiet caiet1 = new Caiet("Chimie");
		Caiet caiet2 = new Caiet("Fizica");
		Manual manual = new Manual("Fizica");

		Ghiozdan ghiozdanulMeu = new Ghiozdan(rechizite, nrRechizite);
		ghiozdanulMeu.add(caiet1);
		ghiozdanulMeu.add(caiet2);
		ghiozdanulMeu.add(manual);

		System.out.println("numarul de rechizite din ghiozdan e " + ghiozdanulMeu.getNrRechizite());
		System.out.println("numarul de manuale din ghiozdan e " + ghiozdanulMeu.getNrManuale());
		System.out.println("numarul de caiete din ghiozdan e " + ghiozdanulMeu.getNrCaiete());

		System.out.println("Toate rehizitele: ");
		ghiozdanulMeu.listItems();
		System.out.println();

		System.out.println("Toate caietele: ");
		ghiozdanulMeu.listCaiet();

		System.out.println();
		System.out.println("Toate manuale: ");
		ghiozdanulMeu.listManual();
		
	}
}
