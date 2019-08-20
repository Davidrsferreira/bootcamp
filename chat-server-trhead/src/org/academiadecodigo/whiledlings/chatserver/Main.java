package org.academiadecodigo.whiledlings.chatserver;

import org.academiadecodigo.whiledlings.chatserver.server.Server;

public class Main {

    public static void main(String[] args) {

        Server server = new Server();
        server.start();
    }
}
