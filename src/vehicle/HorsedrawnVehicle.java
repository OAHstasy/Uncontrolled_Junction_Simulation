package vehicle;

public class HorsedrawnVehicle  extends ANonmotorizedVehicle {
	final String vehicleName = "Horsedrawn Vehicle";
	public HorsedrawnVehicle(int currentRoad, String vehicleDirection) {
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
