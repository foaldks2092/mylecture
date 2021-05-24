package chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uAE00';	//유니코드의 Escape sequence 형식
		
		System.out.println(ch1);
		System.out.println("\uAE00: " + ch2);
		System.out.println("\\uAE00: " + ch2);
		
		int ich = -66;
		
		System.out.println((char)ich);
	}

}
