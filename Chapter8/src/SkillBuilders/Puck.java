package SkillBuilders;

public class Puck extends Disk {
    // Constants for weight ranges
    private static final double MIN_STD_WEIGHT = 5.0;
    private static final double MAX_STD_WEIGHT = 5.5;
    private static final double MIN_YTH_WEIGHT = 4.0;
    private static final double MAX_YTH_WEIGHT = 4.5;

    // Instance variables
    private double weight;
    private boolean standard;
    private boolean youth;

    // Constructor
    public Puck(double weight) {
        super(1.5, 1); // Pass radius and thickness to the Disk superclass
        this.weight = weight;

        // Determine the division based on weight
        if (weight >= MIN_STD_WEIGHT && weight <= MAX_STD_WEIGHT) {
            standard = true;
            youth = false;
        } else if (weight >= MIN_YTH_WEIGHT && weight <= MAX_YTH_WEIGHT) {
            standard = false;
            youth = true;
        } else {
            standard = false;
            youth = false; // Invalid weight
        }
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Returns the division of the puck
    public String getDivision() {
        if (standard) {
            return "Puck is standard";
        } else if (youth) {
            return "Puck is youth";
        } else {
            return "Invalid puck weight";
        }
    }

    // Compares division of this puck with another puck
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Puck) {
            Puck otherPuck = (Puck) obj;
            return this.getDivision().equals(otherPuck.getDivision());
        }
        return false;
    }

    // Compares weight of this puck with another puck
    public int compareTo(Object obj) {
        if (obj instanceof Puck) {
            Puck otherPuck = (Puck) obj;
            return Double.compare(this.weight, otherPuck.getWeight());
        }
        throw new IllegalArgumentException("Object must be of type Puck");
    }
}

