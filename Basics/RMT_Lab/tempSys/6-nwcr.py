import numpy as np

def balance_problem(supply, demand):
    """Balance the transportation problem by adding dummy supply or demand."""
    total_supply = sum(supply)
    total_demand = sum(demand)
    
    if total_supply > total_demand:
        # Add dummy demand
        demand.append(total_supply - total_demand)
        # print(f"Added dummy demand: {demand[-1]}")
    elif total_demand > total_supply:
        # Add dummy supply
        supply.append(total_demand - total_supply)
        # print(f"Added dummy supply: {supply[-1]}")
    
    return supply, demand

def northwest_corner_rule(supply, demand):
    """Implement the North-West Corner Rule for transportation problem."""
    rows, cols = len(supply), len(demand)
    allocation = np.zeros((rows, cols))  # Initialize the allocation matrix with zeros

    i = j = 0
    while i < rows and j < cols:
        # Allocate the minimum of supply and demand
        allocation[i][j] = min(supply[i], demand[j])
        if supply[i] < demand[j]:
            demand[j] -= supply[i]
            supply[i] = 0
            i += 1  # Move to the next row
        else:
            supply[i] -= demand[j]
            demand[j] = 0
            j += 1  # Move to the next column

    return allocation

def calculate_total_cost(allocation, cost_matrix):
    """Calculate the total transportation cost."""
    total_cost = 0
    rows, cols = allocation.shape
    for i in range(rows):
        for j in range(cols):
            total_cost += allocation[i][j] * cost_matrix[i][j]
    return total_cost

# Example Inputs for Unbalanced Problem
cost_matrix = np.array([
    [4, 8, 8],
    [16, 24, 16],
    [8, 16, 24]
])  # Original cost matrix

supply = [76, 82, 77]  # Supply
demand = [72, 102, 41]  # Demand

# Balance the problem
supply, demand = balance_problem(supply, demand)

# Update the cost matrix for dummy row/column
if len(supply) > cost_matrix.shape[0]:
    cost_matrix = np.vstack([cost_matrix, np.zeros(cost_matrix.shape[1])])  # Add dummy row
elif len(demand) > cost_matrix.shape[1]:
    cost_matrix = np.hstack([cost_matrix, np.zeros((cost_matrix.shape[0], 1))])  # Add dummy column

# Run NWCR
allocation = northwest_corner_rule(supply, demand)

# Calculate Total Cost
total_cost = calculate_total_cost(allocation, cost_matrix)

# Output
print("Cost Matrix (including dummy):")
print(cost_matrix)
print("Allocation Matrix:")
print(allocation)
print("Total Transportation Cost:", total_cost)