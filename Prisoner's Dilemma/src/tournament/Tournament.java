package tournament;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/** Prisoner's Dilemma Tournament
 * 
 * This Tournament class takes the strategies 
 * from the PrisonerDilemmaTechniques class and
 * simulates them in various tournament formats.
 * 
 * May the best prisoner win!
 * 
 * @author Connor Ford
 * @version 10/17
 *
 */

public class Tournament {

	//Number of rounds specifications
	private static final int NUM_ROUNDS_PER_CONTEST = 50;
	private static final int NUM_CONTESTS = 5;
	
	private PrisonerDilemmaTechniques strategyArr;
	private ArrayList<Strategy> strategies;
	
	private ArrayList<Turn<String,String>> history = new ArrayList<Turn<String,String>>();

	public Tournament() {
		strategyArr = new PrisonerDilemmaTechniques();
		strategies = strategyArr.strategies;
		for (Strategy s : strategies) {
			System.out.println(s.toString());
		}
		
		// The elimination version of the tournament. At least one player 
		// is eliminated after each round.
		runEliminationTournament(strategies, NUM_ROUNDS_PER_CONTEST, NUM_CONTESTS);
		
	}
	
	
	/**
	 * 
	 * @param players
	 * @param numTransactionsPerContest
	 * @param numContests
	 * @return void
	 */
	public static void runEliminationTournament(ArrayList<Strategy> players, int numTransactionsPerContest, int numContests) {
		Boolean keepRunningTournament = true;
		while (keepRunningTournament) {
			ArrayList<Player<Strategy,Integer>> scores = runTournament(players, numTransactionsPerContest, numContests);
			Collections.sort(scores, (s1,s2) -> {
				return s1.score.compareTo(s2.score);
			});
			if (allTied(scores)) {
				keepRunningTournament = false;
			} else {
				int lowestScore = scores.get(0).score;
				
				// update player list to keep only players with 
				// scores greater than the lowest score
				for (Player<Strategy,Integer> p : scores) {
					if (p.score == lowestScore) {
						players.remove(p.strategy);
					}
				}
			}
		}
		System.out.println("Game Over!");
		System.out.println("Winners");
		for (Strategy s : players) {
			//Parse this string to be only the name of the strategy
			System.out.println(s.toString());
		}
	}

	/**
	 * 
	 * @param players
	 * @param numTransactionsPerContest
	 * @param numContests
	 * @return ArrayList of each strategy and the respective score
	 */
	public static ArrayList<Player<Strategy,Integer>> runTournament(ArrayList<Strategy> players, int numTransactionsPerContest, int numContests) {
		return null;
	}
	
	/*def runTournament(playerlist, numTransactionsPerContest, numContests):
	    if len(playerlist) == 1:
	        return {playerlist[0][0]: 0}
	    print "Running Tournament with", len(playerlist), "Players"
	    bestscore = 5.0 * numTransactionsPerContest * numContests * (len(playerlist)-1)
	    scores = runRoundRobin(playerlist, numTransactionsPerContest, numContests)
	    playernames = scores.keys()
	    playernames.sort(key=lambda p: scores[p], reverse=True)
	    for name in playernames:
	        #print format(scores[name],"10d") + " points for " + name
	        score = scores[name]
	        percent = (score / bestscore) * 100
	        print format(percent, "7.3f") + " percent for " + name
	    return scores*/
	
	
	public static boolean allTied(ArrayList<Player<Strategy,Integer>> scores) {
		return false;
	}
	
	
	
	
	
	
	
	
	public static void main(String s[]) {
		new Tournament();
	}
	
}