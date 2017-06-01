/*
 * 1 = sisciors
 * 2 = rock
 * 3 = paper
 */

package opponents;

import java.util.Random;

public class Scissors extends Opponent {
	
	public Scissors(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int move() {
		int move = 0;
		Random movePicker = new Random(100);
		int decider = movePicker.nextInt();
		if(decider < 50){
			move = 1;
		}
		else if(decider < 90 && decider >= 50){
			move = 3;
		}
		else{
			move = 2;
		}
		
		return move;
	}

}