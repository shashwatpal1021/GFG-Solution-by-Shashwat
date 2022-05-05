Stack Data Structure
In this tutorial, you will learn about the stack data structure and its implementation in Python, Java and C/C++.

A stack is a linear data structure that follows the principle of Last In First Out (LIFO). This means the last element inserted inside the stack is removed first.

You can think of the stack data structure as the pile of plates on top of another.

elements on stack are added on top and removed from top just like a pile of plate
Stack representation similar to a pile of plate
Here, you can:

Put a new plate on top
Remove the top plate
And, if you want the plate at the bottom, you must first remove all the plates on top. This is exactly how the stack data structure works.

LIFO Principle of Stack
In programming terms, putting an item on top of the stack is called push and removing an item is called pop.

represent the LIFO principle by using push and pop operation
Stack Push and Pop Operations
In the above image, although item 3 was kept last, it was removed first. This is exactly how the LIFO (Last In First Out) Principle works.

We can implement a stack in any programming language like C, C++, Java, Python or C#, but the specification is pretty much the same.

Basic Operations of Stack
There are some basic operations that allow us to perform different actions on a stack.

Push: Add an element to the top of a stack
Pop: Remove an element from the top of a stack
IsEmpty: Check if the stack is empty
IsFull: Check if the stack is full
Peek: Get the value of the top element without removing it
Working of Stack Data Structure
The operations work as follows:

A pointer called TOP is used to keep track of the top element in the stack.
When initializing the stack, we set its value to -1 so that we can check if the stack is empty by comparing TOP == -1.
On pushing an element, we increase the value of TOP and place the new element in the position pointed to by TOP.
On popping an element, we return the element pointed to by TOP and reduce its value.
Before pushing, we check if the stack is already full
Before popping, we check if the stack is already empty
Adding elements to the top of stack and removing elements from the top of stack
Working of Stack Data Structure
Stack Implementations in Python, Java, C, and C++
The most common stack implementation is using arrays, but it can also be implemented using lists.

Python
Java
C
C++
# Stack implementation in python


# Creating a stack
def create_stack():
    stack = []
    return stack


# Creating an empty stack
def check_empty(stack):
    return len(stack) == 0


# Adding items into the stack
def push(stack, item):
    stack.append(item)
    print("pushed item: " + item)


# Removing an element from the stack
def pop(stack):
    if (check_empty(stack)):
        return "stack is empty"

    return stack.pop()


stack = create_stack()
push(stack, str(1))
push(stack, str(2))
push(stack, str(3))
push(stack, str(4))
print("popped item: " + pop(stack))
print("stack after popping an element: " + str(stack))
Stack Time Complexity
For the array-based implementation of a stack, the push and pop operations take constant time, i.e. O(1).

Applications of Stack Data Structure
Although stack is a simple data structure to implement, it is very powerful. The most common uses of a stack are:

To reverse a word - Put all the letters in a stack and pop them out. Because of the LIFO order of stack, you will get the letters in reverse order.
In compilers - Compilers use the stack to calculate the value of expressions like 2 + 4 / 5 * (7 - 9) by converting the expression to prefix or postfix form.
In browsers - The back button in a browser saves all the URLs you have visited previously in a stack. Each time you visit a new page, it is added on top of the stack. When you press the back button, the current URL is removed from the stack, and the previous URL is accessed.


















Queue Data Structure
In this tutorial, you will learn what a queue is. Also, you will find implementation of queue in C, C++, Java and Python.

A queue is a useful data structure in programming. It is similar to the ticket queue outside a cinema hall, where the first person entering the queue is the first person who gets the ticket.

Queue follows the First In First Out (FIFO) rule - the item that goes in first is the item that comes out first.

Representation of Queue in first in first out principle
FIFO Representation of Queue
In the above image, since 1 was kept in the queue before 2, it is the first to be removed from the queue as well. It follows the FIFO rule.

In programming terms, putting items in the queue is called enqueue, and removing items from the queue is called dequeue.

We can implement the queue in any programming language like C, C++, Java, Python or C#, but the specification is pretty much the same.

Basic Operations of Queue
A queue is an object (an abstract data structure - ADT) that allows the following operations:

