package kr.java.chapter3;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//자연수 n 입력 받기
		System.out.println("자연수 3~10 입력: ");
		int n = sc.nextInt();
		
		// 알파벳 시작점 설정(초기화)
		char alpa = 'A';
		
		// 줄반복
		for (int i = 0; i < n; i++) {		
			//자연수 범위 검증
			if((n < 3) || (n > 10)) {
				
				System.out.println("범위를 벗어났습니다.");
				break;
			}
			//알파벳 피라미드
			//입력받은 자연수 n만큼 반복.
			for(int j = 0; j < n- i; j++) {
				
				System.out.print(alpa);
				alpa++;
				// Z 넘어가면 다시 A부터
				if(alpa == 'Z'+1) 
					alpa = 'A';
													
			}
			System.out.println();
		}

	}

}
