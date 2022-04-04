public class CarProbability {
	
	private final static int CAR = 				35;
	private final static int BUS = 				10 + CAR;
	private final static int TRUCK = 				10 + BUS;
	private final static int MOTORCYCLE = 			15 + TRUCK;
	private final static int TRACTOR = 			10 + MOTORCYCLE;
	private final static int ENGINEERINGVEHICLE = 	5  + TRACTOR;
	private final static int BICYCLE = 			10 + ENGINEERINGVEHICLE;
	private final static int HORSEDRAWNVEHICLE = 	5  + BICYCLE;	


	public static String getVehicleType() {
		double randomValue = Math.random() * 100;
	
		if(randomValue < CAR)
			return "Car";
		else if(randomValue < BUS)
			return "Bus";
		else if(randomValue < TRUCK)
			return "Truck";
		else if(randomValue < MOTORCYCLE)
			return "Motorcycle";
		else if(randomValue < TRACTOR)
			return "Tractor";
		else if(randomValue < ENGINEERINGVEHICLE)
			return "EngineeringVehicle";
		else if(randomValue < BICYCLE)
			return "Bicycle";
		else if(randomValue < HORSEDRAWNVEHICLE)
			return "HorsedrawnVehicle";
		return "";
	}
}
