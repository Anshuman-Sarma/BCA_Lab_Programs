# AnshumanSarma_WAP to perform equal-width binning and plot histogram


import pandas as pd
import numpy as np
from matplotlib import pyplot as plt

d={'item':['Perfume','Lipstick','Deodorant','Body_Lotion','Makeup_Set','Hair_Dryer',
'Lip_Gloss','Moisturiser',"Scrubber"],
'price':[3450,1360,2540,1060,1320,3550,3890,1210,2160]}

df = pd.DataFrame(d)
print("\n ORIGINAL DATASET")
print(" ----------------")
print(df)

m1=min(df["price"])
m2=max(df["price"])
bins=np.linspace(m1,m2,4)
names=["low", "medium", "high"]

df["price_bin"]=pd.cut(df["price"],bins,labels=names,include_lowest=True)
print("\n BINNED DATASET")
print(" ----------------")
print(df)

a = np.array(df)
plt.hist(a, bins = np.linspace(min(df["price"]),max(df["price"]),4))
plt.axis([m1,m2,0,5])
plt.xlabel('Price Range: Low, Medium, High')
plt.ylabel("No. of Items")
plt.title("Histogram of Price of Items")
plt.show()