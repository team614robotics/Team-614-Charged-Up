package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.subsystems.TiltSubsystem;
public class Tilt extends CommandBase{
    public double tiltSpeed;
    public Tilt (double z) {
        addRequirements(RobotContainer.elevatorSubsystem);
        tiltSpeed = z;
    }
    @Override
  public void initialize() {
    
  }

  public void test(){

  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.elevatorSubsystem.set(tiltSpeed);
  }
  @Override
  public void end(boolean interrupted) {
    RobotContainer.elevatorSubsystem.set(Constants.STOP_MOTOR);
  }
  //gets returned true when the command ends
  @Override
  public boolean isFinished() {
    return false;
  }
}