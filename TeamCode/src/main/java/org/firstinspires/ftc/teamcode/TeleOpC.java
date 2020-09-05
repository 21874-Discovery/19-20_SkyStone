package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;
@TeleOp(name = "TeleOpC", group = "team")
public class TeleOpC extends OpMode {
    DcMotor Claw;
    DcMotor Lift;
    ColorSensor ColorSensor;
    double ClawPower = 1.0;
    double Zero;
    double Claw_Power;



    public void init() {
        Claw = hardwareMap.dcMotor.get("CL");
        Claw.setDirection(DcMotorSimple.Direction.FORWARD);
        Lift = hardwareMap.dcMotor.get("L");
        Lift.setDirection(DcMotorSimple.Direction.FORWARD);
        ColorSensor = hardwareMap.colorSensor.get("COL");
    }

    public void loop() {
        telemetry.addData("Inside Loop","");
        telemetry.update();
        if (gamepad2.left_stick_y > 0) {
            Claw.setPower(1);
            telemetry.addData("Inside Ifs","");
            telemetry.update();
        }
        if (gamepad2.left_stick_y<0) {
            Claw.setPower(-1);
        }
        if (gamepad2.left_stick_y<0.1 && gamepad2.left_stick_y>-0.1) {
            Claw.setPower(0);
        }
        if (gamepad2.dpad_up) {
            Lift.setPower(1);
        }
        if (!gamepad2.dpad_up) {
            Lift.setPower(0);
        }
        if (gamepad2.dpad_down) {
            Lift.setPower(-1);
        }
        if (!gamepad2.dpad_down) {
            Lift.setPower(0);
        }
        telemetry.addData("color", ColorSensor.argb());
        telemetry.update();
    }
}
  //  if (gamepad2.dpad_down) {
    //    LinearSlide.setPower(-0.5);
    //}

      //  if (!gamepad2.dpad_up) {
   //     LinearSlide.setPower(0);
    //}
