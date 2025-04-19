public class Vehicle {
    private  int speedVehicle;


    public void accelerate(int speedVehicle) throws LimitedSpeed {
        this.speedVehicle = speedVehicle * 2;

        if (this.speedVehicle > 100) {
            throw new LimitedSpeed(this.speedVehicle);

        }

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speedVehicle=" + speedVehicle +
                '}';
    }
}
