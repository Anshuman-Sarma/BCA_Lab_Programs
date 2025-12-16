/* AnshumanSarma_WAP to count duplicate elements in an array */


#include<stdio.h>
int main()
{
 int A[10],i,j,count = 0,n;
 printf("\nEnter the number of elements:-\t");                                         
 scanf("%d",&n);
 printf("\nEnter the elements of A:-\n");
 for(i=0;i<n;i++)
 {
   printf("A[%d}: ",i);
   scanf("%d",&A[i]);
 }
 for(i=0;i<n;i++)
  for(j=i+1;j<n;j++)
 { 
   if(A[i]==A[j])
   {count++;
    break;}
 }
 if(count==0)
 printf("\nThere are no duplicate entries\n");
 else
 printf("\nThe total number of duplicate entries in an array:%d\n",count);
 return 0;
}
 
