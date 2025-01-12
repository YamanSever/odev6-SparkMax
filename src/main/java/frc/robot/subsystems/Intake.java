package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    SparkMax Intakemotor;
    SparkMaxConfig motorConfig = new SparkMaxConfig();
    
    public Intake() {
        Intakemotor = new SparkMax(1, MotorType.kBrushless);
        
        motorConfig.inverted(true);
        motorConfig.smartCurrentLimit(30);
        motorConfig.idleMode(IdleMode.kBrake);
    }

    public void run(double speed) {
        Intakemotor.set(speed);
    }

}

