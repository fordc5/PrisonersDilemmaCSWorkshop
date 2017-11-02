package tournament.strategies;

import java.util.ArrayList;
import java.util.Random;
import tournament.Strategy;
import tournament.Strategy;
import tournament.Turn;

public class Randy implements Strategy{

	public String takeOneTurn(ArrayList<Turn<String,String>> history) {
		Random rand = new Random();
		int num = rand.nextInt(1);
		if (num == 0) {
			return "d";
		}
		return "c";
	}
}
