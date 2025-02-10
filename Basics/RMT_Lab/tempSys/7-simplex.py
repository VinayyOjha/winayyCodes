from scipy.optimize import linprog

# Coefficients of the objective function (note: we minimize the negative for maximization)
c = [-3, -2]  # Objective function coefficients for maximizing Z = 3x1 + 2x2

# Coefficients for the inequality constraints (A_ub * x <= b_ub)
A = [
    [1, 1],   # Coefficients for the first constraint x1 + x2 <= 4
    [1, -1]   # Coefficients for the second constraint x1 - x2 <= 2
]

b = [4, 2]  # The right-hand side values for the inequality constraints

# Bounds for the variables (x1, x2 >= 0)
x0_bounds = (0, None)  # x1 >= 0
x1_bounds = (0, None)  # x2 >= 0

# Solve the linear programming problem using the simplex method
result = linprog(c, A_ub=A, b_ub=b, bounds=[x0_bounds, x1_bounds], method='simplex')

# Output the results
if result.success:
    print(f'Optimal solution: x1 = {result.x[0]:.2f}, x2 = {result.x[1]:.2f}')
    print(f'Maximized value of Z: {-result.fun:.2f}')  # Negate the objective function value to get the maximized result
else:
    print('No solution found.')