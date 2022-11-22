import interfaces.Engine;

public class Train extends LandVehicle implements Engine {

    public Train(int numberOfWheels, int maximumOccupancy, FuelType fuelType, Boolean publicTravel){
        super(numberOfWheels,maximumOccupancy,fuelType, publicTravel);
    }
    public String startUpNoise(){
        return ("choochoo");
    }

    public String engineTest(int number) {
        return String.format("This Trains engine was tested for " + number + " seconds.");
    }
}