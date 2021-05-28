package kr.java.chap11.ex;


class Mydate {
	int day;
	int month;
	int year;
	
	public Mydate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;		
	}
	
	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof Mydate) {
			 Mydate std = (Mydate) obj;					// equals메서드 값을 true로 받게하기
			 if(this.day == this.day)
				 return true;
			 else return false;
		 }
		 return false;
	 }
	}

public class MydateTest {

	public static void main(String[] args) {
		
		Mydate date1 = new Mydate(5,28,2021);
		Mydate date2 = new Mydate(5,28,2021);
		
		System.out.println(date1 == date2);
		System.out.println(date1.equals(date2));

	}

}
