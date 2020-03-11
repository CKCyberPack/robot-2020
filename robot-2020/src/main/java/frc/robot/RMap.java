/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public class RMap 
{

// Drive Train
static int CANLeftFrontMotor = 0;
static int CANRightFrontMotor = 1;
static int CANLeftBackMotor = 2;
static int CANRightBackMotor = 3;

// Other Subsystem Motors
static int CANFerrisWheelMotor = 4;
static int CANShooterMotorA = 5;
static int CANShooterMotorB = 6;

// Final Variables
static final double driveTrainDeadzone = 0.04;
static final double driveTrainMax = 0.8;
static final double gyroStraightKp = 0.065;
static final double maxSpeedIncrease = 0.03;
static final double maxSpeedDecrease = 0.08;

// DIO
static int screwSens = 0;
static int ballSens = 1;

}
