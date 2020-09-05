package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
@TeleOp(name = "ColorTest", group = "team")
public class ColorTest extends OpMode{
   ColorSensor ColorSensor;

    public void init() {
        ColorSensor = hardwareMap.colorSensor.get("COL");
    }

    public void loop() {
        telemetry.addData("color", ColorSensor.argb());
        telemetry.update();
    }
}
