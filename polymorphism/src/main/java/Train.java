public class Train extends LandVehicle{

    public Train(int numberOfWheels, int maximumOccupancy, FuelType fuelType, Boolean publicTravel){
        super(numberOfWheels,maximumOccupancy,fuelType, publicTravel);
    }
    public String startUpNoise(){
        return ("choochoo");
    }
}