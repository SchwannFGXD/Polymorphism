import java.util.ArrayList;

public abstract class Vehicles {

    private int numberOfWheels;
    private int maximumOccupancy;
    private FuelType fuelType;
    private Boolean publicTravel;

    public Vehicles(int numberOfWheels, int maximumOccupancy, FuelType fuelType, Boolean publicTravel) {
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.fuelType = fuelType;
        this.publicTravel = publicTravel;
    }

    //method

    public abstract String startUpNoise();

    public String startUpNoise(String string){
        return String.format("this vehicle made a %s noise.", string);
    }


    // getters and setters

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public void setMaximumOccupancy(int maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Boolean getPublicTravel() {
        return publicTravel;
    }

    public void setPublicTravel(Boolean publicTravel) {
        this.publicTravel = publicTravel;
    }

}