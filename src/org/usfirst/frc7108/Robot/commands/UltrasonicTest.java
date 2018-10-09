package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class UltrasonicTest extends CommandGroup{
	
	public UltrasonicTest() {
		this.addSequential(new AutonomousDrivePID(350));
		this.addSequential(new AutonomousTurnPID(-30));
		this.addSequential(new AutonomousDrivePID(Robot.ultrasonicfilter.getSmoothVal() + 150));
		this.addSequential(new AutonomousTurnPID(0));
	}
	

}
