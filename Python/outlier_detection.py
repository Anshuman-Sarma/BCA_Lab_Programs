# AnshumanSarma_WAP to detect and remove outliers using standard deviation method


import numpy as np
from matplotlib import pyplot as plt

data = [10, 386, 479, 627, 20, 523, 482, 483, 542, 699, 535, 617, 577, 471, 615, 583, 441, 562,
563, 527, 453, 530, 433, 541, 585, 704, 443, 569, 430, 637, 331, 511, 552, 496, 484, 566, 554,
472, 335, 440, 579, 341, 545, 615, 548, 604, 439, 556, 442, 461, 624, 611, 444, 578, 405, 487,
490, 496, 398, 512, 422, 455, 449, 432, 607, 679, 434, 597, 639, 565, 415, 486, 668, 414, 665,
763, 557, 304, 404, 454, 689, 610, 483, 441, 657, 590, 492, 476, 437, 483, 12, 363, 711, 543]

print("Original List \n", data)
elements = np.array(data)
mean = np.mean(elements)
std = np.std(elements)

a = np.array(elements) #For plotting a Histogram
plt.hist(a, bins = [0,100,200,300,400,500,600,700,800])
plt.title("histogram")
plt.show()

# Identify outliers
cut_off = std * 3
lower, upper = mean - cut_off, mean + cut_off
outliers = [x for x in a if x < lower or x > upper]
print('No of Identified outliers: %d' % len(outliers))

#Creating a Dataset without Outliers
final_list = [x for x in data if (x > lower) and (x < upper)]
a = np.array(final_list)
#For plotting a Histogram

plt.hist(a, bins = [0,100,200,300,400,500,600,700,800])
plt.title("histogram")
plt.show()
