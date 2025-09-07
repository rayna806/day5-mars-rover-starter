package com.afs.tdd;

public class MarsRover {
    private Position position;
    private Direction direction;

    public MarsRover(int x, int y, String direction) {
        this.position = new Position(x, y);
        this.direction = Direction.fromCode(direction);
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public void executeCommand(String command) {
        Command cmd = Command.fromCode(command);
        switch (cmd) {
            case MOVE:
                position = direction.move(position);
                break;
            case LEFT:
                direction = direction.turnLeft();
                break;
            case RIGHT:
                direction = direction.turnRight();
                break;
        }
    }

    @Override
    public String toString() {
        return position.toString() + " " + direction.toString();
    }
}
