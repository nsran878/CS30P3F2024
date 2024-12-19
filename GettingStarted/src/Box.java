import com.phidget22.*;

public class Box {

    public static void main(String[] args) throws Exception {

        // Connect to the wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        // Create motor objects
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();

        // Assign channels to motors (left motor on channel 0, right motor on channel 1)
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        // Open motor connections
        leftMotors.open(5000);
        rightMotors.open(5000);

        // Move forward
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);
        Thread.sleep(1500); // Move forward for 1.5 seconds

        // Turn 90° - rotate in place
        leftMotors.setTargetVelocity(-1); // Left motor reverse
        rightMotors.setTargetVelocity(1);  // Right motor forward
        Thread.sleep(475); // Wait for 475 ms to achieve a 90° turn

        // Stop motors after turn
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        Thread.sleep(1000);

        // Move forward again
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);
        Thread.sleep(1500); // Move forward for 1.5 seconds

        // Turn 90° - rotate in place
        leftMotors.setTargetVelocity(-1); // Left motor reverse
        rightMotors.setTargetVelocity(1);  // Right motor forward
        Thread.sleep(510); // Wait for 510 ms to achieve a 90° turn

        // Stop motors after turn
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        Thread.sleep(1000);

        // Move forward again
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);
        Thread.sleep(1500); // Move forward for 1.5 seconds

        // Turn 90° - rotate in place
        leftMotors.setTargetVelocity(-1); // Left motor reverse
        rightMotors.setTargetVelocity(1);  // Right motor forward
        Thread.sleep(475); // Wait for 500 ms to achieve a 90° turn

        // Stop motors after turn
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        Thread.sleep(1000);

        // Move forward to the final position
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);
        Thread.sleep(1500); // Move forward for 1.5 seconds

        // Stop motors completely
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        Thread.sleep(1000);
    }
}

