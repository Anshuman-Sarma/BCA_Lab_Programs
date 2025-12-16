// AnshumanSarma_WAP to find the youngest and oldest age from an array


import java.util.Scanner;

public class AgeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of family members: ");
        int n = scanner.nextInt();
        int[] ages = new int[n];

        System.out.println("Enter the ages of the family members:");
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt();
        }

        int youngest = ages[0];
        int eldest = ages[0];

        for (int age : ages) {
            if (age < youngest) {
                youngest = age;
            }
            if (age > eldest) {
                eldest = age;
            }
        }

        System.out.println("Youngest age: " + youngest);
        System.out.println("Eldest age: " + eldest);
    }
}
