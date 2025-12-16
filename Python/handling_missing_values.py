# AnshumanSarma_WAP to handle missing data using Pandas


import pandas as pd
import numpy as np

#Creating a DataFrame with Missing Values
df = pd.DataFrame(np.random.randn(5, 3), index=['a', 'c', 'e', 'f','h'], columns=['C1', 'C2', 'C3'])
df = df.reindex(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'])
print("\n Reindexed Data Values")
print("-------------------------")
print(df)

#Method 1 - Filling Every Missing Values with 0
print("Every Missing Value Replaced with '0':")
print("--------------------------------------------")
print(df.fillna(0))

#Method 2 - Dropping Rows Having Missing Values
print("Dropping Rows with Missing Values:")
print("----------------------------------------")
print(df.dropna())

#Method 3 - Replacing missing values with the Median Value
df.fillna(df.median(), inplace=True)
print("Missing Values for Column 1 Replaced with Median Value:")
print("-----------------------------------------------------")
print(df)