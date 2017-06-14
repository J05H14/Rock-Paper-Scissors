package game;

import opponents.*;

public class GameLogic {
	private int move;
	private int oppMove;
	
	public GameLogic(int move, Opponent opponent){
		this.move = move;
		this.oppMove = opponent.move();
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public int getOppMove() {
		return oppMove;
	}

	public void setOppMove(int oppMove) {
		this.oppMove = oppMove;
	}
}
