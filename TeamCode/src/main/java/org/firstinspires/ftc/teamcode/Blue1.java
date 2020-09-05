package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DcMotor.RunMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "Blue1", group = "team")

public class Blue1 extends LinearOpMode {
    DcMotor TopLeft;
    DcMotor TopRight;
    DcMotor BackRight;
    DcMotor BackLeft;
    DcMotor Claw;
    DcMotor Lift;
    DcMotor LiftTwo;

    int currentstep = 0;

    private ElapsedTime runtime = new ElapsedTime();

    static final double COUNTS_PER_MOTOR_REV = 1440;    // REV 60:1 Motor Encoder

    static final double WHEEL_DIAMETER_INCHES = 4.0;     // For figuring circumference

    static final double COUNTS_PER_INCH = (COUNTS_PER_MOTOR_REV) / (WHEEL_DIAMETER_INCHES * 3.1415);


    public void runOpMode() {
/*Turning left
 Topleft: Out
 TopRight: In
 BackRight: Out
 BackLeft: In*/

//Front 2 wheels-Negative
//Back 2 wheels-Positive

        TopLeft = hardwareMap.dcMotor.get("TL");
        TopLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        //   TopLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        TopRight = hardwareMap.dcMotor.get("TR");
        TopRight.setDirection(DcMotorSimple.Direction.FORWARD);
        //    TopRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        BackRight = hardwareMap.dcMotor.get("BR");
        BackRight.setDirection(DcMotorSimple.Direction.FORWARD);
        //    BackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        BackLeft = hardwareMap.dcMotor.get("BL");
        BackLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        //    BackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        Claw = hardwareMap.dcMotor.get("CL");
        Claw.setDirection(DcMotorSimple.Direction.FORWARD);
        // Claw.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        Lift = hardwareMap.dcMotor.get("L1");
        Lift.setDirection(DcMotorSimple.Direction.REVERSE);
        Lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        LiftTwo = hardwareMap.dcMotor.get("L2");
        LiftTwo.setDirection(DcMotorSimple.Direction.REVERSE);

        TopLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        TopRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Claw.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Lift.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        LiftTwo.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        TopLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        TopRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Claw.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();
        while (opModeIsActive()) {

            if (currentstep == 0) {
                currentstep++;
            }

       /*     if (currentstep == 1) {
              //Lift claw
              while (Lift.getCurrentPosition() <= 200 && opModeIsActive())  {
                  Lift.setPower(0.5);
                  telemetry.addData("Inside while statement", "");
                  telemetry.update();
              }
              telemetry.addData("Lift: ", Lift.getCurrentPosition());
              telemetry.update();
              Lift.setPower(0);
              currentstep++;
            }*/


            if (currentstep == 1) {
                //move forward until at foundation
                telemetry.addData("Current step: ", currentstep);
                telemetry.update();
                while (TopLeft.getCurrentPosition() >= -1000 && TopRight.getCurrentPosition() >= -1000 && BackRight.getCurrentPosition() <= 1000 && BackLeft.getCurrentPosition() <= 1000 && opModeIsActive()) {
                    TopLeft.setPower(-0.3);
                    TopRight.setPower(0.3);
                    BackRight.setPower(-0.3);
                    BackLeft.setPower(-0.3);
                }
                while (TopLeft.getCurrentPosition() <= -1000 && TopRight.getCurrentPosition() <= -1000 && BackRight.getCurrentPosition() >= 1000 && BackLeft.getCurrentPosition() >= 1000 && opModeIsActive()) {
                    TopLeft.setPower(0);
                    TopRight.setPower(0);
                    BackRight.setPower(0);
                    BackLeft.setPower(0);
                }
                telemetry.addData("Left position: ", TopRight.getCurrentPosition());
                telemetry.addData("Right position: ", TopLeft.getCurrentPosition());
                telemetry.addData("Left position: ", BackRight.getCurrentPosition());
                telemetry.addData("Right position: ", BackLeft.getCurrentPosition());
                telemetry.update();
                telemetry.update();

            }


/*
            if (currentstep == 3) {
                //turn left 90 degrees
                while (TopLeft.getCurrentPosition() <= 200 && opModeIsActive()) {
                    TopLeft.setPower(0);
                    TopRight.setPower(0.25);
                    BackRight.setPower(0.25);
                    BackLeft.setPower(0);
                }
                TopLeft.setPower(0);
                TopRight.setPower(0);
                BackRight.setPower(0);
                BackLeft.setPower(0);
                currentstep++;
            }

            if (currentstep == 4) {
                //close the claw
                while (Claw.getCurrentPosition() <= 5 && opModeIsActive()) {
                    Claw.setPower(0.25);

                }
                Claw.setPower(0);
                currentstep++;
            }
            if (currentstep == 5) {
                //move forward to in between foundation
                while (TopLeft.getCurrentPosition() <= 300 && opModeIsActive()) {
                    TopLeft.setPower(-0.25);
                    TopRight.setPower(0.25);
                    BackRight.setPower(-0.25);
                    BackLeft.setPower(0.25);
                }
                TopLeft.setPower(0);
                TopRight.setPower(0);
                BackRight.setPower(0);
                BackLeft.setPower(0);
                currentstep++;

            }
            if (currentstep == 6) {
                //Turn left 90 degrees
                while (TopLeft.getCurrentPosition() <= 400 && opModeIsActive()) {
                    TopLeft.setPower(-0.25);
                    TopRight.setPower(-0.25);
                    BackRight.setPower(-0.25);
                    BackLeft.setPower(-0.25);
                }
                TopLeft.setPower(0);
                TopRight.setPower(0);
                BackRight.setPower(0);
                BackLeft.setPower(0);
                currentstep++;
            }
            if (currentstep == 7) {
                //Slide right
                while (TopLeft.getCurrentPosition() <= 500 && opModeIsActive()) {
                    TopLeft.setPower(0.25);
                    TopRight.setPower(0.25);
                    BackRight.setPower(-0.25);
                    BackLeft.setPower(-0.25);
                }
                TopLeft.setPower(0);
                TopRight.setPower(0);
                BackRight.setPower(0);
                BackLeft.setPower(0);
                currentstep++;
            }
            if (currentstep == 8) {
                //Move foundation forward to build site
                while (TopLeft.getCurrentPosition() <= 600 && opModeIsActive()) {
                    TopLeft.setPower(-0.25);
                    TopRight.setPower(0.25);
                    BackRight.setPower(-0.25);
                    BackLeft.setPower(0.25);
                }
                TopLeft.setPower(0);
                TopRight.setPower(0);
                BackRight.setPower(0);
                BackLeft.setPower(0);
                currentstep++;
            }
            if (currentstep == 9) {
                //Move left to under bridge
                while (TopLeft.getCurrentPosition() <= 700 && opModeIsActive()) {
                    TopLeft.setPower(-0.25);
                    TopRight.setPower(-0.25);
                    BackRight.setPower(0.25);
                    BackLeft.setPower(0.25);
                }
                TopLeft.setPower(0);
                TopRight.setPower(0);
                BackRight.setPower(0);
                BackLeft.setPower(0);
                currentstep++;
            }
        }
            if (currentstep == 20) {

                currentstep ++;
            }
            if (currentstep == 9) {

                currentstep ++;
            }
            if (currentstep == 10) {

                currentstep ++;
            }
            if (currentstep == 11) {

                currentstep ++;
            }
            if (currentstep == 12) {

                currentstep ++;
            }
            if (currentstep == 13) {

                currentstep ++;
            }
            if (currentstep == 14) {

                currentstep ++;
            }
            if (currentstep == 15) {

                currentstep ++;
            }
            if (currentstep == 16) {

                currentstep ++;
            }
            if (currentstep == 17) {

                currentstep ++;
            }
            if (currentstep == 18) {

                currentstep ++;
            }
            if (currentstep == 19) {

                currentstep ++;
            }
            if (currentstep == 20) {

                currentstep ++;
            }*/
        }
    }

