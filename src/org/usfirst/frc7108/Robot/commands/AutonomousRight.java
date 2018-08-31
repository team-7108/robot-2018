package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousRight extends CommandGroup {
	
	public DriverStation ds = DriverStation.getInstance();
	public int loc = DriverStation.getInstance().getLocation();
	// public String gameData = DriverStation.getInstance().getGameSpecificMessage();
	public String _gameData = ds.getGameSpecificMessage();
	public String gameData = _gameData.substring(0,2);
	public void start() {
	requires(Robot.sase);
	
	// WIP. Not tested
	switch (gameData) 
	{
	
	case "LL":
		/*Only passes the line.
		this.addSequential(new AutonomusDrive(350));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomousTurnPID(90));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomusDrive(200));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomousTurnPID(0));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomusDrive(200));
		*/
		for (int i = 0; i < 1000; i++) {
		System.out.println("Left-Left works boi");
		}
		break;
	
	case "RR":
		/*Places box in to the scale also passes the line
		this.addSequential(new AutonomusDrive(350));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomousTurnPID(90));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomusDrive(200));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomousTurnPID(0));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomusDrive(200));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomousLift());
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new KutuBirak());
		*/
		for (int i = 0; i < 1000; i++) {
		System.out.println("Right-Right works boi");
		}
		break;
	
	case "RL":
		/*Places box in to the switch also passes the line
	 	this.addSequential(new AutonomusDrive(350));
	 	this.addSequential(new AutonomousDelay(0.5));
	 	this.addSequential(new AutonomousTurnPID(90));
	 	this.addSequential(new AutonomousDelay(0.5));
	 	this.addSequential(new AutonomusDrive(200));
	 	this.addSequential(new AutonomousDelay(0.5));
	 	this.addSequential(new AutonomousTurnPID(0));
	 	this.addSequential(new AutonomousDelay(0.5));
	 	this.addSequential(new AutonomusDrive(200));
	 	this.addSequential(new AutonomousDelay(0.5));
	 	this.addSequential(new AutonomousTurnPID(-90));
	 	this.addSequential(new AutonomousDelay(0.5));
	 	this.addSequential(new AutonomousLift());
	 	this.addSequential(new AutonomousDelay(0.5));
	 	this.addSequential(new KutuBirak());
	 	*/
		for (int i = 0; i < 1000; i++) {
		System.out.println("Right-Left works boi");
		}
		break;
	 	
	case "LR":
		/*Places box in to the scale also passes the line
		this.addSequential(new AutonomusDrive(350));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomousTurnPID(90));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomusDrive(200));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomousTurnPID(0));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomusDrive(200));
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new AutonomousLift());
		this.addSequential(new AutonomousDelay(0.5));
		this.addSequential(new KutuBirak());
		*/
		for (int i = 0; i < 1000; i++) {
		System.out.println("Left-Right works boi");
		}
		break;
	}
	
	}
}	


