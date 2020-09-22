package org.firstinspires.ftc.teamcode;
// I got it! -JRS 8/22/2020
//Retest - JRS 9/5/2020
//19-20_Skystone - JRS 9/5/2020
//09-22-2020 - JRS
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;
@TeleOp(name = "TankDrivePractice", group = "team")

public class TankDrivePractice extends OpMode {
    DcMotor TopLeft;
    DcMotor TopRight;
    DcMotor BackLeft;
    DcMotor BackRight;

    double drivepower = 1;
    double Zero;
    double One;
    double Two;
    double Three;
    double TopLeftPower;
    double TopRightPower;
    double BackLeftPower;
    double BackRightPower;

    public void init () {

        TopLeft = hardwareMap.dcMotor.get ("TL");
        TopLeft.setDirection(DcMotorSimple.Direction.FORWARD);

        TopRight = hardwareMap.dcMotor.get("TR");
        TopRight.setDirection(DcMotorSimple.Direction.FORWARD);

        BackLeft = hardwareMap.dcMotor.get("BL");
        BackLeft.setDirection(DcMotorSimple.Direction.FORWARD);

        BackRight = hardwareMap.dcMotor.get("BR");
        BackRight.setDirection(DcMotorSimple.Direction.FORWARD);
        
    }

    public void loop () {

        TopLeftPower = Range.clip(Math.pow(gamepad1.left_stick_y, 3), -drivepower, drivepower);
        TopRightPower = Range.clip(Math.pow(gamepad1.right_stick_y, 3), -drivepower, drivepower);
        BackLeftPower = Range.clip(Math.pow(gamepad1.left_stick_y, 3), -drivepower, drivepower);
        BackRightPower = Range.clip(Math.pow(gamepad1.right_stick_y, 3), -drivepower, drivepower);

        TopLeft.setPower(TopLeftPower);
        TopRight.setPower(TopRightPower);
        BackLeft.setPower(BackLeftPower);
        BackRight.setPower(BackRightPower);

    }
}
