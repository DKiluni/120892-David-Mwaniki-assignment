public class Motorcycle extends Vehicle {
    private int numberOfWheels;
    private String passengers;
    private String engineType;
    private String speedLimit;
    private String behaviour;

    public Motorcycle(String make, String model, String type, int numberOfWheels, String passengers, String engineType, String speedLimit, String behaviour) {
        super(make, model, type);
        // Constructor chaining
        this.numberOfWheels = numberOfWheels;
        this.passengers = passengers;
        this.engineType = engineType;
        this.speedLimit = speedLimit;
        this.behaviour = behaviour;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Motorcycle");
        super.displayVehicleInfo(); // Calling Vehicle's displayInfo
        System.out.println("Number of Wheels: " + numberOfWheels +", Passengers: " + passengers +  ", Engine Type: " + engineType + ", Speed Limit: " + speedLimit +", Behaviour: " + behaviour);
        System.out.println("*******************************************************************");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }
    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }
    public String getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
    }
}