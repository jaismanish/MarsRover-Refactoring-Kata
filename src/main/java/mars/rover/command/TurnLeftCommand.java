package mars.rover.command;

import mars.rover.Rover;

public class TurnLeftCommand implements Command{
    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
