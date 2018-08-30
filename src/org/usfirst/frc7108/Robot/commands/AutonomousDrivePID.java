//ALI KOC BASKANIM YARDIM ET
package org.usfirst.frc7108.Robot.commands;


import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousDrivePID extends Command {
      double power;
      double distance;
      double distancee= Robot.sonAV;
      double distance_error=distance-distancee;
      double distance_oldError=distance_error;
      double kP = 0.0018;
      double kD = 0.040;
      double angle_power;
      double right_power;
      double left_power;
      double yawAngle =0;
      double angle= Robot.gyro.getAngle(); 
      double angle_error= angle-yawAngle;
      double angle_oldError=angle_error;
      int true_flag = 0;
      double accuracy = 3;
      double p=0.0019;
      double d=0.040;
    public AutonomousDrivePID(double _distance ) {
    	requires(Robot.sase);
    //	requires(Robot.sonAV);
    	this.distance= _distance;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	

    	distance_error= distance-distancee;
    	angle_power = p*angle_error+(d*(angle_error-angle_oldError));
			left_power=power+angle_power;
			right_power=power-angle_power;
		
	
		if (distance_error<0) {
			power = -0.2 + (kP*distance_error+(kD*(distance_error-distance_oldError)));	
			
		}
		else {
			power = 0.2 + (kP*distance_error+(kD*(distance_error-distance_oldError)));	
		}
		
		if (left_power>1)
		{left_power=1;}
		else if(left_power < -1)
		{left_power=-1;}
		if (right_power>1)
		{right_power=1;}
		else if(right_power < -1)
		{right_power=-1;}
		Robot.sase.otonomSolMotor(left_power);
		Robot.sase.otonomSagMotor(right_power);
		//Robot.sase.otonomDuz(power);
		System.out.println("Measured Distance:");
		System.out.print(distance+ "		");
		System.out.print("Error Distance");
		System.out.print(distance_error+ "		");
		System.out.print("Measured Angle:");
		System.out.print(angle+ "		");
		System.out.print("Error Angle");
		System.out.print(angle_error+ "		");
		System.out.print("Left Power :"); 
		System.out.print(left_power + "		");
		System.out.print("Right Power :"); 
		System.out.print(right_power);
		     
		     
		     
		     distance_oldError= distance_error;
	if(distancee< distance+ accuracy && distancee > distance-accuracy) {
		System.out.println("arizona kertenkelecik");
		true_flag++;
		
	}
	else 
	{
		true_flag=0;
		
	}

	
	
	
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (true_flag>=5) {
    		return true;
    	}
    else {
    	return false;
    	
    }
    	
    	
}

    // Called once after isFinished returns true
    protected void end() {Robot.sase.otonomDur();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
}
