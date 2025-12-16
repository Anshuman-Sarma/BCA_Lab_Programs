/* AnshumanSarma_WAP to sort an array using Insertion Sort */


#include<stdio.h>
#include<stdlib.h>

void InsertionSort( int arr[], int n)
{
    int i , j, key;
    for(i=1;i<n;i++)
    {
        key=arr[i];
        j=i-1;
    
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
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
    InsertionSort(arr,n);

    printf("Sorted Array\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t",arr[i]);
    }

    return 0;
}