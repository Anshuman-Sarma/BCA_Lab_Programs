/* AnshumanSarma_WAP to implement First Fit memory allocation algorithm */


#include<stdio.h>
int main()
{
 int memory_block[]={10,50,20,30,60};
 int pro[]={22,44,8,90,15};
 int i,j,c;
 int p=5,m=5;
 for(i=0;i<p;i++)
  {
   c=0;
   for(j=0;j<m;j++)
    {
      if(memory_block[j]>pro[i])
       {
        printf("P%d-----%dKB in memory block of size %d\n",i+1,pro[i],memory_block[j]);
        memory_block[j]=-1;
        c++;
        break;
       }
     } 
    if(c==0)
       printf("P%d-----%dKB is too large to fit in memory\n",i+1,pro[i]);
  }
return 0;
}