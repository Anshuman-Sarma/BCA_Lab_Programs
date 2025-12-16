# AnshumanSarma_WAP to demonstrate list methods and deep copy in Python


import copy

a = [10, 20, 30, 40,50,60,70,80,90,100]

# Remove the last element from list
a.pop()
a.pop()

print(a)

b= copy.deepcopy(a)
print(b)

c = a.count(10)
print(c)

numbers = [10,20,30,40]
print(max(numbers))
print(min(numbers))
print(sum(numbers))

