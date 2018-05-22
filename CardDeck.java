/** CardDeck modelon nje kuvertë te letrave. */
public class CardDeck {
	private int card_count; 
	private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];
	// I pandryshueshem: elementet deck[0]..deck[card_count - 1] mbajnë letrat

	/** Konstruktori CardDeck krijon nje kuvertë te te gjitha letrave */
	public CardDeck() {
		createSuit(Card.SPADES);
		createSuit(Card.HEARTS);
		createSuit(Card.CLUBS);
		createSuit(Card.DIAMONDS);
	}

	/**
	 * newCard merr nje leter te re ga kuverta.
	 * 
	 * @return kthen nje leter qe nuk eshte perdorur me pare
	 * 			, ose return null, nese nuk ka mbetur asnje leter
	 */
	public Card newCard() {
		Card next_card = null;
		if (card_count == 0) {
			System.out.println("CardDeck error: no more cards");
		} else {
			int index = (int) (Math.random() * card_count); // i zgjedhim me metoden random
			next_card = deck[index];
			// kur nje leter nxjerret nga kuverta, ndrysho letrat e tjera qe te plotesojne boshllekun:
			for (int i = index + 1; i != card_count; i = i + 1)
			// deri tani, letrat nga index+1 to i-1 jane nderruar nga ana majte
			{
				deck[i - 1] = deck[i];
			}
			card_count = card_count - 1;
		}
		return next_card;
	}

	/**
	 * moreCards kontrollon nese kuverta ka ende letra.
	 * 
	 * @return nese kuverta seshte e zbrazet
	 */
	public boolean moreCards() {
		return (card_count > 0);
	}

	/** createSuit krijon nje kustum letrash. */
	private void createSuit(String which_suit) {
		for (int i = 1; i <= Card.SIZE_OF_ONE_SUIT; i = i + 1) {
			deck[card_count] = new Card(which_suit, i);
			card_count = card_count + 1;
		}
	}
}