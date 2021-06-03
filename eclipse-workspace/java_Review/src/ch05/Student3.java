package ch05;

public class Student3 {
	
	private int age;
	private String name;
	private String address;
	
	
	// this 키워드
	// this() 생성자
	public Student3() {
	//	this.age = 0;
	//	this.name = "";
		
		this("", 0);
	}
	
	public Student3(String n, int age) {
		
		// age = age;
		// name = n;
		this( n, age, "" );
	}
	
	public Student3(String n, int age, String adr) {		
		this.age = age;
		this.name = n;
		this.address = adr;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
