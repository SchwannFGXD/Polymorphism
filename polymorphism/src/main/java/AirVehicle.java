public class AirVehicle extends Vehicles{

    private int maximumAltitude;

    public AirVehicle(int numberOfWheels, int maximumOccupancy, FuelType fuelType, Boolean publicTravel, int maximumAltitude){
        super(numberOfWheels,maximumOccupancy,fuelType, publicTravel);
        this.maximumAltitude=maximumAltitude;

    }
}
