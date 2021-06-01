package chap13Study;

public class InnerClassExam2 {
	
	static class InnerClass {
		static String keyword = "STATIC INNER";
		
		public void info() {
			System.out.println("Inner.info()");
		}
		
		public static void printName() {
			System.out.println("Inner.printName()");
		}
	}

	public static void main(String[] args) {
		InnerClassExam2.InnerClass inner = new InnerClassExam2.InnerClass();
		
		System.out.println("keyword: " + InnerClass.keyword);
		inner.info();
		InnerClass.printName();
	}

}
