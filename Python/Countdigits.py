# AnshumanSarma_WAP to count the number of digits in a given number


n = int(input("Enter a number: "))
i=n
d=0
while i>0:
    digit = n % 10
    i = i // 10
    d += 1
print("The number",n,"has",d,"digits")