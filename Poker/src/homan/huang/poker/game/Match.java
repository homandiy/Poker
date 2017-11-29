package homan.huang.poker.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Homan on 11/28/2017.
 */
public class Match {
	// Ten cards per match
	List<Card> x = new ArrayList<Card>();
	List<Card> y = new ArrayList<Card>();

	private boolean xWon = true;

	// Simple version of System.out.println
	public void pln(final String x) {
		System.out.println(x);
	}

	// Simple version of System.out.print
	public void prt(final String x) {
		System.out.print(x);
	}

	// Constructor
	public Match(final String input) {

		// split input into ten cards
		final String[] games = input.split(" ");

		for (int i = 0; i < 5; i++) {
			x.add(new Card(games[i]));
			y.add(new Card(games[i + 5]));
		}

		// x: sort by card value
		Collections.sort(x, new Comparator<Card>() {
			@Override
			public int compare(final Card o1, final Card o2) {
				return o1.getValue() - o2.getValue();
			}
		});

		// y: sort by card value
		Collections.sort(y, new Comparator<Card>() {
			@Override
			public int compare(final Card o1, final Card o2) {
				return o1.getValue() - o2.getValue();
			}
		});

		/*
		 * Test each output
		 */
		System.out.print("x:");
		for (int i = 0; i < 5; i++) {
			prt(String.valueOf(i) + ": " + x.get(i).toString() + ", ");
		}

		System.out.print("\ty:");
		for (int i = 0; i < 5; i++) {
			prt(String.valueOf(i) + ": " + y.get(i).toString() + ", ");
		}
		pln("");

		scoreMatch();
	}

	// return 0 for x; 1 for y
	public int whoWon() {

		return 0;
	}

	// Check for One Pair after checking for Four of a Kind, Full House, Three of a Kind and Two Pairs.
	public static int isPair(final List<Card> h) {
		boolean a1, a2, a3, a4;
		int r0, r1, r2, r3, r4;

		r0 = h.get(0).getRank();
		r1 = h.get(1).getRank();

		// Checking: a a x y z
		a1 = r0 == r1;
		if (a1) {
			return r1 + h.get(1).getSuit();
		}

		r2 = h.get(2).getRank();

		// Checking: x a a y z
		a2 = r1 == r2;
		if (a2) {
			return r2 + h.get(2).getSuit();
		}

		r3 = h.get(3).getRank();

		// Checking: x y a a z
		a3 = r2 == r3;
		if (a3) {
			return r3 + h.get(3).getSuit();
		}

		r4 = h.get(4).getRank();

		// Checking: x y z a a
		a4 = r3 == r4;
		if (a4) {
			return r4 + h.get(4).getSuit();
		}

		return -1;
	}

	// Check for Two Pairs return highest rank or return -1
	private static int is2Pair(final List<Card> h) {
		boolean a1, a2, a3;
		int c0, c1, c2, c3, c4;

		// Checking: a a b b x
		c0 = h.get(0).getRank();
		c1 = h.get(1).getRank();
		c2 = h.get(2).getRank();
		c3 = h.get(3).getRank();

		a1 = c0 == c1 && c2 == c3;

		if (a1) {
			if (c1 > c3) {
				return c1 + h.get(1).getSuit();
			}
			return c3 + h.get(3).getSuit();
		}

		c4 = h.get(4).getRank();

		// Checking: a a x b b
		a2 = c0 == c1 && c3 == c4;

		if (a2) {
			if (c1 > c4) {
				return c1 + h.get(1).getSuit();
			}
			return c4 + h.get(4).getSuit();
		}

		// Checking: x a a b b
		a3 = c1 == c2 && c3 == c4;
		if (a2) {
			if (c2 > c4) {
				return c2 + h.get(2).getSuit();
			}
			return c4 + h.get(4).getSuit();
		}

		return -1;
	}

	// check Three of a Kind: return rank or -1
	private int is3K(final List<Card> h) {
		boolean a1, a2, a3;

		// Check for: x x x a b
		a1 = h.get(0).getRank() == h.get(1).getRank() && h.get(1).getRank() == h.get(2).getRank();

		// Check for: a x x x b
		a2 = h.get(1).getRank() == h.get(2).getRank() && h.get(2).getRank() == h.get(3).getRank();

		// Check for: a b x x x
		a3 = h.get(2).getRank() == h.get(3).getRank() && h.get(3).getRank() == h.get(4).getRank();

		if (a1) {
			return h.get(0).getRank();
		} else if (a2) {
			return h.get(1).getRank();
		} else if (a3) {
			return h.get(2).getRank();
		}
		return -1;
	}

