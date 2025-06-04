import org.junit.jupiter.api.*;

class HouseUnitTest {

    @Test
    public void testConstructor() {
        House house = new House();
        Assertions.assertEquals("white", house.getDoor().getDoorColor());
        Assertions.assertEquals(1500, house.getArea());
    }
    @Test
    public void testSettersAndGetters() {
        House house = new House();
        House.Door door = house.getDoor();
        house.setArea(3000);
        door.setDoorColor("green");
        Assertions.assertEquals(3000, house.getArea());
        Assertions.assertEquals("green", door.getDoorColor());
    }
    @Test
    public void testToStringMethod() {
        House house = new House();
        House.Door door = house.getDoor();
        house.setArea(2000);
        door.setDoorColor("black");
        Assertions.assertEquals("I am a house, my area is " + 2000 + " square feet.",
                house.toString());
        Assertions.assertEquals("I am a black door.",
                door.toString());
    }

    @Test
    public void testGetHouseDescription() {
        House house = new House();
        Assertions.assertEquals("a house", house.getHouseDescription());
    }


}
