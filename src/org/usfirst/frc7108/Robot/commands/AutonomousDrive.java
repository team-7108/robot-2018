package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;
import org.usfirst.frc7108.Robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;


public class AutonomousDrive extends Command{

	long startTime;
	double seconds;
	double mesafe;
	boolean durum;
	
	public AutonomousDrive(double _mesafe) {
		this.mesafe = _mesafe;
		//this.seconds = _seconds;		
		requires(Robot.driveTrain);
	}
	protected void initialize() {
		startTime = System.currentTimeMillis();

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.autonomousForward();
    	
    	
     // may need to call getJoystick() method
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
		//return (System.currentTimeMillis() - startTime) > (int) (1000d * this.seconds);
    	
    	return (Robot.sonAV > (int) this.mesafe);
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    	Robot.driveTrain.autonomousStop();

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }

}