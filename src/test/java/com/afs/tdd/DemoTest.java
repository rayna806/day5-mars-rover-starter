package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_y_plus_when_input_command_M_direction_N() {
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.excuteCommand(command);
        assertEquals(1,marsRover.getY());
    }
    @Test
    public void should_return_y_minus_when_input_command_M_direction_S() {
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.excuteCommand(command);
        assertEquals(-1,marsRover.getY());
    }
    @Test
    public void should_return_x_plus_when_input_command_M_direction_E() {
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.excuteCommand(command);
        assertEquals(1,marsRover.getX());
    }
    @Test
    public void should_return_y_minus_when_input_command_M_direction_W() {
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.excuteCommand(command);
        assertEquals(-1,marsRover.getX());
    }
    @Test
    public void should_return_direction_W_when_input_command_L_direction_N() {
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.excuteCommand(command);
        assertEquals("0 0 W",marsRover.toString());
    }
    @Test
    public void should_return_direction_N_when_input_command_L_direction_E() {
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.excuteCommand(command);
        assertEquals("0 0 N",marsRover.toString());
    }
    @Test
    public void should_return_direction_E_when_input_command_L_direction_S() {
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.excuteCommand(command);
        assertEquals("0 0 E",marsRover.toString());
    }
    @Test
    public void should_return_direction_S_when_input_command_L_direction_W() {
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.excuteCommand(command);
        assertEquals("0 0 S",marsRover.toString());
    }

}
