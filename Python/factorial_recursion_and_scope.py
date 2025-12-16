# AnshumanSarma_WAP to find factorial using recursion and demonstrate local and global variables


def factorial(n):
    if n == 0 or n == 1:  
        return 1
    return n * factorial(n - 1)  

n = int(input("Enter a number: "))
print("The factorial of the number", n, "is:", factorial(n))

global_var = "I am global"

def func():
    local_var = "I am local"
    print(local_var)
    print(global_var)

func()
print(global_var)