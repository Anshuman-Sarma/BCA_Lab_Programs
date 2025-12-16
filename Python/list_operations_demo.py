# AnshumanSarma_WAP to demonstrate all basic list operations in Python


#1. Creating a List

my_list = [1, 2, 3, 4, 5]
print(my_list)


#2. Accessing Elements

my_list = [10, 20, 30, 40, 50]
print(my_list[0])
print(my_list[-1])
print(my_list[1:4])

#3. Modifying Elements

my_list = [10, 20, 30]
my_list[1] = 25
print(my_list)

#4. Adding Elements

my_list = [1, 2, 3]
my_list.append(4)
print(my_list)
my_list.insert(1, 10)
print(my_list)
my_list.extend([5, 6, 7])
print(my_list)

#5. Removing Elements

my_list = [1, 2, 3, 4, 5]
my_list.remove(3)
print(my_list) 
popped_element = my_list.pop(1)
print(my_list)
print(popped_element)
del my_list[0]
print(my_list) 

#6. Checking Membership

my_list = [1, 2, 3, 4]
print(3 in my_list)
print(10 not in my_list)

#8. List Comprehension (Quick List Creation)

squared = [x for x in range(5)]
print(squared) #Output: [0, 1, 4, 9, 16]

#9. Sorting and Reversing

my_list = [4, 1, 3, 2]
my_list.sort()
print(my_list) 
my_list = [4, 1, 3, 2]
sorted_list = sorted(my_list)
print(sorted_list) 
my_list.reverse()
print(my_list) 

#10. Finding Maximum, Minimum, and Sum

numbers = [10, 20, 30, 40]
print(max(numbers)) 
print(min(numbers)) 
print(sum(numbers)) 

#11. Copying a List

my_list = [1, 2, 3]
copy1 = my_list.copy()
copy2 = my_list[:]
copy3 = list(my_list)
print(copy1, copy2, copy3) 

#12. Clearing a List

my_list = [1, 2, 3]
my_list.clear()
print(my_list) 

#13. Finding Index of an Element

my_list = [10, 20, 30, 40]
print(my_list.index(30)) #Output: 2

#14. Counting Occurrences of an Element

my_list = [1, 2, 2, 3, 2, 4]
print(my_list.count(2)) 