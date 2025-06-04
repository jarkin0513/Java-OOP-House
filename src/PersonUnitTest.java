import org.junit.jupiter.api.*;

public class PersonUnitTest {

    @Test
    public void testConstructor() {
        House house = new House();
        House.Door door = house.getDoor();
        Person person = new Person("Joe", house);
        Assertions.assertEquals("Joe", person.getName());
        Assertions.assertEquals(1500, house.getArea());
        Assertions.assertEquals("white", door.getDoorColor());
    }

    @Test
    public void testGetName() {
        House house = new House();
        Person person = new Person("Jack", house);
        Assertions.assertEquals("Jack", person.getName());
    }

    @Test
    public void testToString() {
        House house = new House();
        House.Door door = house.getDoor();
        door.setDoorColor("black");
        house.setArea(4000);
        Person person = new Person("John", house);
        Assertions.assertEquals("John lives in a house that is 4000 square feet with a black door.",
                person.toString());
    }

}
