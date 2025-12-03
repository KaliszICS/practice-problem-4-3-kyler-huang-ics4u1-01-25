/**
 * The Chair class represents a chair with a number of legs and a material.
 * It provides three constructors for different initialization options
 * and getter methods for accessing the instance variables.
 */
public class Chair {

    /** Number of legs on the chair */
    private int legs;

    /** Material the chair is made from */
    private String material;

    /**
     * No-argument constructor.
     * Sets legs to 4 and material to "wood".
     */
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * One-parameter constructor.
     * Sets legs to the given value and material to "wood".
     *
     * @param legs the number of legs of the chair
     */
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }

    /**
     * Two-parameter constructor.
     * Sets legs and material to the given values.
     *
     * @param legs the number of legs of the chair
     * @param material the material of the chair
     */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /** Returns the number of legs. */
    public int getLegs() {
        return legs;
    }

    /** Returns the material of the chair. */
    public String getMaterial() {
        return material;
    }
}
