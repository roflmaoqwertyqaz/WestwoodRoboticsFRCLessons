// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleMotor;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** A command that runs a motor subsystem at a given encoder velocity. */
public class PControllerCommand extends CommandBase {

  private final ExampleMotor m_motor;

  /**
   * Creates a new TimedCommand.
   *
   * @param subsystem The motor subsystem used by this command.
   */
  public PControllerCommand(ExampleMotor subsystem) {
    // Fill in constructor.
    // The subsystem requirements need to be set using addRequirements.
    m_motor = subsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() { 
    // enable closed loop control
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Set subsystem to enable closed loop control and run motor at target velocity
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_motor.enableClosedLoopControl(false);
    m_motor.setMotorSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
