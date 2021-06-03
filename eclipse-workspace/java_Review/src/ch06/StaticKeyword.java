package ch06;

public class StaticKeyword {

	public static void main(String[] args) {		
		// static keyword
		// - 정적변수
		// - 공유되는 메모리 공간에 단 하나의 이름만 등록
		// ClassName.static_field
		
		StudentStatic.count += 1;
		
		// static 자료혀으메서드,클래스		
		StudentStatic st1 = new StudentStatic();
		// st1.count += 1;
		StudentStatic.count += 1;
		
		StudentStatic st2 = new StudentStatic();
		st2.count += 2;
		StudentStatic st3 = new StudentStatic();
		st3.count += 3;
		
		StudentStatic.setCount(10);
	//	System.out.println("Count: " + StudentStatic.count);
		System.out.println("Count: " + StudentStatic.getCout());
	}

}
