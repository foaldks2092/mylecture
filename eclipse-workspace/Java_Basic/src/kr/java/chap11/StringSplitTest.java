package kr.java.chap11;

import java.util.StringTokenizer;

public class StringSplitTest {

	public static void main(String[] args) {
		//String str = "Java Programing is funny things!";
		String str = "Java Programing is funny things!";
		
		String[] result = str.split(" "); 	
		for(String s : result) {
			System.out.print(s);
		}
		
		
		str = "Java Programing is funny things!";
		
		
		//StringTokenzer class				// 문장이 많을 때 쓰는게 유리
		StringTokenizer st = new StringTokenizer(str);
		while( st.hasMoreTokens()) {
			System.out.println(st.countTokens());
		}

	}

}
