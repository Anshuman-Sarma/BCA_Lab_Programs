//AnshumanSarma_WAP to copy the content of a file to another file using byte stream.


import java.io.*;

public class FileCopyByteStream {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination_byte_stream.txt";
        
        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
            System.out.println("File copied successfully using byte stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}