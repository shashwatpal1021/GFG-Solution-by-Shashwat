import random
n=random.random() # 0-1
print(n)

n=random.randint(0,50)
print(n)

n=random.randint(100,200)
print(n)

# using for loop

rand_list = [] 
for i in range(0,10):
    n=random.randint(1,50)
    rand_list.append(n)
print(rand_list)

'''
Using random.sample()
The random module also provides the sample() method, which directly generates a list of random numbers. 
Below is the example of generating random numbers using the sample() method.
'''
random_list = random.sample(range(10, 40), 6)  
print(random_list) 