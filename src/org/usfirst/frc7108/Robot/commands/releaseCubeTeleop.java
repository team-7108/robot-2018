package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;
import org.usfirst.frc7108.Robot.subsystems.Gripper;

import edu.wpi.first.wpilibj.command.Command;

public class releaseCubeTeleop extends Command
{
	
	 public releaseCubeTeleop() 
	 {

		        requires(Robot.gripper);

		    }

			// Called just before this Command runs the first time
		    protected void initialize() 
		    {
		    	
		    }

		    // Called repeatedly when this Command is scheduled to run
		    protected void execute() 
		    {
		    Robot.gripper.gripperRelease(0.8); // may need to call getJoystick() method
		    }

		    // Make this return true when this Command no longer needs to run execute()
		    protected boolean isFinished() 
		    {
		         return false;
		    }

		    // Called once after isFinished returns true
		    protected void end() 
		    {
		    	Robot.gripper.gripperStop();
		    }

		    // Called when another command which requires one or more of the same
		    // subsystems is scheduled to run
		    protected void interrupted()
		    {
		    	end();
		    }


}
