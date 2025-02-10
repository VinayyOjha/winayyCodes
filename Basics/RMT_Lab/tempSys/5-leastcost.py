#### Least cost method
def leastCost(rows_num):
    rows=[[4,8,8,6],[6,4,3,7],[5,6,8,4]] ## balanced
    # rows=[[5,8,6,9],[4,7,3,6],[7,5,4,8]]  ## unbalanced
    # rows=[]
    # for i in range(rows_num):
        # values=list(map(int,input(f"enter values of row_{i+1} :- ").split()))
        # rows.append(values)
    # demand=list(map(int,input("enter demand :- ").split()))
    demand=[90,80,100,30] # balanced
    # demand=[80,70,60,150] ## unbalanced
    # supply=list(map(int,input("enter supply :- ").split()))
    supply=[100,120,80]   # balanced
    # supply=[120,100,90]   ## unbalanced
    ignore_list=[[],[]]     # [row,column]
    
    
    ### code for unbalanced problem
    if(sum(demand)>sum(supply)):
        rows.append([0]*len(rows[0]))
        supply.append(sum(demand)-sum(supply))
        rows_num+=1
    elif(sum(demand)<sum(supply)):
        for i in rows:
            i.append(0)
            demand.append(sum(supply)-sum(demand))
    else:
        pass
    
    rows_cost=[[0]*len(rows[0]) for _ in range(rows_num)]
    
    while True:
        min_ele_details=[]
        for i in range(rows_num):
            for j in range(len(rows[0])):
                if(i not in ignore_list[0] and j not in ignore_list[1]):
                    min_ele_details.append(rows[i][j])
                    min_ele_details.append(i)
                    min_ele_details.append(j)
                    break
        
        for i in range(rows_num):
            for j in range(len(rows[0])):
                if(i not in ignore_list[0] and j not in ignore_list[1] and min_ele_details[0]>rows[i][j]):
                    min_ele_details[0]=rows[i][j]
                    min_ele_details[1]=i
                    min_ele_details[2]=j
        
        rows_cost[min_ele_details[1]][min_ele_details[2]]=min(demand[min_ele_details[2]],supply[min_ele_details[1]])
        demand[min_ele_details[2]]=demand[min_ele_details[2]]-rows_cost[min_ele_details[1]][min_ele_details[2]]
        supply[min_ele_details[1]]=supply[min_ele_details[1]]-rows_cost[min_ele_details[1]][min_ele_details[2]]
        
        if(demand[min_ele_details[2]]==0):
            ignore_list[1].append(min_ele_details[2])
        else:
            ignore_list[0].append(min_ele_details[1])
            
        if(max(demand)==0 and max(supply)==0):
            break
    optimize_answer=0
    for i in range(len(rows)):
        for j in range(len(rows[0])):
            optimize_answer+=rows[i][j]*rows_cost[i][j]
    print(rows_cost)
    return optimize_answer    

if __name__=="__main__":
    # rows_num=int(input("enter number of rows :- "))
    print(f"optimal solution is :- {leastCost(rows_num=3)}")