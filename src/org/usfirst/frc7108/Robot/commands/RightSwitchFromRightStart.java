package org.usfirst.frc7108.Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightSwitchFromRightStart extends CommandGroup {
	
	public RightSwitchFromRightStart()
	{
		
	this.addSequential(new AutonomousDrivePID(400));
	this.addSequential(new AutonomousTurnPID(-90));
	this.addSequential(new AutonomousReverse(0.2));
	this.addSequential(new AutonomousLift(3));
	this.addSequential(new KutuBirak(3));
 
		

}
}