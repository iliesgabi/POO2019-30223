
public class Test {
	public static void testHasNext() {
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

		System.out.println("mai exista carti in pachet? " + pachet.hasNext());
	}

	public static void testNext() {
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

		System.out.println("cartile din pachet sunt: ");
		for (int i = 0; i < pachet.getNrOfCards(); i++) {
			Card carte = pachet.next();
			System.out.println(carte.getNumar() + " " + carte.getSuit());
		}
	}

	public static void remove() {
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

		System.out.println("cartile din pachet sunt: ");
		for (int i = 0; i < pachet.getNrOfCards(); i++) {
			Card carte = pachet.next();
			System.out.println(carte.getNumar() + " " + carte.getSuit());
		}

		pachet.remove(carti[0]);
		pachet.remove(carti[12]);
		pachet.remove(carti[5]);
		Card[] pachetNou = pachet.getPachet();
		System.out.println("dupa stergeri cartile din pachet sunt: ");
		for (int i = 0; i < pachet.getNrOfCards(); i++) {
			System.out.println(pachetNou[i].getNumar() + " " + pachetNou[i].getSuit());
		}
	}
}
