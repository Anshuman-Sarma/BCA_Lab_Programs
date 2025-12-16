# AnshumanSarma_WAP to demonstrate data rescaling and binarization using preprocessing techniques


import pandas as pd
import numpy as np
from sklearn import preprocessing
import scipy.stats as s

d = {'C1':[1,3,7,4],'C2':[12,2,7,1],'C3':[22,34,-11,9]}
df2 = pd.DataFrame(d)
print("\n ORIGINAL DATA VALUES")
print("------------------------")
print(df2)

#Method 1: Rescaling Data
print("\n\n Data Scaled Between 0 to 1")
d = preprocessing.MinMaxScaler(feature_range = (0, 1))
data = d.fit_transform(df2)
print("\n Min Max Scaled Data ")
print("-----------------------")
print(data.round(2))

#Method 2: Binarize Data (Make Binary)
d = preprocessing.Binarizer(threshold=5).transform(df2)
print("\n Binarized data ")
print(" -----------------")
print(d)