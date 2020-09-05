package org.firstinspires.ftc.teamcode;

        import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
        import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.hardware.DcMotorSimple;
        import com.qualcomm.robotcore.hardware.DcMotor.RunMode;
        import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "Blue1_No2", group = "team")

public class Blue1_NoEncoders2 extends LinearOpMode {
    DcMotor TopLeft;
    DcMotor TopRight;
    DcMotor BackRight;
    DcMotor BackLeft;
    DcMotor Claw;
    DcMotor Lift;
    DcMotor LiftTwo;
    Servo Hook;

    int currentstep = 0;

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

        BackRight = hardwareMap.dcMotor.get("BR");
        BackRight.setDirection(DcMotorSimple.Direction.FORWARD);

        BackLeft = hardwareMap.dcMotor.get("BL");
        BackLeft.setDirection(DcMotorSimple.Direction.FORWARD);


        Claw = hardwareMap.dcMotor.get("CL");
        Claw.setDirection(DcMotorSimple.Direction.FORWARD);

        Hook = hardwareMap.servo.get("H");


        Lift = hardwareMap.dcMotor.get("L1");
        Lift.setDirection(DcMotorSimple.Direction.REVERSE);
        Lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        LiftTwo = hardwareMap.dcMotor.get("L2");
        LiftTwo.setDirection(DcMotorSimple.Direction.FORWARD);
        LiftTwo.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        Lift.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        LiftTwo.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        LiftTwo.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


        waitForStart();
        while (opModeIsActive()) {

            if (currentstep == 0) {

                currentstep ++;
            }

            if (currentstep == 1) {

                currentstep++;
            }

            if (currentstep == 2) {
                TopLeft.setPower(0.5); TopRight.setPower(0.5); BackLeft.setPower(-0.5); BackRight.setPower(-0.5);
                sleep(2000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }


            if (currentstep == 3) {
                Hook.setPosition(1);
                sleep(500);
                currentstep++;
            }

            if (currentstep == 4) {
                TopLeft.setPower(-0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(0.5);
                sleep(3100);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep++;
            }

            if (currentstep == 5) {
                TopLeft.setPower(0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(-0.5);
                sleep(1000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }

            if (currentstep == 6) {
                TopLeft.setPower(-0.5); TopRight.setPower(-0.5); BackLeft.setPower(-0.5); BackRight.setPower(-0.5);
                sleep(1000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }

            if (currentstep == 7) {
                TopLeft.setPower(0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(-0.5);
                sleep(1000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }


            /*if (currentstep == 6) {
                TopLeft.setPower(-0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(0.5);
                sleep(1000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }

            if (currentstep == 7) {
                TopLeft.setPower(0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(-0.5);
                sleep (500);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                currentstep ++;
            }

            if (currentstep == 8) {
                TopLeft.setPower(-0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(0.5);
                sleep(300);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }

            if (currentstep == 9) {

                TopLeft.setPower(-0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(0.5);
                sleep(1000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }

	        if (currentstep == 8) {
	            Hook.setPosition(0);
	            sleep(500);
            currentstep ++;
	        }
/*
	        if (currentstep == 5) {
                TopLeft.setPower(0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(-0.5);
                sleep(2000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
            }*/

        }}}