Enqueue: Add an element to the end of the queue
Dequeue: Remove an element from the front of the queue
IsEmpty: Check if the queue is empty
IsFull: Check if the queue is full
Peek: Get the value of the front of the queue without removing it
Working of Queue
Queue operations work as follows:

two pointers FRONT and REAR
FRONT track the first element of the queue
REAR track the last element of the queue
initially, set value of FRONT and REAR to -1
Enqueue Operation
check if the queue is full
for the first element, set the value of FRONT to 0
increase the REAR index by 1
add the new element in the position pointed to by REAR
Dequeue Operation
check if the queue is empty
return the value pointed by FRONT
increase the FRONT index by 1
for the last element, reset the values of FRONT and REAR to -1
Demonstrating how front and rear indexes are modified during enqueue and dequeue operations
Enqueue and Dequeue Operations
Queue Implementations in Python, Java, C, and C++
We usually use arrays to implement queues in Java and C/++. In the case of Python, we use lists.

Python
Java
C
C++
# Queue implementation in Python

class Queue:

    def __init__(self):
        self.queue = []

    # Add an element
    def enqueue(self, item):
        self.queue.append(item)

    # Remove an element
    def dequeue(self):
        if len(self.queue) < 1:
            return None
        return self.queue.pop(0)

    # Display  the queue
    def display(self):
        print(self.queue)

    def size(self):
        return len(self.queue)


q = Queue()
q.enqueue(1)
q.enqueue(2)
q.enqueue(3)
q.enqueue(4)
q.enqueue(5)

q.display()

q.dequeue()

print("After removing an element")
q.display()
Limitations of Queue
As you can see in the image below, after a bit of enqueuing and dequeuing, the size of the queue has been reduced.

the empty spaces at front cannot be used after dequeing from a full queue
Limitation of a queue
And we can only add indexes 0 and 1 only when the queue is reset (when all the elements have been dequeued).

After REAR reaches the last index, if we can store extra elements in the empty spaces (0 and 1), we can make use of the empty spaces. This is implemented by a modified queue called the circular queue.

Complexity Analysis
The complexity of enqueue and dequeue operations in a queue using an array is O(1). If you use pop(N) in python code, then the complexity might be O(n) depending on the position of the item to be popped.

Applications of Queue
CPU scheduling, Disk Scheduling
When data is transferred asynchronously between two processes.The queue is used for synchronization. For example: IO Buffers, pipes, file IO, etc
Handling of interrupts in real-time systems.
Call Center phone systems use Queues to hold people calling them in order.
Recommended Readings
Types of Queue
Circular Queue
Deque Data Structure
Priority Queue














Types of Queues
In this tutorial, you will learn different types of queues with along with illustration.

A queue is a useful data structure in programming. It is similar to the ticket queue outside a cinema hall, where the first person entering the queue is the first person who gets the ticket.

There are four different types of queues:

Simple Queue
Circular Queue
Priority Queue
Double Ended Queue
Simple Queue
In a simple queue, insertion takes place at the rear and removal occurs at the front. It strictly follows the FIFO (First in First out) rule.

Simple queue 
Simple Queue Representation
To learn more, visit Queue Data Structure.

Circular Queue
In a circular queue, the last element points to the first element making a circular link.

Circular queue 
Circular Queue Representation
The main advantage of a circular queue over a simple queue is better memory utilization. If the last position is full and the first position is empty, we can insert an element in the first position. This action is not possible in a simple queue.

To learn more, visit Circular Queue Data Structure.

Priority Queue
A priority queue is a special type of queue in which each element is associated with a priority and is served according to its priority. If elements with the same priority occur, they are served according to their order in the queue.

Priority queue
Priority Queue Representation
Insertion occurs based on the arrival of the values and removal occurs based on priority.

To learn more, visit Priority Queue Data Structure.

Deque (Double Ended Queue)
In a double ended queue, insertion and removal of elements can be performed from either from the front or rear. Thus, it does not follow the FIFO (First In First Out) rule.

Double ended queue
Deque Representation






















Circular Queue Data Structure
In this tutorial, you will learn what a circular queue is. Also, you will find implementation of circular queue in C, C++, Java and Python.

