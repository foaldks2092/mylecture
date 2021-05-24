package kr.java.chapter3;

import java.util.Arrays;

public class TwoDimension {

	public static void main(String[] args) {
		
		//2 X 3 배열 : 행 우선
		int [][] arr = new int [2][3];
		
		
		System.out.println("행: " + arr.length);
		System.out.println("열: " + arr[0].length);
		
		for(int i = 0; i < arr.length; i++) {			// 행
								
			for(int j = 0; j < arr[0].length; j++) {	// 열
				arr[i][j] = 1;	// 행 X 열
			}
		}

				System.out.println(Arrays.toString(arr));
	}

}
