// AnshumanSarma_WAP to read multiple lines and count lines containing specific words


import java.util.Scanner;

public class ReadLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        int count = 0;

        System.out.println("Enter lines of text (type 'good bye' to stop):");

        while (!(line = scanner.nextLine()).equals("good bye")) {
            if (line.contains("India") || line.contains("Hello")) {
                System.out.println(line);
                count++;
            }
        }

        System.out.println("Number of lines containing 'India' or 'Hello': " + count);
    }
}
