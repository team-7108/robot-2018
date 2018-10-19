package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc7108.Robot.sensors.Ultrasonic;

public class LeftScaleFromLeftStart extends CommandGroup
{
	
	public LeftScaleFromLeftStart() 
	{
		this.addSequential(new GripperRelease());
		this.addSequential(new AutonomousDrivePID(680));
		this.addSequential(new AutonomousTurnPID(30));
		this.addSequential(new AutonomousDrive(0.5));
		this.addParallel(new AutonomousLift(8));
		this.addSequential(new releaseCube(3));
		
	}
}
