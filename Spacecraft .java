import java.util.*;
public class Spacecraft {
    private int x, y, z;
    private char direction;

    public Spacecraft(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void moveForward() {
        if (direction == 'N') {
            y++;
        } else if (direction == 'S') {
            y--;
        } else if (direction == 'E') {
            x++;
        } else if (direction == 'W') {
            x--;
        } else if (direction == 'U') {
            z++;
        } else if (direction == 'D') {
            z--;
        }
    }

    public void moveBackward() {
        if (direction == 'N') {
            y--;
        } else if (direction == 'S') {
            y++;
        } else if (direction == 'E') {
            x--;
        } else if (direction == 'W') {
            x++;
        } else if (direction == 'U') {
            z--;
        } else if (direction == 'D') {
            z++;
        }
    }

    public void turnLeft() {
        if (direction == 'N') {
            direction = 'W';
        } else if (direction == 'W') {
            direction = 'S';
        } else if (direction == 'S') {
            direction = 'E';
        } else if (direction == 'E') {
            direction = 'N';
        }
    }

    public void turnRight() {
        if (direction == 'N') {
            direction = 'E';
        } else if (direction == 'E') {
            direction = 'S';
        } else if (direction == 'S') {
            direction = 'W';
        } else if (direction == 'W') {
            direction = 'N';
        }
    }

    public void turnUp() {
        if (direction == 'N') {
            direction = 'U';
        } else if (direction == 'U') {
            direction = 'S';
        } else if (direction == 'S') {
            direction = 'D';
        } else if (direction == 'D') {
            direction = 'N';
        }
    }

    public void turnDown() {
        if (direction == 'N') {
            direction = 'D';
        } else if (direction == 'D') {
            direction = 'S';
        } else if (direction == 'S') {
            direction = 'U';
        } else if (direction == 'U') {
            direction = 'N';
        }
    }

    public void executeCommands(char[] commands) {
        for (char command : commands) {
            executeCommand(command);
        }
    }

    private void executeCommand(char command) {
        if (command == 'f') {
            moveForward();
        } else if (command == 'b') {
            moveBackward();
        } else if (command == 'l') {
            turnLeft();
        } else if (command == 'r') {
            turnRight();
        } else if (command == 'u') {
            turnUp();
        } else if (command == 'd') {
            turnDown();
        }
    }

    public String getCurrentPosition() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public char getCurrentDirection() {
        return direction;
    }

    // Test
    public static void main(String[] args) {
        int startX = 0, startY = 0, startZ = 0;
        char initialDirection = 'N';
        char[] commands = { 'f', 'r', 'u', 'b', 'l' };

        Spacecraft chandrayaan3 = new Spacecraft(startX, startY, startZ, initialDirection);
        chandrayaan3.executeCommands(commands);

        System.out.println("Final Position: " + chandrayaan3.getCurrentPosition());
        System.out.println("Final Direction: " + chandrayaan3.getCurrentDirection());
    }
}

