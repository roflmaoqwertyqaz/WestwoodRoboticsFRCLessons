// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleMotor;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** A command that runs a motor subsystem at the speed given by a joystick. */
public class TimedCommand extends CommandBase {

  private final ExampleMotor m_motor;
  private final Timer m_timer;

  /**
   * Creates a new TimedCommand.
   *
   * @param subsystem The motor subsystem used by this command.
   */
  public TimedCommand(ExampleMotor subsystem) {
    // Fill in constructor.
    // m_motor needs to be defined
    // m_timer needs to be defined
    // the subsystem requirements need to be set using addRequirements.

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() { 
    // reset and start timer, alternatively use the method restart()
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Set subsystem to run motor
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Set subsystem to stop motor
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // Change to check timer and see if enough time has elapsed (3 seconds)
    return false;
  }
}
