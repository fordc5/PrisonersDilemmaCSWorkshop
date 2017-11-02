package tournament.strategies;

import tournament.Strategy;
import tournament.Strategy;
import tournament.Turn;

import java.util.ArrayList;
import java.util.Random;

public class Squire implements Strategy {
	public String takeOneTurn(ArrayList<Turn<String,String>> history) {
		int twiceCounter = 0;
		if (history.size() <= 1) {
			return "d";
		} else {
			for (Turn<String,String> t : history) {
				if (t.them == "c") {
					if (twiceCounter == 2) {
						Random rand = new Random();
						int num = rand.nextInt(1);
						if (num == 0) {
							return "d";
						}
						return "c";
					}
					twiceCounter++;
				} else {
					twiceCounter = 0;
				}
			}
			return "d";
		}
	}
}
