package p;

public class BusMain {

	public static void main(String[] args) {
		
		// 1. 직접 사용하게 하거나
		Bus b = new Bus("버스",1);
		b.name = "";
		b.number = 0; // 디폴트, 프로텍티드, 퍼블릭

		
		b.getName();

	}

}
