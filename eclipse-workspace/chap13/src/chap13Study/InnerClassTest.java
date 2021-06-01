package chap13Study;

import chap13Study.MyClass1.MyInnerClass;

public class InnerClassTest {

	public static void main(String[] args) {
		MyClass1 obj = new MyClass1();
		
		MyInnerClass innerObj = obj.new MyInnerClass(); 
		
		

	}

}
