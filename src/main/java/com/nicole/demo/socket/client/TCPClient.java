package com.nicole.demo.socket.client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

    public static void main(String[] args) throws UnknownHostException, IOException {

        String req;
        String response;
        int port = 9001;
        Socket clientSocket = new Socket("127.0.0.1", port);

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        req = inFromUser.readLine();
        outToServer.writeBytes(req + '\n');

        response = inFromServer.readLine();
        System.out.println("FROM SERVER: " + response);

        clientSocket.close();
    }

}
