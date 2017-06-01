package opponents;

public abstract class Opponent {

	private String name;
	
	public Opponent(String name){
		this.setName(name);
	}
	
	abstract int move();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
