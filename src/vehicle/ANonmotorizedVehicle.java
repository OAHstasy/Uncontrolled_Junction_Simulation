package vehicle;

public abstract class ANonmotorizedVehicle extends AVehicle {
    private final String motorType = "Non-Motorized";

    public ANonmotorizedVehicle(int currentRoad, String vehicleDirection) {
        super(currentRoad, vehicleDirection);
        super.changePassSuperiority(-10);
    }

    public String getMotorType() { return motorType; }
}
