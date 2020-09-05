package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous (name = "HolonomicTest", group = "team")
public class HolonomicTest extends LinearOpMode{
    DcMotor FrontLeft;
    DcMotor FrontRight;
    DcMotor BackLeft;
    DcMotor BackRight;


    int currentstep = 0;
public void runOpMode () {
    FrontLeft = hardwareMap.dcMotor.get("FL");
    FrontLeft.setDirection(DcMotorSimple.Direction.FORWARD);

    FrontRight = hardwareMap.dcMotor.get("FR");
    FrontRight.setDirection(DcMotorSimple.Direction.FORWARD);

    BackLeft = hardwareMap.dcMotor.get("BL");
    BackLeft.setDirection(DcMotorSimple.Direction.FORWARD);

    BackRight = hardwareMap.dcMotor.get("BR");
    BackRight.setDirection(DcMotorSimple.Direction.FORWARD);

    FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    FrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    FrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    BackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    BackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    waitForStart();
    while (opModeIsActive()) {
        telemetry.update();
   /* FrontLeft = y+.x+spin;
    FrontRight = -y-x+spin;
     BackLeft = -y+x+spin;
    BackRight = y-x+spin;
*/
        if (currentstep == 0) {
            telemetry.addData("Current step: ", currentstep);
            telemetry.addData("FrontLeft Pos: ", FrontLeft.getCurrentPosition());
            telemetry.addData("FrontRight Pos: ", FrontRight.getCurrentPosition());
            telemetry.addData("BackRight Pos: ", BackRight.getCurrentPosition());
            telemetry.addData("BackLeft Pos: ", BackLeft.getCurrentPosition());
            telemetry.update();
            while (FrontLeft.getCurrentPosition() <= 300.0 && FrontRight.getCurrentPosition() >= -300.0 && BackRight.getCurrentPosition() <= 300.0 && BackLeft.getCurrentPosition() >= -300.0 && opModeIsActive()) {
                FrontLeft.setPower(1.0);
                FrontRight.setPower(-1.0);
                BackLeft.setPower(-1.0);
                BackRight.setPower(1.0);
            }
            currentstep ++;
        }

         if(currentstep == 1.0) {
                FrontLeft.setPower(0.0);
                BackLeft.setPower(0.0);
                FrontRight.setPower(0.0);
                BackRight.setPower(0.0);
                currentstep++;
            }

         if (currentstep == 2) {
         sleep(500);

         currentstep ++;
         }

        if (currentstep == 3) {
            while (FrontLeft.getCurrentPosition() >= -300.0 && FrontRight.getCurrentPosition() <= 300.0 && BackRight.getCurrentPosition() <= 300.0 && BackLeft.getCurrentPosition() >= -300.0 && opModeIsActive()) {
                FrontLeft.setPower(-1.0);
                FrontRight.setPower(1.0);
                BackLeft.setPower(1.0);
                BackRight.setPower(-1.0);
            }
        }

    if(currentstep == 4) {
        FrontLeft.setPower(0.0);
        BackLeft.setPower(0.0);
        FrontRight.setPower(0.0);
        BackRight.setPower(0.0);
        currentstep++;
    }

    }
}}



