/**
 * The person class provides methods to represent a person and their house including its details.
 */
public class Person {
    /**
     * A string for the name of the person.
     */
    private String name;
    /**
     * A House object for where the person lives.
     */
    private House house;

    /**
     * Constructor for the Person class.
     * Creates a Person object with a name and a house.
     * Assigns name and house parameter values to the member variables for name and house.
     *
     * @param name  The name of the person.
     * @param house The house where the person lives.
     */
    public Person(String name, House house) {
        this.name = name;
        this.house = house;
    }

    /**
     * Getter for getting the currently set name of the person.
     *
     * @return The person's name as a string.
     */
    public String getName() {
        return name;
    }

    /**
     * Generate a string representing the details of the person's name, either their house with its area and the door or
     * their small apartment and its area.
     *
     * @return A string describing the peron's name, either the house they live in with its area in square feet, and
     * the door of the house with its color, or their small apartment and its area.
     */
    @Override
    public String toString() {

        String houseDescription = house.getHouseDescription();
        String doorDescription = "";

        if (house.getDoor() != null) {
            doorDescription = " with a " + house.getDoor().getDoorColor() + " door";
        }
        return getName() + " lives in " + houseDescription + " that is " + house.getArea() + " square feet" +
                doorDescription + ".";
    }

}
