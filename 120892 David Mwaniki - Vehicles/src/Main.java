public class Main {
    public static void main(String[] args) {
        Bus isuzu = new Bus("Isuzu", "NQR", "Saloon", 4, "V8", "Airbags", "12 Feet","Carrying 33 Passengers");
        Trailer volvo = new Trailer("Volvo", "VNL300", "VolvoVM", 22, "5 feet", "Diesel", "White", "Carrying 30 Tonnes");
        Boat mercedes = new Boat("Mercedes", "AMG", "Yacht", "Jet drive", "Fishing", "Bow", "Heaving");
        Motorcycle boxer = new Motorcycle("Boxer", "BM150", "Bajaj", 2, "One", "Jet drive", "100", "Move on one wheel");

        isuzu.displayVehicleInfo();
        volvo.displayVehicleInfo();
        mercedes.displayVehicleInfo();
        boxer.displayVehicleInfo();
    }
}
