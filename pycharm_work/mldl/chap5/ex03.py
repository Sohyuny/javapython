import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import cross_validate

data = pd.read_csv('https://raw.githubusercontent.com/rickiepark/hg-mldl/master/wine.csv')
data.to_csv('wine.csv')
print(data.head())

x = data[['alcohol', 'sugar', 'pH']].to_numpy()
y = data['class'].to_numpy();

train_input, test_input, train_target, test_target = train_test_split(x, y, test_size=0.2, random_state=42)

sub_input, val_input, sub_target, val_target = train_test_split(train_input, train_target, random_state=42)

print(train_input.shape)
print(sub_input.shape)
print(val_input.shape)

index0 = (train_target == 0)
print(index0)

index1 = (train_target == 1)
print(index1)

# print(x)

plt.scatter(train_input[index0, 1], train_input[index0, 0], c="#ff0000")
plt.scatter(train_input[index1, 1], train_input[index1, 0], c="#0000ff")
plt.show()

dt = DecisionTreeClassifier()
dt.fit(sub_input, sub_target)

훈련점수 = dt.score(sub_input, sub_target)
테스트점수 = dt.score(test_input, test_target)

print(훈련점수)
print(테스트점수)

'''0 데이터'''
pred = dt.predict([[9.4, 1.9, 3.51], val_input[0]])
print(pred)
print(val_target[10])

print(dt.feature_importances_)

# plt.hist(x)
# plt.show()


scores = cross_validate(dt, train_input, train_target)
print(scores)

import numpy as np

print(np.mean(scores['test_score']))

from sklearn.model_selection import StratifiedKFold

splitter_ =StratifiedKFold(n_splits=10, shuffle=True, random_state=42)
scores = cross_validate(dt, train_input, train_target, cv = splitter_)
print(scores)

print(np.mean(scores['test_score']))

from sklearn.model_selection import GridSearchCV

gridcv = {'min_impurity_decrease': np.arange(0.0001, 0.001, 0.0001),
          'max_depth': range(5, 20, 1),
          'min_samples_split': range(2, 100, 10)}
gridcv.fit(train_input, train_target)

gridcv = GridSearchCV(DecisionTreeClassifier(random_state=42),parames, n_jobs==1)
print(gridcv.best_params_)