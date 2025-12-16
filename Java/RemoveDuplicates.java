// AnshumanSarma_WAP to remove duplicate elements from an array using HashSet


import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            uniqueNumbers.add(arr[i]);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}
