package org.usfirst.frc7108.Robot.sensors;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class UltrasonicFilter
{
	private double smoothedValue;
	double filterValue = 0.6;
	int sensorRead = Robot.lastAnalogValue;
		
		public double getSmoothVal() 
		{
			
			if (filterValue >1) 
			{
				filterValue = 0.99;
			}else if(filterValue <=0)
			{
				filterValue = 0;
			}
			 smoothedValue = (Robot.lastAnalogValue*(1 - filterValue)+(smoothedValue*filterValue));
			
			
			
			return (int) smoothedValue;
		
		
	}	
}
