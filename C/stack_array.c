/* AnshumanSarma_WAP to implement stack using array */


#define size 10
#include<stdio.h>
void push(int data);
int pop();
void display();
int stack[size], top =-1;
int main()
{
	int choice, element;
	do
	{
		printf("\n\t\t  Stack Operation\n");
		printf("\t\t  ***************");
		printf("\n1. Push");
		printf("\n2. Pop");
		printf("\n3. Display");
		printf("\n4. Exit");
		printf("\nEnter your choice:-");
		scanf("%d",&choice);
		if (choice == 1)
			{
				printf("\nEnter an element:-");
				scanf("%d",&element);
				push(element);
			}
		else if (choice == 2)
			{
				element = pop();
			}
		else if (choice == 3)
				display();
		else if (choice == 4)
			{
				printf("\nYou are exiting");
				break;
			}
		else
			{
				printf("\nInvalid Entry");
			}
	} 			while(choice!= 4);
		return 0;
}

void push(int data)
{
	if(top<size-1)
	{
		top++;
		stack[top] = data;
	}
	else
		printf("\nStack is full");
}
int isempty()
{ 
	if(top==-1)
		return(1);
	else
		return(0);
}


int pop()
{
	int data;
	if(!isempty())
	{
		data = stack[top];
		top --;
		return data;
	}
	else
		printf("\nStack is empty");
}


void display()
{
	int i;
	if(top!=-1)
	{
		for(i = top;i>=0;i--)
		printf("\nSTACK[%d]:%d",i,stack[i]);
	}
	else
		printf("\nStack is empty");
}
