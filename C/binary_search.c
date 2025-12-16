/* AnshumanSarma_WAP to perform Binary Search on an array */


#include <stdio.h>

int binarySearch(int arr[], int n, int key)
{
    int low = 0, high = n - 1, mid;

    while (low <= high)
    {
        mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;
        else if (arr[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}

int main()
{
    int arr[10] = {1,2,3,4,5,6,7,8,9,10};
    int key, pos;

    printf("Enter element to search: ");
    scanf("%d", &key);

    pos = binarySearch(arr, 10, key);

    if (pos != -1)
        printf("Element found at position %d\n", pos);
    else
        printf("Element not found\n");

    return 0;
}
