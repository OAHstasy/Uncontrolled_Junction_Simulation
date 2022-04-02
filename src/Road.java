import java.util.ArrayList;
import java.util.List;
import vehicle.IVehicle;

public class Road {
	private int roadNumber;
	private int first = 0;
	
	public Road(int roadNumber) {	
		this.roadNumber = roadNumber;
	}
	
	List<IVehicle> road = new ArrayList<>();
	
	public boolean removeFirstInLine() {
		if(!isRoadEmpty()) {
			road.remove(first);
			first++;
			return true;
		}
		return false;
	}
	
	private boolean isRoadEmpty() {
		if(road.get(first)!=null) return false;
		
		return true;
	}
	
	public void addVehicleToRoad(IVehicle vehicle) {
		road.add(vehicle);		
	}
}