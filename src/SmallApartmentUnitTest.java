import org.junit.jupiter.api.*;

public class SmallApartmentUnitTest {

    @Test
    public void testToStringMethod() {
        SmallApartment smallApartment = new SmallApartment();
        Assertions.assertEquals("I am a small apartment, my area is " + smallApartment.getArea() + " square feet.",
                smallApartment.toString());
    }

    @Test
    public void testGetHouseDescription() {
        SmallApartment smallApartment = new SmallApartment();
        Assertions.assertEquals("a small apartment", smallApartment.getHouseDescription());
    }
}
