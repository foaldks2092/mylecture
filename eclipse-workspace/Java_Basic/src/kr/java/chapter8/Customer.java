package kr.java.chapter8;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	

	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerGrade() {
		return customerGrade;
	}


	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	private int agentID;
	double saleRatio;
	
	public Customer() {
		this(0,"");
	} 
	

/*	public Customer( ) {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		

	
	}*/
	
	public Customer(int customerID, String customerName ) {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		
		this.customerID = customerID;
		this.customerName = customerName;
		
		System.out.println("Customer() 생성자 호출");
	
	} 
	
	
	public int caleCPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}

}
