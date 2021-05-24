package kr.java.chapter3;

import java.util.Scanner;

public class TenTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		 System.out.println("N의 값을 입력하세요: ");
		 int num = sc.nextInt();
		 
		 double k;

		 long sum = 0;
		 
		 for(int i = 1; i <= num; i++) {            // 합계가 다름('tae'참조)
			 //if(i % 3 != 0) continue;
			k = Math.pow(i*2,i*2-1);
			 sum +=k;
			 
		 }
		 System.out.println(sum);

	}


}


