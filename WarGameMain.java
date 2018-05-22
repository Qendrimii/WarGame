import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;

public class WarGameMain {

	// atributet jane static sepse i perdorim ne main.
	public static String f = "";
	public static String b = "";

	public static String player1 = "";
	public static String player2 = "";
	public static String skaletra = "";

	public static String emri1 = "";
	public static String emri2 = "";

	public static int count1 = 0;
	public static int count2 = 0;

	public static int b1;

	public static void main(String[] args) {
		WarGameView wv = new WarGameView();

		emri1 = JOptionPane.showInputDialog("Shtyp emrin e Player 1:");
		emri2 = JOptionPane.showInputDialog("Shtyp emrin e Player 2:");

		int m;
		int x;
		int y;

		Card c;
		Card c1;
		CardDeck deck = new CardDeck();

		boolean processing = true;

		while (processing) {
			String request = JOptionPane.showInputDialog("Shtyp ok per te laujtur War ndersa cancel per te ndaluar");
			if (count1 + count2 + b1 == 25) {
				processing = false;
			}
			if (skaletra == "Ska me letra") {
				processing = false;// ndalon ciklin while
			}
			if (request.equals("stop")) {
				processing = false;// ndalon ciklin while
			} else {
				if (!deck.moreCards()) {
					skaletra = "Ska me letra";
				} else {
					c = deck.newCard();
					
						player1 = c.toString()+ " of " + c.getSuit();
					
					m = (int) Math.random() * 10;
					x = c.getCount();
					if (x == 1) {
						x = 14;// Per piken
					}

					c1 = deck.newCard();
					y = c1.getCount();
					if (y == 1) {
						y = 14;// Per piken
					}
					m = (int) Math.random() * 10;
					
						player2 = c1.toString() + " of " + c1.getSuit();
					

					if (x > y) {// caktojm fituesin
						f = "Fituesi eshte " + emri1;
						++count1;// ruajme numrin e fitoreve
					} else {
						f = "Fituesi eshte " + emri2;
						++count2;
					}
					if (x == y) {
						f = "Barazim";
						++b1;
					}
				}
			}

		}
	}
	/*
	 * Metoda fituesi
	 * 
	 * @return- fituesin e lojes WarGame
	 */

	public String fituesi() {
		return f;

	}

	/*
	 * Metoda barazim
	 * 
	 * @return- barazim nese ska fitues ne WarGame
	 */
	public String barazim() {
		return b;

	}

	/*
	 * Metoda emri1
	 * 
	 * @return- emrin e Player1(lojtarit1)
	 */
	public String emri1() {

		return emri1;
	}

	/*
	 * Metoda emri2
	 * 
	 * @return- emrin e Player1(lojtarit1)
	 */
	public String emri2() {

		return emri2;
	}

	/*
	 * Metoda player1
	 * 
	 * @return- letra qe bie per lojtarin 1
	 */
	public String player1() {
		return player1;
	}

	/*
	 * Metoda player2
	 * 
	 * @return- letra qe bie per lojtarin 2
	 */
	public String player2() {
		return player2;
	}

	/*
	 * Metoda skaLetra
	 * 
	 * @return- tregon qe letrat kan mbaruar kthen string
	 */
	public String skaLetra() {
		return skaletra;
	}

	/*
	 * Metoda numriFitoreve
	 * 
	 * @return- numri i fitoreve te lojtarit1
	 */
	public int numriFitoreveP1() {
		return count1;
	}

	/*
	 * Metoda numriFitoreve
	 * 
	 * @return- numri i fitoreve te lojtarit1
	 */
	public int numriFitoreveP2() {
		return count2;
	}

	/*
	 * Metoda numriBarazimeve
	 * 
	 * @return- numri i barazimeve
	 */
	public int numriBarazimeve() {
		return b1;
	}

}