import java.util.Arrays;
import java.util.NoSuchElementException;

public class DeckOfCards implements OrderedIterator {
	private Card[] pachet;
	private int nrOfCards;
	private int nrCarteNext;
	private int nrCarteHasNext;

	public DeckOfCards(Card[] pachet, int nrOfCards) {
		this.pachet = pachet;
		this.nrOfCards = nrOfCards;
		this.nrCarteNext = 0;
		this.nrCarteHasNext = 0;
	}

	public Card[] getPachet() {
		return this.pachet;
	}

	public int getNrOfCards() {
		return this.nrOfCards;
	}

	public void remove(Card carte) {
		if (isCardInDeck(carte) == true) {
			int nr = 0;
			for (int i = 0; i < this.nrOfCards; i++) {
				if (carte.getNumar() == pachet[i].getNumar()) {
					nr = i;
					break;
				}
			}
			for (int k = nr; k < this.nrOfCards - 1; k++) {
				pachet[k] = pachet[k + 1];
			}
			this.nrOfCards--;
		} else
			System.out.print("mai incearca");
	}

	@Override
	public boolean hasNext() {
		if (this.pachet[this.nrCarteHasNext++].getNumar() == "A") {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Card next() {

		return this.pachet[this.nrCarteNext++];

	}

	private boolean isCardInDeck(Card card) {
		for (int i = 0; i < this.nrOfCards; i++)
			if (pachet[i].compareTo(card) == 0)
				return true;
		return false;
	}

	@Override
	public int put(Comparable comparable) {
		if (isCardInDeck((Card) comparable) == false && this.nrOfCards < 52) {
			this.nrOfCards++;
			this.pachet[this.nrOfCards - 1] = (Card) comparable;
			Arrays.sort(pachet, 0, this.nrOfCards);
			return 1;
		} else {
			return 0;
		}
	}

}
