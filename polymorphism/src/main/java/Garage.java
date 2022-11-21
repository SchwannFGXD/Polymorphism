import java.util.ArrayList;

public class Garage {

    private static ArrayList<Vehicles> garage = new ArrayList<>();

    public Garage(){
    }

    //methods

    public int garageSize(){
        return garage.size();
    }

    public void addToGarage(Vehicles vehicle){
        this.garage.add(vehicle);
    }

    public Vehicles inIGarage(int i){
        return garage.get(i);
    }

    //getters and setters
    public static ArrayList<Vehicles> getGarage() {
        return garage;
    }

    public static void setGarage(ArrayList<Vehicles> garage) {
        Garage.garage = garage;
    }
}
