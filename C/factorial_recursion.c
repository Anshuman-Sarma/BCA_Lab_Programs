/* AnshumanSarma_WAP to find factorial of a number using recursion */


#include<stdio.h>

int fact(int n)
{
	if(n==0)
		return(1);
	return(n*fact(n-1));	
}

int main()
{
	int f,n;
	f = fact(5);
	printf("\nFactorial = %d",f);
}
