package tournament.strategies;

import java.util.ArrayList;

import tournament.Strategy;
import tournament.Turn;

/**
 *
 * @author tford
 * @author me
 * Hat For Hit - the opposite of what it sounds like
 */

public class HatForHit implements Strategy{

	public String takeOneTurn(ArrayList<Turn<String,String>> history) {
		if (history.size() == 0) {
			return "c";
		} else {
			if (history.get(history.size()-1).them == "c") {
				return "c";
			} else {
				return "d";
			}
		}
	}

}
