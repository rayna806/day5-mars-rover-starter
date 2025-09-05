package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_y_plus_when_input_command_M_direction_N() {
        //Given
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals(1,marsRover.getY());
    }
    @Test
    public void should_return_y_minus_when_input_command_M_direction_S() {
        //Given
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals(-1,marsRover.getY());
    }
    @Test
    public void should_return_x_plus_when_input_command_M_direction_E() {
        //Given
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals(1,marsRover.getX());
    }
    @Test
    public void should_return_y_minus_when_input_command_M_direction_W() {
        //Given
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals(-1,marsRover.getX());
    }
    @Test
    public void should_return_direction_W_when_input_command_L_direction_N() {
        //Given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals("0 0 W",marsRover.toString());
    }
    @Test
    public void should_return_direction_N_when_input_command_L_direction_E() {
        //Given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals("0 0 N",marsRover.toString());
    }
    @Test
    public void should_return_direction_E_when_input_command_L_direction_S() {
        //Given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals("0 0 E",marsRover.toString());
    }
    @Test
    public void should_return_direction_S_when_input_command_L_direction_W() {
        //Given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals("0 0 S",marsRover.toString());
    }
    @Test
    public void should_return_direction_E_when_input_command_R_direction_N() {
        //Given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals("0 0 E",marsRover.toString());
    }
    @Test
    public void should_return_direction_S_when_input_command_R_direction_E() {
        //Given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals("0 0 S",marsRover.toString());
    }
    @Test
    public void should_return_direction_W_when_input_command_R_direction_S() {
        //Given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals("0 0 W",marsRover.toString());
    }
    @Test
    public void should_return_direction_N_when_input_command_R_direction_W() {
        //Given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //When
        marsRover.excuteCommand(command);
        //Then
        assertEquals("0 0 N",marsRover.toString());
    }
}
