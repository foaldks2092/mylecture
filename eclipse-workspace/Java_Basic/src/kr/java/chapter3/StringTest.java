package kr.java.chapter3;

public class StringTest {

	public static void main(String[] args) {
		
		
		String str1 = new String("abc");		//new라는 
		String str2 = "abc";					//String 클래스로 객체 생성
		String str3 = "abc";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		str2 = "efg";
		System.out.println(str2);
		System.out.println(str3);
		
		
		String str4;
		str4 = "하나둘셋";						// 변수 식별자 지정, 객체 생성
		System.out.print(str4 + " : ");		// .class : 컴파일된 바이트 코드
		
		//final char charat(int)
		
		//dot operator: .
		/*  System.out.print(str4.charAt(0));
			System.out.print(str4.charAt(1));
			System.out.print(str4.charAt(2));
			System.out.print(str4.charAt(3)); */
		
		//배열 이용 - str4 크키만큼 반복
		int len = str4.length();		
		
		for (int i = 0; i < len; i++) {
			System.out.println(str4.charAt(i));
		}
		
		/** equals(string) **/
		
		System.out.println(str4.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals("abc"));
		
		String str5;
		/* if(str5.equals("abc") ) {
						
		}
		if("abc".equals(str5)) 
			*/ 
		
		
		String[] strs  =  "하 나 두 ㄹ ㅅ ㅔ 넷".split(" ");
		System.out.println(strs.length);
		
		System.out.println(strs[0]);
		System.out.println(strs[6]);
		
		for(int i = 0; i < len; i++) {
			System.out.print(strs[i]);
		}
		
		
	}
	

}
