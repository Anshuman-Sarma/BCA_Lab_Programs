/* AnshumanSarma_WAP to read 15 numbers into an array and find their sum and average */

#include <stdio.h>
void main()
{
	int arr[15];
	int i;
	int sum=0;
	float average;
	printf("\nEnter 15 numbers\n");

	for(i=0;i<15;i++)
	{
      		scanf("%d",&arr[i]);
	}
	printf("The 15 numberd are\n");

	for(i=0;i<15;i++)
	{
		printf("%d",arr[i]);
	}

	for(i=0;i<15;i++)
	{
		sum=sum+arr[i];
	}

	printf("the sum is%d\n",sum);
	average=sum/15;
	printf("The adverage is %d\n",sum);
}

