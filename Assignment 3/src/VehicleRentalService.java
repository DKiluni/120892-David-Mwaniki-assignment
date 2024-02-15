class VehicleRentalService {

    void rent(String vehicleType, String duration) {
        System.out.println("Rental Duration " + duration + " Vehicle Type " + vehicleType);
    }

    void rentVehicle(String vehicleType, String duration, boolean insurance) {
        if (insurance) {
            System.out.println("The vehicle " + vehicleType + " is insured and is on rent for " + duration);
        } else {
            System.out.println("The vehicle " + vehicleType + " is not insured and is on rent for " + duration);
        }
    }
}
class Main {
    public static void main(String[] args) {
        VehicleRentalService service = new VehicleRentalService();


        service.rentVehicle("car", "Two Days", true);


        service.rentVehicle("bike", "Five Days",  false);


        service.rentVehicle("scooter", "Seven Days",   true);

    }
}