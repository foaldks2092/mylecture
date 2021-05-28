package kr.java.chap11;

import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// 1
		String s = new String();
		Class c = s.getClass();
		Method[] m = c.getMethods();
		for(Method method: m) {
		System.out.println(method.getName());

	}
	// 2
	c = String.class;
	c = EqualsTest.class;
	
	c = Class.forName("kr.java.chapter11.CloneTest");
	System.out.println(c.getName());
	
	// 3 
	try {
		c = Class.forName("kr.java.chap11.CloneTest");
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println(c.getName());
	

	
	
	

}
}
