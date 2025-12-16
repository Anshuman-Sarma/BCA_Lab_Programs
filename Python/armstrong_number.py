# AnshumanSarma_WAP to check whether a number is an Armstrong number


n=int(input("Enter the number: "))
i=n
d=0
l=[]
no = 0
while i > 0:
    digit = i % 10
    l.append(digit)
    d += 1
    i = i // 10

for i in l:
    no += i ** d

print(l)

if n == no:

    print("The number",n,"is a armstrong number")

else:

    print("The number",n,"is not a armstrong number")