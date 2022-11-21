
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CycleTest {

    private Cycle cycle;

    @BeforeEach
    public void setUp() {
        cycle = new Cycle(2, 1, FuelType.NONE, true);
    }

    @Test
    public void canGetWheelCount(){
        int expected = 2;

        int actual = cycle.getNumberOfWheels();

        assertEquals(expected,actual);
    }

    @Test
    public void canGetMaximumOccupancy(){
        int expected = 1;

        int actual = cycle.getMaximumOccupancy();

        assertEquals(expected,actual);
    }
    @Test
    public void canGetFuelType(){
        FuelType expected = FuelType.NONE;

        FuelType actual = cycle.getFuelType();

        assertEquals(expected,actual);
    }
    @Test
    public void canGetTravelType(){
        Boolean expected = true;

        Boolean actual = cycle.getPublicTravel();

        assertEquals(expected,actual);
    }

    @Test
    public void canStartUp(){
        String expected = "wrwrwr";

        String actual = cycle.startUpNoise();

        assertEquals(expected,actual);
    }

}
