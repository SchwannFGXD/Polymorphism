public class Cycle extends LandVehicle{

    public Cycle(int numberOfWheels, int maximumOccupancy, FuelType fuelType, Boolean publicTravel){
        super(numberOfWheels,maximumOccupancy,fuelType, publicTravel);
    }
    public String startUpNoise(){
        return ("wrwrwr");
    }
}
