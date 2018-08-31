package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftSwitchFromLeftStart extends CommandGroup{
	public LeftSwitchFromLeftStart() {
		this.addSequential(new AutonomousDrive(240));	
		this.addSequential(new AutonomousTurnPID(20));
		this.addSequential(new AutonomousDrive(Robot.sonAV+30));
		this.addParallel(new AutonomousLift(3));
		this.addSequential(new KutuBirak());
	}

}
