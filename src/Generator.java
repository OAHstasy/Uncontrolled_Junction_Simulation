import vehicle.*;

public class Generator {
    double randomDirectionValue = Math.random();
    double randomRoadValue = Math.random();

    private String carDirection;
    private int carRoad;
    
    public Generator() {
    }
    
    private String getDirection() {
    	if (randomDirectionValue > 0.666) {
            carDirection = "Left";
        }
        else if(randomRoadValue > 0.333) {
            carDirection = "Straight";
        }
        else {
            carDirection = "Right";
        }
    	return carDirection;
    }
    
    public int getRoad() {
        if(randomRoadValue > 0.75) {
            carRoad = 1;
        }
        else if(randomRoadValue > 0.50) {
            carRoad = 2;
        }
        else if(randomRoadValue > 0.25) {
            carRoad = 3;
        }
        else {
            carRoad = 4;
        }
        return carRoad;
    }
    
    public IVehicle initializeVehicle() {
    	IVehicle vehicle = null;
    	switch(CarProbability.getVehicleType()) {
	        case("Car"):
	        	 vehicle = new Car(getRoad(), getDirection());
	        	break;
	        case("Bus"):
	        	vehicle = new Bus(getRoad(), getDirection());
	        	break;
	        case("Truck"):
	        	vehicle = new Truck(getRoad(), getDirection());
	        	break;
	        case("Motorcycle"):
	        	vehicle = new Motorcycle(getRoad(), getDirection());
	        	break;
	        case("Tractor"):
	        	vehicle = new Tractor(getRoad(), getDirection());
	        	break;
	        case("EngineeringVehicle"):
	        	vehicle = new EngineeringVehicle(getRoad(), getDirection());
	        	break;
	        case("Bicycle"):
	        	vehicle = new Bicycle(getRoad(), getDirection());
	        	break;
	        case("HorsedrawnVehicle"):
	        	vehicle = new HorsedrawnVehicle(getRoad(), getDirection());
	        	break;
	    }
    	return vehicle;
    }
    
    


}