    public void encoderDrive(double speed, double Inches, double timeoutS) {
        //Create our target variables

        int newFrontLeftTarget;

        int newFrontRightTarget;

        int newBackLeftTarget;

        int newBackRightTarget;


        // Ensure that the opmode is still active

        if (opModeIsActive()) {


            // Math to calculate each target position for the motors

            newFrontLeftTarget = TopLeft.getCurrentPosition() + (int) (Inches * COUNTS_PER_INCH);

            newFrontRightTarget = TopRight.getCurrentPosition() + (int) (Inches * COUNTS_PER_INCH);

            newBackLeftTarget = BackLeft.getCurrentPosition() + (int) (Inches * COUNTS_PER_INCH);

            newBackRightTarget = BackRight.getCurrentPosition() + (int) (Inches * COUNTS_PER_INCH);


            //Set Target Positions to respective motors

            TopLeft.setTargetPosition(newFrontLeftTarget);

            TopRight.setTargetPosition(newFrontRightTarget);

            BackLeft.setTargetPosition(newBackLeftTarget);

            BackRight.setTargetPosition(newBackRightTarget);


            // Turn On RUN_TO_POSITION

            TopLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            TopRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);


            // reset the timeout time and start motion.

            runtime.reset();

            TopLeft.setPower(speed);

            TopRight.setPower(speed);

            BackLeft.setPower(speed);

            BackRight.setPower(speed);


            // keep looping while we are still active, and there is time left, and both motors are running.

            // Note: We use (isBusy() && isBusy()) in the loop test, which means that when EITHER motor hits

            // its target position, the motion will stop.  This is "safer" in the event that the robot will

            // always end the motion as soon as possible.

            // However, if you require that BOTH motors have finished their moves before the robot continues

            // onto the next step, use (isBusy() || isBusy()) in the loop test.

            while (opModeIsActive() &&

                    (runtime.seconds() < timeoutS) &&

                    (TopLeft.isBusy() && TopRight.isBusy() && BackLeft.isBusy() && BackRight.isBusy())) {


                // Display it for the driver.

                telemetry.addData("Motor Paths", "Running at %7d : %7d : %7d : %7d", //Tells us where we are

                        TopLeft.getCurrentPosition(), //Front Left Position

                        TopRight.getCurrentPosition(), //Front Right Position

                        BackLeft.getCurrentPosition(), //Back Left Position

                        BackRight.getCurrentPosition()); //Back Right Position

                telemetry.update();

            }


            // Stop all motion;

            TopLeft.setPower(0);

            TopRight.setPower(0);

            BackLeft.setPower(0);

            BackRight.setPower(0);


            // Turn off RUN_TO_POSITION

            TopLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

            TopRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

            BackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

            BackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


            //  sleep(250);   // optional pause after each move
        }
    }
}