/* AnshumanSarma_WAP to sort an array using optimized Bubble Sort */


#include<stdio.h>
int main()
{
 int a[]={6,3,4,7,1,2},i,j,k,n=6,c;
 for(j=0;j<n-1;)
    if(a[j]>a[j+1])
      {
        k=a[j];
        a[j]=a[j+1];
        a[j+1]=k;
        j++;
        if(j==n-2)
          {
           j=0;
           n--;
          }
       }
 c=6;
 for(i=0;i<c;i++)
   printf("a[%d] = %d\n",i,a[i]);
    
  return 0;
}  
      
