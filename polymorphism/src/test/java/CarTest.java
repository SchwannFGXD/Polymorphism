
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car(4, 5, FuelType.ELECTRICITY, true);
    }

    @Test
    public void canGetWheelCount(){
        int expected = 4;

        int actual = car.getNumberOfWheels();

        assertEquals(expected,actual);
    }

    @Test
    public void canGetMaximumOccupancy(){
        int expected = 5;

        int actual = car.getMaximumOccupancy();

        assertEquals(expected,actual);
    }
    @Test
    public void canGetFuelType(){
        FuelType expected = FuelType.ELECTRICITY;

        FuelType actual = car.getFuelType();

        assertEquals(expected,actual);
    }
    @Test
    public void canGetTravelType(){
        Boolean expected = true;

        Boolean actual = car.getPublicTravel();

        assertEquals(expected,actual);
    }

    @Test
    public void canStartUp(){
        String expected = "vroom";

        String actual = car.startUpNoise();

        assertEquals(expected,actual);
    }

}
