// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc7108.Robot;


import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

//import org.usfirst.frc7108.Robot.commands.Forward;
import org.usfirst.frc7108.Robot.commands.takeCube;
import org.usfirst.frc7108.Robot.commands.CloseGripper;
import org.usfirst.frc7108.Robot.commands.GripperFold;
import org.usfirst.frc7108.Robot.commands.GripperRelease;
import org.usfirst.frc7108.Robot.commands.OpenGripper;
import org.usfirst.frc7108.Robot.commands.compressorSwitcher;
import org.usfirst.frc7108.Robot.commands.releaseCube;
import org.usfirst.frc7108.Robot.commands.releaseCubeTeleop;
//import org.usfirst.frc7108.Robot.commands.Reverse;
import org.usfirst.frc7108.Robot.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    public Joystick xbox;
    public Joystick logitech;
    
    public OI() {

        xbox = new Joystick(0);
        logitech = new Joystick(1);
        Button button  = new JoystickButton(logitech,5); // Take Cube
        Button button1 = new JoystickButton(logitech,6); // Release Cube
        Button button2 = new JoystickButton(logitech,3); // Close Gripper
        Button button3 = new JoystickButton(logitech,4); // Open Gripper
        Button button4 = new JoystickButton(xbox,1); // Fold Gripper
        Button button5 = new JoystickButton(xbox,2); // Release Gripper
        Button button6 = new JoystickButton(logitech,7); // Close compressor
        
        button.whileHeld(new takeCube());
        button1.whileHeld(new releaseCubeTeleop());
        button2.whenPressed(new CloseGripper());
        button3.whenPressed(new OpenGripper());
        button4.whenPressed(new GripperFold());
        button5.whenPressed(new GripperRelease());
        button6.whenPressed(new compressorSwitcher());
    }	

    public Joystick getxbox() {
        return xbox;
    }
    
}

