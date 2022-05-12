from tkinter import E


def rectangle(n):
    for i in range(n):
        for j in range(n):
            print("*",end=" ")
        print()
'''

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

'''

def Hollow_rec(n):
    for i in range(n):
        for j in range(n):
            if i==0 or j==0 or i==n-1 or j==n-1:
                print("* ",end=" ")
            else:
                print("  ",end=" ")
        print()

'''

*  *  *  *  *
*           *
*           *
*           *
*  *  *  *  *

'''

def right_tir(n):
    for i in range(n):
        for j in range(i):
            print("* ",end=" ")
        print()


'''
*
*  *
*  *  *
*  *  *  *
'''

def opposite_right_tri(n):
    for i in range(n):
        for j in range(n-i):
            print("* ",end=" ")
        print()

'''

*  *  *  *  *
*  *  *  *
*  *  *  
*  *
*

'''

def left_tri(n):
    for i in range(n,0,-1):
        for j in range(i):
            print("  ",end=" ")
        for j in range(n-i):
            print("* ",end=" ")
        print()

'''

            *
         *  *
      *  *  *
   *  *  *  *
'''

def serial_num(n):
    for i in range(n+1):
        for j in range(1,i):
            print(j,end=" ")
        print()

'''

1
1 2
1 2 3
1 2 3 4
'''

def opposite_serial_num(n):
    for i in range(n):
        for j in range(1,n-i):
            print(j,end=" ")
        print()

'''
1 2 3 4
1 2 3
1 2
1
'''
def snake_pattern(n):
    num=1
    for i in range(n):
        for j in range(i):
            print(num,end=" ")
            num+=1
        print()
'''

1
2 3
4 5 6
7 8 9 10

'''

def binary_pattern(n):
    for i in range(n):
        for j in range(i):
            if (i+j)%2==0:
                print(0,end=" ")
            else:
                print(1,end=" ")
        print()

'''

1
0 1
1 0 1
0 1 0 1

'''
def rohmbus(n):
    for i in range(n):
        for j in range(n-i):
            print("  ",end=" ")
        for j in range(n):
            print("* ",end=" ")
        print()

'''


               *  *  *  *  *
            *  *  *  *  *
         *  *  *  *  *
      *  *  *  *  *
   *  *  *  *  *

'''
def pyramid(n):
    for i in range(n):
        for j in range(n-i):
            print("",end=" ")
        for j in range(i):
            print(i,end=" ")
        print()

'''

    1
   2 2
  3 3 3
 4 4 4 4 

'''

def pyramid_two(n):
    for i in range(1,n+1):
        for j in range(1,n-i+1):
            print(" ",end=" ")
        for j in range(i,0,-1):
            print(j,end=" ")
        for j in range(2,i+1):
            print(j,end=" ")
        print()
'''

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

'''

def diamond(n):
    for i in range(n):
        for j in range(n-i):
            print("",end=" ")
        for j in range(i):
            print("*",end=" ")
        print()
    for i in range(n,0,-1):
        for j in range(n-i):
            print("",end=" ")
        for j in range(i):
            print("*",end=" ")
        print()

'''

     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

'''

def revenum(n):
    num=-1
    for i in range(n,0,-1):
        num += 1
        for j in range(n-num):
            print(i,end=" ")
        print()

'''
5 5 5 5 5 
4 4 4 4
3 3 3
2 2
1
'''
def num(n):
    for i in range(n+1):
        for j in range(n-i):
            print(" ",end=" ")
        for j in range(n-i,n+1):
            print(j,end=" ")
        print()

'''
          5 
        4 5 
      3 4 5 
    2 3 4 5 
  1 2 3 4 5 
0 1 2 3 4 5 

'''
#num(5)
# print()
# revenum(5)
# print()
# diamond(6)
# print()
# pyramid_two(5)
# print()
# pyramid(5)
# print()
# rohmbus(5)
# print()
# binary_pattern(5)
# print()
# snake_pattern(5)
# print()
# opposite_serial_num(5)
# print()
# serial_num(5)
# print()
# left_tri(5)
# print()
# opposite_right_tri(5)
# print()
# right_tir(5)
# print()
# Hollow_rec(5)
# print()
# rectangle(5)