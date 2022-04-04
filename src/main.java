import java.io.IOException;

import vehicle.*;

public class main {

	public static void main(String[] args) throws IOException {
		IVehicle vehicle = new Bus(1, "Right");
		System.out.println(vehicle.getClassName() + vehicle.getCurrentRoad() + vehicle.getVehicleDirection());
		Junction junction = new Junction();
	}
}
