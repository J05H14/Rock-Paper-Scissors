/*
 * 1 = sisciors
 * 2 = rock
 * 3 = paper
 */

package opponents;

import java.util.Random;

public class Rock extends Opponent {

	public Rock(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int move() {
		int move = 0;
		Random movePicker = new Random(100);
		int decider = movePicker.nextInt();
		
		if(decider < 60){
			move = 2;
		}
		else if(decider >= 60 && decider < 95){
			move = 1;
		}
		else{
			move = 3;
		}
		return move;
	}

}
