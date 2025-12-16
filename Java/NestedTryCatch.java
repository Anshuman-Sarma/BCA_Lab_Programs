// AnshumanSarma_WAP to demonstrate nested try-catch blocks in Java


public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}