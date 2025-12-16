/* AnshumanSarma_WAP to read a matrix and display its forward and reverse diagonals */

#include <stdio.h>

int main()
{
    int row, col;
    int a[10][10];
    int i, j;

    printf("Enter number of rows: ");
    scanf("%d", &row);

    printf("Enter number of columns: ");
    scanf("%d", &col);

    printf("Enter the elements of the matrix:\n");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            printf("A[%d][%d]: ", i, j);
            scanf("%d", &a[i][j]);
        }
    }

    printf("\nThe matrix is:\n");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            printf("%d\t", a[i][j]);
        }
        printf("\n");
    }

    printf("\nForward Diagonal:\n");
    for (i = 0; i < row && i < col; i++)
    {
        printf("%d\n", a[i][i]);
    }

    printf("\nReverse Diagonal:\n");
    for (i = 0, j = col - 1; i < row && j >= 0; i++, j--)
    {
        printf("%d\n", a[i][j]);
    }

    return 0;
}
