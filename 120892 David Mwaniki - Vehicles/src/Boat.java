public class Boat extends Vehicle {
    private String use;
    private String view;
    private String engineType;
    private String behaviour;

    public Boat(String make, String model, String type, String engineType, String use, String view, String behaviour) {
        super(make, model, type);
        // Constructor chaining
        this.use = use;
        this.view = view;
        this.engineType = engineType;
        this.behaviour = behaviour;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Boat");
        super.displayVehicleInfo(); // Calling Vehicle's displayInfo
        System.out.println("Engine Type: " + engineType + ", Use: " + use + ", View: " + view + ", Behaviour: " + behaviour);
        System.out.println("*******************************************************************");
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
    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }
}