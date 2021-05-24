package kr.java.chapter3;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		int[] number = new int[10]; 		
		int temp;
		
		System.out.println("숫자를 입력하세요: ");
		
		for(int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}		
		
		
		for (int i = 0; i < number.length-1; i++) {
		
			for (int j = i + 1; j < number.length; j++) {
							
				if(number[i] < number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
				
			}
			
		}
		
for(int i1 = 0; i1 < number.length; i1++) {
	System.out.print(number[i1] + " ");
}

	}

}
