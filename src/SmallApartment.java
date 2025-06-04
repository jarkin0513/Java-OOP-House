/**
 * The SmallApartment class is a subclass of the House class with a predefined area of 500 sq feet that cannot change.
 */
public class SmallApartment extends House {
    /**
     * Constructor for creating a SmallApartment object.
     * Initializes the area of the SmallApartment to 500 sq feet.
     * Uses the 'super' keyword to call the constructor of the superclass, House, with the specified area.
     */
    public SmallApartment() {
        super(500);
    }

    /**
     * Gets a description of the house, specifically for a SmallApartment instance.
     * Overridden from House class.
     *
     * @return A string that says 'a small apartment'.
     */
    @Override
    public String getHouseDescription() {
        return "a small apartment";
    }

    /**
     * Generate a string representing the details of the small apartment.
     *
     * @return A string describing the small apartment and its area.
     */
    @Override
    public String toString() {
        return "I am a small apartment, my area is " + getArea() + " square feet.";
    }
}

