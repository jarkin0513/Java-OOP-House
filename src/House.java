/**
 * The House class provides methods to represent a house with an area and a door with a color.
 */
public class House {
    /**
     * The area of the house in square feet.
     */
    private int area;
    /**
     * The door of the house. Will have an associated color for it.
     */
    private Door door;

    /**
     * The constructor for the House class.
     * Initializes the area to be 1500 sq feet and sets the door color to be white as default.
     */
    public House() {
        this.area = 1500;
        this.door = new Door("white");
    }

    /**
     * A parameterized constructor for the House class.
     * Used for setting the area of subclass SmallApartment.
     *
     * @param area The area of the house in square feet.
     */
    public House(int area) {
        this.area = area;
    }

    /**
     * Getter for getting the currently set area of the house.
     *
     * @return The area as in integer.
     */
    public int getArea() {
        return area;
    }

    /**
     * Setter for setting the area of the house.
     *
     * @param area The area of the house to set.
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * Generate a string representing the details of the house.
     *
     * @return A string describing the house and its area.
     */
    @Override
    public String toString() {
        return "I am a house, my area is " + area + " square feet.";
    }

    /**
     * Gets a description of the house, specifically for a House instance.
     *
     * @return A string that says 'a house'.
     */
    public String getHouseDescription() {
        return "a house";
    }

    /**
     * Get the door of the house.
     *
     * @return The door object representing the house's door.
     */
    public Door getDoor() {
        return door;
    }

    /**
     * The Door class represents the door of the house. Includes methods to create door.
     */
    public static class Door {

        /**
         * A string representing the color of the door.
         */
        private String doorColor;

        /**
         * Constructor for the Door class. For creating a Door object with a specified door color.
         *
         * @param doorColor The color of the door.
         */
        public Door(String doorColor) {
            this.doorColor = doorColor;
        }

        /**
         * Getter for getting the currently set door color.
         *
         * @return A String representing the door color.
         */
        public String getDoorColor() {
            return doorColor;
        }

        /**
         * Setter for setting the door color.
         *
         * @param doorColor The new color for the door.
         */
        public void setDoorColor(String doorColor) {
            this.doorColor = doorColor;
        }

        /**
         * Generate a string representing the details for the door.
         *
         * @return A string describing the door and its color.
         */
        @Override
        public String toString() {
            return "I am a " + doorColor + " door.";
        }
    }
}

