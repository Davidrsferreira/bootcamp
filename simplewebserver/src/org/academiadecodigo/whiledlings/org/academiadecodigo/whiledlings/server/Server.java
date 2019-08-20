package org.academiadecodigo.whiledlings.org.academiadecodigo.whiledlings.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void start() {

        try {
            ServerSocket serverSocket = new ServerSocket(9090);

            while (true) {
                Socket socket = serverSocket.accept();
                Thread response = new Thread(new ResponseHandler(socket));
                System.out.println(response.getName());
                response.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}