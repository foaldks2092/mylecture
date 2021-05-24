package kr.java.chapter5;

import java.util.Scanner;

public class Prac501ver2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하시오: ");
		String[] a = sc.nextLine().split("");
		
		String result = "";
		
		for (int i = 0; i < a.length; i++) {
			
			if("곰돌이".equalsIgnoreCase(a[i])) {
			result += "Bear";
			
			}else if("복돌이".equalsIgnoreCase(a[i])){
			result += "Gift";
			
			}else if("흰둥이".equalsIgnoreCase(a[i])){
			result += "White";
			
			}else if("깨소금".equalsIgnoreCase(a[i])){
			result += "Sesami";
			
			}else if("까만콩".equalsIgnoreCase(a[i])){
			result += "Black";
			
		}
			

	}
		System.out.println(result);
	}
}
