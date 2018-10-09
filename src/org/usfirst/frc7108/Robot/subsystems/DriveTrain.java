// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc7108.Robot.subsystems;

import org.usfirst.frc7108.Robot.Robot;
import org.usfirst.frc7108.Robot.RobotMap;
import org.usfirst.frc7108.Robot.commands.xboxDrive;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotState;

public class DriveTrain extends Subsystem 
{

    private final WPI_TalonSRX leftFrontTalon = RobotMap.driveTrainleftFrontTalon;
    private final WPI_TalonSRX leftRearTalon = RobotMap.driveTrainleftRearTalon;
    private final WPI_TalonSRX rightFrontTalon = RobotMap.driveTrainrightFrontTalon;
    private final WPI_TalonSRX rightRearTalon = RobotMap.driveTrainrightRearTalon;
    private final RobotDrive robotDrive41 = RobotMap.driveTrainRobotDrive41;

    @Override
    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new xboxDrive());
    }
    public void driveBase(){
	   if(RobotState.isAutonomous()) 
	   {
	    	
	   }
	   else 
	   {
		   robotDrive41.arcadeDrive(Robot.oi.xbox.getY(),Robot.oi.xbox.getX());
	   }
	  
	   robotDrive41.isSafetyEnabled();
	 
    }
    
 	public void autonomousForward() 
 	{
 		leftFrontTalon.set(-.55);
 		rightFrontTalon.set(.6);
 		leftRearTalon.set(-.55);
 		rightRearTalon.set(.6);    		
 	}
 	
 	public void autonomousRightMotor(double speed) 
 	{
 		rightFrontTalon.set(speed);
 		rightRearTalon.set(speed);	
 	}
 	
 	public void autonomousLeftMotor(double speed) 
 	{
 		leftFrontTalon.set(-speed);
 		leftRearTalon.set(-speed);
 	}
 	
 	public void autonomousReverse() 
 	{
 		leftFrontTalon.set(.55);
 		rightFrontTalon.set(-.6);
 		leftRearTalon.set(.55);
 		rightRearTalon.set(-.6);	
 	}
 	
 	public void autonomousStop() 
 	{
 		leftFrontTalon.set(0);
 		rightFrontTalon.set(0);
 		leftRearTalon.set(0);
 		rightRearTalon.set(0);
 	}
 	
 	public void autonomousTurn(double speed) 
 	{
 		// if speed is - robot goes left, else right
 		leftFrontTalon.set(-speed);
 		rightFrontTalon.set(-speed);
 		leftRearTalon.set(-speed);
 		rightRearTalon.set(-speed);
     }
     	
     	
     	
    @Override
    public void periodic() {
        // Put code here to be run every loop

    }
	
}

