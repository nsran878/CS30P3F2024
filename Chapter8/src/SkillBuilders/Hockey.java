package SkillBuilders;

public class Hockey {

    public static void main(String[] args) {
        // Create a youth puck with a weight of 4
        Puck youthPuck = new Puck(4.0);

        // Create an adult puck with a weight of 5.5
        Puck adultPuck = new Puck(5.5);

        // Display the division of each puck
        System.out.println("Youth Puck: " + youthPuck.getDivision());
        System.out.println("Adult Puck: " + adultPuck.getDivision());

        // Compare the two pucks
        if (youthPuck.equals(adultPuck)) {
            System.out.println("The two pucks belong to the same division.");
        } else {
            System.out.println("The two pucks belong to different divisions.");
        }

        // Compare weights
        int comparison = youthPuck.compareTo(adultPuck);
        if (comparison < 0) {
            System.out.println("The youth puck is lighter than the adult puck.");
        } else if (comparison > 0) {
            System.out.println("The youth puck is heavier than the adult puck.");
        } else {
            System.out.println("The two pucks have the same weight.");
        }
    }
}



