# AnshumanSarma_WAP to calculate measures of dispersion using statistics module


import statistics as s

data = [10, 20, 30, 40, 50]
variance = s.variance(data)
std_deviation = s.stdev(data)

print("Variance:", variance)
print("Standard Deviation:", round(std_deviation,2))