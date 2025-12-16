/* AnshumanSarma_WAP to insert nodes at the end of a singly linked list */

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head = NULL;

struct node *create_node(int value)
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));

    if (temp == NULL)
    {
        printf("Memory not allocated\n");
        return NULL;
    }

    temp->data = value;
    temp->next = NULL;
    return temp;
}

void insert_end(int value)
{
    struct node *newnode, *temp;
    newnode = create_node(value);

    if (head == NULL)
    {
        head = newnode;
    }
    else
    {
        temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newnode;
    }
}

void display()
{
    struct node *temp;

    if (head == NULL)
    {
        printf("The list is empty\n");
        return;
    }

    temp = head;
    printf("Elements of list are:\n");
    while (temp != NULL)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

int main()
{
    int value, choice = 1;

    while (choice)
    {
        printf("Enter value to insert at end: ");
        scanf("%d", &value);

        insert_end(value);
        display();

        printf("Do you want to insert again? (1 = Yes, 0 = No): ");
        scanf("%d", &choice);
    }

    return 0;
}
