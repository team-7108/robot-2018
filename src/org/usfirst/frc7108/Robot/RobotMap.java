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
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX sasesolOnTalon;
    public static WPI_TalonSRX sasesolArkaTalon;
    public static WPI_TalonSRX sasesagOnTalon;
    public static WPI_TalonSRX sasesagArkaTalon;
    public static RobotDrive saseRobotDrive41;

    
    public static SpeedController grabberKutuMotor1;
    public static SpeedController grabberKutuMotor2;
    
    public static WPI_TalonSRX lifterMotor1;
    public static WPI_TalonSRX lifterMotor2;
    
    public static Compressor compresor;
    public static DoubleSolenoid db;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        sasesolOnTalon = new WPI_TalonSRX(11);
        sasesolOnTalon.setInverted(false);
        
        sasesolArkaTalon = new WPI_TalonSRX(12);
        sasesolArkaTalon.setInverted(false);
        
        sasesagOnTalon = new WPI_TalonSRX(15);
        sasesagOnTalon.setInverted(true);
        
        sasesagArkaTalon = new WPI_TalonSRX(16);
        sasesagArkaTalon.setInverted(true);
        
        grabberKutuMotor1 = new Spark(0);
        grabberKutuMotor2 = new Spark(2);
        
        grabberKutuMotor1.setInverted(false);
        grabberKutuMotor2.setInverted(false);
        
        lifterMotor1 = new WPI_TalonSRX(13);
        lifterMotor2 = new WPI_TalonSRX(14);
        
       
        
        saseRobotDrive41 = new RobotDrive(sasesolOnTalon, sasesolArkaTalon,
              sasesagOnTalon, sasesagArkaTalon);
        
        saseRobotDrive41.setSafetyEnabled(false);
        //saseRobotDrive41.setExpiration(0.1);
        saseRobotDrive41.setSensitivity(0.5);
        saseRobotDrive41.setMaxOutput(1.0);
        
       // compresor = new Compressor(2);
      //  db = new DoubleSolenoid(2,6,7);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
