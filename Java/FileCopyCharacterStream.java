//Anshuman_Sarma_DC2022BCA0002
//WAP to copy the content of a file to another file using character stream
import java.io.*;

public class FileCopyCharacterStream {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination_char_stream.txt";
        
        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {
            int charRead;
            while ((charRead = reader.read()) != -1) {
                writer.write(charRead);
            }
            System.out.println("File copied successfully using character stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}