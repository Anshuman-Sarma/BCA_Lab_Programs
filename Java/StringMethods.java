// AnshumanSarma_WAP to demonstrate built-in String methods in Java


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello India";
        System.out.println("Original String: " + str);
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Replace 'India' with 'World': " + str.replace("India", "World"));
        System.out.println("To Lower Case: " + str.toLowerCase());
    }
}
