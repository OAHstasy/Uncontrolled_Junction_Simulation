package vehicle;

public class Bicycle extends ANonmotorizedVehicle {
	final String vehicleName = "Bicycle";

	public Bicycle(int currentRoad, String direction) {
		super(currentRoad, direction);
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
