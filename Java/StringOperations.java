// AnshumanSarma_WAP to perform various string operations using user-defined methods


import java.util.Arrays;

public class StringOperations {

    private String inputString;

    public StringOperations(String inputString) {
        this.inputString = inputString;
    }

    public String[] splitByWhiteSpace() {
        return inputString.split("\\s+");
    }

    public String toUpperCase() {
        return inputString.toUpperCase();
    }

    public String toLowerCase() {
        return inputString.toLowerCase();
    }

    public String toProperCase() {
        StringBuilder properCaseString = new StringBuilder();
        String[] words = inputString.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                properCaseString.append(Character.toUpperCase(word.charAt(0)));
                properCaseString.append(word.substring(1).toLowerCase());
                properCaseString.append(" ");
            }
        }
        return properCaseString.toString().trim();
    }

    public static void main(String[] args) {
        StringOperations stringOps = new StringOperations("hello WORld   HOW are YOU?");
        System.out.println("Original String: " + stringOps.inputString);
        System.out.println("Split by whitespace: " + Arrays.toString(stringOps.splitByWhiteSpace()));
        System.out.println("Uppercase String: " + stringOps.toUpperCase());
        System.out.println("Lowercase String: " + stringOps.toLowerCase());
        System.out.println("Propercase String: " + stringOps.toProperCase());
    }
}
