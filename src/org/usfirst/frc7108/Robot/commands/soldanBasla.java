package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;
//import org.usfirst.frc7108.Robot.subsystems.DriveTrain;
//import org.usfirst.frc7108.Robot.commands.*;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class soldanBasla extends CommandGroup{
	public soldanBasla(){
		requires(Robot.driveTrain);
		this.addSequential(new AutonomousDrivePID(300));
		//this.addSequential(new AutonomousTurnPID(90));
		
	}
}

