import interfaces.Engine;

public class Helicopter extends AirVehicle implements Engine {

    public Helicopter(int numberOfWheels, int maximumOccupancy, FuelType fuelType, Boolean publicTravel, int maximumAltitude){
        super(numberOfWheels,maximumOccupancy,fuelType, publicTravel, maximumAltitude);

    }

    public String startUpNoise(){
        return ("wachuwachuwachu");
    }

    public String engineTest(int number) {
        return String.format("This Helicopters engine was tested for " + number + " seconds.");
    }
}