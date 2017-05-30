package opponents;

public abstract class opponents {

	private String name;
	
	public opponents(String name){
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
