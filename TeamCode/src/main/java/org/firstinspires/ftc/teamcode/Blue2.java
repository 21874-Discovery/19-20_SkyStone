package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "Blue2", group = "team")

public class Blue2 extends LinearOpMode {
    DcMotor TopLeft;
    DcMotor TopRight;
    DcMotor BackRight;
    DcMotor BackLeft;
    DcMotor Claw;
    DcMotor LiftTwo;
    DcMotor LiftOne;

    int currentstep = 0;

    public void runOpMode() {
        TopLeft = hardwareMap.dcMotor.get("TL");
        TopLeft.setDirection(DcMotorSimple.Direction.FORWARD);

        TopRight = hardwareMap.dcMotor.get("TR");
        TopRight.setDirection(DcMotorSimple.Direction.FORWARD);

        BackRight = hardwareMap.dcMotor.get("BR");
        BackRight.setDirection(DcMotorSimple.Direction.FORWARD);

        BackLeft = hardwareMap.dcMotor.get("BL");
        BackLeft.setDirection(DcMotorSimple.Direction.FORWARD);

        Claw = hardwareMap.dcMotor.get("C");
        Claw.setDirection(DcMotorSimple.Direction.FORWARD);

        LiftOne = hardwareMap.dcMotor.get("L1");
        LiftOne.setDirection(DcMotorSimple.Direction.REVERSE);

        LiftTwo = hardwareMap.dcMotor.get("L2");
        LiftTwo.setDirection(DcMotorSimple.Direction.FORWARD);

        waitForStart();
        while (opModeIsActive()) {

            if (currentstep == 0) {
                //open hook
                Claw.setPower(-0.5);
                sleep(300);
                Claw.setPower(0);
                sleep(500);
                currentstep ++;
            }
            if (currentstep == 1) {
             TopLeft.setPower(0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(-0.5);
              sleep(2000);
              TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
              sleep(500);
                //move to block
                currentstep ++;
            }
            if (currentstep == 2) {
                Claw.setPower(0.5);
                sleep(300);
                Claw.setPower(0);
                sleep(500);
                currentstep ++;
            }
            if (currentstep == 3) {
                TopLeft.setPower(-0.5); TopRight.setPower(0.5); BackLeft.setPower(-0.5); BackRight.setPower(0.5);
                sleep(2000);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }
            if (currentstep == 4) {
                TopLeft.setPower(-0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(0.5);
                sleep(2200);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }
            if (currentstep == 5) {
                Claw.setPower(-0.5);
                sleep(300);
                Claw.setPower(0);
                sleep(500);
                currentstep ++;
            }
            if (currentstep == 6) {
                TopLeft.setPower(0.5); TopRight.setPower(-0.5); BackLeft.setPower(0.5); BackRight.setPower(-0.5);
                sleep(500);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }
            if (currentstep == 7) {
                TopLeft.setPower(-0.5); TopRight.setPower(0.5); BackLeft.setPower(-0.5); BackRight.setPower(0.5);
                sleep(500);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
            }

            if (currentstep == 8) {
                TopLeft.setPower(0.5); TopRight.setPower(0.5); BackLeft.setPower(-0.5); BackRight.setPower(-0.5);
                sleep(500);
                TopLeft.setPower(0); TopRight.setPower(0); BackLeft.setPower(0); BackRight.setPower(0);
                sleep(500);
                currentstep ++;
                currentstep ++;
            }
            if (currentstep == 9) {
                //Turn 180 degrees
                currentstep ++;
            }
            if (currentstep == 10) {
                //Release claw
                currentstep ++;
            }
            if (currentstep == 11) {
                //Move left until under bridge
                currentstep ++;
            }
            if (currentstep == 12) {
                //
                currentstep ++;
            }
            if (currentstep == 13) {
                //
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
            }
        }
    }



}

