/* AnshumanSarma_WAP to replace an element at a given position in an array */


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
 printf("\nEnter the element you want to enter: ");
 scanf("%d",&ele);
 a[pos]=ele;
 for(i=0;i<n;i++)
 {
   printf("\nA[%d]:%d\t",i,a[i]);
 }
 return 0;
}
