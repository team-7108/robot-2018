package org.usfirst.frc7108.Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightSwitchFromRightStart extends CommandGroup 
{
	
	public RightSwitchFromRightStart()
	{
		
		this.addSequential(new GripperRelease());
		this.addParallel(new AutonomousDrivePID(410));	
		this.addSequential(new AutonomousTurnPID(-90));
		this.addSequential(new AutonomousDrive(0.3));
		this.addParallel(new AutonomousLift(5));
		this.addSequential(new releaseCube(3));
 
	}
}