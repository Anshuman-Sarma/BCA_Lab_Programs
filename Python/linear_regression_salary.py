# AnshumanSarma_WAP to implement simple linear regression and visualize results


import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import r2_score

# Step 1: Create the CSV file
data = {
    'YearsExperience': [1.1, 1.3, 1.5, 2.0, 2.2, 2.9, 3.0, 3.2, 3.7, 3.9, 4.0, 4.1, 4.5, 4.9, 5.1, 5.3, 5.9, 6.0, 6.8, 7.1, 7.9, 8.2, 8.7, 9.0],
    'Salary': [39343, 46205, 37731, 43525, 39891, 56642, 60150, 54445, 64445, 57189, 63218, 55794, 56915, 57081, 61111, 67938, 66029, 83088, 81363, 93940, 91738, 98273, 101302, 113812]
}
df = pd.DataFrame(data)
df.to_csv('Salary_Data.csv', index=False)
print("CSV file 'Salary_Data.csv' created successfully.")

# Step 2: Load the Dataset
data = pd.read_csv('Salary_Data.csv')

# Step 3: Preprocess the Data
X = data[['YearsExperience']].values  # Independent variable
y = data['Salary'].values  # Dependent variable

# Step 4: Split the Data
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.33, random_state=0)
# Step 5: Train the Model
model = LinearRegression()
model.fit(X_train, y_train)

# Predict on the test set
y_pred = model.predict(X_test)

# Step 6: Evaluate the Model
r2 = r2_score(y_test, y_pred)
print(f'R-squared score: {r2:.4f}')

# Step 7: Plot the Results
plt.figure(figsize=(14, 6))

plt.subplot(1, 2, 1)
plt.scatter(X_train, y_train, color='red', label='Training data')
plt.plot(X_train, model.predict(X_train), color='blue', label='Regression line')
plt.title('Training Set')
plt.xlabel('Years of Experience')
plt.ylabel('Salary')
plt.legend()

plt.subplot(1, 2, 2)
plt.scatter(X_test, y_test, color='green', label='Test data')
plt.plot(X_train, model.predict(X_train), color='blue', label='Regression line')
plt.title('Test Set')
plt.xlabel('Years of Experience')
plt.ylabel('Salary')
plt.legend()
plt.tight_layout()
plt.show()
