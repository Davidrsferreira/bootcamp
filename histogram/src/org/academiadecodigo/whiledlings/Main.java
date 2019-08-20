package org.academiadecodigo.whiledlings;

public class Main {

    public static final String STRING = "yes yes yes no no no ha ha ha ha test test teste";
    public static void main(String[] args) {

        Histogram histogram = new Histogram(STRING);

        for (String word : histogram){
            System.out.println("The word '" + word + "' appear " + histogram.get(word) + " times");
        }
    }
}
