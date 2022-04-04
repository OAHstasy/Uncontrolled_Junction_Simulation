package vehicle;

public class EngineeringVehicle extends AMotorVehicle {
	final String vehicleName = "Engineering Vehicle";
	public EngineeringVehicle(int currentRoad, String vehicleDirection) {
		super(currentRoad, vehicleDirection);
		super.changePassSuperiority(-5);
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
