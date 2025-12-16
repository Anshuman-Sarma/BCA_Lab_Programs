// AnshumanSarma_WAP to demonstrate user-defined exception handling in Java


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeChecker {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18.");
        }
    }

    public static void main(String[] args) {
        try {
            int userAge = 16; // Example age, you can change this to test different cases
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}