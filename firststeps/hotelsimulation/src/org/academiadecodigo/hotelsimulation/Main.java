package org.academiadecodigo.hotelsimulation;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel("Pensao dos Manos", 10);
        Client client = new Client("David Ferreira");
        client.setHotel(hotel);

        Client client2 = new Client("Rui");
        client2.setHotel(hotel);

        Client client3 = new Client("Faustino");
        client3.setHotel(hotel);

        Client client4 = new Client("Seringas");
        client4.setHotel(hotel);

        client.checkIn();
        System.out.println("Bedroom number: " + client.getKey());
        client2.checkIn();
        System.out.println("Bedroom number: " + client2.getKey());
        client3.checkIn();
        System.out.println("Bedroom number: " + client3.getKey());

        client2.checkOut();

        client4.checkIn();
        System.out.println("Bedroom number: " + client4.getKey());
    }
}
