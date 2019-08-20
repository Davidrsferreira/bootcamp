package org.academiadecodigo.whiledlings.hostnameResolver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receiver {

    public static void main(String[] args) throws IOException {

        byte[] recvBuffer = new byte[1024];
        byte[] sendBuffer;

        DatagramSocket socket = new DatagramSocket(8080);

        DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);

        socket.receive(receivePacket);

        String text = new String(recvBuffer, 0, receivePacket.getLength());
        System.out.println("Processing text " + text);
        text = text.toUpperCase();
        System.out.println("Sending text " + text);

        sendBuffer = text.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length,
                InetAddress.getByName("localhost"), 8081);
        socket.send(sendPacket);

        socket.close();

    }
}
