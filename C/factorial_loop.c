/* AnshumanSarma_WAP to find factorial of a number using loop */


#include<stdio.h>
int main()
{
	int i,fact = 1,n = 5;
	i = n;
	while(i>0)
	{
		fact=fact*i;
		i--;
		printf("\n%d = %d",i,fact);
	}
	return 0;
}
