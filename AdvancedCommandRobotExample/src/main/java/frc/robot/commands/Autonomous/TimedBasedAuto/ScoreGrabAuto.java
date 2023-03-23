package frc.robot.commands.Autonomous.TimedBasedAuto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.PathPlannerLoadEventMapCommand;
import frc.robot.commands.getEventMap;

public class ScoreGrabAuto extends SequentialCommandGroup {
  public ScoreGrabAuto() {
    addCommands(
        new PathPlannerLoadEventMapCommand("ScoreGrabBalance", getEventMap.ScoreGrab()).withTimeout(15));
  }
}
