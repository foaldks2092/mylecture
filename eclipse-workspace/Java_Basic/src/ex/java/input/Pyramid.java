package ex.java.input;


import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	   System.out.println("ㄱㄱ");
	   int n = sc.nextInt();
	   
	   for (int i = 0; i < n; i++) {
		   for (int j = 0; j < n-i; j++) {
			System.out.print(" ");
			
		}
		for (int k = i*2+1; k > 0; k--) {
			System.out.print("*");
		}	
		System.out.println();
	}
	   

	}
	

}
