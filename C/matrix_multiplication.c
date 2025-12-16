 AnshumanSarma_WAP to perform matrix multiplication and display diagonals 


#include<stdio.h>
int main()
{
	int row, col, a[10][10],b[10][10],c[10][10],i,j,k;
	printf("\n Enter number of rows:");
	scanf("%d",&row);
	printf("\nEnter number of colums:-");
	scanf("%d",&col);
	printf("\nEnter the elements of A & B:");
	for(i=0;i<row;i++)
		for(j=0;j<col;j++)
			{
				printf("\nA[%d][%d]:",i,j);
				scanf("%d",&a[i][j]);
			}
	for(i=0;i<row;i++)
		for(j=0;j<col;j++)
			{
				printf("\nB[%d][%d]:",i,j);
				scanf("%d",&b[i][j]);
			}
	printf("\nThe matrix A is:-");
	for(i=0;i<row;i++)
		{
			printf("\n");
			for(j=0;j<col;j++)
			 printf("\t%d",a[i][j]);
		}
	printf("\nThe matrix B is:-");
	for(i=0;i<row;i++)
		{
			printf("\n");
			for(j=0;j<col;j++)
			 printf("\t%d",b[i][j]);
		}
	printf("\nThe matrix C after Multiplication :-");
	for(i=0;i<row;i++)
	 for(j=0;j<col;j++)
		{
			c[i][j] = 0;
			for(k=0;k<row;k++)
			c[i][j]+=a[i][k] * b[k][j];
		}
	for(i=0;i<row;i++)
		{
			printf("\n");
			for(j=0;j<col;j++)
			 printf("\t%d",c[i][j]);
		}
	printf("\nForward Diagonal of Matrix C:-");
	for(i=0;i<row;i++)
	 printf("\n%d",c[i][i]);
	printf("\nReverse Diagonal of Matrix C:-");
	for(i=0,j=col-1;i<row;i++,j--)
	 printf("\n%d",c[i][j]);
	return 0;
}
