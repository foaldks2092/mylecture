package ch05;

public class InfoHidingEx {

	public static void main(String[] args) {
		// 접근제한자: public > protected > package > private
		
		Student2 st1 = new Student2();
		st1.name = ("홍길동");
		st1.address = "";
		
		ch05.Student2 st2 = new ch05.Student2();
		// package 의 가시성
		// st2.name = "홍길동";
		

	}

}
