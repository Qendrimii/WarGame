/** Card modelon nje leter */
public class Card { 
	
	public static final String SPADES = "spades";
	public static final String HEARTS = "hearts";
	public static final String DIAMONDS = "diamonds";
	public static final String CLUBS = "clubs";

	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	public static final int SIZE_OF_ONE_SUIT = 13; // 13 permban nje kustum i lertave

	// Atributet e letrave
	private String suit;
	private int count;

	/**
	 * Constructor Card cakton numrin edhe kustrumin e letrave.
	 * 
	 * @param s
	 *            - kustumi
	 * @param c
	 *            - numri
	 */
	public Card(String s, int c) {
		suit = s;
		count = c;
	}

	/** getSuit kthen kustumin e letres. */
	public String getSuit() {
		return suit;
	}

	/** getCount kthen numrin e letres. */
	public int getCount() {
		return count;
	}

	public String toString() {
		String s = "";
		if (count == ACE) {
			s = "Ace" + s;
		} else if (count == JACK) {
			s = "Jack" + s;
		} else if (count == QUEEN) {
			s = "Queen" + s;
		} else if (count == KING) {
			s = "King" + s;
		} else {
			s = count + s;
		}
		return s;
	}
}
