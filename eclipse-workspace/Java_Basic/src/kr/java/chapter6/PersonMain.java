package kr.java.chapter6;

public class PersonMain {

	public static void main(String[] args) {
		
			Person p1 = new Person("홍길동",24);
			Person p2 = new Person("둘리",300,"남자","AB형","초능력자");
			Person p3 = new Person("도우너",250,"남자","A형","시간여행자");


			p1.play();
			p2.play();
			p3.play();
	}					
	
}
