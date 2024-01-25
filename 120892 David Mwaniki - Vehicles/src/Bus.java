public class Bus extends Vehicle {
    private int numberOfWheels;
    private String engineType;
    private String suspension;
    private String length;
    private String behaviour;

    public Bus(String make, String model, String type, int numberOfWheels, String engineType, String suspension, String length, String behaviour) {
        super(make, model, type);
        // Constructor chaining
        this.numberOfWheels = numberOfWheels;
        this.engineType = engineType;
        this.suspension = suspension;
        this.length = length;
        this.behaviour = behaviour;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Bus");
        super.displayVehicleInfo();
        // Calling Vehicle's displayInfo
        System.out.println("Number of Wheels: " + numberOfWheels + ", Engine Type: " + engineType + ", Suspension: " + suspension + ", Behaviour: " + behaviour);
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
    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}