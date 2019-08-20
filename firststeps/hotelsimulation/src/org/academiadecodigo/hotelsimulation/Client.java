package org.academiadecodigo.hotelsimulation;

public class Client {

    private String name;
    private int key;
    private Hotel hotel;

    public Client(String name){ this.name = name; }

    public void checkIn(){
        if (hotel != null){
            key = hotel.checkIn();
        }
    }

    public void checkOut(){
        if (key != -1) {
            hotel.checkOut(key);
            key = -1;
        }
    }

    public String getName() { return name; }

    public int getKey() { return key; }

    public void setHotel(Hotel hotel) { this.hotel = hotel; }
}
