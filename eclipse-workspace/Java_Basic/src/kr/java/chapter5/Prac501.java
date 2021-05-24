package kr.java.chapter5;
import java.util.Scanner;
public class Prac501 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하시오: ");
		String[] a =  sc.nextLine().split(" ");
		
		String[] n = {"곰돌이","복돌이","흰둥이","꺠소금","까만콩"};
		String[] ap = {"Bear","Gift","White","Sesami","Black"};
		
		String result = "";
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < n.length; j++) {
				if(a[i].equalsIgnoreCase(n[j])) {
					result += ap[j] + " ";
					continue;
				}
			
			}
			
		}
		System.out.print(result);
	}

}
