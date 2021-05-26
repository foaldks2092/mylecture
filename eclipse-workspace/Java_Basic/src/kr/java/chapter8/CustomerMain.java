package kr.java.chapter8;

public class CustomerMain {

	public static void main(String[] args) {
		Customer  c1 = new Customer();
		c1.customerName = "홍길동";
		c1.setCustomerName("홍길동");
		c1.setCustomerID(1);
		System.out.println(c1.showCustomerInfo());
		
		Customer  c2 = new Customer(10,"강감찬");
		System.out.println(c2.showCustomerInfo());

	}

}
