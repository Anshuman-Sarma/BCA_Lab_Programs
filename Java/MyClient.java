// AnshumanSarma_WAP to implement a TCP client using Java socket programming


import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 6666)) {
            System.out.println("Connected to the server.");

            try (DataOutputStream dout = new DataOutputStream(s.getOutputStream())) {
                dout.writeUTF("Hello Server");
                dout.flush();
                System.out.println("Message sent to the server: Hello Server");
            }

        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
