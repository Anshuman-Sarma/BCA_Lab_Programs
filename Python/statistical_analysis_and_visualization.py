# AnshumanSarma_WAP to compute statistical measures and visualize data using Python

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from scipy.stats import hmean, gmean

data = {
    'Physics': [75, 85, 95, 80, 70, 85, 90, 95, 80, 70],
    'Maths': [80, 70, 90, 85, 75, 95, 85, 90, 75, 80]
}

df = pd.DataFrame(data)

# Central Tendency Calculations for Physics
mean_p = df['Physics'].mean()
harmonic_p = hmean(df['Physics'][df['Physics'] > 0])  # Harmonic mean is only defined for positive numbers
geo_p = gmean(df['Physics'][df['Physics'] > 0])       # Geometric mean is also defined for positive numbers
median_p = df['Physics'].median()
mode_p = df['Physics'].mode().tolist()  

# Central Tendency Calculations for Maths
mean_m = df['Maths'].mean()
harmonic_m = hmean(df['Maths'][df['Maths'] > 0])
geo_m = gmean(df['Maths'][df['Maths'] > 0])
median_m = df['Maths'].median()
mode_m = df['Maths'].mode().tolist()  

# Dispersion Calculations for Physics
range_p = np.max(df['Physics']) - np.min(df['Physics'])
variance_p = np.var(df['Physics'], ddof=0)  # Population variance (ddof=0)
std_p = np.sqrt(variance_p)

# Dispersion Calculations for Maths
range_m = np.max(df['Maths']) - np.min(df['Maths'])
variance_m = np.var(df['Maths'], ddof=0)
std_m = np.sqrt(variance_m)

# Position Calculations for Physics
q1_p = np.percentile(df['Physics'], 25)
q2_p = np.percentile(df['Physics'], 50)  # Median (Q2)
q3_p = np.percentile(df['Physics'], 75)
iqr_p = q3_p - q1_p  # Interquartile Range for Physics

# Position Calculations for Maths
q1_m = np.percentile(df['Maths'], 25)
q2_m = np.percentile(df['Maths'], 50)  # Median (Q2)
q3_m = np.percentile(df['Maths'], 75)
iqr_m = q3_m - q1_m  # Interquartile Range for Maths

# Print all results at the end
# Central Tendency Results
print("Measures of Central Tendency:")
print("\nPhysics:")
print(f"Mean: {mean_p:.2f}")
print(f"Harmonic Mean: {harmonic_p:.2f}")
print(f"Geometric Mean: {geo_p:.2f}")
print(f"Median: {median_p:.2f}")
print(f"Mode: {mode_p}")

print("\nMaths:")
print(f"Mean: {mean_m:.2f}")
print(f"Harmonic Mean: {harmonic_m:.2f}")
print(f"Geometric Mean: {geo_m:.2f}")
print(f"Median: {median_m:.2f}")
print(f"Mode: {mode_m}")

# Dispersion Results
print("\nMeasures of Dispersion:")
print("\nPhysics:")
print(f"Range: {range_p:.2f}")
print(f"Variance: {variance_p:.2f}")
print(f"Standard Deviation: {std_p:.2f}")

print("\nMaths:")
print(f"Range: {range_m:.2f}")
print(f"Variance: {variance_m:.2f}")
print(f"Standard Deviation: {std_m:.2f}")

# Position Results
print("\nMeasures of Position:")
print("\nPhysics:")
print(f"Q1: {q1_p:.2f}")
print(f"Q2 (Median): {q2_p:.2f}")
print(f"Q3: {q3_p:.2f}")
print(f"IQR: {iqr_p:.2f}")

print("\nMaths:")
print(f"Q1: {q1_m:.2f}")
print(f"Q2 (Median): {q2_m:.2f}")
print(f"Q3: {q3_m:.2f}")
print(f"IQR: {iqr_m:.2f}")

#measureGraphs
# Plot Histogram for Physics
plt.hist(df['Physics'], bins=5, edgecolor='black')
plt.title('Histogram of Physics Scores')
plt.xlabel('Scores')
plt.ylabel('Frequency')
plt.show()

# Plot Histogram for Maths
plt.hist(df['Maths'], bins=5, edgecolor='black')
plt.title('Histogram of Maths Scores')
plt.xlabel('Scores')
plt.ylabel('Frequency')
plt.show()

# Bar Graph for Central Tendency Comparison
labels = ['Mean', 'Median', 'Mode']
physics_values = [mean_p, median_p, mode_p[0]]  # Using the first mode value for simplicity
maths_values = [mean_m, median_m, mode_m[0]]   # Using the first mode value for simplicity
x = np.arange(len(labels))  # X-axis positions for the bars
bar_width = 0.35  # Bar width for side-by-side bars
plt.bar(x, physics_values, bar_width, alpha=0.5, edgecolor='black', label='Physics')
plt.bar(x + bar_width, maths_values, bar_width, alpha=0.5, edgecolor='black', label='Maths')
plt.xlabel('Central Tendency Measures')
plt.ylabel('Values')
plt.title('Comparison of Central Tendency: Physics vs Maths')
plt.xticks(x + bar_width / 2, labels)  # Position labels between bars
plt.legend()
plt.show()

# Box plot for Physics and Maths
df[['Physics', 'Maths']].plot.box()
plt.title('Box Plot of Physics and Maths Scores')
plt.ylabel('Scores')
plt.show()

