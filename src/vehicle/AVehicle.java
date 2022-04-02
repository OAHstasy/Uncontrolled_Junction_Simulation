package vehicle;

public abstract class AVehicle implements IVehicle {

	
	public String getClassName() {
		return this.getClass().getSimpleName();
	}
}
