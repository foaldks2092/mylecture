package ch08;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone1 = new  Phone("전화","붉은색","111111");
		phone1.powerOn();
		phone1.send();
		phone1.powerOff();
		
//		VideoPhone phone2 = new VideoPhone("영상통화","노랑","11112");
//		phone2.powerOn();
//		phone2.send();
//		phone2.powerOff();
//		phone2.videoCall();
		
		Phone phone3 = new VideoPhone();	// UP - casting (Auto - Boxing)
		// phone3.videoCall();
		((VideoPhone)phone3).videoCall();	// Down - casting
		
		Phone phone4 = new  Phone("전화","붉은색","111111");
		((VideoPhone)phone4).videoCall();
		
		

	}

}
