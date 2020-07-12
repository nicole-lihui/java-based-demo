package com.nicole.demo.socket.client;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class FileClient {
    Socket s = null;

    void connect(String host, int port) {
        try {
            s = new Socket(host, port);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void dFile(String dpath, String fname, int fileSize) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write(fname);
            bw.flush();
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String rfname = dis.readUTF();
            long flen = dis.readLong();
            System.out.printf("Filename: %s, length: %d", rfname, flen);

            File file = new File(dpath + fname);
            FileOutputStream fos = new FileOutputStream(file);

            byte[] bytes = new byte[fileSize];
            int length = 0;
            while((length = dis.read(bytes, 0, bytes.length)) != -1) {
                fos.write(bytes, 0, length);
                fos.flush();
            }

            fos.close();
            dis.close();
            s.close();

        } catch (IOException e) {
            //TODO: handle exception
        }

        try {
            System.out.println("Done...Going to exit");
            Thread.sleep(3000);
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileClient fc = new FileClient();
        File f = new File("/Users/nicole/tmp/text.txt");
        fc.connect("localhost" ,9000);
        fc.dFile("/Users/nicole/tmp1/", "text.txt", (int) f.length());
    }
}
