# AnshumanSarma_WAP to plot a bar graph using Matplotlib


import matplotlib.pyplot as plt
import numpy as np

#Creating an array of categorical data
data = ('Fortran', 'C', 'C++', 'Java', 'R', 'Python')
p = [1,2,4,6,8,10]

#Plotting the Bar Graph
plt.bar(data, p, align='center', alpha=0.5, edgecolor='black')
plt.xlabel('Programming Languages')
plt.ylabel('No. of Usage')
plt.title('Programming Languages Used in Projects')
plt.show()