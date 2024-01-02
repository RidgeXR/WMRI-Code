// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.commands;
// import edu.wpi.first.wpilibj.Timer;
// import edu.wpi.first.wpilibj2.command.CommandBase;
// //import frc.robot.Robot;
// import frc.robot.RobotContainer;
// import frc.robot.subsystems.Arm;
// import frc.robot.subsystems.DriveSubsystem;
// //import frc.robot.subsystems.Arm;
// import frc.robot.subsystems.Intake;

// public class AutonomousC extends CommandBase {
//   Intake intake;
//   Timer timer;
//   DriveSubsystem m_robotDrive;
//   /** Creates a new AutonomousC. */
//   public AutonomousC(Intake IT, DriveSubsystem DS) {
//     intake = IT;
//     m_robotDrive = DS;
//     addRequirements(intake);
//     timer = new Timer();
//     addRequirements(m_robotDrive);
//     // Use addRequirements() here to declare subsystem dependencies.
//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {
//     timer.reset();
//   }

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {
//     timer.start();
//     if(timer.get() < 4.09) {
//       intake.idle(.15);
//     } if(timer.get() < 1.6) {
//       RobotContainer.m_robotDrive.drive(0, 0, .34, true, true);
//     } if(timer.get() > 1.6 & timer.get()  < 3.65) {
//       RobotContainer.m_robotDrive.drive(0, 0, 0, true, true);
//     } if(timer.get() > 2.1 & timer.get() < 2.6) {
//       Arm.pid.setSetpoint(0.28);
//     } if(timer.get() > 3.65 & timer.get() < 4) {
//       RobotContainer.m_robotDrive.drive(.35, 0, 0, false, true);
//     } if(timer.get() > 4.1 & timer.get() < 5.89) {
//       RobotContainer.m_robotDrive.drive(0, 0, 0, true, true);
//     } if(timer.get() > 4.1 & timer.get() < 4.3) {
//       intake.dropObject(-.3);
//     } if (timer.get() > 4.3) {
//       intake.stop();
//     } if(timer.get() > 5.9 & timer.get() < 6.2) {
//       RobotContainer.m_robotDrive.drive(-.35, 0, 0, false, true);
//     } if (timer.get() > 6.3) {
//       Arm.pid.setSetpoint(0);
//     } if (timer.get() > 6.3 & timer.get() < 9) {
//       RobotContainer.m_robotDrive.drive(-.35, 0, 0, false, true);
//     } if(timer.get() > 9) {
//       RobotContainer.m_robotDrive.drive(0, 0, 0, true, true);
//     }
//     else {
//     }
//   }
//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {
//    intake.stop();
//   }

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return false;
//   }
// }
