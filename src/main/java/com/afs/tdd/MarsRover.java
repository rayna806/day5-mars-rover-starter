package com.afs.tdd;

public class MarsRover {
    public static final String Move = "M";
    public static final String Left = "L";
    public static final String Right = "R";
    public static final String North = "N";
    public static final String South = "S";
    public static final String East = "E";
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void executeCommand(String command) {
        if (Move.equals(command)) {
            switch (direction) {
                case North:
                    y++;
                    break;
                case South:
                    y--;
                    break;
                case East:
                    x++;
                    break;
                default:
                    x--;
                    break;
            }
        }
        if (Left.equals(command)) {
            switch (direction) {
                case North:
                    direction = "W";
                    break;
                case "W":
                    direction = South;
                    break;
                case South:
                    direction = East;
                    break;
                default:
                    direction = North;
                    break;
            }
        }
        else if (Right.equals(command)) {
            switch (direction) {
                case North:
                    direction = East;
                    break;
                case East:
                    direction = South;
                    break;
                case South:
                    direction = "W";
                    break;
                default:
                    direction = North;
                    break;
            }
        }

    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
}
