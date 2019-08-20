package org.academiadecodigo.whiledlings;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Connection connection = new Connection("https://www.google.com");
        connection.connect();
        connection.viewContent();
    }
}
