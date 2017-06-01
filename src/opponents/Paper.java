/*
 * 1 = sisciors
 * 2 = rock
 * 3 = paper
 */

package opponents;

import java.util.Random;

public class Paper extends Opponent {

	public Paper(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int move() {
		int move = 0;
		Random movePicker = new Random(100);
		int decider = movePicker.nextInt();
		
		if(decider < 50){
			move = 3;
		}
		else if(decider >= 50 && decider < 85){
			move = 2;
		}
		else{
			move = 1;
		}
		return move;
	}

}
