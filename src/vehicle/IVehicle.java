package vehicle;

public interface IVehicle {
	
	public String getClassName();
	public String getVehicleDirection();
	public void setVehicleDirection();
	public int getCurrentRoad();
	public void setCurrentRoad();
	public int getPassSuperiority();
	public void changePassSuperiority(int changeValue);
}
