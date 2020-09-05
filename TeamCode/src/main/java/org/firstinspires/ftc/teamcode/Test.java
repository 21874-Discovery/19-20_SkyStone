package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;
    @TeleOp(name = "Test", group = "team")
    public class Test extends OpMode {
        Servo Hook;
        Servo Claw1;
        Servo Claw2;

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

            Hook = hardwareMap.servo.get("H");
            Hook.setPosition(0);

            Claw1 = hardwareMap.servo.get("C1");
            Claw1.setPosition(0);

            Claw2 = hardwareMap.servo.get("C2");
            Claw2.setPosition(0);

        }




        public void loop() {
            telemetry.addData("Inside Loop","");
            telemetry.update();

            if (gamepad2.a) {
                Claw1.setPosition(0.25);
                Claw2.setPosition(0.25);
            }
            if (gamepad2.b) {
                Claw2.setPosition(0);
                Claw1.setPosition(0);
            }

            if (gamepad2.x) {
                Hook.setPosition(0.5);
            }

            if (gamepad2.y) {
                Hook.setPosition(0.5);
            }


            }
        }


