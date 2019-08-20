package org.academiadecodigo.hotelsimulation;

public class Room {

    private boolean occupied;

    public void occupyRoom(){ occupied = true; }

    public void vacateRoom(){
        occupied = false;
    }

    public boolean isOccupied() { return occupied; }
}
