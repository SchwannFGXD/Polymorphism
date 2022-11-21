
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelicopterTest {

    private Helicopter helicopter;

    @BeforeEach
    public void setUp() {
        helicopter = new Helicopter(0, 6, FuelType.PETROL, false,1000);
    }

    @Test
    public void canGetWheelCount(){
        int expected = 0;

        int actual = helicopter.getNumberOfWheels();

        assertEquals(expected,actual);
    }

    @Test
    public void canGetMaximumOccupancy(){
        int expected = 6;

        int actual = helicopter.getMaximumOccupancy();

        assertEquals(expected,actual);
    }
    @Test
    public void canGetFuelType(){
        FuelType expected = FuelType.PETROL;

        FuelType actual = helicopter.getFuelType();

        assertEquals(expected,actual);
    }
    @Test
    public void canGetTravelType(){
        Boolean expected = false;

        Boolean actual = helicopter.getPublicTravel();

        assertEquals(expected,actual);
    }

    @Test
    public void canStartUp(){
        String expected = "wachuwachuwachu";

        String actual = helicopter.startUpNoise();

        assertEquals(expected,actual);
    }

}
