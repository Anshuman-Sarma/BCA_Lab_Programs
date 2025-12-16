/* AnshumanSarma_WAP to sort an array using Bubble Sort with function */


#include<stdio.h>
#include<stdlib.h>

void BubbleSort( int arr[], int n)
{
    int i, j, temp;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}

int main()
{
    int i;
    int n = 10;
    int arr[n];
    for(i=0;i<n;i++)
    {
        arr[i]=rand()%10;
    }

    printf("The Array before sorting:\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t",arr[i]);
    }
    printf("\n");
    BubbleSort(arr, n);

    printf("The Sorted Array is as follows:\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t",arr[i]);
    }

    return 0;
}