package frc.robot.commands;

import frc.robot.subsystems.ExampleMotor;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class EncoderDistanceCommand extends CommandBase {
    private final ExampleMotor m_motor;
    private double startEncoderPosition;

    public EncoderDistanceCommand(ExampleMotor subsystem) {
        // Fill in constructor.
        // m_motor needs to be defined
        // m_timer needs to be defined
        // the subsystem requirements need to be set using addRequirements.
        m_motor = subsystem;
        startEncoderPosition = 0;
        addRequirements(m_motor);
    }
// Called when the command is initially scheduled.
@Override
public void initialize() { 
    startEncoderPosition = m_motor.getEncoderPosition();
  // reset and start timer, alternatively use the method restart()
}

// Called every time the scheduler runs while the command is scheduled.
@Override
public void execute() {
  // Set subsystem to run motor
  m_motor.setMotorSpeed(1);
}

// Called once the command ends or is interrupted.
@Override
public void end(boolean interrupted) {
  m_motor.setMotorSpeed(0);
  // Set subsystem to stop motor
}

// Returns true when the command should end.
@Override
public boolean isFinished() {
  // Change to check timer and see if enough time has elapsed (3 seconds)
  if (m_motor.getEncoderPosition() >= startEncoderPosition + 20) {
    return true;
  }

  return false;
}
}

    
}
