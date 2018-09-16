package org.usfirst.frc7108.Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightScaleFromLeftStart extends CommandGroup
{
	
	public RightScaleFromLeftStart()
	{
		
		this.addSequential(new AutonomousDrivePID(500));

	}

}
