package mars.rover;

public class Rover {
    private int x;
    private int y;
    private final int plateauUpperX;
    private final int plateauUpperY;
    private char direction;

    public Rover(int x, int y, char direction, int plateauUpperX, int plateauUpperY) {
        validateCoordinates(x, y, plateauUpperX, plateauUpperY);
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.plateauUpperX = plateauUpperX;
        this.plateauUpperY = plateauUpperY;
    }
    private void validateCoordinates(int x, int y, int plateauUpperX, int plateauUpperY) {
        if (x < 0 || x > plateauUpperX || y < 0 || y > plateauUpperY) {
            throw new IllegalArgumentException("Invalid coordinates for rover. Out of plateau boundaries.");
        }
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

    public void turnLeft() {
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

    public void turnRight() {
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

    public void moveForward() {
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
