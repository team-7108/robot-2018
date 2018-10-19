package org.usfirst.frc7108.Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightScaleFromRightStart extends CommandGroup
{
	
	public RightScaleFromRightStart()
	{	
		this.addSequential(new GripperRelease());
		this.addSequential(new AutonomousDrivePID(680));
		this.addSequential(new AutonomousTurnPID(-30));
		this.addSequential(new AutonomousDrive(0.3));
		this.addParallel(new AutonomousLift(8));
		this.addSequential(new releaseCube(3));
	
		
	}
	
}

