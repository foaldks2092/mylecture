package p;

public class Bus {
	
	private String name;
	protected int number;
	
	public Bus(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	String getName() {
		return this.name;
	}

}
