import java.util.ArrayList;
import java.util.List;

public class NewsFeed {
	public static void main(String argv[]) {
		FacebookAccount cont1 = new FacebookAccount("Ioana", 25, "Cluj-Napoca");
		FacebookAccount cont2 = new FacebookAccount("Marius", 24, "Bucuresti");
		FacebookAccount cont3 = new FacebookAccount("Iulia", 15, "Timisoara");

		cont1.adaugaPrieten(cont2);
		cont1.adaugaPrieten(cont3);

		System.out.println("prietenii Ioanei sunt: ");
		List<FacebookAccount> prieteni = new ArrayList<FacebookAccount>();
		prieteni = cont1.getPrieteni();

		for (FacebookAccount prieten : prieteni) {
			System.out.println(prieten.toString());
		}

		cont1.stergePrieten(cont2);
		cont1.stergePrieten(cont2);
		cont1.stergePrieten(cont3);
		cont1.stergePrieten(cont2);
	}
}
