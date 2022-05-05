from tkinter import E


def rectangle(n):
    for i in range(n):
        for j in range(n):
            print("*",end=" ")
        print()


def Hollow_rec(n):
    for i in range(n):
        for j in range(n):
            if i==0 or j==0 or i==n-1 or j==n-1:
                print("* ",end=" ")
            else:
                print("  ",end=" ")
        print()



def right_tir(n):
    for i in range(n):
        for j in range(i):
            print("* ",end=" ")
        print()



def opposite_right_tri(n):
    for i in range(n):
        for j in range(n-i):
            print("* ",end=" ")
        print()


def left_tri(n):
    for i in range(n,0,-1):
        for j in range(i):
            print("  ",end=" ")
        for j in range(n-i):
            print("* ",end=" ")
        print()


def serial_num(n):
    for i in range(n+1):
        for j in range(1,i):
            print(j,end=" ")
        print()


def opposite_serial_num(n):
    for i in range(n):
        for j in range(1,n-i):
            print(j,end=" ")
        print()


def snake_pattern(n):
    num=1
    for i in range(n):
        for j in range(i):
            print(num,end=" ")
            num+=1
        print()


def binary_pattern(n):
    for i in range(n):
        for j in range(i):
            if (i+j)%2==0:
                print(0,end=" ")
            else:
                print(1,end=" ")
        print()


def rohmbus(n):
    for i in range(n):
        for j in range(n-i):
            print("  ",end=" ")
        for j in range(n):
            print("* ",end=" ")
        print()

def pyramid(n):
    for i in range(n):
        for j in range(n-i):
            print("",end=" ")
        for j in range(i):
            print(i,end=" ")
        print()


def pyramid_two(n):
    for i in range(1,n+1):
        for j in range(1,n-i+1):
            print(" ",end=" ")
        for j in range(i,0,-1):
            print(j,end=" ")
        for j in range(2,i+1):
            print(j,end=" ")
        print()


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



def revenum(n):
    num=-1
    for i in range(n,0,-1):
        num += 1
        for j in range(n-num):
            print(i,end=" ")
        print()



#revenum(5)
#diamond(6)
#pyramid_two(5)
#pyramid(5)
#rohmbus(5)
#binary_pattern(5)
#snake_pattern(5)
#opposite_serial_num(5)
#serial_num(5)
#left_tri(5)
#opposite_right_tri(5)
#right_tir(5)
#Hollow_rec(5)
#rectangle(5)