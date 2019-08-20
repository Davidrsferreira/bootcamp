package org.academiadecodigo.whiledlings.hostnameResolver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {

    public static void main(String[] args) throws IOException {

        byte[] sendBuffer = "To uppercase".getBytes();
        byte[] recvBuffer = new byte[sendBuffer.length];

        DatagramSocket socket = new DatagramSocket(8081);

        System.out.println("Sending text");
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName("localhost"), 8080);
        socket.send(sendPacket);

        DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
        socket.receive(receivePacket);

        System.out.println("Result: " + new String(recvBuffer, "UTF-8"));

        socket.close();
    }
}
