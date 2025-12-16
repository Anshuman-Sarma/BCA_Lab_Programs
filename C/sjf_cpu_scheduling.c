/* AnshumanSarma_WAP to implement CPU scheduling using Shortest Job First (Non-Preemptive) algorithm */


#include <stdio.h>

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void bubbleSort(int n, int bt[], int at[], int ps[]) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (bt[j] > bt[j + 1]) {
                swap(&bt[j], &bt[j + 1]);
                swap(&at[j], &at[j + 1]);
                swap(&ps[j], &ps[j + 1]);
            }
        }
    }
}

void calculateWaitingTime(int n, int bt[], int wt[]) {
    wt[0] = 0;
    for (int i = 1; i < n; i++) {
        wt[i] = wt[i - 1] + bt[i - 1];
    }
}

void calculateTurnaroundTime(int n, int bt[], int wt[], int tat[]) {
    for (int i = 0; i < n; i++) {
        tat[i] = bt[i] + wt[i];
    }
}

int main() {
    int n = 5; // Number of processes
    int ps[] = {1, 2, 3, 4, 5};
    int bt[] = {6, 2, 8, 3, 4};
    int at[] = {2, 5, 3, 1, 8};
    int wt[n], tat[n];

    bubbleSort(n, bt, at, ps);
    calculateWaitingTime(n, bt, wt);
    calculateTurnaroundTime(n, bt, wt, tat);

    printf("Process\tBurst Time\tArrival Time\tWaiting Time\tTurnaround Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\t\t%d\t\t%d\t\t%d\n", ps[i], bt[i], at[i], wt[i], tat[i]);
    }

    float avgWaitingTime = 0;
    for (int i = 0; i < n; i++) {
        avgWaitingTime += wt[i];
    }
    avgWaitingTime /= n;

    printf("Average Waiting Time: %.2f\n", avgWaitingTime);

    return 0;
}