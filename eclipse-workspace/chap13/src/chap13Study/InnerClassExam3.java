package chap13Study;

import java.util.Date;
import java.text.DateFormat;

public class InnerClassExam3 {
	
	public void printStatus (){
				
		
		class DateFormat {
			private Date date;
			
			public DateFormat(Date date) {
				this.date = date;
			}
			
			public String getDateFormat() {
				return date.toString();
			}
		}
		DateFormat format = new DateFormat(new Date());
		System.out.println("The Date : " + format);
	}

	public static void main(String[] args) {
		InnerClassExam3 example = new InnerClassExam3();
		example.printStatus();

	}

}
