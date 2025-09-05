package com.afs.tdd;

public class MarsRover {
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
    public int getY(){
        return y;
    }

    public void excuteCommand(String command) {
        if("M".equals(command)){
            if(direction.equals("N")){
                y++;
            }else if(direction.equals("S")){
                y--;
            }else if(direction.equals("E")){
                x++;
            }else{
                x--;
            }

}

    }


}
