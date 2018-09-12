package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc7108.Robot.sensors.Ultrasonic;

public class LeftScaleFromLeftStart extends CommandGroup{
	public LeftScaleFromLeftStart() {
		this.addSequential(new AutonomousDrivePID(500));
		this.addSequential(new AutonomousTurnPID(30) , 2);
		this.addParallel(new AutonomousLift(3));
		this.addSequential(new AutonomousDrive(1));		
		this.addSequential(new AutonomousBoxRelease(3));
}
}
