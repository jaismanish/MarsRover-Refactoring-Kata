package mars.rover.command;

import mars.rover.Rover;

public interface Command {
    void execute(Rover rover);

}
