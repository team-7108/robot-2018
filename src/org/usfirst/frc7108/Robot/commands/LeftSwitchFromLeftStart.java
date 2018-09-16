package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftSwitchFromLeftStart extends CommandGroup
{
	
	public LeftSwitchFromLeftStart() 
	{
		
		this.addSequential(new AutonomousDrivePID(400));	
		this.addSequential(new AutonomousTurnPID(90));
		this.addSequential(new AutonomousReverse(0.2));
		this.addParallel(new AutonomousLift(3));
		this.addSequential(new releaseCube(3));
		
	}

}
