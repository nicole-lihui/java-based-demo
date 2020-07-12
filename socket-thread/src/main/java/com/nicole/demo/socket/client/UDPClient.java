package com.nicole.demo.socket.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {

    public static void main(String[] args) {
        int port = 9002;
        DatagramSocket socket = null;
        DatagramPacket send = null;
        InetAddress ia = null;
        try {
            ia = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            socket = new DatagramSocket();
            for (int i = 0; i < 5; i++) {
                byte[] data = ("I'm Client number " + i).getBytes();
                send = new DatagramPacket(data, data.length, ia, port);
                socket.send(send);
                Thread.sleep(1000);
            }

        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
