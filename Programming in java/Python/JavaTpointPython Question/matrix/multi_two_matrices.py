x= [[5, 4, 3],  
    [2, 4, 6],  
    [4, 7, 9]]

y=[[3, 2, 4],  
    [4, 3, 6],  
    [2, 7, 5]]

res=[[0,0,0],[0,0,0],[0,0,0]]
# i will run through each row of matrix1
for i in range(len(x)):
# j will run through each column of matrix 2
    for j in range(len(y[0])):
    # k will run through each row of matrix 2
        for k in range(len(y)):
            res[i][j] += x[i][k] * y[k][j]
for r in res:
    print(r)