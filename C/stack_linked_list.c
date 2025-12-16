/* AnshumanSarma_WAP to implement stack using linked list */


#include<stdio.h>
#include<stdlib.h>
struct node
	{
		int data;
		struct node * next;
	}*top = NULL;

struct node*create_node(int value)
	{
		struct node*temp;
		temp = (struct node*) malloc (sizeof(struct node));
		if(temp == NULL)
			{
				printf("Memory not allocated\n");
				return 0;
			}
		else
			{
				temp -> data = value;
				temp -> next = NULL;
			}
		return temp;
	}

void push(int value)
	{
		struct node* newnode, *p;
		newnode = create_node (value);
		if(top == NULL)
			        top = newnode;
		
		else
			{
				p = top;
				top = newnode;
				newnode -> next = p;

			}
    }

int pop()
{
 int ele;
 if(top!=NULL)
  {
   ele=top->data;
   top=top->next;
   return ele;
  }
}

void display()
	{
		struct node* temp;
		if (top == NULL)
			{
				printf("The stack is empty\n");
				return;
			}
		temp = top;
		printf("Elements of stack are:\n");
		while(temp!=NULL)
			{
				printf("\n%d\n|\nV", temp -> data);
				temp = temp -> next;
			}
                 printf("\n");
	}

int main()
	{
		int value,element;
		int choice = 1;
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

