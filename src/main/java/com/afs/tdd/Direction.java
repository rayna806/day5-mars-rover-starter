package com.afs.tdd;

public enum Direction {
    NORTH("N") {
        @Override
        public Direction turnLeft() {
            return WEST;
        }

        @Override
        public Direction turnRight() {
            return EAST;
        }

        @Override
        public Position moveForward(Position position) {
            return new Position(position.getX(), position.getY() + 1);
        }

        @Override
        public Position moveBackward(Position position) {
            return new Position(position.getX(), position.getY() - 1);
        }
    },
    SOUTH("S") {
        @Override
        public Direction turnLeft() {
            return EAST;
        }

        @Override
        public Direction turnRight() {
            return WEST;
        }

        @Override
        public Position moveForward(Position position) {
            return new Position(position.getX(), position.getY() - 1);
        }

        @Override
        public Position moveBackward(Position position) {
            return new Position(position.getX(), position.getY() + 1);
        }
    },
    EAST("E") {
        @Override
        public Direction turnLeft() {
            return NORTH;
        }

        @Override
        public Direction turnRight() {
            return SOUTH;
        }

        @Override
        public Position moveForward(Position position) {
            return new Position(position.getX() + 1, position.getY());
        }

        @Override
        public Position moveBackward(Position position) {
            return new Position(position.getX() - 1, position.getY());
        }
    },
    WEST("W") {
        @Override
        public Direction turnLeft() {
            return SOUTH;
        }

        @Override
        public Direction turnRight() {
            return NORTH;
        }

        @Override
        public Position moveForward(Position position) {
            return new Position(position.getX() - 1, position.getY());
        }

        @Override
        public Position moveBackward(Position position) {
            return new Position(position.getX() + 1, position.getY());
        }
    };

    private final String code;

    Direction(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Direction fromCode(String code) {
        for (Direction direction : values()) {
            if (direction.code.equals(code)) {
                return direction;
            }
        }
        throw new IllegalArgumentException("Invalid direction code: " + code);
    }

    public abstract Direction turnLeft();
    public abstract Direction turnRight();
    public abstract Position moveForward(Position position);
    public abstract Position moveBackward(Position position);

    @Override
    public String toString() {
        return code;
    }
}
