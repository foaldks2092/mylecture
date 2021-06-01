package ex.java.input;
import java.util.Scanner;
public class DiamondTest {
	
	public DiamondTest() {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int std = (s-1)/2;
		int i; 
		

		
		for( i = 0; i < std+1; i++) {
			
			for(int j = 0; j < i; j++)
				System.out.print(" ");
		
		for (int k = s; k > 2*i ; k--) 
			System.out.print("*");
			System.out.println();
		}
		
		
		
		for( i = 0;  i < std ; i++)  {
			for(int j = std-i ; j > 0; j--)  
				System.out.print(" ");			
		
			for(int k = 0 ; k < 2*i+1; k++) 
				System.out.print("*");				
		System.out.println();

}
	


	}
		
	
	public static void main(String[] args) {
		System.out.println("1,3,5...홀수로 입력하시오");
		new DiamondTest();
		
	}
	
}	