	// Check Straight: chain of rank
	private boolean isStraight(final List<Card> h) {
		// impossible to over jack
		if (h.get(0).getRank() < 110) {
			for (int i = 0; i < 4; i++) {
				if (h.get(i + 1).getRank() - h.get(i).getRank() != 10) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	// Check for Flush: all have same suit
	private boolean isFlush(final List<Card> h) {
		for (int i = 0; i < 4; i++) {
			if (h.get(i + 1).getSuit() != h.get(i).getSuit()) {
				return false;
			}
		}
		return true;
	}

	// Check for Full House: return the rank of 3 of a Kind or -1
	private int isFullHouse(final List<Card> h) {
		boolean a1, a2;

		// Check for: x x x y y
		a1 = h.get(0).getRank() == h.get(1).getRank() &&
				h.get(1).getRank() == h.get(2).getRank() &&
				h.get(3).getRank() == h.get(4).getRank();

		// Check for: x x y y y
		a2 = h.get(0).getRank() == h.get(1).getRank() &&
				h.get(2).getRank() == h.get(3).getRank() &&
				h.get(3).getRank() == h.get(4).getRank();

		if (a1) {
			return h.get(0).getRank();
		} else if (a2) {
			return h.get(4).getRank();
		}
		return -1;
	}

	// Check for Four of a Kind
	private boolean is4K(final List<Card> h) {
		boolean a1, a2;

		// Check for: XXXX Y
		a1 = h.get(0).getRank() == h.get(1).getRank() &&
				h.get(1).getRank() == h.get(2).getRank() &&
				h.get(2).getRank() == h.get(3).getRank();

		// Check for: Y XXXX
		a2 = h.get(1).getRank() == h.get(2).getRank() &&
				h.get(2).getRank() == h.get(3).getRank() &&
				h.get(3).getRank() == h.get(4).getRank();

		return (a1 || a2);
	}

	/*
	 * Check score
	 * Royal Flush: 10000
	 * Straight Flush: 9000
	 * 4 of a Kind: 8000
	 * Full House: 7000
	 * Flush: 6000
	 * Straight: 5000
	 * 3 of a Kind: 4000
	 * 2 Pairs: 3000
	 * 1 Pair: 2000
	 * High card: last card rank + suit
	 */
	private int valueInHand(final List<Card> h) {

		final int suit = h.get(4).getSuit();
		int rank = h.get(4).getRank();
		final int highCard = suit + rank;

		final boolean flush = isFlush(h);
		final boolean straight = isStraight(h);

		// Straight Flush
		if (flush && straight) {

			// Royal Flush: 10000
			if (rank == 140) {
				return 10000 + rank + suit;
			}

			// Straight Flush
			return 9000 + rank + suit;
		}

		// 4 of a Kind
		if (is4K(h)) {
			rank = h.get(0).getRank() + h.get(1).getRank() + h.get(2).getRank() + h.get(3).getRank()
					+ h.get(4).getRank();
			return 8000 + rank;
		}

		// Full House
		rank = isFullHouse(h);
		if (rank > 0) {
			return 7000 + rank;
		}

		// Flush
		if (flush) {
			return 6000 + highCard;
		}

		// Straight
		if (straight) {
			return 5000 + highCard;
		}

		rank = is3K(h);
		if (rank > 0) {
			return 4000 + rank;
		}

		rank = is2Pair(h);
		if (rank > 0) {
			return 3000 + rank;
		}

		rank = isPair(h);
		if (rank > 0) {
			return 2000 + rank;
		}

		return highCard;
	}

	private String getMsg(final int score) {

		if (score > 10000)
			return "Royal Flush";
		if (score > 9000)
			return "Str8-Flush";
		if (score > 8000)
			return "4-Kind";
		if (score > 7000)
			return "Full House";
		if (score > 6000)
			return "Flush";
		if (score > 5000)
			return "Straight";
		if (score > 4000)
			return "3-Kind";
		if (score > 3000)
			return "Two Pairs";
		if (score > 2000)
			return "Pair";

		return "High Card";
	}

	// Output result and set winner
	private void scoreMatch() {
		String winner = "X";
		final int scoreX = valueInHand(x);
		final String msgX = getMsg(scoreX) + "_(" + String.valueOf(scoreX) + ")";
		final int scoreY = valueInHand(y);
		final String msgY = getMsg(scoreY) + "_(" + String.valueOf(scoreY) + ")";

		if (scoreX < scoreY) {
			winner = "Y";
			xWon = false; // y won the game
		}

		pln("x: " + msgX + "\ty: " + msgY + "\twinner: " + winner);
	}

	// Set user X status
	public boolean getXWon() {
		return xWon;
	}
}