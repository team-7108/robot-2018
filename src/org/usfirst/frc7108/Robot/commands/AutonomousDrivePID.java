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
      double current_distance= Robot.lastAnalogValue;
      double distance_error=distance-current_distance;
      double distance_oldError=distance_error;
      double kP = 0.0014;
      double kD = 0.04;
      double angle_power;
      double right_power;
      double left_power;
      double yawAngle= Robot.gyro.getAngle(); 
      double angle ;
      double angle_error= angle-yawAngle;
      
      double angle_oldError=angle_error;
      int true_flag = 0;
      double accuracy = 3;
      double p=0.0014;
      double d=0.04;
    public AutonomousDrivePID(double _distance ) {
    	requires(Robot.driveTrain);
    //	requires(Robot.lastAnalogValue);
    	this.distance= _distance;
    //	current_distance=Robot.lastAnalogValue;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gyro.updateGyro();
    	angle=Robot.gyro.getAngle();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.gyro.updateGyro();
    	current_distance=Robot.ultrasonic.ultrasonic1();
    	yawAngle= Robot.gyro.getAngle();
		angle_error = angle - yawAngle; 
    	

    	distance_error= distance-current_distance;
    	
    	angle_power = p*angle_error+(d*(angle_error-angle_oldError));
		
	
		if (distance_error<0) {
			power = -0.2 + (kP*distance_error+(kD*(distance_error-distance_oldError)));	
			
		}
		else {
			power = 0.2 + (kP*distance_error+(kD*(distance_error-distance_oldError)));	
		}
		left_power =power+angle_power;
		right_power =power+angle_power;
		
		if (left_power>1)
		{left_power=1;}
		else if(left_power < -1)
		{left_power=-1;}
		if (right_power>1)
		{right_power=1;}
		else if(right_power < -1)
		{right_power=-1;}
		Robot.driveTrain.autonomousLeftMotor(left_power);
		Robot.driveTrain.autonomousRightMotor(right_power);
		//Robot.driveTrain.autonomousForward(power);
		//Robot.driveTrain.autonomousLeftMotor(0.4);
		//Robot.driveTrain.autonomousRightMotor(0.4);
		System.out.println("Measured Distance:");
		System.out.print(current_distance+ "		");
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
		System.out.println("True Flag:       "+ true_flag);
		     
		     
		     
		     distance_oldError= distance_error;
	if(current_distance< distance+ accuracy && current_distance > distance-accuracy) {
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
    protected void end() {Robot.driveTrain.autonomousStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
}

