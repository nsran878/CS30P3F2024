package SkillBuilders;

public class Circle {
    // Instance variables
    private double radius;
    private static final double PI = 3.14;

    // Default constructor initializes radius to 1
    public Circle() {
        this.radius = 1;
    }

    // Constructor with a parameter to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Static method to display the formula for the area of a circle
    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a circle is a = π * r * r");
    }

    // Method to calculate the area of the circle
    public double area() {
        return PI * radius * radius;
    }

    // Overridden equals method to compare two Circle objects
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle testObj = (Circle) obj;
            return Double.compare(testObj.getRadius(), this.radius) == 0;
        }
        return false;
    }

    // Overridden toString method to provide a string representation of the Circle object
    @Override
    public String toString() {
        return String.format("Circle has radius %.2f", radius);
    }
}

