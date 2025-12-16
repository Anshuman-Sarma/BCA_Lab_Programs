/* AnshumanSarma_WAP to insert an element at a given position in an array */


#include<stdio.h>
int main()
{
 int a[10],n,i,pos,ele;
 printf("\nEnter the number of elements:-\t");                                         
 scanf("%d",&n);
 printf("\nEnter the elements: ");
 for(i=0;i<n;i++)
 {
   scanf("%d",&a[i]);
 }
 printf("\nEnter the position you want to enter: ");
 scanf("%d",&pos);
 if(pos<n)
 {
      printf("\nEnter the element you want to enter: ");
      scanf("%d",&ele);
      for(i=n-1;i>=pos;i--)
        a[i+1] = a[i];
        a[pos] = ele;
      for(i=0;i<n+1;i++)
     {
        printf("\nA[%d]:%d\t",i,a[i]);
     }
 } 
 else
 { 
     printf("\nNot in Range\n");
 }
 return 0;
}
