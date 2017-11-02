package tournament.strategies;

import java.util.ArrayList;
import java.util.Random;

import tournament.Strategy;
import tournament.Turn;

/**
 * 
 * @author Connor Ford
 *
 * The Great Defector
 */

public class TheGreatDefector implements Strategy {

	public String takeOneTurn(ArrayList<Turn<String,String>> history) {
		if (history.size() == 0) {
			return "d";
		}
		else {
			boolean hasCooperated = false;
			for (Turn<String,String> t : history) {
				if (t.them == "c") {
					hasCooperated = true;
					break;
				}
			}
			if (hasCooperated) {
				Random rand = new Random();
				int num = rand.nextInt(10);
				if (num == 0) {
					return "d";
				} else {
					return "c";
				}
			} else {
				return "d";
			}
		} 
	}
}
