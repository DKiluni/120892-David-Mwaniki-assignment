
interface LandVehicle {
    void drive();
}
interface SeaVehicle {
    void sail();
}
interface AirVehicle {
    void fly();
}

interface Amphibious{

    void dock();
    void launch();
}

class Car implements LandVehicle{
    @Override
    public void drive() {
        System.out.println("A car drives on a road");
    }
}
class AmphibiousPlane implements Amphibious, AirVehicle{
    @Override
    public void fly() {
        System.out.println("The plane moves in the air");
    }
    @Override
    public void dock() {
        System.out.println("The plane can be docked");
    }
    @Override
    public void launch() {
        System.out.println("The plane can also be launched");
    }

}

//Multiple inheritance. An amphibious vehicle implements land and sea characteristics
class AmphibiousVehicle implements LandVehicle, SeaVehicle {

    @Override
    public void drive() {
        System.out.println("The vehicle can be driven on land");
    }

    @Override
    public void sail() {
        System.out.println("The vehicle can be driven on the sea as well");
    }
}

// An airplane implements AirVehicle behavior
class Airplane implements AirVehicle{

    @Override
    public void fly() {
        System.out.println("This vehicle moves in the air");
    }
}


class Main{
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("How does a car move? ");
        car1.drive();
        System.out.println("*********************************");
        AmphibiousVehicle amp1 = new AmphibiousVehicle();
        System.out.println("How does an amphibious vehicle move? ");
        amp1.drive();
        amp1.sail();
        System.out.println("*********************************");
        Airplane plane1 = new Airplane();
        System.out.println("How does an airplane move? ");
        plane1.fly();
        System.out.println("*********************************");
        AmphibiousPlane ampplane1= new AmphibiousPlane();
        System.out.println("How does an Amphibious plane move?");
        ampplane1.fly();
        ampplane1.dock();
        ampplane1.launch();
        System.out.println("*********************************");
        System.out.println("End of the game");
    }
}