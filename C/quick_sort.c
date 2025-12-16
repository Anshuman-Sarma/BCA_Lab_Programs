/* AnshumanSarma_WAP to sort an array using Quick Sort */


#include<stdio.h>
#include<stdlib.h>

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

int partition(int arr[], int low, int high)
{
    int pivot= arr[high];
    int i = low - 1;
    for(int j= low; j<high; j++)
    {
        if(arr[j] <= pivot)
        {
            i++;
            swap(&arr[i],&arr[j]);
        }
    }
    swap(&arr[i+1], &arr[high]);
    return i + 1;
}

void quicksort(int arr[], int low, int high)
{
    if (low<high)
    {
        int pi = partition(arr, low, high);
        quicksort(arr,low, pi - 1);
        quicksort(arr, pi + 1, high);
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
    quicksort(arr,0,n-1);

    printf("Sorted Array\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t",arr[i]);
    }

    return 0;
}