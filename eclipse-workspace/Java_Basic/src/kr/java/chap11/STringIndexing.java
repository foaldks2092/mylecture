package kr.java.chap11;

public class STringIndexing {

	public static void main(String[] args) {

		String str = "Java Programming";

		System.out.println(str.indexOf("J"));
		System.out.println(str.indexOf("P"));
		System.out.println(str.indexOf("gram"));



		/// 자르기
		System.out.println(str.substring(0, str.indexOf("gram")));
		
		System.out.println(str.lastIndexOf("gram"));
		
		System.out.println(str.startsWith("java"));
		System.out.println(str.startsWith("java"));
		
		
		//trim  -> 공백 잘라줌
		//Scanner  ->
		String str1 = "        하하하";
		String str2 = "호호호호       ";
		String str3 = "        호호호호       ";
		
		str1.trim();
		str2.trim();
		str3.trim();
		
		System.out.println(str1);		  // 문자 그래도 출력
		System.out.println(str1.trim());  // 공백 지워짐
		
		System.out.println(str2);
		System.out.println(str2.trim());
		
		System.out.println(str3);
		System.out.println(str3.trim());

	}

}
