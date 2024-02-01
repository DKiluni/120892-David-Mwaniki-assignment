abstract class ElectricVehicle{
    abstract void batteryType();
}


class ElectricCar extends ElectricVehicle {

    @Override
    void batteryType() {
        System.out.println("The electric car uses Lithium-ion batteries");
    }
}
class ElectricBike extends ElectricVehicle {

    @Override
    void batteryType() {
        System.out.println("The electric bike uses Nickel-metal hydride batteries");
    }
}
class  MainClass {
    public static void main(String[] args) {
        System.out.println("What are the battery types used by the electric vehicles?");
        ElectricCar car = new ElectricCar();
        ElectricBike bike = new ElectricBike();
        car.batteryType();
        bike.batteryType();
    }
}