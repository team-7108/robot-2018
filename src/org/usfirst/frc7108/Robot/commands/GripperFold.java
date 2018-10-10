package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GripperFold extends Command {

    public GripperFold() {
    // Called just before this Command runs the first time
	requires(Robot.pnomatik);
    }
	protected void initialize() {
	
	}
	protected void execute() {
		 Robot.pnomatik.Fold();
		 
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
