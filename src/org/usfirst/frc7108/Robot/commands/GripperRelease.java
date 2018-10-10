package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GripperRelease extends Command {

    public GripperRelease() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.pnomatik);
    }
	protected void initialize() {
	
	}
	protected void execute() {
		 Robot.pnomatik.Release();
		 
	}
	protected boolean isFinished() {
        return false;
    }
	 protected void end() 
	    {
	    	Robot.pnomatik.StopFolding();
	    }
	 protected void interrupted() {
	    	end();
	    }
	 }