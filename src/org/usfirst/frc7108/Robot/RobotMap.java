// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc7108.Robot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX driveTrainleftFrontTalon;
    public static WPI_TalonSRX driveTrainleftRearTalon;
    public static WPI_TalonSRX driveTrainrightFrontTalon;
    public static WPI_TalonSRX driveTrainrightRearTalon;
    public static RobotDrive driveTrainRobotDrive41;
    public static PWM RgbLedRed;
    public static PWM RgbLedGreen;
    public static PWM RgbLedBlue;

    public static SpeedController gripperKutuMotor1;
    public static SpeedController gripperKutuMotor2;
    
    public static WPI_TalonSRX lifterMotor1;
    public static WPI_TalonSRX lifterMotor2;
    
    public static Compressor compresor;
    public static DoubleSolenoid db;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftFrontTalon = new WPI_TalonSRX(11);
        driveTrainleftFrontTalon.setInverted(true);
        
        driveTrainleftRearTalon = new WPI_TalonSRX(13);
        driveTrainleftRearTalon.setInverted(true);
        
        driveTrainrightFrontTalon = new WPI_TalonSRX(15);
        driveTrainrightFrontTalon.setInverted(true);
        
        driveTrainrightRearTalon = new WPI_TalonSRX(14);
        driveTrainrightRearTalon.setInverted(true);
        
        gripperKutuMotor1 = new Spark(0);
        gripperKutuMotor2 = new Spark(2);
        
        RgbLedRed = new PWM(2);
        RgbLedRed.setRaw(255);
        RgbLedGreen = new PWM(3);
        RgbLedGreen.setRaw(255);
        RgbLedBlue = new PWM(4);
        RgbLedBlue.setRaw(255);
        
        gripperKutuMotor1.setInverted(false);
        gripperKutuMotor2.setInverted(false);
        
        lifterMotor1 = new WPI_TalonSRX(12);
        lifterMotor2 = new WPI_TalonSRX(16);
        
       
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainleftFrontTalon, driveTrainleftRearTalon,
              driveTrainrightFrontTalon, driveTrainrightRearTalon);
        
        driveTrainRobotDrive41.setSafetyEnabled(false);
        //driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);
        
       // compresor = new Compressor(2);
      //  db = new DoubleSolenoid(2,6,7);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
