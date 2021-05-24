package kr.java.chapter3;

public class AssignTest {

	public static void main(String[] args) {
		int t= 1000;
		int i;
		
		String str = "Test";
		String str2 = new String("Test2");
		String str3;
		
		System.out.println(t);
		// System.out.println(i);
		System.out.println(str);
		System.out.println(str2);
		// System.out.println(str3);
		
		i = t;
		str3 = str;  
		
		System.out.println(i);
		System.out.println(str3);
		System.out.println("-----------------------------------");

		int num = 10;
		
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);

		
		num = -num;
		System.out.println(num);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		float q = 1.0F;
		System.out.println(+q);
		System.out.println(-q);
		System.out.println(q);



	}

}
