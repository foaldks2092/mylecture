package kr.java.chapter8;

public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	

	

	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public String showVIPCustomer() {
		return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다";
	}
	
	
	
	public int getAgentID() {
		return agentID;
	}
	


}
