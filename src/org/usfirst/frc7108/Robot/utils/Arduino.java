package org.usfirst.frc7108.Robot.utils;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.SerialPort;

public class Arduino {
	
	public static SerialPort arduinoUSB =  new SerialPort(9600 ,SerialPort.Port.kUSB); // USB needs to be changed
	public static String receivedData;
	
	public void readFromArduino(int receivedDataCharCount) {
		arduinoUSB.flush();
		receivedData =  arduinoUSB.readString(receivedDataCharCount);
	}
	
	public void writeToArduino() {
		arduinoUSB.writeString("Hello from RoboRIO");
	}

}
