package opponents;

public class Impossible extends Opponent {

	public Impossible(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public int move(){
		return 0;
	}
	
	@Override
	protected int move(double rockOdds, double paperOdds, double scissorsOdds) {
		return 0;
	}
	

}
