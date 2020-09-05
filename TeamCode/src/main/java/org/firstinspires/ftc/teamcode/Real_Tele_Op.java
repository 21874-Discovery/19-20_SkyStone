package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;
@TeleOp(name = "Real_Tele_Op", group = "team")
public class Real_Tele_Op extends OpMode {
    DcMotor Claw;
    DcMotor LiftOne;
    DcMotor LiftTwo;
    DcMotor TopLeft;
    DcMotor TopRight;
    DcMotor BackLeft;
    DcMotor BackRight;
    Servo Hook;
    /*Servo Claw1;
    Servo Claw2;*/

    double ClawPower = 1;
    double Zero;
    double Claw_Power;
    double leftMotorPower = 1;
    double rightMotorPower = 1;
    double drivepower = 1;
    double One;
    double Two;
    double Three;
    double Top_Left_Power;
    double Top_Right_Power;
    double Bottom_Right_Power;
    double Bottom_Left_Power;

    public void init() {
        Claw = hardwareMap.dcMotor.get("C");
        Claw.setDirection(DcMotorSimple.Direction.FORWARD);

        LiftOne = hardwareMap.dcMotor.get("L1");
        LiftOne.setDirection(DcMotorSimple.Direction.REVERSE);

        LiftTwo = hardwareMap.dcMotor.get("L2");
        LiftTwo.setDirection(DcMotorSimple.Direction.FORWARD);

        TopLeft = hardwareMap.dcMotor.get("TL");
        TopLeft.setDirection(DcMotorSimple.Direction.FORWARD);

        TopRight = hardwareMap.dcMotor.get("TR");
        TopRight.setDirection(DcMotorSimple.Direction.FORWARD);

        BackLeft = hardwareMap.dcMotor.get("BL");
        BackLeft.setDirection(DcMotorSimple.Direction.FORWARD);

        BackRight = hardwareMap.dcMotor.get("BR");
        BackRight.setDirection(DcMotorSimple.Direction.FORWARD);

        Hook = hardwareMap.servo.get("H");
/*
        Claw1 = hardwareMap.servo.get("C1");
        Claw1.setPosition(0);

        Claw2 = hardwareMap.servo.get("C2");
        Claw2.setPosition(0);*/

    }




        public void loop() {
        telemetry.addData("Inside Loop","");
        telemetry.update();



        if (gamepad2.dpad_left) {
            Claw.setPower(0.5);
        }
        if (!gamepad2.dpad_left) {
            Claw.setPower(0);
        }
        if (gamepad2.dpad_right) {
            Claw.setPower(-0.5);
        }
        if (!gamepad2.dpad_right) {
            Claw.setPower(0);
        }
        if (gamepad2.dpad_up) {
            LiftOne.setPower(1);
            LiftTwo.setPower(1);
        }
        if (!gamepad2.dpad_up) {
            LiftOne.setPower(0);
            LiftTwo.setPower(0);
        }
        if (gamepad2.dpad_down) {
            LiftOne.setPower(-0.5);
            LiftTwo.setPower(-0.5);
        }
        if (!gamepad2.dpad_down) {
            LiftOne.setPower(0);
            LiftTwo.setPower(0);
        }
        /*if (gamepad2.a) {
            Claw1.setPosition(0.25);
            Claw2.setPosition(0.25);
        }
        if (gamepad2.b) {
            Claw2.setPosition(0);
            Claw1.setPosition(0);
        }
*/
        if (gamepad2.x) {
            Hook.setPosition(0.5);
        }

        if (gamepad2.y) {
            Hook.setPosition(0);
        }

        if (gamepad2.b) {
            Hook.setPosition(1);
        }

            Zero = -gamepad1.left_stick_y+gamepad1.left_stick_x+gamepad1.right_stick_x;
            One = gamepad1.left_stick_y+gamepad1.left_stick_x+gamepad1.right_stick_x;
            Two = gamepad1.left_stick_y-gamepad1.left_stick_x+gamepad1.right_stick_x;
            Three = -gamepad1.left_stick_y-gamepad1.left_stick_x+gamepad1.right_stick_x;

            {

            Top_Left_Power = Range.clip(Zero,-1,1);
            Top_Right_Power = Range.clip(One,-1,1);
            Bottom_Right_Power = Range.clip(Two,-1,1);
            Bottom_Left_Power = Range.clip(Three,-1,1);

            TopLeft.setPower(Top_Left_Power);
            TopRight.setPower(Top_Right_Power);
            BackRight.setPower(Bottom_Right_Power);
            BackLeft.setPower(Bottom_Left_Power);
        }
    }
}
