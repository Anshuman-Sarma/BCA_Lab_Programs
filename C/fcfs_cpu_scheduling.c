/* AnshumanSarma_WAP to implement FCFS CPU scheduling algorithm */


#include<stdio.h>
int main()
{
 int ps[ ]={1,2,3,4,5} , bt[ ]={6,2,8,3,4} , at[ ]={2,5,3,1,8} ,wt[5] ,tat[5], st ,k,i,j;
 int n=5;
 float avgt = 0;
 //sorting by arrival time
  for(i=0;i<n;i++)
  for(j=i+1;j<n;j++)
       if(at[i]>at[j])
         {
           k=at[i];
           at[i]=at[j];
           at[j]=k;
           k=ps[i];
           ps[i]=ps[j];
           ps[j]=k;
           k=bt[i];
           bt[i]=bt[j];
           bt[j]=k;
         }
 st=at[0];
 wt[0]= st- at[0];//waiting time for first process
 st+=bt[0];
 for(i=1;i<n;i++)//calculating waiting time for the rest fo the processes
  {
   wt[i]= (st - at[i] ) -1;
   st+=bt[i];
  }
 for(i=0;i<n;i++)//calculating average waiting time
  {
   avgt+=wt[i];
  }
 avgt/=(float)n;
for(i=0;i<n;i++)//calculating turnaround time
  {
   tat[i]=bt[i] + wt[i];
  }
 for(j=0;j<n;j++)
  {
    printf("%d\t%d\t%d\t%d\t%d\n",ps[j],bt[j],at[j],wt[j],tat[j]);
   }
 printf("\nAverage waiting time = %f\n",avgt);
return 0;
}