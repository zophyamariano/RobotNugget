// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants;





public class Feeder extends SubsystemBase {
  /** Creates a new Feeder. */

private TalonFX HoneyMotor;
private TalonFX MustardMotor;

  public Feeder() {

  HoneyMotor = new TalonFX(Constants.FeederConstants.kHoneyMotor);
  MustardMotor = new TalonFX(Constants.FeederConstants.kMustardMotor);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
