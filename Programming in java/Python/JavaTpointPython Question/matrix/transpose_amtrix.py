A=[[1,2,3],
    [4,5,6],
    [7,8,9]]
res=[[0,0,0],
    [0,0,0],
    [0,0,0]]

# for j in range(len(A)):
#     for i in range(len(A[0])):
#         res[i][j] = A[j][i]

     
# for r in res:
#     print(r)

for i in range(len(A)):
    for j in range(len(A[0])):
        print(A[j][i],end=" ")
    print()