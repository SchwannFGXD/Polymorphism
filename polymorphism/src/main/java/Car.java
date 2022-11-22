import interfaces.Engine;

public class Car extends LandVehicle implements Engine {

    public Car(int numberOfWheels, int maximumOccupancy, FuelType fuelType, Boolean publicTravel){
        super(numberOfWheels,maximumOccupancy,fuelType, publicTravel);
    }
    public String startUpNoise() {
        return ("vroom");
    }

    public String engineTest(int number) {
        return String.format("This Cars engine was tested for " + number + " seconds.");
    }
}