A circular queue is the extended version of a regular queue where the last element is connected to the first element. Thus forming a circle-like structure.

Circular increment in circular queue
Circular queue representation
The circular queue solves the major limitation of the normal queue. In a normal queue, after a bit of insertion and deletion, there will be non-usable empty space.

demonstrate how we cannot add element even after removing some element from the queue
Limitation of the regular Queue
Here, indexes 0 and 1 can only be used after resetting the queue (deletion of all elements). This reduces the actual size of the queue.

How Circular Queue Works
Circular Queue works by the process of circular increment i.e. when we try to increment the pointer and we reach the end of the queue, we start from the beginning of the queue.

Here, the circular increment is performed by modulo division with the queue size. That is,


if REAR + 1 == 5 (overflow!), REAR = (REAR + 1)%5 = 0 (start of queue)
Circular Queue Operations
The circular queue work as follows:

two pointers FRONT and REAR
FRONT track the first element of the queue
REAR track the last elements of the queue
initially, set value of FRONT and REAR to -1
1. Enqueue Operation
check if the queue is full
for the first element, set value of FRONT to 0
circularly increase the REAR index by 1 (i.e. if the rear reaches the end, next it would be at the start of the queue)
add the new element in the position pointed to by REAR
2. Dequeue Operation
check if the queue is empty
return the value pointed by FRONT
circularly increase the FRONT index by 1
for the last element, reset the values of FRONT and REAR to -1
However, the check for full queue has a new additional case:

Case 1: FRONT = 0 && REAR == SIZE - 1
Case 2: FRONT = REAR + 1
The second case happens when REAR starts from 0 due to circular increment and when its value is just 1 less than FRONT, the queue is full.

enqueue and dequeue operation of the circular queue
Enque and Deque Operations
Circular Queue Implementations in Python, Java, C, and C++
The most common queue implementation is using arrays, but it can also be implemented using lists.

Python
Java
C
C+
# Circular Queue implementation in Python


class MyCircularQueue():

    def __init__(self, k):
        self.k = k
        self.queue = [None] * k
        self.head = self.tail = -1

    # Insert an element into the circular queue
    def enqueue(self, data):

        if ((self.tail + 1) % self.k == self.head):
            print("The circular queue is full\n")

        elif (self.head == -1):
            self.head = 0
            self.tail = 0
            self.queue[self.tail] = data
        else:
            self.tail = (self.tail + 1) % self.k
            self.queue[self.tail] = data

    # Delete an element from the circular queue
    def dequeue(self):
        if (self.head == -1):
            print("The circular queue is empty\n")

        elif (self.head == self.tail):
            temp = self.queue[self.head]
            self.head = -1
            self.tail = -1
            return temp
        else:
            temp = self.queue[self.head]
            self.head = (self.head + 1) % self.k
            return temp

    def printCQueue(self):
        if(self.head == -1):
            print("No element in the circular queue")

        elif (self.tail >= self.head):
            for i in range(self.head, self.tail + 1):
                print(self.queue[i], end=" ")
            print()
        else:
            for i in range(self.head, self.k):
                print(self.queue[i], end=" ")
            for i in range(0, self.tail + 1):
                print(self.queue[i], end=" ")
            print()


# Your MyCircularQueue object will be instantiated and called as such:
obj = MyCircularQueue(5)
obj.enqueue(1)
obj.enqueue(2)
obj.enqueue(3)
obj.enqueue(4)
obj.enqueue(5)
print("Initial queue")
obj.printCQueue()

obj.dequeue()
print("After removing an element from the queue")
obj.printCQueue()
Circular Queue Complexity Analysis
The complexity of the enqueue and dequeue operations of a circular queue is O(1) for (array implementations).

Applications of Circular Queue
CPU scheduling
Memory management
Traffic Management


















Priority Queue
In this tutorial, you will learn what priority queue is. Also, you will learn about it's implementations in Python, Java, C, and C++.

A priority queue is a special type of queue in which each element is associated with a priority value. And, elements are served on the basis of their priority. That is, higher priority elements are served first.

However, if elements with the same priority occur, they are served according to their order in the queue.

Assigning Priority Value

