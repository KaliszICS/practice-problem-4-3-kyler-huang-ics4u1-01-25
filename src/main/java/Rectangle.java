/**
 * The Rectangle class represents a rectangle with a length and width.
 * It provides three constructors for different initialization options
 * and getter methods for accessing the instance variables.
 */
public class Rectangle {

    /** The rectangle's length */
    private double length;

    /** The rectangle's width */
    private double width;

    /**
     * No-argument constructor.
     * Sets length to 4 and width to 8.
     */
    public Rectangle() {
        this.length = 4.0;
        this.width = 8.0;
    }

    /**
     * One-parameter constructor.
     * Sets length to the given value and width to 8.
     *
     * @param length the length of the rectangle
     */
    public Rectangle(double length) {
        this.length = length;
        this.width = 8.0;
    }

    /**
     * Two-parameter constructor.
     * Sets length and width to the given values.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /** Returns the rectangle's length. */
    public double getLength() {
        return length;
    }

    /** Returns the rectangle's width. */
    public double getWidth() {
        return width;
    }
}
