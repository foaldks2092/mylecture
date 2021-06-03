package ch05;

public class Student2 {
	// 필드: 가능하면 private 선언!
	
	// package modifier
	protected int age;
	protected String name;
	protected String address;
	
	public Student2() {
		
	}
	public Student2(String n, int a,String adr) {
		
		age = a;
		name = n;
		address = adr;
	}
	

	
	// 플드에 접근하는 메서드를 get, set 접두어로
	// 메서드를 선언해 사용
	
	 public int getAge() {
		return age;
	 } 
	
	

}