Generally, the value of the element itself is considered for assigning the priority. For example,

The element with the highest value is considered the highest priority element. However, in other cases, we can assume the element with the lowest value as the highest priority element.

We can also set priorities according to our needs.

the element with highest priority is removed from the priority queue
Removing Highest Priority Element
Difference between Priority Queue and Normal Queue
In a queue, the first-in-first-out rule is implemented whereas, in a priority queue, the values are removed on the basis of priority. The element with the highest priority is removed first.

Implementation of Priority Queue
Priority queue can be implemented using an array, a linked list, a heap data structure, or a binary search tree. Among these data structures, heap data structure provides an efficient implementation of priority queues.

Hence, we will be using the heap data structure to implement the priority queue in this tutorial. A max-heap is implement is in the following operations. If you want to learn more about it, please visit max-heap and mean-heap.

A comparative analysis of different implementations of priority queue is given below.

Operations	peek	insert	delete
Linked List	O(1)	O(n)	O(1)
Binary Heap	O(1)	O(log n)	O(log n)
Binary Search Tree	O(1)	O(log n)	O(log n)
Priority Queue Operations
Basic operations of a priority queue are inserting, removing, and peeking elements.

Before studying the priority queue, please refer to the heap data structure for a better understanding of binary heap as it is used to implement the priority queue in this article.

1. Inserting an Element into the Priority Queue
Inserting an element into a priority queue (max-heap) is done by the following steps.

Insert the new element at the end of the tree.
insert an element at the end of the priority queue
Insert an element at the end of the queue
Heapify the tree.
heapify the priority queue after inserting new element
Heapify after insertion
Algorithm for insertion of an element into priority queue (max-heap)

If there is no node, 
  create a newNode.
else (a node is already present)
  insert the newNode at the end (last node from left to right.)
  
heapify the array
For Min Heap, the above algorithm is modified so that parentNode is always smaller than newNode.

2. Deleting an Element from the Priority Queue
Deleting an element from a priority queue (max-heap) is done as follows:

Select the element to be deleted.
choose the element to be deleted from the priority queue
Select the element to be deleted
Swap it with the last element.
swap the element to be deleted with the last leaf node element
Swap with the last leaf node element
Remove the last element.
remove the last leaf node element
Remove the last element leaf
Heapify the tree.
heapify the priority queue
Heapify the priority queue
Algorithm for deletion of an element in the priority queue (max-heap)

If nodeToBeDeleted is the leafNode
  remove the node
Else swap nodeToBeDeleted with the lastLeafNode
  remove noteToBeDeleted
   
heapify the array
For Min Heap, the above algorithm is modified so that the both childNodes are smaller than currentNode.

3. Peeking from the Priority Queue (Find max/min)
Peek operation returns the maximum element from Max Heap or minimum element from Min Heap without deleting the node.

For both Max heap and Min Heap

return rootNode
4. Extract-Max/Min from the Priority Queue
Extract-Max returns the node with maximum value after removing it from a Max Heap whereas Extract-Min returns the node with minimum value after removing it from Min Heap.

Priority Queue Implementations in Python, Java, C, and C++
Python
Java
C
C++
# Priority Queue implementation in Python


# Function to heapify the tree
def heapify(arr, n, i):
    # Find the largest among root, left child and right child
    largest = i
    l = 2 * i + 1
    r = 2 * i + 2

    if l < n and arr[i] < arr[l]:
        largest = l

    if r < n and arr[largest] < arr[r]:
        largest = r

    # Swap and continue heapifying if root is not largest
    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]
        heapify(arr, n, largest)


