package ch08;

public class SupersonicAirplane extends Airplane{
	public final static int NORMAL = 0;
	public final static int SUPERSONIC = 1;
	
	
	 int mode = NORMAL;
	@Override
	public void fly() {
		if(mode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();
		}
		
		
	}
	public void setMode(int m) {
		this.mode = m;
	}

}
