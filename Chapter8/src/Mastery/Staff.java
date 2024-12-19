package Mastery;

// Class representing a staff member, inherits from UEmployee
public class Staff extends UEmployee {
    private String jobTitle; // Specific field for job title

    // Constructor to initialize staff details
    public Staff(String name, double salary, String jobTitle) {
        super(name, salary); // Call the constructor of UEmployee
        this.jobTitle = jobTitle;
    }

    // Implementation of the abstract method to provide staff details
    @Override
    public String getDetails() {
        return toString() + ", Job Title: " + jobTitle;
    }
}
