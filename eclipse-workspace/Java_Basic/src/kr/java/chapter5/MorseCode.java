package kr.java.chapter5;

import java.util.Scanner;
public class MorseCode {

	public static void main(String[] args) {
		//모스부호 출력문
		Scanner sc = new Scanner(System.in);
		System.out.println("해석할 것을 입력하시오: ");
		String[] n = sc.nextLine().split("");
		
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", 
                "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "v", 
                "W", "X", "Y", "Z"};
        
        
		String[] morse = {
				".-"  ,
				"-...",
				"-.-.",
				"-..",
				".",
				"..-.",
				"--.",
				"....",
				"..",
				".---",
				"-.-",
				".-..",
	            "--",
	            "-.",
	            "---",
	            ".--.",
	            "--.-",
	            ".-.",
	            "...",
	            "-",
	            "..-",
	            "...-",
	            ".--",
	            "-..-",
	            "-.--",
	            "--..",
	            "|",
	            ".---",
	            "..---",
	            "...--",
	            "....-",
	            ".....",
	            "-....",
	            "--...",
	            "---..",
	            "----.",
	            "-----"      };
		
		
		String result = "";
		
	

		for (int i = 0; i < n.length; i++) {	
			for (int j = 0; j < alpha.length; j++) {
				if(n[i].equalsIgnoreCase(alpha[j])) {
				result += morse[j] + " ";
				continue;
			}
		
		}
    }
		System.out.print(result);		
  }
}


