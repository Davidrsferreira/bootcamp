package org.academiadecodigo.whiledlings.chatserver.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    private ArrayList<Socket> sockets;

    public void start() {

        try {

            ServerSocket serverSocket = new ServerSocket(9090);

            while (true) {

                Socket socket = serverSocket.accept();
                sockets.add(socket);
                Thread response = new Thread(new RequestHandler(socket, this));
                response.start();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Socket> getSockets() {
        return sockets;
    }
}
