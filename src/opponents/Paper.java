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

	@Override
	public int move() {
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
