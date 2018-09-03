package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc7108.Robot.sensors.Ultrasonic;

public class LeftScaleFromLeftStart extends CommandGroup{
	public LeftScaleFromLeftStart() {
		this.addSequential(new AutonomousDrive(500));
		this.addSequential(new AutonomousTurnPID(30) , 2);
		System.out.print("Son AV");
		System.out.println(Robot.sonAV);	
		this.addSequential(new AutonomousDrive(Robot.ultrasonic.ultrasonic1()+150));
		System.out.println("Lifting");
		this.addParallel(new AutonomousLift(3));
		this.addSequential(new KutuBirak());
}
}
