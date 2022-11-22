public class LandVehicle extends Vehicles{

    public LandVehicle(int numberOfWheels, int maximumOccupancy, FuelType fuelType, Boolean publicTravel){
        super(numberOfWheels,maximumOccupancy,fuelType, publicTravel);

    }

    @Override
    public String startUpNoise() {
        return "nyoom";
    }


}
