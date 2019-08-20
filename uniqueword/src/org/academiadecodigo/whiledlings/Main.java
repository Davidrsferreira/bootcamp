package org.academiadecodigo.whiledlings;

public class Main {

    public static final String STRING = "David David Miguel Miguel Rafa Rafa Jorge Jorge";

    public static void main(String[] args) {

        UniqueWord uniqueWord = new UniqueWord(STRING);

        for (String word : uniqueWord) {
            System.out.println(word);
        }
    }
}
