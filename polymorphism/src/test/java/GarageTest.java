import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarageTest {

    private Garage garage;
    private Helicopter helicopter;
    private Car car;
    private Train train;
    private Cycle cycle;



    @BeforeEach
    public void setUp() {
        garage = new Garage();
        helicopter = new Helicopter(0, 6, FuelType.PETROL, false,1000);
        car = new Car(4, 5, FuelType.ELECTRICITY, true);
        train = new Train(12, 20, FuelType.COAL, true);
        cycle = new Cycle(2, 1, FuelType.NONE, true);

    }
    @Test
    public void canAddToGarage() {
        garage.addToGarage(helicopter);
        garage.addToGarage(cycle);

        int expected = garage.garageSize();

        int actual = 2;

        assertEquals(expected, actual);
    }

}