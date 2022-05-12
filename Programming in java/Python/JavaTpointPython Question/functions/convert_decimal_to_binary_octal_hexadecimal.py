from unicodedata import decimal

def binary(num):
    decimal=int(num)
    print(bin(decimal))

def octal(num):
    decimal=int(num)
    print(oct(decimal))

def hexa(num):
    decimal=int(num)
    print(hex(decimal))

binary(12)
octal(18)
hexa(12)
