package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "PhoenixTest", group = "team")

public class LightTest extends LinearOpMode {
    DcMotor TopLeft;
    DcMotor TopRight;
    DcMotor BackRight;
    DcMotor BackLeft;
    DcMotor Claw;
    DcMotor LiftTwo;
    DcMotor LiftOne;

    int currentstep=0;

    public void runOpMode () {
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
                TopLeft.setPower(1);
                TopRight.setPower(-1);
                BackLeft.setPower(1);
                BackRight.setPower(-1);
                sleep(500);
                TopLeft.setPower(0);
                TopRight.setPower(0);
                BackLeft.setPower(0);
                BackRight.setPower(0);
                sleep(500);
                currentstep++;
            }

            if (currentstep == 0) {
                TopLeft.setPower(1);
                TopRight.setPower(1);
                BackLeft.setPower(1);
                BackLeft.setPower(1);
                sleep(500);
                TopLeft.setPower(0);
                TopRight.setPower(0);
                BackLeft.setPower(0);
                BackRight.setPower(0);
                sleep(500);
                currentstep++;

            }
        }

    }}