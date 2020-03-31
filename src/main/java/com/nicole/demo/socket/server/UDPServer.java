package com.nicole.demo.socket.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

    public static void main(String[] args) {
        int port = 9002;
        DatagramSocket socket = null;
        DatagramPacket receive = null;

        try {
            socket = new DatagramSocket(port);

            System.out.println("UDP Server is Starting...");

            byte[] b = new byte[1024];

            int i = 0;
            while (i < 5) {
                receive = new DatagramPacket(b, b.length);

                try {
                    socket.receive(receive);
                    byte[] data = receive.getData();
                    int len = data.length;
                    System.out.println("Client (" + receive.getAddress() + " --- "
                            + receive.getPort() + ") : " + new String(data, 0, len));

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    i++;
                }
            }
            socket.close();

        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
