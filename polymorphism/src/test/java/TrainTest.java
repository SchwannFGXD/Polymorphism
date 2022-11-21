
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTest {

    private Train train;

    @BeforeEach
    public void setUp() {
        train = new Train(12, 20, FuelType.COAL, true);
    }

    @Test
    public void canGetWheelCount(){
        int expected = 12;

        int actual = train.getNumberOfWheels();

        assertEquals(expected,actual);
    }

    @Test
    public void canGetMaximumOccupancy(){
        int expected = 20;

        int actual = train.getMaximumOccupancy();

        assertEquals(expected,actual);
    }
    @Test
    public void canGetFuelType(){
        FuelType expected = FuelType.COAL;

        FuelType actual = train.getFuelType();

        assertEquals(expected,actual);
    }
    @Test
    public void canGetTravelType(){
        Boolean expected = true;

        Boolean actual = train.getPublicTravel();

        assertEquals(expected,actual);
    }

    @Test
    public void canStartUp(){
        String expected = "choochoo";

        String actual = train.startUpNoise();

        assertEquals(expected,actual);
    }

}
