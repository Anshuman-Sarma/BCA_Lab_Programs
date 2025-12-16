/* AnshumanSarma_WAP to sort an array using Bubble Sort */


#include<stdio.h>
int main()
{
 int a[]={16,3,4,17,1,12},i,j,k,n=6;
 for(i=1;i<=n;i++)
    for(j=0;j<n-i;j++)
	if(a[j]>a[j+1])
          {
            k=a[j];
            a[j]=a[j+1];
            a[j+1]=k;
           }
    
 
 for(i=0;i<n;i++)
   printf("a[%d] = %d\n",i,a[i]);
    
  return 0;
}  
      
