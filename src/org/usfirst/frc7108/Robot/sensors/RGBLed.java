package org.usfirst.frc7108.Robot.sensors;


import java.awt.Color;

import org.usfirst.frc7108.Robot.RobotMap;

import edu.wpi.first.wpilibj.PWM;

public class RGBLed {
	
	private final PWM RGBLed1 = RobotMap.RgbLedRed;
	private final PWM RGBLed2 = RobotMap.RgbLedGreen;
	private final PWM RGBLed3 = RobotMap.RgbLedBlue;
	
	private final Color color = Color.BLACK;
	int red;
	int green;
	int blue;
	public void setRed(int red, int green, int blue) {
		setRed(255,0,0);
		this.red = red;
	}
	public int getRed() {
		return red;
	}
	public void setGreen(int red, int green, int blue) {
		setGreen(0,255,0);
		this.green = green;
	}
	public int getGreen() {
		return green;
	}
	public void setBlue(int red, int green, int blue) {
		setBlue(0,0,255);
		this.blue = blue;
	}
	public int getBlue() {
		return blue;
	}
	public PWM getRGBLed1() {
		RGBLed1.getRaw();
		return RGBLed1;
	}
	public PWM getRGBLed2() {
		RGBLed2.getRaw();
		return RGBLed2;
	}
	public PWM getRGBLed3() {
		RGBLed3.getRaw();
		return RGBLed3;
	}
	public Color getColor() {
		return color;
	}
	
	
}
