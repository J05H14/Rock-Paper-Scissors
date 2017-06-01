package opponents;

import java.util.Random;

public abstract class Opponent {

	private String name;
	protected Random decider = new Random(1);
	
	public Opponent(String name){
		this.setName(name);
	}
	
	abstract protected int move(double rockOdds,  double paperOdds, double scissorsOdds);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int move() {
		// TODO Auto-generated method stub
		return 0;
	}
}
