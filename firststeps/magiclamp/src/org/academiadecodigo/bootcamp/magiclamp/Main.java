package org.academiadecodigo.bootcamp.magiclamp;

public class Main {

    public static void main(String[] args) {

        Lamp lamp = new Lamp(2);

        lamp.rubLamp();
        lamp.rubLamp();
        lamp.rubLamp();
        lamp.recicleLamp(lamp.getDemon());
        lamp.rubLamp();
        lamp.rubLamp();
        lamp.rubLamp();
        lamp.recicleLamp(lamp.getDemon());
    }
}
