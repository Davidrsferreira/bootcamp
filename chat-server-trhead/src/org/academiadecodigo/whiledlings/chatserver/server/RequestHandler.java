package org.academiadecodigo.whiledlings.chatserver.server;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class RequestHandler implements Runnable{

    private Server server;
    private Socket socket;

    public RequestHandler(Socket socket, Server server) {
        this.socket = socket;
        this.server = server;
    }

    @Override
    public void run() {

        byte[] buffer = new byte[1024];
        BufferedInputStream in;
        BufferedOutputStream bWriter;
        //Scanner scanner = new Scanner(System.in);
        int read;

        try {

            in = new BufferedInputStream(socket.getInputStream());

            read = in.read(buffer);
            //System.out.println("Client: " + new String(buffer, 0, read));

            for (Socket socket : server.getSockets()) {

                bWriter = new BufferedOutputStream(socket.getOutputStream());

                //System.out.println("Server: ");
                bWriter.write(buffer);

                bWriter.flush();
                bWriter.close();
                socket.close();

            }

            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
