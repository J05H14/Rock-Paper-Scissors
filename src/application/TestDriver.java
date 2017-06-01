package application;

import opponents.*;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Opponent p1 = new Paper("Cutman");
		int move = 3;
		while(move == 3){
			move = p1.move();
			System.out.println(move);

		}
	}
}
