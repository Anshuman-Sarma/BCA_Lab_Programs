# AnshumanSarma_WAP to find the sum of odd digits in a given number


n = int(input("Enter a number: "))
i=n
d=0
sum=0
while i>0:
    digit = i % 10
    if(digit % 2 != 0):
        sum += digit
    i = i // 10
print("The sum of odd digits of number", n, "is:", sum)