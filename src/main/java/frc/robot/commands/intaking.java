package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;

public class intaking extends Command {
  double m_intake_speed; 
  Intake m_intake_motor;

  public intaking(Intake intake_motor, double intake_speed) {
    this.m_intake_speed = intake_speed;
    this.m_intake_motor = intake_motor;

    addRequirements(m_intake_motor);
  }

  @Override
  public void initialize() {}
  
  @Override
  public void execute() {
    m_intake_motor.run(m_intake_speed);
  }

  @Override
  public void end(boolean interrupted) {
    m_intake_motor.run(0); 
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}