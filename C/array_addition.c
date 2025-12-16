/* AnshumanSarma_WAP to add two arrays and store the result in a third array */


#include<stdio.h>
int main()
{
 	int A[10],B[10],C[10],i,j,n;
 	printf("\nEnter the number of elements:-\t");
 	scanf("%d",&n);
 	printf("\nEnter the elements of A:-\n");
 	for(i=0;i<n;i++)
 	{
   		printf("A[%d}: ",i);
   		scanf("%d",&A[i]);
 	}
 	printf("\nEnter the elements of B:-\n");
 	for(i=0;i<n;i++)
 	{
  		printf("B[%d}: ",i);
  		scanf("%d",&B[i]);
 	}
 	printf("\nAfter Addition The new array is as follows:-\n");
 	for(i=0;i<n;i++)
 	{
  		C[i] = A[i] + B[i];
  		printf("C[%d] = %d \n",i,C[i]);
 	}
 	return 0;
}
 
