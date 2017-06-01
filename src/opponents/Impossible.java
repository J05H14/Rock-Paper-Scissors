package opponents;

public class Impossible extends Opponent {

	public Impossible(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int move() {
		return 2;

	}
	
	public int move(int playerMove){
		return playerMove;
	}
	

}
