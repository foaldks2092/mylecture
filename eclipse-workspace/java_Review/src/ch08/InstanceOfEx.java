package ch08;

public class InstanceOfEx {

	public static void main(String[] args) {
		
	Phone phone1 = new VideoPhone();		// UP - casting된 클래스
	if(phone1 instanceof VideoPhone) {
		System.out.println("Phone1 OK VidePhone");
	}
	
	// phone1.videoCall();
	((VideoPhone)phone1).videoCall();		// DOWN - casting 
	
	if(phone1 instanceof Phone) {
		System.out.println("Phone1 OK VidePhone");
	}
	
	
	Phone phone2 = new Phone("","","");
	if(phone2 instanceof VideoPhone) {
		System.out.println("Phone2 OK VidePhone");
	}
	
	
	if(phone2 instanceof Phone) {
		System.out.println("Phone2 OK VidePhone");
	}
	

	}

}
