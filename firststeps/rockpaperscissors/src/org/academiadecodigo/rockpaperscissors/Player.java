package org.academiadecodigo.rockpaperscissors;

public class Player {

    private String name;
    private int score;
    private Hand hand;

    public Player(String name){
        this.name = name;
        score = 0;
    }

    public void chooseHand(){
        hand = Hand.values()[(int) (Math.random() * Hand.values().length)];
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void win() { score++; }

    public Hand getHand() {
        return hand;
    }

}
