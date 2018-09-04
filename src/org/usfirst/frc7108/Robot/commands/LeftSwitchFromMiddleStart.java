package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSwitchFromMiddleStart extends CommandGroup {

    public LeftSwitchFromMiddleStart() {
    	requires(Robot.sase);
    	this.addSequential(new AutonomousDrivePID(100));
    	this.addSequential(new AutonomousTurnPID(-20));
    	this.addSequential(new AutonomousDrivee(2));
    	this.addSequential(new AutonomousDelay(0.5));
    	this.addSequential(new AutonomousTurnPID(20));
    	this.addParallel(new AutonomousLift(3));
    	this.addSequential(new AutonomousDrivee(1));
    	this.addSequential(new KutuBirak(3));
    }
}
