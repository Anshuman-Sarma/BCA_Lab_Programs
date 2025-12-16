/* AnshumanSarma_WAP to implement queue using linked list */


#include<stdio.h>
#include<stdlib.h>
struct node
	{
		int data;
		struct node * next;
	}*front = NULL;

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

void enqueue(int value)
	{
		struct node* newnode, *p;
		newnode = create_node (value);
		if(front == NULL)
				front = newnode;
		else
			{
				p=front;
 				while(p->next!=NULL)
					p=p->next;
				p->next=newnode;
			}
    }

int dequeue()
{
 int ele;
 if(front!=NULL)
  {
   ele=front->data;
   front=front->next;
   return ele;
  }
}

void display()
	{
		struct node* temp;
		if (front == NULL)
			{
				printf("The queue is empty\n");
				return;
			}
		temp = front;
		printf("Elements of queue are:\n");
		while(temp!=NULL)
			{
				printf("\n%d ->", temp -> data);
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
			
		printf("\n\t\t  Queue Operation\n");
		printf("\t\t  ***************");
		printf("\n1. Enqueue");
		printf("\n2. Dequeue");
		printf("\n3. Display");
		printf("\n4. Exit");
		printf("\nEnter your choice:-");
		scanf("%d",&choice);
		if (choice == 1)
			{
				printf("\nEnter an element:-");
				scanf("%d",&element);
				enqueue(element);
			}
		else if (choice == 2)
			{
				element = dequeue();
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
	}

