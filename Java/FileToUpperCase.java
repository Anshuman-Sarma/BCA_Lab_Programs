//Anshuman_Sarma_WAP to read the content of a text file and print all the text after converting to upper case


import java.io.*;

public class FileToUpperCase {
    public static void main(String[] args) {
        String fileName = "source.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}