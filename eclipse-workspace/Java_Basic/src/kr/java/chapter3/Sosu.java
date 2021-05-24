package kr.java.chapter3;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		 System.out.println("숫자 입력: ");
		 int num = sc.nextInt();
		 
		 int i = 2; //i : 나눌대상
		  boolean isPrime = true;
		  
		  while(i <= num) {
			  
			  isPrime= true;
			  
			  for(int n = 2; n < i; n++) {
				  
				  if (i % n == 0) {
					  isPrime = false;
				  }
				  
				  continue;
			  }
			  
			  if (isPrime == true) {
				  System.out.print(i);
			  }
			  
			  i++;
		  }
		  
		  System.out.println("");
		  
		 
		 /*
		 for(int i = 2; i <= num; i++) {
			 if(i !=2 && i%2 == 0) {
				 				 								 
			 }
			 else if(i !=3 && i%3 == 0) {
				 
			 }
			 else if(i !=5 && i%5 == 0) {
				 
			 }
			 else if(i !=7 && i%7 == 0) {
				 
			 }
			 else {
				 System.out.println(i+" ");
			 }
		 }

*/

	}

}
