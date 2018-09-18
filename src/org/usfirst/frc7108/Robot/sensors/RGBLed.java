package org.usfirst.frc7108.Robot.sensors;


import java.awt.Color;
import edu.wpi.first.wpilibj.SendableBase;
import edu.wpi.first.wpilibj.PWM;

public class RGBLed {
	
	private Color color = Color.BLACK;
	public void getChannel() {
		
	}
	int r, g, b;
	
	
	
	public void setColor(int r, int g, int b) {
		
		setColor(255,0,0); //Red
		setColor(0,255,0); //Green
		setColor(0,0,255); //Blue
		
	}
	public void RGBLed () {
	 this.color.getRed();
	 this.color.getGreen();
	 this.color.getBlue();
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

}
