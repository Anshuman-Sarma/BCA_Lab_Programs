# AnshumanSarma_WAP to check whether a number is a Perfect Number


num = int(input("Enter a number: "))
print()
sum= 0

for i in range (1, num):
    if num % i == 0:
        sum += i

if sum == num:
    print(f"The number {num} is a perfect number")
else:
    print(f"The number {num} is not a perfect number")
print()
print()