package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftSwitchFromMiddleStart extends CommandGroup 
{

    public LeftSwitchFromMiddleStart() 
    {
    	
    	requires(Robot.driveTrain);
    	this.addSequential(new AutonomousDrivePID(100));
    	this.addSequential(new AutonomousTurnPID(-40));
    	this.addSequential(new AutonomousDrive(1));
    	this.addSequential(new AutonomousDelay(0.5));
    	this.addSequential(new AutonomousTurnPID(0));
    	this.addSequential(new AutonomousDrive(0.5));
    	this.addParallel(new AutonomousLift(5));
    	this.addSequential(new releaseCube(3));
    	
    }
}
