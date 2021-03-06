package org.usfirst.frc7108.Robot.subsystems;

import org.usfirst.frc7108.Robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Gripper extends Subsystem 
{
	
	 private final SpeedController gripperMotor1 = RobotMap.gripperKutuMotor1;
	 private final SpeedController gripperMotor2 = RobotMap.gripperKutuMotor2;
	
	 public void initDefaultCommand() 
	 {

	 }

		public void gripperRelease(double wheelSpeed) 
		{
			gripperMotor1.set(wheelSpeed);
			gripperMotor2.set(-wheelSpeed);
		}

		public void gripperTake(double wheelSpeed) 
		{
			gripperMotor1.set(-wheelSpeed);
			gripperMotor2.set(wheelSpeed);
		}
		
		public void gripperStop() 
		{
			gripperMotor1.set(0);
			gripperMotor2.set(0);
		}
		
	    public void periodic() 
	    {
	        // Put code here to be run every loop
	    }


}
