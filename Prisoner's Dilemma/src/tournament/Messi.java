package tournament;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Connor Ford
 * @version 10/17
 * 
 * This is Messi.
 */

public class Messi implements Strategy {
	
	public String takeOneTurn(ArrayList<Turn<String,String>> history) {
		if (history.size() == 0) {
			return "c";
		} else {
			Random rand = new Random();
			String lastOppPick = history.get(history.size()-1).them;
			if (lastOppPick == "c") {
				return "c";
			}
			if (lastOppPick == "d") {
				int num = rand.nextInt(10);
				if (num == 9) {
					return "c";
				} else {
					return "d";
				}
			}
		}
		throw new IllegalArgumentException("Should never get to here in a Messi strategy");
	}
}