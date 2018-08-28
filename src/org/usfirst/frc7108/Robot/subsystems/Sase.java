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
import org.usfirst.frc7108.Robot.commands.xboxSurus;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotState;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Sase extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX solOnTalon = RobotMap.sasesolOnTalon;
    private final WPI_TalonSRX solArkaTalon = RobotMap.sasesolArkaTalon;
    private final WPI_TalonSRX sagOnTalon = RobotMap.sasesagOnTalon;
    private final WPI_TalonSRX sagArkaTalon = RobotMap.sasesagArkaTalon;
    private final RobotDrive robotDrive41 = RobotMap.saseRobotDrive41;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	
        // Set the default command for a subsystem here.
    	setDefaultCommand(new xboxSurus());

        // setDefaultCommand(new MySpecialCommand());
    }
     public void driveBase(){
	   if(RobotState.isAutonomous()) {
	    	
	     }
	     else {
	    	 robotDrive41.arcadeDrive(Robot.oi.xbox.getY(),-Robot.oi.xbox.getX());
	    	 
	     }
	  robotDrive41.isSafetyEnabled();
	 
     }
     	public void otonomDuz(double speed) {
     		solOnTalon.set(-speed);
     		sagOnTalon.set(speed);
     		solArkaTalon.set(-speed);
     		sagArkaTalon.set(speed);
     		
     	}
     	public void otonomSagMotor(double speed) {

     		sagOnTalon.set(speed);
     		sagArkaTalon.set(speed);
     		
     	}
     	public void otonomSolMotor(double speed) {
     		solOnTalon.set(-speed);
     		solArkaTalon.set(-speed);
     	}
     	
     	public void otonomDur() {
     		solOnTalon.set(0);
     		sagOnTalon.set(0);
     		solArkaTalon.set(0);
     		sagArkaTalon.set(0);
     		}
     	public void otonomDon(double speed) {//speed - girilirse sola doner + verilirse saga doner
     		solOnTalon.set(-speed);
     		sagOnTalon.set(-speed);
     		solArkaTalon.set(-speed);
     		sagArkaTalon.set(-speed);
     	}
     	
     	
     	
    @Override
    public void periodic() {
        // Put code here to be run every loop

    }
	
		// TODO Auto-generated method stub
		
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.



}

