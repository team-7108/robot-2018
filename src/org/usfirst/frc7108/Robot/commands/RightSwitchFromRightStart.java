package org.usfirst.frc7108.Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightSwitchFromRightStart extends CommandGroup {
	
	public RightSwitchFromRightStart()
	{
		
	this.addSequential(new AutonomusDrive(350));
 	this.addSequential(new AutonomousDelay(0.1));
 	this.addSequential(new AutonomousTurnPID(90));
 	this.addSequential(new AutonomousDelay(0.1));
 	this.addSequential(new AutonomusDrive(200));
 	this.addSequential(new AutonomousDelay(0.1));
 	this.addSequential(new AutonomousTurnPID(0));
 	this.addSequential(new AutonomousDelay(0.1));
 	this.addSequential(new AutonomusDrive(200));
 	this.addSequential(new AutonomousDelay(0.1));
 	this.addSequential(new AutonomousTurnPID(-90));
 	this.addSequential(new AutonomousDelay(0.1));
 	this.addSequential(new AutonomousLift());
 	this.addSequential(new AutonomousDelay(0.1));
 	this.addSequential(new KutuBirak());
 
		

}
