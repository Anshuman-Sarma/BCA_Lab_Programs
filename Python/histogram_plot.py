# AnshumanSarma_WAP to plot a histogram using Matplotlib


import matplotlib.pyplot as plt
#Creating an array of numerical data
data = [1,11,21,31,41,51]

#Plotting the histogram
plt.hist(data, bins=[0,10,20,30,40,50,60], weights=
[10,1,40,33,6,8], edgecolor="red", color="green")
plt.title("An Example of a Histogram")
plt.xlabel("Data Values")
plt.show()