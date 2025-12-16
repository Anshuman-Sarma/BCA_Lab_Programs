# AnshumanSarma_WAP to count vowels in a string using a function


def count_vowels(s):
    vowels = "aeiou"
    v = 0
    for i in s:
        if i.lower() in vowels:  
            v += 1
    return v

s = input("Enter a string: ")
vowels_count = count_vowels(s)
print("The number of vowels in the string are:", vowels_count)
