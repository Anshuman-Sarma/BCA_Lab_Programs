/* AnshumanSarma_WAP to insert nodes at the beginning of a singly linked list */


#include<stdio.h>
#include<stdlib.h>
struct node
	{
		int data;
		struct node * next;
	}*head = NULL;

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

void insert_begin(int value)
	{
		struct node* newnode, *p;
		newnode = create_node (value);
		if(head == NULL)
			{
				head = newnode;
				head -> next = NULL;
			}
		else
			{
				p = head;
				head = newnode;
				newnode -> next = p;

			}
    }

void display()
	{
		struct node* temp;
		if (head == NULL)
			{
				printf("The list is empty\n");
				return;
			}
		temp = head;
		printf("Elements of list are:\n");
		while(temp!=NULL)
			{
				printf("%d ->", temp -> data);
				temp = temp -> next;
			}
		printf("NULL\n");
	}

int main()
	{
		int value;
		int choice = 1;
		do
		{
			printf("Enter value to insert at beginning:");
			scanf("%d",& value);
			insert_begin(value);
			display();
			printf("\nDo you want to insert again:[0:No, 1 : Yes]:");
			scanf("%d",&choice);
		}while(choice!=0);
		return 0;
	}

