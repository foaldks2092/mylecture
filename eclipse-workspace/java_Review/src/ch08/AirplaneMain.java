package ch08;

/* 비행기는 날아 갈 수 있다.
 * 초음속 비행기는 모드가 초음속이면 초음속으로 날고
 * 모드가 일반이면 일반 비행기 속도로 난다.
 * 
 * 비행기 -> Airplane
 * 		 + land()		// 착륙
 * 		 + fly()
 * 		 + takeoff()	// 이륙
 * 
 * 초음속 -> Supersonic extends Airplane
 * 			+ mode: NORMAL, SUPERSONIC( 상수 )
 * 			+ @Override fly()
 */
public class AirplaneMain {
	

	public static void main(String[] args) {
		Airplane plane = new Airplane();
		plane.takeoff();
		plane.fly();
		plane.land();

		
		
		SupersonicAirplane splane = new SupersonicAirplane();
		splane.takeoff();
		splane.fly();
		splane.setMode(SupersonicAirplane.SUPERSONIC);
		splane.fly();
		splane.setMode((SupersonicAirplane.NORMAL));
		splane.fly();
		splane.land();
	}

}
