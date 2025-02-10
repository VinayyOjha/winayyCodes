import numpy as np
import matplotlib.pyplot as plt
from scipy.optimize import linprog

# Define objective and constraints
c = [-3, -4]  # Coefficients for maximizing 3x1 + 4x2
A = [[4, 2], [2, 5]]  # Inequality constraints
b = [80, 180]
bounds = [(0, None), (0, None)]  # x1, x2 >= 0

# Solve the linear programming problem
result = linprog(c, A_ub=A, b_ub=b, bounds=bounds, method='highs')
x1, x2 = result.x

# Plotting the constraints and solution
x = np.linspace(0, 50, 400)
y1, y2 = (80 - 4*x)/2, (180 - 2*x)/5
plt.plot(x, y1, label=r'$4x_1 + 2x_2 \leq 80$')
plt.plot(x, y2, label=r'$2x_1 + 5x_2 \leq 180$')
plt.fill_between(x, np.minimum(y1, y2), 0, where=(np.minimum(y1, y2) >= 0), color='green', alpha=0.5)
plt.plot(x1, x2, 'ro', label=f'Optimal: x1={x1:.2f}, x2={x2:.2f}')
plt.xlim((0, 50))
plt.ylim((0, 50))
plt.xlabel(r'$x_1$'), plt.ylabel(r'$x_2$')
plt.axhline(0, color='black'), plt.axvline(0, color='black')
plt.legend(), plt.grid(True), plt.show()

# Print the solution
print(f'Optimal solution: x1 = {x1:.2f}, x2 = {x2:.2f}')
print(f'Zmax = {3*x1+4*x2}')