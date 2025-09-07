package com.afs.tdd;

public enum Command {
    MOVE("M"),
    LEFT("L"),
    RIGHT("R");

    private final String code;

    Command(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Command fromCode(String code) {
        for (Command command : values()) {
            if (command.code.equals(code)) {
                return command;
            }
        }
        throw new IllegalArgumentException("Invalid command code: " + code);
    }

    @Override
    public String toString() {
        return code;
    }
}
