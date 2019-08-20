package org.academiadecodigo.guessanumber;

import java.util.Random;

public class Randomizer {

    public static int intRandomRange(int startNumber, int finalNumber){

        return new Random().nextInt((finalNumber - startNumber) + 1) + startNumber;

    }
}
