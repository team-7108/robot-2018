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

import org.usfirst.frc7108.Robot.commands.Autonomous;
import org.usfirst.frc7108.Robot.sensors.Ultrasonic;
import org.usfirst.frc7108.Robot.sensors.mpuGyro;
import org.usfirst.frc7108.Robot.subsystems.CLifter;
import org.usfirst.frc7108.Robot.subsystems.Gripper;
import org.usfirst.frc7108.Robot.subsystems.Pneumatic;
import org.usfirst.frc7108.Robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc7108.Robot.commands.LeftScaleFromLeftStart;
import org.usfirst.frc7108.Robot.commands.LeftScaleFromRightStart;
import org.usfirst.frc7108.Robot.commands.LeftSwitchFromLeftStart;
import org.usfirst.frc7108.Robot.commands.LeftSwitchFromMiddleStart;
import org.usfirst.frc7108.Robot.commands.RightScaleFromLeftStart;
import org.usfirst.frc7108.Robot.commands.RightScaleFromRightStart;
import org.usfirst.frc7108.Robot.commands.RightSwitchFromMiddleStart;
import org.usfirst.frc7108.Robot.commands.RightSwitchFromRightStart;
import org.usfirst.frc7108.Robot.sensors.UltrasonicFilter;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in 
 * the project.
 */
public class Robot extends TimedRobot 
	{
	
	Autonomous autoCG;
	SendableChooser autoChooser;
    SendableChooser<Command> chooser = new SendableChooser<>();
    
    public static DigitalInput limitswitch = new DigitalInput(0);
    
    public static Counter counter = new Counter(limitswitch);
    
    public static OI oi;
    public static DriveTrain driveTrain;
    public static Gripper gripper;
    public static CLifter clifter;
    public static Timer timer;
    public static AnalogInput UAna;
    public static AnalogInput UAna2;
    public static int lastAnalogValue;
    public static BuiltInAccelerometer accel;
    public static Pneumatic pnomatik;
	public static double xDeger;
	public static double yDeger;
	public static double zDeger;
	public static mpuGyro gyro;
    public static int lastAnalogValue2;
	public static UltrasonicFilter ultrasonicfilter;
	public static Ultrasonic ultrasonic;
	public static NetworkTable table;
	public static double x,y;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() 
    {
        RobotMap.init();
        driveTrain = new DriveTrain();
        gripper = new Gripper();
        clifter = new CLifter();
        timer = new Timer();
        UAna = new AnalogInput(0);
        UAna2 = new AnalogInput(1);
        accel = new BuiltInAccelerometer();
        gyro = new mpuGyro();
        pnomatik = new Pneumatic();
        ultrasonic = new Ultrasonic();
        ultrasonicfilter = new UltrasonicFilter();
        CameraServer.getInstance().startAutomaticCapture();
        table = NetworkTable.getTable("datatable");
        
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        
        oi = new OI();
        autoCG = new Autonomous();
        SmartDashboard.putData("Auto mode", chooser);
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit(){

    }
    
    /**
     * This function is called periodically when the robot is disabled.
     */
    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * This function is called once when the autonomous phase starts.
     */
    @Override
    public void autonomousInit() 
    {
		Scheduler.getInstance().removeAll();
		gyro.zeroGyro();
		String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		int station = DriverStation.getInstance().getLocation();

		switch (station)  {
		// Left
	        case 1:
	        	switch (gameData.substring(0, 2)) {
	        	case "LR":
	        		autoCG.addSequential(new LeftSwitchFromLeftStart());
	        		break;
	        	case "RL":
	        		autoCG.addSequential(new LeftScaleFromLeftStart());
	        		break;
	        	case "LL":
	        		autoCG.addSequential(new LeftScaleFromLeftStart());
	        		break;
	        	case "RR":
	        		autoCG.addSequential(new RightScaleFromLeftStart());
	        		break;
	        	}
	        	break;
	        	
        	// Mid
	        case 2:
	        	switch (gameData.substring(0, 2)) {
	        	case "LR":
	        		autoCG.addSequential(new LeftSwitchFromMiddleStart());
	        		break;
	        	case "RL":
	        		autoCG.addSequential(new RightSwitchFromMiddleStart());
	        		break;
	        	case "LL":
	        		autoCG.addSequential(new LeftSwitchFromMiddleStart());
	        		break;
	        	case "RR":
	        		autoCG.addSequential(new RightSwitchFromMiddleStart());
	        		break;
	        	}
	        	break;
	        // Right
	        case 3:
	        	switch (gameData.substring(0, 2)) {
	        	case "LR":
	        		autoCG.addSequential(new RightScaleFromRightStart());
	        		break;
	        	case "RL":
	        		autoCG.addSequential(new RightSwitchFromRightStart());
	        		break;
	        	case "LL":
	        		autoCG.addSequential(new LeftScaleFromRightStart());
	        		break;
	        	case "RR":
	        		autoCG.addSequential(new RightScaleFromRightStart());
	        		break;
	        	}
	        	break;
	        }
		autoCG.start();
 }
    @Override
    public void autonomousPeriodic() 
    {
        Scheduler.getInstance().run();
         ultrasonic.ultrasonic1();
        
    }
    
    /**
     * This function is called once when the teleoperator phase starts.
     */
    @Override
    public void teleopInit() 
    {
    	gyro.zeroGyro();
        
    	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
           	
    }

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        /*
        System.out.print("Without smoothing  :   ");
        System.out.println(ultrasonic.ultrasonic1());
        System.out.println("With smoothing  :   " + ultrasonicfilter.getSmoothVal());
        */
	    gyro.updateGyro();
        double yawAngle = gyro.getAngle();
        System.out.println(yawAngle);
        table.putNumber("X",x);
        x += 1;
        y = table.getNumber("Y", 0.0);
        
        //This is the code to read the limit switch and react to it.
        if(counter.get()!=0) {
        	boolean limitSwitchStatus = true;
        	table.putBoolean("Limit Switch Status", limitSwitchStatus);
        	counter.reset();
        }else {
        	boolean limitSwitchStatus = false;
        	table.putBoolean("Limit Switch Status", limitSwitchStatus);
        	counter.reset();
        	
         	int ult1 = (int) Ultrasonic.ultrasonic1();
        	int ult2 = (int) Ultrasonic.ultrasonic2();
        	
        	table.putNumber("Ult. Sensor No.1 Cal. Distance", ult1);	        	
            table.putNumber("Ult. Sensor No.2 Cal. Distance", ult2);

    }
    
  }
}