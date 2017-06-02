/*
 * 1 = rock
 * 2 = paper
 * 3 = scissors
 */


package opponents;

import java.util.Random;

public class Paper extends Opponent {

	public Paper(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public int move(){
		return move(0.35, 0.50, 0.15);
	}

	@Override
	public int move(double rockOdds, double paperOdds, double scissorsOdds) {
		if(this.decider.nextDouble() < rockOdds){
			return 1;
		}
		else if(this.decider.nextDouble() >= rockOdds && this.decider.nextDouble() < (1 - scissorsOdds)){
			return 2;
		}
		else{
			return 3;
		}
	}

}
