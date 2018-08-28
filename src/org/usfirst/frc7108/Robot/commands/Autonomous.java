package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;
import org.usfirst.frc7108.Robot.commands.KutuBirak;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous extends CommandGroup {
	public DriverStation ds = DriverStation.getInstance();
	public int loc = DriverStation.getInstance().getLocation();
	public String gameData = DriverStation.getInstance().getGameSpecificMessage(); 
	
	
	public void sagdanBasla()
	{
		requires(Robot.sase);
		
		// WIP. Not tested
		switch (gameData) 
		{
		
		case "LL":
			//Only passes the line.
			this.addSequential(new AutonomusDrive(350));
			this.addSequential(new AutonomousDelay(0.5));
			this.addSequential(new AutonomousTurnPID(90));
			this.addSequential(new AutonomousDelay(0.5));
			this.addSequential(new AutonomusDrive(200));
			this.addSequential(new AutonomousDelay(0.5));
			this.addSequential(new AutonomousTurnPID(0));
			this.addSequential(new AutonomousDelay(0.5));
			this.addSequential(new AutonomusDrive(200));
			break;
		
		case "RR":
			//Places box in to the scale also passes the line
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
			break;
		
		case "RL":
			//Places box in to the switch also passes the line
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
		 	break;
		 	
		case "LR":
			//Places box in to the scale also passes the line
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
		}
	}
	
	
	public Autonomous() {
		
	if (loc == 3) {
		
		sagdanBasla();
		
		}	
	}
}



