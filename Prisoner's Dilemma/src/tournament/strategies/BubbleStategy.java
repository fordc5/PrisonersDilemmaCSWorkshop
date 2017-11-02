package tournament.strategies;

import java.util.ArrayList;
import tournament.Strategy;
import tournament.Turn;

/**
 * 
 * @author Connor Ford
 * @version 10/17
 * 
 * This is my first bubble stategy. Say hi, prepare to die ;)
 */

public class BubbleStategy implements Strategy {
	
	public String takeOneTurn(ArrayList<Turn<String,String>> history) {
		return "c";
	}
}