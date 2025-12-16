# AnshumanSarma_WAP to count the number of vowels in a string


s=str(input("Enter a string: "))
v=0
for i in s:
    if i in "aeiou":
        v+=1
print("The number of vowels in the string are: ",v)