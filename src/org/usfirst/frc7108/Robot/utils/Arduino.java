package org.usfirst.frc7108.Robot.utils;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.SerialPort;

public class Arduino {
	
	public static SerialPort arduinoUSB =  new SerialPort(9600 ,SerialPort.Port.kUSB); // USB needs to be changed
	public static String receivedData;
	DriverStation.Alliance Alliance = DriverStation.getInstance().getAlliance();
	
	
	
	public String readFromArduino(int receivedDataCharCount) {
		arduinoUSB.flush();
		receivedData =  arduinoUSB.readString(receivedDataCharCount);
		return receivedData;
	}
	
	public void writeToArduino(String message) {
		
		if (Alliance == DriverStation.Alliance.Blue) {
			arduinoUSB.writeString("c");
		}if (Alliance == DriverStation.Alliance.Red) {
			arduinoUSB.writeString("a");
		}
	}
		

}
