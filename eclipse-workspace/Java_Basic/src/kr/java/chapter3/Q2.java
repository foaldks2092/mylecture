package kr.java.chapter3;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
				    
		    Scanner sc = new Scanner(System.in);
			 int[] a = new int[10];	
		    System.out.println("정수를 입력하세요: ");
		    
		    for (int i = 0; i < a.length; i++) {				// 역순 출력(null값까지 입력됨)
			      a[i] = sc.nextInt();					    
				if (a[i] == 0) break; 
				}				
		    
			        for (int i = a.length-1 ; 0 <= i; i--) {
			        	if(a[i] != 0) {
			            System.out.print(a[i] + " ");

						
				}
		    }
		}

	

	}

