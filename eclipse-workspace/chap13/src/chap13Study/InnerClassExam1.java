package chap13Study;

public class InnerClassExam1 {
	
	private int outerHashCode;
	public String outerClassName;
	static boolean isOuter;
	
	
	class InnerClass {
		private int innerHashCode;
		public String innerClassName;
		static final boolean isInner = true;
		
		public InnerClass() {
			innerHashCode = System.identityHashCode(this);
			innerClassName = this.getClass().getName();
			
		}
		public void printOuterInfo() {
			System.out.println("Outer hash: " + outerHashCode);
			System.out.println("Outer name: " + outerClassName);
			System.out.println("It is Outer class :" + isOuter);		
		}		
		public void printInnerInfo() {
			System.out.println("Inner hash: " + innerHashCode);
			System.out.println("Inner name: " + innerClassName);
			System.out.println("It is Inner class :" + isInner);		
		}
	}
			public InnerClassExam1() {
			outerHashCode = System.identityHashCode(this);
			outerClassName = this.getClass().getName();
			isOuter = true;
			
		
			
		}
}
