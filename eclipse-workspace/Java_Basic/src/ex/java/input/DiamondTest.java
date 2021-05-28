package ex.java.input;
import java.util.Scanner;
public class DiamondTest {
	
	public void TestD( ) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int std = (s-1)/2;
		int i; 
		for( i = 0;  i < std; i++) 
			for(int j = std-i; j > 0; j--) 
				System.out.println(" ");			
			
			for(int k = 0; k < 2*i; k--) 
				System.out.println("*");
			System.out.println();
	}
	
	for(int i = 0; i < std+1; i++) {
		
		for(int j = 0; j < i; j++)
			System.out.println();
	}
}
	
}
