// AnshumanSarma_WAP to perform matrix operations using a class and menu-driven program


import java.util.Scanner;

class MyMatrix {
    private int[][][] matrices;
    private int rows;
    private int columns;

    public MyMatrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrices = new int[3][rows][columns];
    }

    public void inputMatrices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for 3 matrices:");
        for (int k = 0; k < 3; k++) {
            System.out.println("Matrix " + (k + 1) + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrices[k][i][j] = scanner.nextInt();
                }
            }
        }
    }

    public void displayMatrices() {
        for (int k = 0; k < 3; k++) {
            System.out.println("Matrix " + (k + 1) + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrices[k][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void addMatrices() {
        System.out.println("Addition of Matrix 1 and Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrices[0][i][j] + matrices[1][i][j] + " ");
            }
            System.out.println();
        }
    }

    public void subtractMatrices() {
        System.out.println("Subtraction of Matrix 1 from Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrices[1][i][j] - matrices[0][i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiplyMatrices() {
        System.out.println("Multiplication of Matrix 1 and Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int sum = 0;
                for (int k = 0; k < columns; k++) {
                    sum += matrices[0][i][k] * matrices[1][k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}

class TestMyMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        MyMatrix myMatrix = new MyMatrix(rows, columns);

        myMatrix.inputMatrices();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Matrices");
            System.out.println("2. Add Matrices");
            System.out.println("3. Subtract Matrices");
            System.out.println("4. Multiply Matrices");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myMatrix.displayMatrices();
                    break;
                case 2:
                    myMatrix.addMatrices();
                    break;
                case 3:
                    myMatrix.subtractMatrices();
                    break;
                case 4:
                    myMatrix.multiplyMatrices();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}