//Add Phidgets Library

import com.phidget22.*;



public class Move {

    public static void main(String[] args) throws Exception {



        //Connect to wireless rover

        Net.addServer("", "192.168.100.1", 5661, "", 0);



        //Create

        DCMotor leftMotors = new DCMotor();

        DCMotor rightMotors = new DCMotor();



        //Address

        leftMotors.setChannel(0);

        rightMotors.setChannel(1);



        //Open

        leftMotors.open(5000);

        rightMotors.open(5000);



        //Move forward at full speed

        leftMotors.setTargetVelocity(1.0);

        rightMotors.setTargetVelocity(1.0);



        //Wait for 2 seconds

        Thread.sleep(2000);



        //Move backward at full speed

        leftMotors.setTargetVelocity(-1.0);

        rightMotors.setTargetVelocity(-1.0);



        //Wait for 2 seconds while moving backward

        Thread.sleep(2000);



        //Stop motors

        leftMotors.setTargetVelocity(0);

        rightMotors.setTargetVelocity(0);

    }

}