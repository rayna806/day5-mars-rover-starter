package com.afs.tdd;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        Position position = (Position) obj;
        return x == position.x && y == position.y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
