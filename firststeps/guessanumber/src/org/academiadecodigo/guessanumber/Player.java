package org.academiadecodigo.guessanumber;

public class Player {

    private int chosenNumber;
    private int startNumber;
    private int finalNumber;

    public Player(int startNumber, int finalNumber){

        this.startNumber = startNumber;
        this.finalNumber = finalNumber;

    }

    public void pickNumber(){

        chosenNumber = Randomizer.intRandomRange(startNumber, finalNumber);


    }

    public int getChosenNumber() {

        return chosenNumber;

    }

}
