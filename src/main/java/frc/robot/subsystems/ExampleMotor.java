// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ExampleMotor extends SubsystemBase {
  CANSparkMax motor;
  public ExampleMotor() {
    motor = new CANSparkMax(Constants.CanConstants.kMotorId, MotorType.kBrushless);
  }

  /**
   * Sets motor to specific speed.
   *
   * @param speed The motor speed, -1 for full reverse, 1 for full forward
   */
  public void setMotorSpeed(double speed) {
    // Implement motor logic here
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    // No periodic tasks for this subsystem
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
