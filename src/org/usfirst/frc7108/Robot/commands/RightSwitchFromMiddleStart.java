package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSwitchFromMiddleStart extends CommandGroup {

    public RightSwitchFromMiddleStart() {
    	requires(Robot.sase);
    	this.addSequential(new AutonomusDrive(100));
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new AutonomousTurnPID(90));
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new AutonomusDrive(125));
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new AutonomousTurnPID(-90));
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new AutonomusDrive(155));
    	this.addSequential(new AutonomousDelay(0.1));
    	//this.addSequential(new AutonomousLift());
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new KutuBirak(3));
    	this.addSequential(new AutonomusDrive(-5));
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new AutonomousTurnPID(-90));
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new AutonomusDrive(100));
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new KutuAl());
    	this.addSequential(new AutonomusDrive(-100));
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new AutonomousTurnPID(90));
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new AutonomusDrive(5));
    	this.addSequential(new AutonomousDelay(0.1));
    	//this.addSequential(new AutonomousLift());
    	this.addSequential(new AutonomousDelay(0.1));
    	this.addSequential(new KutuBirak(3));
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
