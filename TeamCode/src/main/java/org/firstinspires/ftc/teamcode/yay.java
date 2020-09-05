package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;

public class yay extends OpMode {
    DcMotor FrontLeft;
    DcMotor FrontRight;
    DcMotor BackLeft;
    DcMotor BackRight;

    double leftMotorPower = 1.0;
    double rightMotorPower = 1.0;
    double drivepower = 1.0;

    public void init() {
        FrontLeft = hardwareMap.dcMotor.get("FL");
        FrontLeft.setDirection(DcMotorSimple.Direction.REVERSE);

        FrontRight = hardwareMap.dcMotor.get("FR");
        FrontRight.setDirection(DcMotorSimple.Direction.FORWARD);

        BackLeft = hardwareMap.dcMotor.get("BL");
        BackLeft.setDirection(DcMotorSimple.Direction.REVERSE);

        BackRight = hardwareMap.dcMotor.get("BR");
        BackRight.setDirection(DcMotorSimple.Direction.FORWARD);


    }

    public void loop() {

            leftMotorPower = Range.clip(Math.pow(gamepad1.left_stick_y, 3), -drivepower, drivepower);
            rightMotorPower = Range.clip(Math.pow(gamepad1.right_stick_y, 3), -drivepower, drivepower);

        FrontLeft.setPower(leftMotorPower);
        FrontRight.setPower(rightMotorPower);
        BackLeft.setPower(leftMotorPower);
        BackRight.setPower(rightMotorPower);

    }
}