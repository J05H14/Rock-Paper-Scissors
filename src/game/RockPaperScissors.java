package game;

/*
 * 1 = rock
 * 2 = paper
 * 3 = scissors
 */

import opponents.*;

public class RockPaperScissors {
	private Opponent opponent;
	
	public RockPaperScissors(Opponent opponent){
		this.setOpponent(opponent);
	}

	public String match(int playerMove) throws Exception{
		int oppMove = this.opponent.move();
		//player - rock
		if(playerMove == 1){
			if(oppMove == 3){
				return "Win";
			}
			else if(oppMove == 2){
				return "Lose";
			}
			else{
				return "Draw";
			}
		}
		//player - paper
		else if(playerMove == 2){
			if(oppMove == 1){
				return "Win";
			}
			else if(oppMove == 3){
				return "Lose";
			}
			else{
				return "Draw";
			}
		
		}
		//player - scissors
		else if(playerMove == 3){
			if(oppMove == 2){
				return "Win";
			}
			else if(oppMove == 1){
				return "Lose";
			}
			else{
				return "Draw";
			}
		}
		else{
			throw new Exception("Not a Valid Move Use 1, 2, or 3");
		}
	}
	
	public Opponent getOpponent() {
		return opponent;
	}

	public void setOpponent(Opponent opponent) {
		this.opponent = opponent;
	}

}
