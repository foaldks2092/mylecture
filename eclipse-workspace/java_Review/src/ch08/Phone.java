package ch08;

// 전화
public class Phone {
	
	String model; // 모델
	String color; // 색상
	String no;	
	
//	public Phone() {
//	
//	}
	
	
	public Phone(String m, String c, String n) {
		this.model = m;
		this.color  = c;
		this.no = n;
	}
		public void powerOn() {System.out.println(this.model + "전원 ON");}
		public void powerOff() {System.out.println("전원 Off");}
		public void ring() {System.out.println("전화벨...울팀");}
		public void send() {System.out.println("전화 걸기");}
		
		
	

}
