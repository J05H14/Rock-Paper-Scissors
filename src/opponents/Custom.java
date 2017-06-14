package opponents;

public class Custom extends Opponent {

	private double rockChance;
	private double paperChance;
	private double scissorChance;
	
	public Custom(String name, double rockChance, double paperChance, double scissorChance) throws Exception {
		super(name);
		if(rockChance + paperChance + scissorChance != 1){
			throw new Exception("Chances don't add up correctly");
		}
		this.rockChance = rockChance;
		this.paperChance = paperChance;
		this.scissorChance = scissorChance;
	}

	public int move(){
		return move(this.rockChance, this.paperChance, this.scissorChance);
	}
	
	@Override
	protected int move(double rockOdds, double paperOdds, double scissorsOdds) {
		if(this.decider.nextDouble() < rockOdds){
			return 1;
		}
		else if(this.decider.nextDouble() >= rockOdds && this.decider.nextDouble() < (1 - scissorsOdds)){
			return 2;
		}
		else{
			return 3;
		}
	}

	public double getRockChance() {
		return rockChance;
	}

	public void setRockChance(double rockChance) {
		this.rockChance = rockChance;
	}

	public double getPaperChance() {
		return paperChance;
	}

	public void setPaperChance(double paperChance) {
		this.paperChance = paperChance;
	}

	public double getScissorChance() {
		return scissorChance;
	}

	public void setScissorChance(double scissorChance) {
		this.scissorChance = scissorChance;
	}

}
