
package org.usfirst.frc7108.Robot.subsystems;

import org.usfirst.frc7108.Robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatic extends Subsystem{
	public Pneumatic() {
		
	}
	public void Off() {
		RobotMap.db2.set(Value.kOff);
	}
	public void Forward() {
		RobotMap.db2.set(Value.kForward);
	}
	public void Reverse() {
		RobotMap.db2.set(Value.kReverse);
	}
	public void Fold() {
		RobotMap.db.set(Value.kReverse);
	}
	public void Release() {
		RobotMap.db.set(Value.kForward);
	}
	public void StopFolding() {
		RobotMap.db.set(Value.kOff);
	}
	public void initDefaultCommand() {
		
	}
}
	
