// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleMotor;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** A command that runs a motor subsystem at the speed given by a joystick. */
public class JoystickMotorCommand extends CommandBase {
  private final ExampleMotor m_motor;
  private final XboxController m_controller;

  /**
   * Creates a new JoystickMotorCommand.
   *
   * @param subsystem The motor subsystem used by this command.
   * @param controller The controller used by this command.
   */
  public JoystickMotorCommand(ExampleMotor subsystem, XboxController controller) {
    m_motor = subsystem;
    m_controller = controller;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() { }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_motor.setMotorSpeed(m_controller.getLeftX());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_motor.setMotorSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
