package frc.robot.commands.Autonomous.TimedBasedAuto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.PathPlannerLoadEventMapCommand;
import frc.robot.commands.getEventMap;

public class TestAuto extends SequentialCommandGroup {
  public TestAuto() {
    addCommands(
        new PathPlannerLoadEventMapCommand("MoveForward", getEventMap.ScoreAutoBalanceBlue()).withTimeout(15));
  }
}