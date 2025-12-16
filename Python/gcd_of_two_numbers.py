# AnshumanSarma_WAP to find the Greatest Common Divisor (GCD) of two numbers


num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

def find_gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

gcd = find_gcd(num1, num2)
print("Greatest Common Divisor (GCD) =", gcd)
