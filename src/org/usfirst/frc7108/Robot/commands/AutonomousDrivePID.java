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
      double distancee;
      double distance_error=distance-distancee;
      double distance_oldError=distance_error;
      double kP = 0.0018;
      double kD = 0.040;
      int true_flag = 0;
      double accuracy = 3;
    public AutonomousDrivePID(double _distance) {
    	requires(Robot.sase);
    //	requires(Robot.sonAV);
    	this.distance= _distance;
    
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	
    	distancee= Robot.sonAV;
    	distance_error= distance-distancee;
    	
		
		
		
		
		if (distance_error<0) {
			power = -0.15 + (kP*distance_error+(kD*(distance_error-distance_oldError)));	
			
		}
		else {
			power = 0.15 + (kP*distance_error+(kD*(distance_error-distance_oldError)));	
		}
		
		if (power>1)
		{power=1;}
		else if(power < -1)
		{power=-1;}
		
		Robot.sase.otonomDuz(power);
		
		System.out.println("Measured :");
		System.out.print(distancee);
		System.out.println("Error");
		System.out.print(distance_error);
		
		System.out.println("Power :"); 
		System.out.print(power);
		  
		     
		     
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
    	if (true_flag>=8) {
    		System.out.println("arizona kertenkedicik");
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
