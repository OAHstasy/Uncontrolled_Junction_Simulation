package vehicle;

public class Tractor extends AMotorVehicle {
	final String vehicleName = "Tractor";
	public Tractor(int currentRoad, String vehicleDirection) {
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
