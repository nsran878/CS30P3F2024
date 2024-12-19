// Add Phidgets Library

import com.phidget22.*;



public class Turn {

    public static void main(String[] args) throws Exception {

        // Connect to wireless rover

        Net.addServer("", "192.168.100.1", 5661, "", 0);



        // Create motor objects

        DCMotor leftMotors = new DCMotor();

        DCMotor rightMotors = new DCMotor();



        // Address motors

        leftMotors.setChannel(0);

        rightMotors.setChannel(1);



        // Open motor channels

        leftMotors.open(5000);

        rightMotors.open(5000);



        // Task 1: Turn in one direction

        leftMotors.setTargetVelocity(1);

        rightMotors.setTargetVelocity(1);

        Thread.sleep(2000); // Wait for 2 seconds

        leftMotors.setTargetVelocity(0);

        rightMotors.setTargetVelocity(0); // Stop motors

        Thread.sleep(1000); // Pause to ensure motors have stopped



        // Task 1: Turn in the opposite direction

        leftMotors.setTargetVelocity(-1);

        rightMotors.setTargetVelocity(1);

        Thread.sleep(770); // Wait for 2 seconds

        leftMotors.setTargetVelocity(0);

        rightMotors.setTargetVelocity(0); // Stop motors

        Thread.sleep(1000); // Pause to ensure motors have stopped



        // Task 2: Move forward

        leftMotors.setTargetVelocity(1);

        rightMotors.setTargetVelocity(1);

        Thread.sleep(2000); // Move forward for 2 seconds

        leftMotors.setTargetVelocity(0);

        rightMotors.setTargetVelocity(0); // Stop motors

        Thread.sleep(1000); // Pause to ensure motors have stopped



       



    }

    

}

