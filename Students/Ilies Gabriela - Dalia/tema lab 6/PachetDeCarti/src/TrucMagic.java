import java.util.Scanner;

public class TrucMagic {

	public static void main(String argv[]) {
		Card[] carti = new Card[52];
		carti[0] = new Card("2", "diamond");
		carti[1] = new Card("3", "diamond");
		carti[2] = new Card("4", "diamond");
		carti[3] = new Card("5", "diamond");
		carti[4] = new Card("6", "diamond");
		carti[5] = new Card("7", "diamond");
		carti[6] = new Card("8", "diamond");
		carti[7] = new Card("9", "diamond");
		carti[8] = new Card("10", "diamond");
		carti[9] = new Card("J", "diamond");
		carti[10] = new Card("Q", "diamond");
		carti[11] = new Card("K", "diamond");
		carti[12] = new Card("A", "diamond");
		DeckOfCards pachet = new DeckOfCards(carti, 13);

		Card carteNoua = new Card("2", "spade");
		pachet.put(carteNoua);
		Card[] pachetNou = new Card[14];
		pachetNou = pachet.getPachet();

		for (int i = 0; i < pachet.getNrOfCards(); i++)
			System.out.println(pachetNou[i].getNumar() + " " + pachetNou[i].getSuit());

		System.out.println("extrageti o carte dintre cele existente in pachet");
		Scanner input = new Scanner(System.in);
		System.out.println("dati numarul cartii ");
		String numar = input.next();
		System.out.println("dati culoarea cartii ");
		String culoare = input.next();
		Card cartePtTruc = new Card(numar, culoare);
		pachet.remove(cartePtTruc);

		System.out.println("acum pachetul arata asa: ");
		for (int i = 0; i < pachet.getNrOfCards(); i++)
			System.out.println(pachetNou[i].getNumar() + " " + pachetNou[i].getSuit());

		Test.testHasNext();
		Test.testNext();
		Test.remove();

	}
}
