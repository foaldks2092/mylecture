package ch02;

public class Variable1 {
	
	// 1. 멤버 필드(속성, 변수)
	// 자료형 이름;
	// 자료형 이름 = " ";
	// 자료형 이름 = 리터럴(자료의 표기 방법);
	// 자료형: 기본자료형, 클래스,배열,Enum
	
	char ch;		// 선언
	static char ch1 = 'A'; // 65
	

	float f_name;
	float f_name2 = 1.0F;
	double d_name = 1.0;

	byte b1 = -128;
	byte b2 = 127;
	// byte b3 = 128; // 범위를 넘음. 
	
	double d_name3 = Double.MAX_VALUE + 1;
	// double d_name4 = Double.MAX_VALUE + 1.0;
	
	int i = 10;
	long l = Long.MAX_VALUE;
	long l2 = 10L;
	
	
	// true, false 논리자료형
	boolean isboolean;
	boolean isnumber;
	
	

	// 2. 멤버 메소드
	// Modifier [static] 리턴형식 이름(매개변수) {}
	// Modifier: public, protected, package, private
	// 리턴형식: void, 자료형
	
	public void printinfo(int i) {
		System.out.println(ch1);
		System.out.println(b2);
	}
	
	public void printinfo2(int i, long l, short s, byte b) {
		
		
	}
	
	{
		// 코드블록
	}
	
	
	public int getNumber() {			// int 같이 자료형이 들어가면 같은 자료혀의 return이 들어가야함
		return 0;						// return 자료형
	}
	
	
	
	
	// Starting Point. 시작점
		public static void main(String[] args) {				
			 System.out.println(ch1);			// main이 static에 영향을 받아서 바깥 멤버 변수는 사용 할 수가 없다.
		int j = 100;
		char c = 'a';
		
		char ch2;
		char ch3 = 'A';
		System.out.println(ch3);
			 
	}

}
