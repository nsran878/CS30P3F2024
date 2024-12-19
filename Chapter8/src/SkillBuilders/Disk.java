package SkillBuilders;

public class Disk extends Circle {
    // Instance variable
    private double thickness;

    // Constructor to initialize radius and thickness
    public Disk(double radius, double thickness) {
        super(radius); // Call superclass constructor to set radius
        this.thickness = thickness;
    }

    // Setter for thickness
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    // Getter for thickness
    public double getThickness() {
        return thickness;
    }

    // Calculates the volume of the disk
    public double volume() {
        return super.area() * thickness; // Area of base multiplied by thickness
    }

    // Checks equality between two Disk objects
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Disk) {
            Disk testObj = (Disk) obj;
            return Double.compare(testObj.getRadius(), super.getRadius()) == 0 &&
                   Double.compare(testObj.getThickness(), thickness) == 0;
        }
        return false;
    }

    // Returns a string representation of the disk
    @Override
    public String toString() {
        return String.format("The disk has radius %.2f and thickness %.2f.", super.getRadius(), thickness);
    }
}
