package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore
		Roll comeoutroll = new Roll();
		this.ComeOutScore = comeoutroll.getScore();

		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
		boolean bool = true;
		while(bool) {
			Roll roll = new Roll();
			rolls.add(roll);
			if (roll.getScore() == 4 || roll.getScore() == 5 || roll.getScore() == 6 || 
					roll.getScore() == 8 || roll.getScore() == 9 || roll.getScore() == 10) {
				bool = false;
			}
			else if (roll.getScore() == 11) {
				bool = false;
			}
			else {}
		}
		Roll lastroll = rolls.get(rolls.size()-1);
		if (lastroll.getScore() == 4 || lastroll.getScore() == 5 || lastroll.getScore() == 6 || 
				lastroll.getScore() == 8 || lastroll.getScore() == 9 || lastroll.getScore() == 10) {
			this.eGameResult = eGameResult.POINT;
		}
		else {
			this.eGameResult = eGameResult.SEVEN_OUT;
		}
	}

	public int RollCount() {
		// Return the roll count
		return 0;
	}

}
