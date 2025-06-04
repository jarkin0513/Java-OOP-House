/**
 * The Main class serves as the entry point for showcasing the House, SmallApartment, and Person classes.
 * It creates instances of these classes and demonstrates a variety of scenarios.
 */
public class Main {
    /**
     * The main method where the program starts execution.
     *
     * @param args The command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        House house = new House();
        House.Door door = house.getDoor();

        System.out.println("House and Door Constructor Test:");
        String houseConstructorString = house.toString();
        String doorConstructorString = door.toString();
        System.out.println(houseConstructorString);
        System.out.println(doorConstructorString + "\n");

        SmallApartment smallApartment = new SmallApartment();
        System.out.println("Small Apartment Constructor Test:");
        String smallApartmentConstructorString = smallApartment.toString();
        System.out.println(smallApartmentConstructorString + "\n");

        Person person = new Person("Joe", house);
        house.setArea(2000);
        door.setDoorColor("yellow");
        System.out.println("House With Person Test 1:");
        String personString = person.toString();
        System.out.println(personString + "\n");

        House house1 = new House();
        House.Door door1 = house1.getDoor();
        house1.setArea(2500);
        door1.setDoorColor("blue");
        Person person1 = new Person("Jack", house1);
        System.out.println("House With Person Test 2:");
        System.out.println(person1 + "\n");

        SmallApartment smallApartment1 = new SmallApartment();
        Person person2 = new Person("John", smallApartment1);
        System.out.println("Small Apartment With Person Test 1:");
        System.out.println(person2 + "\n");

        SmallApartment smallApartment2 = new SmallApartment();
        Person person3 = new Person("Jasmin", smallApartment2);
        System.out.println("Small Apartment With Person Test 2:");
        System.out.println(person3 + "\n");

    }
}