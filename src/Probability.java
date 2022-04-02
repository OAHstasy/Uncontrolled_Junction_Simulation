public class Probability {
	
	private final int CAR = 				35;
	private final int BUS = 				10 + CAR;
	private final int TRUCK = 				10 + BUS;
	private final int MOTORCYCLE = 			15 + TRUCK;
	private final int TRACTOR = 			10 + MOTORCYCLE;
	private final int ENGINEERINGVEHICLE = 	5  + TRACTOR;
	private final int BICYCLE = 			10 + ENGINEERINGVEHICLE;
	private final int HORSEDRAWNVEHICLE = 	5  + BICYCLE;	
	
	public Probability() {
	}
	
	public String getVehicleType(){
		
		double rValue = Math.random() * 100;

		if(rValue < CAR)
			return "Car";
		else if(rValue < BUS)
			return "Bus";
		else if(rValue < TRUCK)
			return "Truck";
		else if(rValue < MOTORCYCLE)
			return "Motorcycle";
		else if(rValue < TRACTOR)
			return "Tractor";
		else if(rValue < ENGINEERINGVEHICLE)
			return "EngineeringVehicle";
		else if(rValue < BICYCLE)
			return "Bicycle";
		else if(rValue < HORSEDRAWNVEHICLE)
			return "HorsedrawnVehicle";
		return "";	
	}
}
