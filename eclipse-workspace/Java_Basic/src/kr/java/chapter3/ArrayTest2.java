package kr.java.chapter3;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		String[] str = new String[] 
				{"A","B","C","D","E","F","G","H","i","j",};
		
		String t; 
		for (int i = 0; i < str.length / 2; i++) { 
			
			t = str[i];
			str[i] = str[str.length - 1 - i];     // 배열 역순(내가 한 거 x)
			str[str.length -1 -i] = t;
		}
		
		for(String a : str) {
			System.out.print(a);
		}
	}

}
