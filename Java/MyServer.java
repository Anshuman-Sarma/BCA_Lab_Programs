// AnshumanSarma_WAP to implement a TCP server using Java socket programming


import java.io.*;
import java.net.*;

public class MyServer 
{
    public static void main(String[] args) 
    {
        try (ServerSocket ss = new ServerSocket(6666)) 
        {
            System.out.println("Server is waiting for a client...");
            Socket s = ss.accept();
            System.out.println("Client connected.");

            try (DataInputStream dis = new DataInputStream(s.getInputStream())) 
            {
                String str = dis.readUTF();
                System.out.println("Message received: " + str);
            }

            s.close();  // Closing the client socket after use
        } catch (IOException e) 
        {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
