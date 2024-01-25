public class Trailer extends Vehicle {
    private int numberOfWheels;
    private String height;
    private String engineType;
    private String colour;
    private String behaviour;


    public Trailer(String make, String model, String type, int numberOfWheels, String height, String engineType, String colour, String behaviour) {
        super(make, model, type);
        // Constructor chaining
        this.numberOfWheels = numberOfWheels;
        this.height = height;
        this.engineType = engineType;
        this.colour = colour;
        this.behaviour = behaviour;

    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Trailer");
        super.displayVehicleInfo(); // Calling Vehicle's displayInfo
        System.out.println("Number of Wheels: " + numberOfWheels + ", Height: " + height + ", Engine Type: " + engineType + ", Colour: " + colour + ", Behaviour: " + behaviour);
        System.out.println("*******************************************************************");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }
}