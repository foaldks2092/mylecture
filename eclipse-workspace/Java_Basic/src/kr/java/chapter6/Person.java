package kr.java.chapter6;

public class Person {

	String job;
	String name;
	int age;
	String gender;
	String blood;
	
	Person() {
		
		this("이름 없음",1);	
		
	}
	
    Person(String name, int age) {
		this.name = name;
		this.age = age;
	} 
		Person(String name, int age, String gender, String blood, String job) {
			
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.blood = blood;
			this.job = job;
			
		}
		
		  public void play() {
			  String paly = "";
			  if(this.equals("의사")) {
				  System.out.println("의사입니다.");			  
			  }else if(this.equals("초능력자")) {
				  System.out.println("초능력자입니다.");
			  }else if(this.equals("시간여행자")) {
				  System.out.println("시간여행자입니다.");
	}
				  
			  

		}
		
}
	

