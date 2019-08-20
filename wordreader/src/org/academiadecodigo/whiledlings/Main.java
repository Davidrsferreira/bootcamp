package org.academiadecodigo.whiledlings;

public class Main {

    public static void main(String[] args) {

        WordReader wordReader = new WordReader("/Users/codecadet/Desktop/file.txt");

        for (String word : wordReader){
            System.out.print(word + " ");
        }
    }
}
