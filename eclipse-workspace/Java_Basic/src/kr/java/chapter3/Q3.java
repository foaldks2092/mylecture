package kr.java.chapter3;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();


		
		for (int i = 0; i <= num; i++) {
			
			for(int j = 0; j < num - i; j++ ) {
					
				System.out.print(" ");
		}
			for(int k = 0; k < i; k++ ) {
			System.out.print(k+1);
						
	}
		System.out.println();
		
	
  }

	}

}
