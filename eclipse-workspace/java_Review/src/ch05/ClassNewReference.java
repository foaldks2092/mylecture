package ch05;

public class ClassNewReference {
	
	// Copy by Value
	public void copybyvalue(int i, boolean b) {			// 해당 메서드 매개변수는 '지역변수'
		i = 100;
		b = false;
		
		System.out.println("method -> num: " + i + ", b: " + b);		
	}
	// Copy by Reference
	public void copyByReference(Student st) {			
		st.name = "고길동";
		System.out.println("method -> name: " + st.name);	
	}
	
	public void copyByReference(String str) {			
		str = "고길동";
		System.out.println("method -> name: " + str);	
	}
	
	
	

	public static void main(String[] args) {
		
		// 자료형: 기본자료형, 객체(클래스,배열, Enum)
		
		
		// 객체 자료형
		int[] a = new int[10];
		Student st = new Student();
		String str5 = "";
		String str6 = new String("");
		st.name = "홍길동";
		String str = new String("안녕");
		
		// 기본자료형: int, float, blooean...
		int num = 10;	// 리터럴 // new int();
		boolean b = true;
		
		
		ClassNewReference test = new ClassNewReference();
		test.copybyvalue(num, b);
		test.copyByReference(st);
		Student st2 = new Student();
		test.copyByReference(str);
		
		
		
		System.out.println("st2" + st2);	//hashcode
		st2 = st;
		System.out.println("st" + st);		//hashcode
		System.out.println("st2" + st2);	//hashcode
		
		System.out.println("main -> num: " + num + ", b: " + b);
		System.out.println("main -> name: " + str);

	}
	
	// 객체 Object: 코드 상의 객체, 설계/분석 상의 객체
	// 클래싀 현실 세계 객체의 특성/기능 코드 묘사한 것.
	// 인스턴스: new 연산한 클래스 변수(코드 상의 객체)를 메모리 상의 대상으로 표현.
	// 멤버: 클래스의 구성 요소(속성/필드ㅡ 메서드(기능))
	// 메서드: 기능을 구현하는 함수
	// 참조변수: 객체가 인스턴스를 가르키는 식별자( 변수 )
	// 참조값: 객체 값.  hashcode라는 걸로 표시됌.
	}
