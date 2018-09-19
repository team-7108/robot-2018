package org.usfirst.frc7108.Robot.sensors;


import java.awt.Color;

import org.usfirst.frc7108.Robot.RobotMap;

import edu.wpi.first.wpilibj.PWM;

public class RGBLed {
	
	private final PWM RGBLed = RobotMap.RgbLed;
	private final Color color = Color.BLACK;
	int red;
	int green;
	int blue;
	
	public void setColor(int red, int green, int blue) {
		setColor(255,0,0);
		this.red = red;
		
		setColor(0,255,0);
		this.green = green;
		
		setColor(0,0,255);
		this.blue = blue;
	}
	
	public int getRed() {
		return red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}

	public PWM getRGBLed() {
		RGBLed.getRaw();
		
		return RGBLed;
	}

	public Color getColor() {
		return color;
	}
	
	

	
	
	
	
	
	

}
