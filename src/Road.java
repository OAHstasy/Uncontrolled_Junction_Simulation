import java.util.ArrayList;
import java.util.List;
import vehicle.IVehicle;

public class Road {
	private int roadNumber;
	private boolean hasPedestrian = false;
	
	public Road(int roadNumber) {	
		this.roadNumber = roadNumber;
	}

	private List<IVehicle> road = new ArrayList<>();
	
	public void addVehicleToRoad(IVehicle vehicle) {
		road.add(vehicle);		
	}
	
	public IVehicle moveVehicle() {
		IVehicle vehicle = road.get(0);
		road.remove(0);
		return vehicle;
	}
	
	public IVehicle getVehicle(int index) {
		return road.get(index);
	}
	
	public boolean hasPedestrian() {
		return this.hasPedestrian;
	}
	
	public void spawnPedestrian() {
		this.hasPedestrian = true;
	}
	
	public void crossPedestrian() {
		this.hasPedestrian = false;
	}

	public int getRoadNumber() {
		return roadNumber;
	}
	
	public int getRoadSize() {
		return road.size();
	}
	
	public IVehicle getFirstOnLine() {
		return road.get(0);
	}
}