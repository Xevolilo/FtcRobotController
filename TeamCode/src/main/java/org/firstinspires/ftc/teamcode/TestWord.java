package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled               //this makes that this class doesn't affect anything
@TeleOp                 //this states whether the code will run as TeleOp or Autonomous

public class TestWord extends OpMode {

    @Override
    public void init() {                //one time running at the start
        telemetry.addData("Hello", "World");
    }

    @Override
    public void loop() {                //continuously running until stopped

    }
}
