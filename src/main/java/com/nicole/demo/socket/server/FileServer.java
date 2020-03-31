package com.nicole.demo.socket.server;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * FileServer
 */
public class FileServer {

    public void sendfile(int port) {
        try {
            ServerSocket ss = new ServerSocket(port);
            Socket socket = ss.accept();
            System.out.println("Client : " + socket.getInetAddress().getHostAddress() + " has connectd the server");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String fname = br.readLine();

            File f = new File("/Users/nicole/tmp/" + fname);
            if (f.exists()) {
                byte[] bt = new byte[(int) f.length()];
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
                bis.read(bt, 0, bt.length);
                OutputStream os = socket.getOutputStream();
                os.write(bt, 0, bt.length);
                os.flush();

                System.out.println("Send File Done...");
                bis.close();
                socket.close();
                ss.close();
            } else {
                System.out.println("File not exsits");
            }
            
        } catch (IOException e) {
            //TODO: handle exception
        }

    }

    public static void main(String[] args) throws IOException {
        FileServer fs = new FileServer();
        fs.sendfile(8888);
    }
}
