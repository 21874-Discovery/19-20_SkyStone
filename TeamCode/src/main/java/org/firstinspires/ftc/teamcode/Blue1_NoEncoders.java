package org.firstinspires.ftc.teamcode;

        import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
        import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.hardware.DcMotorSimple;
        import com.qualcomm.robotcore.hardware.DcMotor.RunMode;

@Autonomous(name = "Blue1_No", group = "team")

public class Blue1_NoEncoders extends LinearOpMode {
    DcMotor TopLeft;
    DcMotor TopRight;
    DcMotor BackRight;
    DcMotor BackLeft;
    DcMotor Claw;
    DcMotor Lift;
    DcMotor LiftTwo;

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
                /*Lift.setPower(0.5); LiftTwo.setPower(0.5);
                sleep(1500);
                Lift.setPower(0); LiftTwo.setPower(0);
                sleep(500);*/
                currentstep++;
            }


            if (currentstep == 2) {
                TopLeft.setPower(-0.5); TopRight.setPower(0.5); BackLeft.setPower(-0.5); BackRight.setPower(0.5);
                sleep(3085);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep++;
            }

            if (currentstep == 3) {
                TopLeft.setPower(0.5); TopRight.setPower(0.5); BackLeft.setPower(0.5); BackRight.setPower(0.5);
                sleep(350);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep++;
            }

            if (currentstep == 4) {
                Claw.setPower(0.5);
                sleep(500);
                Claw.setPower(0);
                sleep(500);
                currentstep++;
            }

            if (currentstep == 5) {
                TopLeft.setPower(-0.5); TopRight.setPower(0.5); BackLeft.setPower(-0.5); BackRight.setPower(0.5);
                sleep(300);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep++;
            }

            if (currentstep == 6) {
                /*Lift.setPower(0.5); LiftTwo.setPower(0.5);
                sleep(500);
                Lift.setPower(0); LiftTwo.setPower(0);
                sleep(500);*/
                currentstep++;
            }

            if (currentstep == 7) {
                TopLeft.setPower(0.5); TopRight.setPower(0.5); BackLeft.setPower(0.5); BackRight.setPower(0.5);
                sleep(300);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep++;
            }

            if (currentstep == 8) {
                TopLeft.setPower(-0.5); TopRight.setPower(-0.5); BackLeft.setPower(-0.5); BackRight.setPower(-0.5);
                sleep(250);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep++;
            }

            if (currentstep == 9) {
                TopLeft.setPower(-0.5); TopRight.setPower(0.5); BackLeft.setPower(-0.5); BackRight.setPower(0.5);
                sleep(1000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep++;
            }

            if (currentstep == 10) {
                TopLeft.setPower(0.75); TopRight.setPower(0.9); BackLeft.setPower(-0.5); BackRight.setPower(-0.75);
                sleep(7000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep++;
            }
/*
            if (currentstep == 11) {
                TopLeft.setPower(-0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(0.5);
                sleep (1000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep (500);
            }*/

        }}}