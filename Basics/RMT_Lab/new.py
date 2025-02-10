# Given data
supply = [20, 30, 50]
demand = [30, 40, 30]
cost = [[8, 6, 10], [9, 12, 13], [14, 9, 16]]
rows = len(supply)
cols = len(demand)

# Initialize allocation matrix with zero
allocation = [[0] * cols for _ in range(rows)]
i = 0  # For supply
j = 0  # For demand

# NWCR Algorithm
while i < rows and j < cols:
    # Allocation min cost
    allocation_amount = min(supply[i], demand[j])
    allocation[i][j] = allocation_amount
    supply[i] -= allocation_amount
    demand[j] -= allocation_amount

    # Move to next row or col
    if supply[i] == 0:
        i += 1
    if demand[j] == 0:
        j += 1

# Output the allocation matrix
print("Allocation matrix:")
for row in allocation:
    print(row)

# Calculate the transportation cost
total_cost = 0
for i in range(rows):
    for j in range(cols):
        total_cost += allocation[i][j] * cost[i][j]

# Output the total cost
print("Total transportation cost:", total_cost)