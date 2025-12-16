# AnshumanSarma_WAP to find the factorial of a number using loop


n = int(input("Enter a number: "))
fact=1

for i in range(1, n+1):
    fact *= i
print("The factorial of the number",n,"is:",fact)