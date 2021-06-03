package ch06;

public class Subway {
	String lineNumber;			// 지하철 라인
	int passengerCount;		// 승객 수
	int money;				// 수입
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {	// 승객이 낸 돈
		this.money += money;		// 수입 증가
		passengerCount++;			// 승객 수 증가
	}
	
	public void showInfo() {	// 정보를 출력하는 메서드
		System.out.println("지하철 " + lineNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}

}
