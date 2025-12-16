/* AnshumanSarma_WAP to merge two arrays and separate even and odd elements */


#define size 20
#include<stdio.h>
int main()
{
	int a[size],b[size],c[size],n,i,j,k=0,l=0;
	printf("\nEnter the number of elements:");
	scanf("%d",&n);
	printf("\nPlease enter the elements for Array A and B:\n");
	for(i=0;i<n;i++)
		{
			printf("A[%d]:",i);
			scanf("%d",&a[i]);
		}
	for(i=0;i<n;i++)
		{
			printf("B[%d]:",i);
			scanf("%d",&b[i]);
		}
	for(i=0;i<n;i++)
	   c[i]=a[i];
	for(j=0;j<n;j++,i++)
	   c[i]=b[j];
	for(i=0;i<2*n;i++)
	    if(c[i]%2==0)
		a[k++] = c[i];
            else
		b[l++] = c[i];
	printf("\nA is even");
	for(i=0;i<n;i++)
		{
			printf("\nA[%d]:%d",i,a[i]);
		}
	printf("\nB is odd");
	for(i=0;i<n;i++)
		{
			printf("\nB[%d]:%d",i,b[i]);
			
		}
	return 0;
}
