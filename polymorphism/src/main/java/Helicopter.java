public class Helicopter extends AirVehicle{

    public Helicopter(int numberOfWheels, int maximumOccupancy, FuelType fuelType, Boolean publicTravel, int maximumAltitude){
        super(numberOfWheels,maximumOccupancy,fuelType, publicTravel, maximumAltitude);

    }

    public String startUpNoise(){
        return ("wachuwachuwachu");
    }
}