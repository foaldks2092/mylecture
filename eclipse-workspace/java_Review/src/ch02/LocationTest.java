package ch02;

public class LocationTest {



	public static void main(String[] args) {
		// 1부터 100까지 더하는 식을 세워봐라
		
/*		int sum = 0;									// sum을 멤버필드쪽에서 선언하면 sum에 반복적으로 숫자가 더해짐
		for (int i = 1 ; i <= 10 ; i++) {				 
			
			
			sum += i;		
			System.out.println(sum);					// 출력문을 for문 안에 넣으면 반복횟수만큼 줄줄이 출력됨, 바깥에 출력문을 넣으면 모든 값을 더한 한가지 값만 나온다. (ex) 1~10까지 다 더한값 - > 55
						
		} */
		
											
		for (int i = 1 ; i <= 10 ; i++) {				 
			int sum = 0;								// sum을 for문 안에 넣으면 값이 아닌 반복횟수(1~10까지)순서가 출력됨
			
			sum += i;		
								// 
			System.out.println(sum);		
		}
		
		
	} 

}
