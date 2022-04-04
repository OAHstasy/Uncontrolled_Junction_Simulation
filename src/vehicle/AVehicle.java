package vehicle;

public abstract class AVehicle implements IVehicle {
	private int passageSuperiority = 0;
	public AVehicle(int currentRoad, String vehicleDirection) {
		this.currentRoad = currentRoad;
		this.vehicleDirection = vehicleDirection;
	}
	private String vehicleDirection;
	private int currentRoad;

	public String getClassName() {
		return this.getClass().getSimpleName();
	}
	public String getVehicleDirection(){
		return this.vehicleDirection;
	}
	public int getCurrentRoad() { return this.currentRoad; }
	
	public int getPassSuperiority() {
		return passageSuperiority;
	}
	public void changePassSuperiority(int increaseValue) {
		this.passageSuperiority += increaseValue;
	}

}
