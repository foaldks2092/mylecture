package kr.java.chapter8;

public class Calcurator {

	int op1;
	int op2;
	
	
	public void setOperand(int op1, int op2) {
		this.op1 = op1;
		this.op2 = op2;		
		
	}
	
	public void sum() {
		System.out.println(this.op1 + this.op2);
	}
	public void avg() {
		System.out.println((this.op1 + this.op2) / 2);
	}
	

}
