# AnshumanSarma_WAP to calculate the average of n numbers using a list


n = int(input("Enter the number of terms: "))

l=[]
total = 0
for i in range(n):
    n1= int(input("Enter the element of the list: "))
    l.append(n1)
    total +=l[i]

avg = total / n

print("The average of the numbers is: ", avg)