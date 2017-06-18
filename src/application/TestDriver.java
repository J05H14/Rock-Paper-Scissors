package application;

import java.util.Scanner;

import game.RockPaperScissors;
import opponents.*;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Opponent p1 = new Rock("Cutman");
		Scanner in = new Scanner(System.in);
		
		RockPaperScissors game = new RockPaperScissors(p1);
		int move = in.nextInt();
		
		try {
			System.out.println(game.match(move));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
