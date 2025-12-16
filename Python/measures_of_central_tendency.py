# AnshumanSarma_WAP to calculate measures of central tendency 


import pandas as pd
import scipy.stats as s

data = {'Physics': [62, 47, 55, 74, 31, 55, 85, 63, 42, 32, 71, 55],
        'Maths': [89, 87, 67, 55, 47, 72, 76, 79, 44, 92, 99, 47]}
df = pd.DataFrame(data)

print(df)

print("\nArithmetic Mean Values in the Distribution")
print("Score 1:", s.tmean(df['Physics']).round(2))
print("Score 2:", s.tmean(df['Maths']).round(2))

print("\nHarmonic Mean Values in the Distribution")
print("Score 1:", s.hmean(df['Physics']).round(2))
print("Score 2:", s.hmean(df['Maths']).round(2))

print("\nGeometric Mean Values in the Distribution")
print("Score 1:", s.gmean(df['Physics']).round(2))
print("Score 2:", s.gmean(df['Maths']).round(2))

print("\nMedian Values in the Distribution")
print("Score 1:", df['Physics'].median())
print("Score 2:", df['Maths'].median())

print("\nMode Values in the Distribution")
print("Score 1:", df['Physics'].mode().tolist())
print("Score 2:", df['Maths'].mode().tolist())