package ch05;

public class ArrayCopyTest {
	
	/*
	public void arrayCopy(int[] src, int srcPos, int[] dst, int dstPos, int length) {
		for(int i = 0; i < length; i++) {
			dst[dstPos + i] = src[i + srcPos];
		}
	} */				// 클래스(강사님)
	
	
						// 클래스(수강생)	
	static int[] arrayCopy(int[] src, int srcPos, int[] dst, int dstPos, int length) {
		
		for(int i = srcPos; i < srcPos + length; i++) {
			dst[dstPos] = src[i];
			dstPos++;
		}
		
		return dst;
				
		
	} 
	
	public static void main(String[] args) {
	
		int[] a = { 0,1,2,3,4,5,6,7,8,9 };
		int[] b = new int[20];
		
		arrayCopy(a, 0, b, 5, 10);
		
		for( int c:b) {
			System.out.println(c);
		}
	} 

}

