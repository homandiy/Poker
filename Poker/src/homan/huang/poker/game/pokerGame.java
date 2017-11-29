package homan.huang.poker.game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Homan on 11/28/2017.
 */
public class pokerGame {

	static int win1, win2;

	// Simple version of System.out.println
	public static void pln(final String x) {
		System.out.println(x);
	}

	// Simple version of System.out.print
	public static void prt(final String x) {
		System.out.print(x);
	}

	// Read data and find final winner
	private static void readData(final String fileName) {
		try {
			// get file in same directory
			final URL path = pokerGame.class.getResource(fileName);
			final File f = new File(path.getFile());
			final BufferedReader br = new BufferedReader(new FileReader(f));

			// text input to list readText
			final List<String> readText = new ArrayList<String>();
			String line;
			while ((line = br.readLine()) != null) {
				readText.add(line);
			}
			br.close();

			// readText into games
			for (int i = 0; i < 1000; i++) {

				// Get winner
				final Match one = new Match(readText.get(i));
				if (one.getXWon()) {
					win1++;
				} else {
					win2++;
				}
				pln("\t\tGame# " + String.valueOf(i + 1) + "\t\tPlayer 1: " + String.valueOf(win1) + "\tPlayer 2: "
						+ String.valueOf(win2));
			}
			pln("Total games: " + String.valueOf(win1 + win2));

		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(final String[] args) {

		// initial winning
		win1 = 0;
		win2 = 0;

		// readData("poker.txt");

		Match one = new Match("4H 5C 6D 7C 8H JS KD KH QS 4H");
		one = new Match("4H 5C 6D 7C 8H 5S 6S 7S 8S 9S");
		one = new Match("TH JH AH KH QH TS JS KS QS AS"); // royal
		one = new Match("4H 5C 6D 7C 8H 5S 6S 7S 8S 9S"); // straight flush
		one = new Match("4H 4C 4S 4D 8H 5S 6S 7S 8S 9S"); // 4 of a kind
		one = new Match("4H 4S 4D 8C 8H 5S 5D 9C 9H 9S"); // full house
		one = new Match("4S 5S 6S TS JS 5C 6D 7C 4H 3S"); // flush & straight
		one = new Match("4S 4H 4C TS JS 5C 5D 7C TH TD"); // 3 of a Kind and 2 pair
		one = new Match("4S 4H JC AS QS 5C 6D 7C 8H JD"); // 1 pair and HIGH CARD

	}
}
