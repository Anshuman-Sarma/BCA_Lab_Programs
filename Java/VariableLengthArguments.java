// AnshumanSarma_WAP to demonstrate variable length arguments (varargs) in Java


public class VariableLengthArguments {
    public static void main(String[] args) {
        displayNumbers(1, 2, 3, 4, 5);
        displayNumbers(10, 20);
        displayNumbers(); // Passing no arguments is also valid
    }

    public static void displayNumbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}