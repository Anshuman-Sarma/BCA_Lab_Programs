//AnshumanSarma_WAP to read the content of a text file and find the number of vowels, consonants, special characters, and white space characters.


import java.io.*;

public class FileCharacterAnalysis {
    public static void main(String[] args) {
        String fileName = "source.txt";
        int vowels = 0, consonants = 0, specialChars = 0, whiteSpaces = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char ch : line.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        ch = Character.toLowerCase(ch);
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                            vowels++;
                        else
                            consonants++;
                    } else if (Character.isWhitespace(ch)) {
                        whiteSpaces++;
                    } else {
                        specialChars++;
                    }
                }
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Special Characters: " + specialChars);
            System.out.println("White Spaces: " + whiteSpaces);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}