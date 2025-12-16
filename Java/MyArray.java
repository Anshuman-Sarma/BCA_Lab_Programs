// AnshumanSarma_WAP to perform operations on a 2D array using a user-defined class


import java.util.Scanner;

class MyArray {
    private int[][] a;
    private int r;
    private int c;

    public void initialise_a() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        r = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        c = scanner.nextInt();
        a = new int[r][c];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
    }

    public void display_a() {
        System.out.println("Array elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void findEle(int x) {
        boolean found = false;
        System.out.println("Indices of element " + x + ":");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == x) {
                    System.out.println("Row: " + i + ", Column: " + j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element " + x + " not found in the array.");
        }
    }

    public void replaceEle(int x, int y) {
        System.out.println("Replacing " + x + " with " + y + ":");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == x) {
                    a[i][j] = y;
                    System.out.println("Replaced at Row: " + i + ", Column: " + j);
                }
            }
        }
    }
}

 class TestMyArray {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.initialise_a();
        myArray.display_a();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to find: ");
        int findElement = scanner.nextInt();
        myArray.findEle(findElement);

        System.out.print("Enter the element to replace: ");
        int replaceElement = scanner.nextInt();
        System.out.print("Enter the new value: ");
        int newValue = scanner.nextInt();
        myArray.replaceEle(replaceElement, newValue);

        myArray.display_a();

        scanner.close();
    }
}
