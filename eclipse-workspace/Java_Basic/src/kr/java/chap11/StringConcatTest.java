package kr.java.chap11;

public class StringConcatTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		String str1 = new String("Java");
		String str2 = "Programing";
		String result = "";                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		
		// 동작
		int sum = 0;
		for(int i = 0; i <= 100000; i++ ) {
			result = str1.concat(" ");
			result = result.concat(str2);
		}
		
		System.out.println(result);
		
		
		// 끝 시점 시간.
		long end = System.currentTimeMillis();
				
				System.out.println("----------Concatednating------------");
				System.out.println("시간: " + (end - start));
							
				
				start = System.currentTimeMillis();
				
				for(int i = 0; i <= 100000; i++ ) {
					result = str1;
					result = str2;
				}
				
				end = System.currentTimeMillis();
				
				System.out.println("---------- + ------------");
				System.out.println("시간: " + (end - start)/1000);
							
				
				

	}

}
