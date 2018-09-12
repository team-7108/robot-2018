package org.usfirst.frc7108.Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightScaleFromRightStart extends CommandGroup
{
	
	public RightScaleFromRightStart()
	{	
		
		this.addSequential(new AutonomousDrivePID(500));
		this.addSequential(new AutonomousTurnPID(-30) , 2);
		this.addParallel(new AutonomousLift(3));
		this.addSequential(new AutonomousDrive(1));		
		this.addSequential(new AutonomousBoxRelease(3));
	
		
	}
	
}

