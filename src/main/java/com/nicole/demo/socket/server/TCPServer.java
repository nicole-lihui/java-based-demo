package com.nicole.demo.socket.server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServer {

    public static void main(String[] args) throws IOException {
        String req;
        String response;
        int port = 9001;
        ServerSocket socket = new ServerSocket(port);
        
        int i = 0;
        while (i < 5) {
            Socket connectionSocket = socket.accept();

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            req = inFromClient.readLine();

            response = req.toUpperCase() + '\n';
            outToClient.writeBytes(response);
            i++;
        }
        socket.close();
    
    }
}
