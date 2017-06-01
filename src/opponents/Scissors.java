/*
 * 1 = rock
 * 2 = paper
 * 3 = scissors
 */

package opponents;

import java.util.Random;

public class Scissors extends Opponent {
	
	public Scissors(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int move(){
		return move(0.10, 0.40, 0.50);
	}
	@Override
	protected int move(double rockOdds, double paperOdds, double scissorsOdds) {
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
