package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousLeft extends CommandGroup {
	
	public DriverStation ds = DriverStation.getInstance();
	public int loc = DriverStation.getInstance().getLocation();
	public String gameData = DriverStation.getInstance().getGameSpecificMessage();
	public AutonomousLeft() {
		
	soldanBasla();
	
		
	}
		
		public void soldanBasla()
		{
		requires(Robot.sase);
		switch(gameData)
		{
		case "LL":
		this.addSequential(new AutonomousDrive(500));
		this.addSequential(new AutonomousTurnPID(30));
		this.addSequential(new AutonomousDrive(Robot.sonAV+150));
		this.addParallel(new AutonomousLiftLS());
		this.addSequential(new KutuBirak());
		break;
			
		case "RL":
		this.addSequential(new AutonomousDrive(500));
		this.addSequential(new AutonomousTurnPID(30));
		this.addSequential(new AutonomousDrive(Robot.sonAV+150));
		this.addParallel(new AutonomousLiftLS());
		this.addSequential(new KutuBirak());
		break;
		
		case"LR":
		this.addSequential(new AutonomousDrive(240));	
		this.addSequential(new AutonomousTurnPID(20));
		this.addSequential(new AutonomousDrive(Robot.sonAV+30));
		this.addParallel(new AutonomousLift(3));
		this.addSequential(new KutuBirak());
		break;
		
		case"RR":
		this.addSequential(new AutonomousDrive(590));
		this.addSequential(new AutonomousTurnPID(90));
		this.addSequential(new AutonomousDrive(470));
		this.addSequential(new AutonomousTurnPID(-90));
		this.addSequential(new AutonomousDrive(90));
		this.addParallel(new AutonomousLiftLS());
		this.addSequential(new KutuBirak());
		break;

		}
		}
	
}

		
		
	


