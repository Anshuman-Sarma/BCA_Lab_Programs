//AnshumanSarma_WAP for String manipulation and execute a example for each of the common methods available in String class and StringBuilder Class.

public class StringManipulationExample {

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("Hello, World!");

        // Common String methods
        stringManipulator.lengthExample();
        stringManipulator.charAtExample();
        stringManipulator.substringExample();
        stringManipulator.indexOfExample();
        stringManipulator.replaceExample();

        // Common StringBuilder methods
        stringManipulator.appendExample();
        stringManipulator.insertExample();
        stringManipulator.deleteExample();
        stringManipulator.reverseExample();
    }
}

class StringManipulator {
    private String str;
    private StringBuilder stringBuilder;

    public StringManipulator(String str) {
        this.str = str;
        this.stringBuilder = new StringBuilder(str);
    }

    // Common String methods
    public void lengthExample() {
        System.out.println("Length of the string: " + str.length());
    }

    public void charAtExample() {
        System.out.println("Character at index 4: " + str.charAt(4));
    }

    public void substringExample() {
        System.out.println("Substring from index 2 to 6: " + str.substring(2, 6));
    }

    public void indexOfExample() {
        System.out.println("Index of 'o': " + str.indexOf('o'));
    }

    public void replaceExample() {
        System.out.println("Replacing 'l' with 'z': " + str.replace('l', 'z'));
    }

    // Common StringBuilder methods
    public void appendExample() {
        System.out.println("Appending '!!!' to string: " + stringBuilder.append("!!!"));
    }

    public void insertExample() {
        System.out.println("Inserting 'Java' at index 7: " + stringBuilder.insert(7, "Java"));
    }

    public void deleteExample() {
        System.out.println("Deleting substring from index 2 to 5: " + stringBuilder.delete(2, 5));
    }

    public void reverseExample() {
        System.out.println("Reversed string: " + stringBuilder.reverse());
    }
}
