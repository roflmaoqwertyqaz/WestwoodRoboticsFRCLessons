// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ExampleMotor extends SubsystemBase {
  CANSparkMax motor;
  PIDController p_cont_motor;
  boolean closed_loop_control;

  public ExampleMotor() {
    motor = new CANSparkMax(Constants.CanConstants.kMotorId, MotorType.kBrushless);

    //Activity 3 constructors
    p_cont_motor = new PIDController(
      Constants.ControllerConstants.kPMotor,
      Constants.ControllerConstants.kIMotor,
      0
    );
    closed_loop_control = false;
  }

  /**
   * Sets motor to specific speed.
   *
   * @param speed The motor speed, -1 for full reverse, 1 for full forward
   */
  public void setMotorSpeed(double speed) {
    if (speed < -1) {
      speed = -1;
    }
    else if (speed > 1) {
      speed = 1;
    }
    motor.set(speed);
  }

  /**
   * Gets motor encoder position.
   *
   * @return The measured position from the encoder
   */
  public double getEncoderPosition() {
    return motor.getEncoder().getPosition();
  }

  /**
   * Gets motor encoder velocity.
   *
   * @return The measured velocity from the encoder
   */
  public double getEncoderVelocity() {
    return motor.getEncoder().getVelocity();
  }

  /**
   * Sets if motor should be controlled by closed loop control.
   *
   * @param enabled True if the motor should be controlled by P controller, False if no closed loop control
   */
  public void enableClosedLoopControl(boolean enabled) {
    closed_loop_control = enabled;
  }

  /**
   * Sets the closed loop motor setpoint
   *
   * @param velocity The target velocity of the motor, in RPM
   */
  public void setClosedLoopMotorSpeed(double velocity) {
    // Set closed loop motor speed (Activity 3)
  }

  @Override
  public void periodic() {
    // Add SmartDashboard command to display encoder value. (Activity 1)

    // Uncomment and set closed loop command (Activity 3)
    // if(closed_loop_control) {
    // }
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
