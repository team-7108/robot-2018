package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftScaleFromLeftStart extends CommandGroup{
	public LeftScaleFromLeftStart() {
		//this.addSequential(new AutonomousDrive(500));
		this.addSequential(new AutonomousTurnPID(30), 2);
		//this.addSequential(new AutonomousDrivee(Robot.sonAV+150));
		//this.addParallel(new AutonomousLift(3));
		//this.addSequential(new KutuBirak());
}
}
