package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;
import org.usfirst.frc7108.Robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class AutonomousLift extends Command{
	long startTime;
	double seconds;
	
	public AutonomousLift(double _seconds) {
		requires(Robot.clifter);
		this.seconds = _seconds;
	}
	protected void initialize() {
		

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	RobotMap.lifterMotor1.set(0.5);
    	RobotMap.lifterMotor2.set(0.5);
     // may need to call getJoystick() method
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
		return (System.currentTimeMillis() - startTime) > (int) (1000d * this.seconds);
    	
    	
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    	Robot.sase.clifterDur();

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
	}





