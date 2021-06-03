package ch05;

public class ConstructorEx {

	public static void main(String[] args) {
		Student student1 = new Student();	// default 생성자를 만드는 행위
		student1.name = "홍길동";
		student1.age = 10;
		
		Student student2 = new Student();
		student2.name = "고길동";
		student2.age = 30;
		
		Student student3 = new Student();
		student3.name = "도우너";
		student3.age = 15;
		
		// 생성자
		Student student4 = new Student("이순신",15);
	}

}
