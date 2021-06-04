package override;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff();
		sa.fly();
		System.out.println(sa.flymode);
		System.out.println();
		
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
