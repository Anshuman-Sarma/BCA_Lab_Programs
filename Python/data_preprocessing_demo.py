# AnshumanSarma_WAP to demonstrate data preprocessing techniques in Python


import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.preprocessing import MinMaxScaler, Binarizer
from scipy.stats import hmean, gmean

# --- Program 1: Handling Missing Data ---

# Create a DataFrame with missing values
df = pd.DataFrame({
    'A': [1, 2, np.nan, 4, 5],
    'B': [5, np.nan, np.nan, 8, 10],
    'C': [10, 20, 30, np.nan, np.nan]
})
print("\nOriginal DataFrame with Missing Values:\n", df)

# Fill missing values with mean, median, or zero
df_mean = df.fillna(df.mean())
df_median = df.fillna(df.median())
df_zero = df.fillna(0)
print("\nFilled with Mean:\n", df_mean)
print("\nFilled with Median:\n", df_median)
print("\nFilled with Zero:\n", df_zero)

# --- Program 2: Smoothing Noisy Data with Equal Width Binning ---

products = ['Maruti', 'Honda', 'Mercedes', 'Audi', 'BMW', 'Suzuki']
prices = [8500, 16000, 52000, 47000, 63000, 7800]
df_products = pd.DataFrame({'Product': products, 'Price': prices})
# Define bins and labels for equal-width binning
bins = [0, 20000, 40000, 60000]
labels = ['Low', 'Medium', 'High']
df_products['Price_Binned'] = pd.cut(df_products['Price'], bins=bins, labels=labels)
print("\nProducts with Binned Prices:\n", df_products)

# Plot histogram for binned prices
plt.hist(df_products['Price_Binned'].astype('category').cat.codes, bins=len(labels), edgecolor="black", color="lightblue")
plt.title("Product Prices Histogram (Binned)")
plt.xlabel("Price Range")
plt.ylabel("Frequency")
plt.xticks(ticks=range(len(labels)), labels=labels)
plt.show()

# --- Program 3: Detecting and Removing Outliers Using Standard Deviation Method ---

data = [10, 12, 12, 13, 12, 14, 15, 16, 17, 18, 19, 200]  # 200 is an outlier
data_array = np.array(data)
mean, std_dev = np.mean(data_array), np.std(data_array)
threshold = 2  # 2 standard deviations for outlier detection

# Identify and remove outliers
outliers = (data_array > mean + threshold * std_dev) | (data_array < mean - threshold * std_dev)
cleaned_data = data_array[~outliers]
print("\nOriginal Data:", data_array)
print("Outliers:", data_array[outliers])
print("Cleaned Data:", cleaned_data)

# Plot boxplots before and after outlier removal
plt.figure(figsize=(12, 6))
plt.subplot(1, 2, 1)
plt.boxplot(data_array, vert=False)
plt.title("Original Data")
plt.subplot(1, 2, 2)
plt.boxplot(cleaned_data, vert=False)
plt.title("Cleaned Data")
plt.tight_layout()
plt.show()

# --- Program 4: Data Transformation: Rescaling and Binarizing ---

df_trans = pd.DataFrame({
    'Feature1': [5, 15, 25, 35, 45],
    'Feature2': [100, 200, 300, 400, 500],
    'Feature3': [1, 2, 3, 4, 5]
})
print("\nOriginal DataFrame:\n", df_trans)

# Min-Max Rescaling
scaler = MinMaxScaler()
df_scaled = pd.DataFrame(scaler.fit_transform(df_trans), columns=df_trans.columns)
print("\nRescaled Data (Min-Max Scaling):\n", df_scaled)

# Binarizing with threshold = 3
binarizer = Binarizer(threshold=3)
df_binarized = pd.DataFrame(binarizer.fit_transform(df_trans), columns=df_trans.columns)
print("\nBinarized DataFrame (Threshold=3):\n", df_binarized)