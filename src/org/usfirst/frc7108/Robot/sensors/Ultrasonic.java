package org.usfirst.frc7108.Robot.sensors;

import javax.swing.plaf.FontUIResource;

import org.usfirst.frc7108.Robot.Robot;

public class Ultrasonic 
{
	
	
	public Ultrasonic() 
	{
			 
	}
	public static double ultrasonic1() 
    {
    	
    	double averageVolts = Robot.UAna.getAverageVoltage();
		double AV = averageVolts*1000;
		Robot.lastAnalogValue = (int) (AV/4.9);
		
		return Robot.lastAnalogValue;
    }
	
	public static double ultrasonic2() 
    {
    	
    	double averageVolts = Robot.UAna2.getAverageVoltage();
		double AV = averageVolts*1000;
		Robot.lastAnalogValue2 = (int) (AV/4.9);
		
		return Robot.lastAnalogValue2;
		
    }
}
