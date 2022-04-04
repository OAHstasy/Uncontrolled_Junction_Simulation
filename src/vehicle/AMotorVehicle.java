package vehicle;

public abstract class AMotorVehicle extends AVehicle {
    private final String motorType = "Motor";

    public AMotorVehicle(int currentRoad, String vehicleDirection) {
        super(currentRoad, vehicleDirection);
        super.changePassSuperiority(10);
    }

    public String getMotorType() {
        return motorType;
    }
}