# Function to insert an element into the tree
def insert(array, newNum):
    size = len(array)
    if size == 0:
        array.append(newNum)
    else:
        array.append(newNum)
        for i in range((size // 2) - 1, -1, -1):
            heapify(array, size, i)


# Function to delete an element from the tree
def deleteNode(array, num):
    size = len(array)
    i = 0
    for i in range(0, size):
        if num == array[i]:
            break

    array[i], array[size - 1] = array[size - 1], array[i]

    array.remove(size - 1)

    for i in range((len(array) // 2) - 1, -1, -1):
        heapify(array, len(array), i)


arr = []

insert(arr, 3)
insert(arr, 4)
insert(arr, 9)
insert(arr, 5)
insert(arr, 2)

print ("Max-Heap array: " + str(arr))

deleteNode(arr, 4)
print("After deleting an element: " + str(arr))
Priority Queue Applications
Some of the applications of a priority queue are:

Dijkstra's algorithm
for implementing stack
for load balancing and interrupt handling in an operating system
for data compression in Huffman code















Deque Data Structure
In this tutorial, you will learn what a double ended queue (deque) is. Also, you will find working examples of different operations on a deque in C, C++, Java and Python.

Deque or Double Ended Queue is a type of queue in which insertion and removal of elements can either be performed from the front or the rear. Thus, it does not follow FIFO rule (First In First Out).

representation of deque data structure
Representation of Deque
Types of Deque
Input Restricted Deque
In this deque, input is restricted at a single end but allows deletion at both the ends.
Output Restricted Deque
In this deque, output is restricted at a single end but allows insertion at both the ends.
Operations on a Deque
Below is the circular array implementation of deque. In a circular array, if the array is full, we start from the beginning.

But in a linear array implementation, if the array is full, no more elements can be inserted. In each of the operations below, if the array is full, "overflow message" is thrown.

Before performing the following operations, these steps are followed.

Take an array (deque) of size n.
Set two pointers at the first position and set front = -1 and rear = 0.
initialize an array and pointers for deque operations
Initialize an array and pointers for deque
1. Insert at the Front
This operation adds an element at the front.

Check the position of front.
check the position of front
Check the position of front
If front < 1, reinitialize front = n-1 (last index).
if front is less than 1 shift front to the end
Shift front to the end
Else, decrease front by 1.
Add the new key 5 into array[front].
Insert element at the position of front
Insert the element at Front
2. Insert at the Rear
This operation adds an element to the rear.

Check if the array is full.
check if deque is full
Check if deque is full
If the deque is full, reinitialize rear = 0.
Else, increase rear by 1.
if deque is not full increase rear
Increase the rear
Add the new key 5 into array[rear].
insert element at the rear
Insert the element at rear
3. Delete from the Front
The operation deletes an element from the front.

Check if the deque is empty.
check if deque is empty
Check if deque is empty
If the deque is empty (i.e. front = -1), deletion cannot be performed (underflow condition).
If the deque has only one element (i.e. front = rear), set front = -1 and rear = -1.
Else if front is at the end (i.e. front = n - 1), set go to the front front = 0.
Else, front = front + 1.
increase the index of front
Increase the front
4. Delete from the Rear
This operation deletes an element from the rear.

Check if the deque is empty.
check if deque is empty
Check if deque is empty
If the deque is empty (i.e. front = -1), deletion cannot be performed (underflow condition).
If the deque has only one element (i.e. front = rear), set front = -1 and rear = -1, else follow the steps below.
If rear is at the front (i.e. rear = 0), set go to the front rear = n - 1.
Else, rear = rear - 1.
decrease the position of rear
Decrease the rear
5. Check Empty
This operation checks if the deque is empty. If front = -1, the deque is empty.

6. Check Full
This operation checks if the deque is full. If front = 0 and rear = n - 1 OR front = rear + 1, the deque is full.

Deque Implementation in Python, Java, C, and C++
Python
Java
C
C++
# Deque implementaion in python

class Deque:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def addRear(self, item):
        self.items.append(item)

    def addFront(self, item):
        self.items.insert(0, item)

    def removeFront(self):
        return self.items.pop(0)

    def removeRear(self):
        return self.items.pop()

    def size(self):
        return len(self.items)


d = Deque()
print(d.isEmpty())
d.addRear(8)
d.addRear(5)
d.addFront(7)
d.addFront(10)
print(d.size())
print(d.isEmpty())
d.addRear(11)
print(d.removeRear())
print(d.removeFront())
d.addFront(55)
d.addRear(45)
print(d.items)
Time Complexity
The time complexity of all the above operations is constant i.e. O(1).

Applications of Deque Data Structure
In undo operations on software.
To store history in browsers.
For implementing both stacks and queues.

