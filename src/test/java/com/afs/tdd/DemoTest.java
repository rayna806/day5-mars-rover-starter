package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    public static final String Move = "M";
    public static final String North = "N";
    public static final String South = "S";
    public static final String East = "E";
    public static final String West = "W";


    @Test
    public void should_return_y_plus_when_input_command_M_direction_N() {
        //Given
        String command = Move;
        MarsRover marsRover = new MarsRover(0, 0, North);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals(1,marsRover.getY());
    }
    @Test
    public void should_return_y_minus_when_input_command_M_direction_S() {
        //Given
        String command = Move;
        MarsRover marsRover = new MarsRover(0, 0, South);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals(-1,marsRover.getY());
    }
    @Test
    public void should_return_x_plus_when_input_command_M_direction_E() {
        //Given
        String command = Move;
        MarsRover marsRover = new MarsRover(0, 0, East);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals(1,marsRover.getX());
    }
    @Test
    public void should_return_y_minus_when_input_command_M_direction_W() {
        //Given
        String command = Move;
        MarsRover marsRover = new MarsRover(0, 0, West);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals(-1,marsRover.getX());
    }
    @Test
    public void should_return_direction_W_when_input_command_L_direction_N() {
        //Given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, North);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals("0 0 W",marsRover.toString());
    }
    @Test
    public void should_return_direction_N_when_input_command_L_direction_E() {
        //Given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, East);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals("0 0 N",marsRover.toString());
    }
    @Test
    public void should_return_direction_E_when_input_command_L_direction_S() {
        //Given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, South);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals("0 0 E",marsRover.toString());
    }
    @Test
    public void should_return_direction_S_when_input_command_L_direction_W() {
        //Given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, West);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals("0 0 S",marsRover.toString());
    }
    @Test
    public void should_return_direction_E_when_input_command_R_direction_N() {
        //Given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, North);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals("0 0 E",marsRover.toString());
    }
    @Test
    public void should_return_direction_S_when_input_command_R_direction_E() {
        //Given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, East);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals("0 0 S",marsRover.toString());
    }
    @Test
    public void should_return_direction_W_when_input_command_R_direction_S() {
        //Given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, South);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals("0 0 W",marsRover.toString());
    }
    @Test
    public void should_return_direction_N_when_input_command_R_direction_W() {
        //Given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, West);
        //When
        marsRover.executeCommand(command);
        //Then
        assertEquals("0 0 N",marsRover.toString());
    }
}
