package homan.huang.poker.game;

/**
 * Created by Homan on 11/28/2017.
 */
public class Card {
	private short rank, suit;

	private int value;

	private static String[] suits = { "D", "C", "H", "S" };
	private static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A" };

	public static String rankAsString(final int __rank) {
		return ranks[__rank];
	}

	Card(final String rs) {
		final String r = rs.substring(0, 1);
		final String s = rs.substring(1);

		switch (s) {
		case "D":
			this.suit = 0;
			break;
		case "C":
			this.suit = 1;
			break;
		case "H":
			this.suit = 2;
			break;
		case "S":
			this.suit = 3;
			break;
		default:
			throw new IllegalArgumentException("Invalid suit in the data: " + s);
		}

		switch (r) {
		case "2":
			this.rank = 20;
			break;
		case "3":
			this.rank = 30;
			break;
		case "4":
			this.rank = 40;
			break;
		case "5":
			this.rank = 50;
			break;
		case "6":
			this.rank = 60;
			break;
		case "7":
			this.rank = 70;
			break;
		case "8":
			this.rank = 80;
			break;
		case "9":
			this.rank = 90;
			break;
		case "T":
			this.rank = 100;
			break;
		case "J":
			this.rank = 110;
			break;
		case "Q":
			this.rank = 120;
			break;
		case "K":
			this.rank = 130;
			break;
		case "A":
			this.rank = 140;
			break;

		default:
			throw new IllegalArgumentException("Invalid rank in the data: " + r);
		}

		value = rank + suit;
	}

	public @Override String toString() {
		return ranks[rank / 10 - 2] + "_" + suits[suit];
	}

	public short getRank() {
		return rank;
	}

	public short getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

}
