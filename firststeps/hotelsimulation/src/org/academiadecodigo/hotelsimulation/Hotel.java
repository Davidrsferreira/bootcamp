package org.academiadecodigo.hotelsimulation;

public class Hotel {

    private Room[] rooms;
    private String name;

    public Hotel(String name, int numberOfRooms){

        this.name = name;
        rooms = new Room[numberOfRooms];
        createRooms(numberOfRooms);

    }

    public int checkIn(){

        for (int i = 0; i < rooms.length; i++){

            if (!rooms[i].isOccupied()){
               rooms[i].occupyRoom();
               return i;
            }
        }

        System.out.println("Sorry, we don't have bedrooms :(");
        return -1;
    }

    public void checkOut(int key){
        rooms[key].vacateRoom();
    }

    private void createRooms(int numberOfRooms){
        for (int i = 0; i < numberOfRooms; i++){
            rooms[i] = new Room();
        }
    }
}
