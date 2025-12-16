/* AnshumanSarma_WAP to check whether two arrays are equal */


#include<stdio.h>
int main()
{
 int A[10],B[10],  i,equal= 1,n;
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
  continue;
  else
     {
       equal = 0;
       break;
     }
  }
  if (equal == 1)
       printf("\nThe two lists are equal\n");
  else
       printf("\nThe two lists are not equal\n");
 return 0;
}
 
