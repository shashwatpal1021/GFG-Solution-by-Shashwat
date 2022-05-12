# append(elmt)

# insert(index,ele)

# extends(iterable)

names = ["Joseph", "Peter", "Cook", "Tim"]  
print('Current names List is:', names)  
new_name = input("Please enter a name:\n")  
names.append(new_name)  # Using the append() function  
  
print('Updated name List is:', names)  



list1 = [10, 20, 30, 40, 50]  
print('Current Numbers List: ', list1)  
el = list1.insert(3, 77)  
print("The new list is: ",list1)  
n = int(input("enter a number to add to list:\n")) 
index = int(input('enter the index to add the number:\n'))  
list1.insert(index, n)  

print('Updated Numbers List:', list1)  


list1 = [10,20,30]  
list1.extend(["52.10", "43.12" ])  # extending list elements  
print(list1)  
list1.extend((40, 30))  # extending tuple elements  
print(list1)  
list1.extend("Apple")  # extending string elements  
print(list1)  