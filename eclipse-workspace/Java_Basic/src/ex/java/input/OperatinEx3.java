package ex.java.input;

public class OperatinEx3 {

	public static void main(String[] args) {
	/*	int a = 10;
		int b = 20;
		
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(0 == b);
		System.out.println(-1 == b);
		System.out.println(10 != b);
		
		boolean b1 = ( a > b);
		System.out.println( b1 );
		
		System.out.println( ( 5 > 3 ) && ( 5 > 2 ) );
		System.out.println( ( 5 > 3 ) || ( 5 > 2 ) ); */
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) < 10 ) && ( (i = i + 2) < 10 );
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		int a1 = 10;
		
		System.out.println(a1 += 2);

	}

}
