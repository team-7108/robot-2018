package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;
import org.usfirst.frc7108.Robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class compressorSwitcher extends Command {
	
	public compressorSwitcher() {
		requires(Robot.pnomatik);
	}
	protected void initialize() {
	
	}
	protected void execute() {
		if(Robot.compressorSwitchFlag  == 0) {
			RobotMap.compresor.setClosedLoopControl(false);
			Robot.compressorSwitchFlag = 1;
		}
		else {
			RobotMap.compresor.setClosedLoopControl(true);
			Robot.compressorSwitchFlag = 0;
		}
	}
	protected boolean isFinished() {
        return true;
    }
	 protected void end() 
	    {
	    	// Robot.pnomatik.Off();
	    }
	 protected void interrupted() {
	    	end();
	    }


	}