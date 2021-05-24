package kr.java.chapter3;

import java.util.Scanner;

public class ScannerPrac1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 
		 System.out.println( "숫자1: " );
		 String op = scanner.nextLine();
		 
		 String[] s = op.split(" ");
		 
		 for(int i = 0; i < s.length ;  i++) {
			 System.out.println( s[i] + " " );
		 }
		 
		 int num1 = Integer.parseInt(s[0]);		
		 int num2 = Integer.parseInt(s[2]);
		 
		 System.out.println();
		 
		 switch(s[1]) {
		 case "+":
			 System.out.println(num1 + num2);
			 break;
			 
		 case "-":
			 System.out.println(num1 - num2);
			 break;
			 
		 case "*":
			 System.out.println(num1 * num2);
			 break;
			 
		 case "/":
			 System.out.println(num1 / num2);
			 break;
			 
			 default: 
				 System.out.println("없음");
		 }
		 
		 
	}

}
