
public class Card implements Comparable {
	private String numar;
	private String suit;

	public Card(String numar, String suit) {
		this.numar = numar;
		this.suit = suit;
	}

	public String getNumar() {
		return numar;
	}

	public String getSuit() {
		return suit;
	}

	private int getIntNumar() {
		if (this.numar.equals("2"))
			return 2;
		if (this.numar.equals("3"))
			return 3;
		if (this.numar.equals("4"))
			return 4;
		if (this.numar.equals("5"))
			return 5;
		if (this.numar.equals("6"))
			return 6;
		if (this.numar.equals("7"))
			return 7;
		if (this.numar.equals("8"))
			return 8;
		if (this.numar.equals("9"))
			return 9;
		if (this.numar.equals("10"))
			return 10;
		if (this.numar.equals("J"))
			return 11;
		if (this.numar.equals("Q"))
			return 12;
		if (this.numar.equals("K"))
			return 13;
		if (this.numar.equals("A"))
			return 14;
		return 0;
	}

	private int getNumberOfSuit() {
		if (this.suit.equals("diamond"))
			return 0;
		if (this.suit.equals("club"))
			return 1;
		if (this.suit.equals("heart"))
			return 2;
		if (this.suit.equals("spade"))
			return 3;
		return 0;
	}

	@Override
	public int compareTo(Object arg0) {
		if (this.getIntNumar() == ((Card) arg0).getIntNumar()
				&& this.getNumberOfSuit() == ((Card) arg0).getNumberOfSuit()) {
			return 0;
		}
		if (this.getIntNumar() < ((Card) arg0).getIntNumar()) {
			return -1;
		}
		if (this.getIntNumar() == ((Card) arg0).getIntNumar()
				&& this.getNumberOfSuit() < ((Card) arg0).getNumberOfSuit()) {
			return -1;
		}
		if (this.getIntNumar() == ((Card) arg0).getIntNumar()
				&& this.getNumberOfSuit() > ((Card) arg0).getNumberOfSuit()) {
			return 1;
		}
		if (this.getIntNumar() > ((Card) arg0).getIntNumar()) {
			return 1;
		}
		return 0;
	}

}
