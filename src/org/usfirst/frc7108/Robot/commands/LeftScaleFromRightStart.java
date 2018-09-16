package org.usfirst.frc7108.Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftScaleFromRightStart extends CommandGroup 
{
	
	public LeftScaleFromRightStart()
	{
		
		this.addSequential(new AutonomousDrivePID(500));
		
	}
	
	
}

