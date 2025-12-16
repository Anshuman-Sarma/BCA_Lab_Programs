# AnshumanSarma_WAP to generate Fibonacci series and find prime numbers within the series


n = int(input("Enter a number: "))
l=[]
def prime(n):
    if(a3>1):
        prime=1
        for i in range(2,a3):
            if(a3 % i == 0):
                prime = 0
                break
        if(prime == 1):
            l.append(n)
a1 = 0
a2 = 1
print("The first ",n," terms of the fibonacci series are:")
print(a1)
print(a2)
for i in range(0, n-2):
    a3 = a1 + a2
    print(a3)
    prime(a3)
    a1,a2 = a2,a3
print("The prime numbers in the fibonacci series of", n ,"terms are:\n",l)
print()


