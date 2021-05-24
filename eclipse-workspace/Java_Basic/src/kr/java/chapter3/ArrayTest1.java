package kr.java.chapter3;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		int num [] = new int [10];  
		int j = 0;  
		System.out.println("숫자 10개를 입력해주세요.");
		Scanner sc = new Scanner(System.in); 
		for(int i = 0; i < num.length; i++) 
		{
			num[i] = sc.nextInt(); 
			{
				j = num[i]; 
			}
		}
		System.out.println("입력된 값 중 가장 큰 수는 " + j + "입니다.");
		
		
		

	}

}
