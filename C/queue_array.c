/* AnshumanSarma_WAP to implement queue using array */


#define size 10
#include <stdio.h>
void enqueue (int data);
int dequeue();
void display();
int queue[size], front=-1, rear=-1;
int main()
{
	int choice, element;
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
		return 0;
}

void enqueue(int data)
{
	if(rear==size-1)
		printf("\nQueue is full");
	else 
		{
			if(front==-1)
			  {front++;}
			rear++;
			queue[rear]= data;
		}
}

int dequeue()
{
	int data;
	if (rear==-1 || front>rear)
		printf("\nQueue is Empty");
	else
	{
		data = queue[front];
		front++;
        return (data);
	}
	
}											

void display()
{
	int i;
	if(front==-1 || front>rear)
	{
		printf("\nQueue is empty");	
	}
	else
		for(i =front;i<=rear;i++)
		    {
                if(i<rear)
                 printf("\t%d\t<--",queue[i]);
                else
                 printf("\t%d",queue[i]);
            }
    printf("\n\n");
}

