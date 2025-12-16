# AnshumanSarma_WAP to find the largest and smallest numbers in a list using functions


def find_largest(numbers):
    if not numbers:  
        return None
    return max(numbers)

numbers = [10, 20, 5, 75, 1, 33]
largest = find_largest(numbers)
print("Largest number:", largest)


def find_smallest(numbers):
    if not numbers:
        return None
    return min(numbers)

def find_smallest(numbers):
    if not numbers:  # Check if the list is empty
        return None
    return min(numbers)

numbers = [10, 20, 5, 75, 1, 33]
smallest = find_smallest(numbers)
print("Smallest number:", smallest)


