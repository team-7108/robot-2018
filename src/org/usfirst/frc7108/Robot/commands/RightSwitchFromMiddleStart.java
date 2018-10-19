package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightSwitchFromMiddleStart extends CommandGroup 
{

    public RightSwitchFromMiddleStart() 
    {
    	
    	requires(Robot.driveTrain);
    	/*
    	this.addSequential(new GripperRelease());
    	this.addSequential(new AutonomousDrivePID(300));
    	this.addSequential(new AutonomousTurnPID(30));  //%80 will work but if that'll work you won't be able to put cube to left 
    	this.addSequential(new AutonomousDrive(0.4));    switch from middle.
    	//this.addSequential(new AutonomousDelay(0.5));
    	//this.addSequential(new AutonomousTurnPID(0));
    	this.addParallel(new AutonomousLift(5));
    	//this.addSequential(new AutonomousDrive(1));
    	this.addSequential(new releaseCube(3));
    	*/
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
