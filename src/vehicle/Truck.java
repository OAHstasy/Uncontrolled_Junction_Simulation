package vehicle;

public class Truck extends AMotorVehicle {
	final String vehicleName = "Truck";
	public Truck(int currentRoad, String vehicleDirection) {
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
