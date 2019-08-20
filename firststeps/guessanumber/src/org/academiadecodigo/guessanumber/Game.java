package org.academiadecodigo.guessanumber;

public class Game {

    private int randomNumber;
    private int attempts = 0;
    private boolean incorrectNumber = true;

    public void start(int startNumber, int finalNumber, int numberOfPlayers){

        randomNumber = Randomizer.intRandomRange(startNumber, finalNumber);
        Player[] player = new Player[numberOfPlayers];

        for (int i = 0; i < player.length; i++){
            player[i] = new Player(startNumber, finalNumber);
        }

        while(incorrectNumber) {

            attempts++;

            for (int j = 0; j < player.length; j++) {

                player[j].pickNumber();

                if (player[j].getChosenNumber() == randomNumber) {

                    System.out.println("###################");
                    System.out.println("# CONGRATULATIONS #");
                    System.out.println("# Player " + j + " WIN!!! #");
                    System.out.println("###################");
                    System.out.println("Attempts: " + attempts);
                    incorrectNumber = false;
                    break;
                }
            }
        }
    }
}
