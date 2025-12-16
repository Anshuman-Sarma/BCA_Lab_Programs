/* AnshumanSarma_WAP to sort an array using Selection Sort */


#include<stdio.h>
#include<stdlib.h>

void SelectionSort( int arr[], int n)
{
    int i , j, minindex, temp;
    for(i=0;i<n-1;i++)
    {
        minindex=i;
        for(j=i+1;j<n;j++)
        {
            if(arr[j]<arr[minindex])
            {
                minindex=j;
            }
        }
        temp = arr[minindex];
        arr[minindex]=arr[i];
        arr[i]=temp;
    }
    
}

int main()
{
    int i;
    int n = 10;
    int arr[n];
    for(i=0;i<n;i++)
    {
        arr[i]=rand() % 10;
    }
    printf("Unsorted Array\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t",arr[i]);
    }
    printf("\n");
    SelectionSort(arr,n);

    printf("Sorted Array\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t",arr[i]);
    }

    return 0;
}