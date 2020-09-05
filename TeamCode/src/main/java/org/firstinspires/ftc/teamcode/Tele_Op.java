package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;
@TeleOp(name = "TeleOp", group = "team")
public class Tele_Op extends OpMode {
    DcMotor FrontLeft;
    DcMotor FrontRight;
    DcMotor BackLeft;
    DcMotor BackRight;
    ColorSensor ColorSensor;

    double leftMotorPower = 1.0;
    double rightMotorPower = 1.0;
    double drivepower = 1.0;
    double Zero;
    double One;
    double Two;
    double Three;
    double Top_Left_Power;
    double Top_Right_Power;
    double Bottom_Right_Power;
    double Bottom_Left_Power;
    public void init() {
        FrontLeft = hardwareMap.dcMotor.get("FL");
        FrontLeft.setDirection(DcMotorSimple.Direction.FORWARD);

        FrontRight = hardwareMap.dcMotor.get("FR");
        FrontRight.setDirection(DcMotorSimple.Direction.FORWARD);

        BackLeft = hardwareMap.dcMotor.get("BL");
        BackLeft.setDirection(DcMotorSimple.Direction.FORWARD);

        BackRight = hardwareMap.dcMotor.get("BR");
        BackRight.setDirection(DcMotorSimple.Direction.FORWARD);




    }

    public void loop() {

        Zero = -gamepad1.left_stick_y+gamepad1.left_stick_x+gamepad1.right_stick_x;
        One = gamepad1.left_stick_y+gamepad1.left_stick_x+gamepad1.right_stick_x;
        Two = gamepad1.left_stick_y-gamepad1.left_stick_x+gamepad1.right_stick_x;
        Three = -gamepad1.left_stick_y-gamepad1.left_stick_x+gamepad1.right_stick_x;

        {

            Top_Left_Power = Range.clip(Zero,-1,1);
            Top_Right_Power = Range.clip(One,-1,1);
            Bottom_Right_Power = Range.clip(Two,-1,1);
            Bottom_Left_Power = Range.clip(Three,-1,1);

            FrontLeft.setPower(Top_Left_Power);
            FrontRight.setPower(Top_Right_Power);
            BackRight.setPower(Bottom_Right_Power);
            BackLeft.setPower(Bottom_Left_Power);
    }
}}