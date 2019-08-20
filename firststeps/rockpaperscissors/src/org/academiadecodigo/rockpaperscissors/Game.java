package org.academiadecodigo.rockpaperscissors;

public class Game {

    private boolean haveWinner;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(){

        printLine();

        for (int i = 0; i < 3; i++){

            System.out.println("Round " + (i + 1));
            haveWinner = true;

            while (haveWinner){

                player1.chooseHand();
                player2.chooseHand();

                if (player1.getHand() != player2.getHand()){

                    haveWinner = false;
                    getWinner(player1, player2);
                }
            }

            printLine();

        }

        if (player1.getScore() > player2.getScore()){
            printEndGame();
            printRoundWinner(player1);
            return;
        }

        printEndGame();
        printRoundWinner(player2);
    }

    private void getWinner(Player player1, Player player2){

        switch (player1.getHand()){

            case ROCK:
                if (player2.getHand() == Hand.PAPER){
                    player2.win();
                    printWinner(player2);
                    break;
                }
                    player1.win();
                    printWinner(player1);
                    break;

            case PAPER:
                if (player2.getHand() == Hand.SCISSORS){
                    player2.win();
                    printWinner(player2);
                    break;
                }
                    player1.win();
                    printWinner(player1);
                    break;

            case SCISSORS:
                if (player2.getHand() == Hand.ROCK){
                    player2.win();
                    printWinner(player2);
                    break;
                }
                    player1.win();
                    printWinner(player1);
                    break;
        }
    }

    private void printEndGame(){
        printLine();
        System.out.println("        END GAME");
    }

    private void printWinner(Player player){
        System.out.println(player1.getName() + " hand: " + player1.getHand());
        System.out.println(player2.getName() + " hand: " + player2.getHand());
        System.out.println(player.getName() + " Win");
    }

    private void printLine() {
        System.out.println("#######################");
    }

    private void printRoundWinner(Player winner) {
        System.out.println("      " + winner.getName() + " WIN");
        printLine();
    }
}
