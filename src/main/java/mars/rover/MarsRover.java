package mars.rover;

public class MarsRover {
    private int x;
    private int y;
    private final int plateauUpperX;
    private final int plateauUpperY;
    private char direction;

    public MarsRover(int x, int y, char direction, int plateauUpperX, int plateauUpperY) {
        if(x > plateauUpperX || x < 0 || y > plateauUpperY || y < 0) {
            throw new IllegalArgumentException("Rover's coordinate can't be outside of plateau");
        }
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.plateauUpperX = plateauUpperX;
        this.plateauUpperY = plateauUpperY;
    }

    public void move(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'L') {
                turnLeft();
            } else if (instruction == 'R') {
                turnRight();
            } else if (instruction == 'M') {
                moveForward();
            }
        }
    }

    private void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    private void moveForward() {
        switch (direction) {
            case 'N':
                if (y < plateauUpperY) y++;
                break;
            case 'E':
                if (x < plateauUpperX) x++;
                break;
            case 'S':
                if (y > 0) y--;
                break;
            case 'W':
                if (x > 0) x--;
                break;
        }
    }

    public String getPosition() {
        return x + " " + y + " " + direction;
    }



}
