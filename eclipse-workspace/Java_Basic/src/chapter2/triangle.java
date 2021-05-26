package chapter2;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하시오: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i*1; j--) {
				System.out.print(" ");				
			}
			for (int k = 0; k < i*2+1 ; k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
