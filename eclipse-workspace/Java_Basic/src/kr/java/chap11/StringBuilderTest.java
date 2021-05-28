package kr.java.chap11;

public class StringBuilderTest {

	public static void main(String[] args) {
	
		String javaStr = new String("java");
		System.out.println("javaSr 문자열 주소:   " + "System.identityHashCode");
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 후 buffer 메모리 주소" + System.identityHashCode(buffer));
		
		buffer.append(" friday");
		buffer.append(" night");
		buffer.append(" funkin music!!");
		System.out.println("연산 후 buffer 메모리 주소" + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 메모리 주소" + System.identityHashCode(buffer));



	}

}
