/* AnshumanSarma_WAP to perform matrix multiplication using Strassen's algorithm */


#include <stdio.h>

// Function to perform Strassen's multiplication for 2x2 matrices
void strassenMultiplication(int A[2][2], int B[2][2], int C[2][2]) {
    // Elements of matrix A
    int a = A[0][0];
    int b = A[0][1];
    int c = A[1][0];
    int d = A[1][1];

    // Elements of matrix B
    int e = B[0][0];
    int f = B[0][1];
    int g = B[1][0];
    int h = B[1][1];

    // Strassen's algorithm formulas
    int p1 = a * (f - h);
    int p2 = (a + b) * h;
    int p3 = (c + d) * e;
    int p4 = d * (g - e);
    int p5 = (a + d) * (e + h);
    int p6 = (b - d) * (g + h);
    int p7 = (a - c) * (e + f);

    // Result matrix C
    C[0][0] = p5 + p4 - p2 + p6;
    C[0][1] = p1 + p2;
    C[1][0] = p3 + p4;
    C[1][1] = p1 + p5 - p3 - p7;
}

int main() {
    // Define two 2x2 matrices
    int A[2][2] = {{1, 2}, {3, 4}};
    int B[2][2] = {{5, 6}, {7, 8}};
    int C[2][2]; // Result matrix

    // Perform Strassen's multiplication
    strassenMultiplication(A, B, C);

    // Display the result
    printf("Resultant Matrix C:\n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            printf("%d ", C[i][j]);
        }
        printf("\n");
    }

    return 0;
}
