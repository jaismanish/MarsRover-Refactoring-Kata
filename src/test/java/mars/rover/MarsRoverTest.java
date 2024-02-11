package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {

    @Test
    public void testRoverPositionShouldBeInsidePlateau() {
        assertThrows(IllegalArgumentException.class, () -> new MarsRover(0, 6, 'N', 5, 5));
    }



    @Test
    public void
    testMovingRoverWithValidCoordinates1() {
        MarsRover rover = new MarsRover(1,2,'N', 5,5);
        rover.move( "LMLMLMLMM");
        assertEquals("1 3 N", rover.getPosition());
    }

    @Test
    public void
    testMovingRoverWithValidCoordinates2() {
        MarsRover rover = new MarsRover(3,3,'E', 5,5);
        rover.move("MMRMMRMRRM");
        assertEquals("5 1 E", rover.getPosition());
    }

}