package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;
//import org.usfirst.frc7108.Robot.subsystems.Sase;
//import org.usfirst.frc7108.Robot.commands.*;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class soldanBasla extends CommandGroup{
	public soldanBasla(){
		requires(Robot.sase);
		this.addSequential(new AutonomousDrivePID(300));
	
		
	}
}

