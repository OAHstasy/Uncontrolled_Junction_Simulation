package vehicle;

public class Car extends AMotorVehicle {
	final String vehicleName = "Car";
	public Car(int currentRoad, String vehicleDirection) {
		super(currentRoad, vehicleDirection);
	}
	public String getVehicleName() { return this.vehicleName; }
	@Override
	public void setVehicleDirection() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCurrentRoad() {
		// TODO Auto-generated method stub
		
	}
}
