package mars.rover.command;

import mars.rover.Rover;
import mars.rover.command.Command;
import mars.rover.command.MoveForwardCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CommandTest {
    @Test
    void testExecuteShouldThrowException_ForInvalidRover() {
        Rover rover = null;
        Command moveCommand = new MoveForwardCommand();

        assertThrows(NullPointerException.class, () -> moveCommand.execute(rover));
    }

}
