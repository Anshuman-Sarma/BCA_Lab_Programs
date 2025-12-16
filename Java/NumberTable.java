// AnshumanSarma_WAP to perform row, column, diagonal, and total sum operations on a square matrix


import java.util.Scanner;

class NumberTable {
    private int[][] table;
    private int size;

    public NumberTable(int size) {
        this.size = size;
        table = new int[size][size];
    }

    public void inputTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = scanner.nextInt();
            }
        }
    }

    public void displayTable() {
        System.out.println("Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void sumOfRows() {
        System.out.println("Sum of each row:");
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum += table[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }
    }

    public void sumOfColumns() {
        System.out.println("Sum of each column:");
        for (int j = 0; j < size; j++) {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += table[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }
    }

    public void sumOfDiagonals() {
        if (size != table[0].length) {
            System.out.println("Not a square table. Diagonals cannot be calculated.");
            return;
        }
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            primaryDiagonalSum += table[i][i];
            secondaryDiagonalSum += table[i][size - i - 1];
        }
        System.out.println("Sum of primary diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
    }

    public void sumOfAllElements() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += table[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}

class TestNumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the table: ");
        int size = scanner.nextInt();

        NumberTable numberTable = new NumberTable(size);

        numberTable.inputTable();

        numberTable.displayTable();

        numberTable.sumOfRows();
        numberTable.sumOfColumns();
        numberTable.sumOfDiagonals();
        numberTable.sumOfAllElements();

        scanner.close();
    }
}