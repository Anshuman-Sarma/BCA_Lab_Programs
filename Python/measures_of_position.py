# AnshumanSarma_WAP to calculate quartiles and interquartile range


import numpy as np


data = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

Q1 = np.percentile(data, 25)
Q2 = np.percentile(data, 50)
Q3 = np.percentile(data, 75)

IQR = Q3 - Q1
print("First Quartile (Q1):", Q1)
print("Second Quartile (Q2/Median):", Q2)
print("Third Quartile (Q3):", Q3)
print("Interquartile Range (IQR):", IQR)