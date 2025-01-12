package frc.robot;

import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.subsystems.Intake;
import frc.robot.commands.intaking;

public class RobotContainer {
  PS5Controller ps5 = new PS5Controller(0);
  Intake Intakemotor = new Intake();


  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(ps5, 1).whileTrue(new intaking(Intakemotor, 0.5));
    new JoystickButton(ps5, 2).whileTrue(new intaking(Intakemotor, -0.35));

  }
  public Command getAutonomousCommand() {
    return null;  
  }
}
