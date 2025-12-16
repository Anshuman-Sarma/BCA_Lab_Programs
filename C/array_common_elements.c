/* AnshumanSarma_WAP to display common elements between two arrays */


#include<stdio.h>
int main()
{
 int A[10],B[10],i,n;
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
 for(i=0;i<n;i++)
 {
  if(A[i]==B[i])
  printf("\n%d\n",A[i]);
 }
 return 0;
}
 
 
