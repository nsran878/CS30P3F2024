// Add Phidgets Library
import com.phidget22.*;
public class AvoidObstacles {
   public static void main(String[] args) throws Exception {
	   
       // Connect to wireless rover
       Net.addServer("", "192.168.100.1", 5661, "", 0);
       // Create
       DCMotor leftMotors = new DCMotor();
       DCMotor rightMotors = new DCMotor();
       DistanceSensor sonar = new DistanceSensor();
       
       // Address
       leftMotors.setChannel(0);
       rightMotors.setChannel(1);
       
       // Open
       leftMotors.open(5000);
       rightMotors.open(5000);
       sonar.open(5000);
       
       // Set Sonar Phidget's Data Interval to 100 milliseconds
       sonar.setDataInterval(100);
       
       while (true) {
           // Get and display distance
           double distance = sonar.getDistance();
           System.out.println("Distance: " + distance + " mm");
           if (distance < 200) {
               // Object detected! Back up and turn
               leftMotors.setTargetVelocity(-0.5); // Reverse left motor
               rightMotors.setTargetVelocity(-0.5); // Reverse right motor
               Thread.sleep(500); // Back up for 500ms
               leftMotors.setTargetVelocity(-0.5); // Turn by reversing one motor
               rightMotors.setTargetVelocity(0.5); // Move forward with the other
               Thread.sleep(500); // Turn for 500ms
           } else {
               // Move forward faster (50% max speed)
               leftMotors.setTargetVelocity(0.5);
               rightMotors.setTargetVelocity(0.5);
           }
           // Wait for 100 milliseconds
           Thread.sleep(100);
       }
   }
}

