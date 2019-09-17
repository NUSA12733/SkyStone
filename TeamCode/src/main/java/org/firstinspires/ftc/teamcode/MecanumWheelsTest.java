package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp (name = "Mecanum Wheels Test")
public class MecanumWheelsTest extends OpMode {
    //Initialize front motors
    DcMotor frontR;
    DcMotor frontL;

    //Initialize back motors
    DcMotor backR;
    DcMotor backL;

    //Initialize motor power variables
    double frPower;
    double flPower;
    double brPower;
    double blPower;

    double leftStickY = -gamepad1.left_stick_y;
    double rightStickY = -gamepad1.right_stick_y;

    double leftStickX = gamepad1.left_stick_x;
    double rightStickX = gamepad1.right_stick_x;



    @Override
    public void init() {
        //Instantiate hardware
        frontR = hardwareMap.dcMotor.get("frontR");
        frontL = hardwareMap.dcMotor.get("frontL");
        backR = hardwareMap.dcMotor.get("backR");
        backL = hardwareMap.dcMotor.get("backL");

        //Set front right and back right motors to reverse
        frontR.setDirection(DcMotorSimple.Direction.REVERSE);
        backR.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    @Override
    public void loop() {


        if(leftStickY > 0 && rightStickY >0){
            frontL.setPower(leftStickY);
            backL.setPower(leftStickY);
            frontR.setPower(rightStickY);
            backR.setPower(rightStickY);
        }

        if(leftStickY <0 && rightStickY <0){
            frontL.setPower(leftStickY);
            backL.setPower(leftStickY);
            frontR.setPower(rightStickY);
            backR.setPower(rightStickY);
        }

        if(leftStickY >0 && rightStickY <0){
            frontL.setPower(leftStickY);
            backL.setPower(leftStickY);
            frontR.setPower(rightStickY);
            backR.setPower(rightStickY);
        }

        if(leftStickY <0 && rightStickY >0){
            frontL.setPower(leftStickY);
            backL.setPower(leftStickY);
            frontR.setPower(rightStickY);
            backR.setPower(rightStickY);
        }
        if(leftStickY > 0 || rightStickY >0){
            frontL.setPower(leftStickY);
            backL.setPower(leftStickY);
            frontR.setPower(rightStickY);
            backR.setPower(rightStickY);
        }

        if(leftStickY <0 || rightStickY <0){
            frontL.setPower(leftStickY);
            backL.setPower(leftStickY);
            frontR.setPower(rightStickY);
            backR.setPower(rightStickY);
        }

        if(leftStickY >0 || rightStickY <0){
            frontL.setPower(leftStickY);
            backL.setPower(leftStickY);
            frontR.setPower(rightStickY);
            backR.setPower(rightStickY);
        }

        if(leftStickY <0 || rightStickY >0){
            frontL.setPower(leftStickY);
            backL.setPower(leftStickY);
            frontR.setPower(rightStickY);
            backR.setPower(rightStickY);
        }


        //Strafe
        if(leftStickX <0 && rightStickX >0){
            frontL.setPower(leftStickX);
            backL.setPower(-leftStickX);
            frontR.setPower(rightStickX);
            backR.setPower(-rightStickX);
        }

        if(leftStickX >0 && rightStickX <0){
            frontL.setPower(leftStickX);
            backL.setPower(-leftStickX);
            frontR.setPower(rightStickX);
            backR.setPower(-rightStickX);
        }

    }
}

