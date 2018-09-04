package org.usfirst.frc7108.Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightScaleFromLeftStart extends CommandGroup{
	public RightScaleFromLeftStart() {
		this.addSequential(new AutonomousDrive(590));
		this.addSequential(new AutonomousTurnPID(90));
		this.addSequential(new AutonomousDrive(470));
		this.addSequential(new AutonomousTurnPID(-90));
		this.addSequential(new AutonomousDrive(90));
		this.addParallel(new AutonomousLiftLS());
		this.addSequential(new KutuBirak(3));
	}

}
