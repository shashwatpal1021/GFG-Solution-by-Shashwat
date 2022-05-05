Linked list Data Structure
In this tutorial, you will learn about linked list data structure and it's implementation in Python, Java, C, and C++.

A linked list is a linear data structure that includes a series of connected nodes. Here, each node stores the data and the address of the next node. For example,

linked list data structure
Linked list Data Structure
You have to start somewhere, so we give the address of the first node a special name called HEAD. Also, the last node in the linked list can be identified because its next portion points to NULL.

Linked lists can be of multiple types: singly, doubly, and circular linked list. In this article, we will focus on the singly linked list. To learn about other types, visit Types of Linked List.

Note: You might have played the game Treasure Hunt, where each clue includes the information about the next clue. That is how the linked list operates.

Representation of Linked List
Let's see how each node of the linked list is represented. Each node consists:

A data item
An address of another node
We wrap both the data item and the next node reference in a struct as:

struct node
{
  int data;
  struct node *next;
};
Understanding the structure of a linked list node is the key to having a grasp on it.

Each struct node has a data item and a pointer to another struct node. Let us create a simple Linked List with three items to understand how this works.

/* Initialize nodes */
struct node *head;
struct node *one = NULL;
struct node *two = NULL;
struct node *three = NULL;

/* Allocate memory */
one = malloc(sizeof(struct node));
two = malloc(sizeof(struct node));
three = malloc(sizeof(struct node));

/* Assign data values */
one->data = 1;
two->data = 2;
three->data=3;

/* Connect nodes */
one->next = two;
two->next = three;
three->next = NULL;

/* Save address of first node in head */
head = one;
If you didn't understand any of the lines above, all you need is a refresher on pointers and structs.

In just a few steps, we have created a simple linked list with three nodes.

representing linked list by connecting each node with next node using address of next node
Linked list Representation
The power of a linked list comes from the ability to break the chain and rejoin it. E.g. if you wanted to put an element 4 between 1 and 2, the steps would be:

Create a new struct node and allocate memory to it.
Add its data value as 4
Point its next pointer to the struct node containing 2 as the data value
Change the next pointer of "1" to the node we just created.
Doing something similar in an array would have required shifting the positions of all the subsequent elements.

In python and Java, the linked list can be implemented using classes as shown in the codes below.

Linked List Utility
Lists are one of the most popular and efficient data structures, with implementation in every programming language like C, C++, Python, Java, and C#.

Apart from that, linked lists are a great way to learn how pointers work. By practicing how to manipulate linked lists, you can prepare yourself to learn more advanced data structures like graphs and trees.

Linked List Implementations in Python, Java, C, and C++ Examples
Python
Java
C
C++
# Linked list implementation in Python


class Node:
    # Creating a node
    def __init__(self, item):
        self.item = item
        self.next = None


class LinkedList:

    def __init__(self):
        self.head = None


if __name__ == '__main__':

    linked_list = LinkedList()

    # Assign item values
    linked_list.head = Node(1)
    second = Node(2)
    third = Node(3)

    # Connect nodes
    linked_list.head.next = second
    second.next = third

    # Print the linked list item
    while linked_list.head != None:
        print(linked_list.head.item, end=" ")
        linked_list.head = linked_list.head.next
Linked List Complexity
Time Complexity

 	Worst case	Average Case
Search	O(n)	O(n)
Insert	O(1)	O(1)
Deletion	O(1)	O(1)
Space Complexity: O(n)

Linked List Applications
Dynamic memory allocation
Implemented in stack and queue
In undo functionality of softwares
Hash tables, Graphs
Recommended Readings
1. Tutorials
Linked List Operations (Traverse, Insert, Delete)
Types of Linked List
Java LinkedList
2. Examples
Get the middle element of Linked List in a single iteration
Convert the Linked List into an Array and vice versa
Detect loop in a Linked List

















Linked List Operations: Traverse, Insert and Delete
In this tutorial, you will learn different operations on a linked list. Also, you will find implementation of linked list operations in C/C++, Python and Java.

There are various linked list operations that allow us to perform different actions on linked lists. For example, the insertion operation adds a new element to the linked list.

Here's a list of basic linked list operations that we will cover in this article.

Traversal - access each element of the linked list
Insertion - adds a new element to the linked list
Deletion - removes the existing elements
Search - find a node in the linked list
Sort - sort the nodes of the linked list
Before you learn about linked list operations in detail, make sure to know about Linked List first.

Things to Remember about Linked List
head points to the first node of the linked list
next pointer of the last node is NULL, so if the next current node is NULL, we have reached the end of the linked list.
In all of the examples, we will assume that the linked list has three nodes 1 --->2 --->3 with node structure as below:

struct node {
  int data;
  struct node *next;
};
Traverse a Linked List
Displaying the contents of a linked list is very simple. We keep moving the temp node to the next one and display its contents.

When temp is NULL, we know that we have reached the end of the linked list so we get out of the while loop.

struct node *temp = head;
printf("\n\nList elements are - \n");
while(temp != NULL) {
  printf("%d --->",temp->data);
  temp = temp->next;
}
The output of this program will be:

List elements are - 
1 --->2 --->3 --->
Insert Elements to a Linked List
You can add elements to either the beginning, middle or end of the linked list.

1. Insert at the beginning
Allocate memory for new node
Store data
Change next of new node to point to head
Change head to point to recently created node
struct node *newNode;
newNode = malloc(sizeof(struct node));
newNode->data = 4;
newNode->next = head;
head = newNode;
2. Insert at the End
Allocate memory for new node
Store data
Traverse to last node
Change next of last node to recently created node
struct node *newNode;
newNode = malloc(sizeof(struct node));
newNode->data = 4;
newNode->next = NULL;

struct node *temp = head;
while(temp->next != NULL){
  temp = temp->next;
}

temp->next = newNode;
3. Insert at the Middle
Allocate memory and store data for new node
Traverse to node just before the required position of new node
Change next pointers to include new node in between
struct node *newNode;
newNode = malloc(sizeof(struct node));
newNode->data = 4;

struct node *temp = head;

for(int i=2; i < position; i++) {
  if(temp->next != NULL) {
    temp = temp->next;
  }
}
newNode->next = temp->next;
temp->next = newNode;
Delete from a Linked List
You can delete either from the beginning, end or from a particular position.

1. Delete from beginning
Point head to the second node
head = head->next;
2. Delete from end
Traverse to second last element
Change its next pointer to null
struct node* temp = head;
while(temp->next->next!=NULL){
  temp = temp->next;
}
temp->next = NULL;
3. Delete from middle
Traverse to element before the element to be deleted
Change next pointers to exclude the node from the chain
for(int i=2; i< position; i++) {
  if(temp->next!=NULL) {
    temp = temp->next;
  }
}

temp->next = temp->next->next;
Search an Element on a Linked List
You can search an element on a linked list using a loop using the following steps. We are finding item on a linked list.

Make head as the current node.
Run a loop until the current node is NULL because the last element points to NULL.
In each iteration, check if the key of the node is equal to item. If it the key matches the item, return true otherwise return false.
// Search a node
bool searchNode(struct Node** head_ref, int key) {
  struct Node* current = *head_ref;

  while (current != NULL) {
    if (current->data == key) return true;
      current = current->next;
  }
  return false;
}
Sort Elements of a Linked List
We will use a simple sorting algorithm, Bubble Sort, to sort the elements of a linked list in ascending order below.

Make the head as the current node and create another node index for later use.
If head is null, return.
Else, run a loop till the last node (i.e. NULL).
In each iteration, follow the following step 5-6.
Store the next node of current in index.
Check if the data of the current node is greater than the next node. If it is greater, swap current and index.
Check the article on bubble sort for better understanding of its working.

// Sort the linked list
void sortLinkedList(struct Node** head_ref) {
  struct Node *current = *head_ref, *index = NULL;
  int temp;

  if (head_ref == NULL) {
    return;
  } else {
    while (current != NULL) {
      // index points to the node next to current
      index = current->next;

  	while (index != NULL) {
        if (current->data > index->data) {
          temp = current->data;
          current->data = index->data;
          index->data = temp;
    	  }
    	  index = index->next;
  	}
  	current = current->next;
    }
  }
}
LinkedList Operations in Python, Java, C, and C++
Python
Java
C
C++
# Linked list operations in Python


# Create a node
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:

    def __init__(self):
        self.head = None

    # Insert at the beginning
    def insertAtBeginning(self, new_data):
        new_node = Node(new_data)

        new_node.next = self.head
        self.head = new_node

    # Insert after a node
    def insertAfter(self, prev_node, new_data):

        if prev_node is None:
            print("The given previous node must inLinkedList.")
            return

















Types of Linked List - Singly linked, doubly linked and circular
In this tutorial, you will learn different types of linked list. Also, you will find implementation of linked list in C.

Before you learn about the type of the linked list, make sure you know about the LinkedList Data Structure.

There are three common types of Linked List.

Singly Linked List
Doubly Linked List
Circular Linked List
Singly Linked List
It is the most common. Each node has data and a pointer to the next node.

singly linked list
Singly linked list
Node is represented as:

struct node {
    int data;
    struct node *next;
}
A three-member singly linked list can be created as:

/* Initialize nodes */
struct node *head;
struct node *one = NULL;
struct node *two = NULL;
struct node *three = NULL;

/* Allocate memory */
one = malloc(sizeof(struct node));
two = malloc(sizeof(struct node));
three = malloc(sizeof(struct node));

/* Assign data values */
one->data = 1;
two->data = 2;
three->data = 3;

/* Connect nodes */
one->next = two;
two->next = three;
three->next = NULL;

/* Save address of first node in head */
head = one;
Doubly Linked List
We add a pointer to the previous node in a doubly-linked list. Thus, we can go in either direction: forward or backward.

doubly linked list
Doubly linked list
A node is represented as

struct node {
    int data;
    struct node *next;
    struct node *prev;
}
A three-member doubly linked list can be created as

/* Initialize nodes */
struct node *head;
struct node *one = NULL;
struct node *two = NULL;
struct node *three = NULL;

/* Allocate memory */
one = malloc(sizeof(struct node));
two = malloc(sizeof(struct node));
three = malloc(sizeof(struct node));

/* Assign data values */
one->data = 1;
two->data = 2;
three->data = 3;

/* Connect nodes */
one->next = two;
one->prev = NULL;

two->next = three;
two->prev = one;

three->next = NULL;
three->prev = two;

/* Save address of first node in head */
head = one;
If you want to learn more about it, please visit doubly linked list and operations on it.

Circular Linked List
A circular linked list is a variation of a linked list in which the last element is linked to the first element. This forms a circular loop.

circular linked list
Circular linked list
A circular linked list can be either singly linked or doubly linked.

for singly linked list, next pointer of last item points to the first item
In the doubly linked list, prev pointer of the first item points to the last item as well.
A three-member circular singly linked list can be created as:

/* Initialize nodes */
struct node *head;
struct node *one = NULL;
struct node *two = NULL;
struct node *three = NULL;

/* Allocate memory */
one = malloc(sizeof(struct node));
two = malloc(sizeof(struct node));
three = malloc(sizeof(struct node));

/* Assign data values */
one->data = 1;
two->data = 2;
three->data = 3;

/* Connect nodes */
one->next = two;
two->next = three;
three->next = one;

/* Save address of first node in head */
head = one;
If you want to learn more about it, please visit circular linked list and operations on it.






















Hash Table
In this tutorial, you will learn what hash table is. Also, you will find working examples of hash table operations in C, C++, Java and Python.

The Hash table data structure stores elements in key-value pairs where

Key- unique integer that is used for indexing the values
Value - data that are associated with keys.
Hash Table key and data
Key and Value in Hash table
Hashing (Hash Function)
In a hash table, a new index is processed using the keys. And, the element corresponding to that key is stored in the index. This process is called hashing.

Let k be a key and h(x) be a hash function.

Here, h(k) will give us a new index to store the element linked with k.

Hash Table representation
Hash table Representation
To learn more, visit Hashing.

Hash Collision
When the hash function generates the same index for multiple keys, there will be a conflict (what value to be stored in that index). This is called a hash collision.

We can resolve the hash collision using one of the following techniques.

Collision resolution by chaining
Open Addressing: Linear/Quadratic Probing and Double Hashing
1. Collision resolution by chaining
In chaining, if a hash function produces the same index for multiple elements, these elements are stored in the same index by using a doubly-linked list.

If j is the slot for multiple elements, it contains a pointer to the head of the list of elements. If no element is present, j contains NIL.

chaining method used to resolve collision in hash table
Collision Resolution using chaining
Pseudocode for operations

chainedHashSearch(T, k)
  return T[h(k)]
chainedHashInsert(T, x)
  T[h(x.key)] = x //insert at the head
chainedHashDelete(T, x)
  T[h(x.key)] = NIL
2. Open Addressing
Unlike chaining, open addressing doesn't store multiple elements into the same slot. Here, each slot is either filled with a single key or left NIL.

Different techniques used in open addressing are:

i. Linear Probing
In linear probing, collision is resolved by checking the next slot.

h(k, i) = (h′(k) + i) mod m

where

i = {0, 1, ….}
h'(k) is a new hash function
If a collision occurs at h(k, 0), then h(k, 1) is checked. In this way, the value of i is incremented linearly.

The problem with linear probing is that a cluster of adjacent slots is filled. When inserting a new element, the entire cluster must be traversed. This adds to the time required to perform operations on the hash table.

ii. Quadratic Probing
It works similar to linear probing but the spacing between the slots is increased (greater than one) by using the following relation.

h(k, i) = (h′(k) + c1i + c2i2) mod m

where,

c1 and c2 are positive auxiliary constants,
i = {0, 1, ….}
iii. Double hashing
If a collision occurs after applying a hash function h(k), then another hash function is calculated for finding the next slot.

h(k, i) = (h1(k) + ih2(k)) mod m

Good Hash Functions
A good hash function may not prevent the collisions completely however it can reduce the number of collisions.

Here, we will look into different methods to find a good hash function

1. Division Method
If k is a key and m is the size of the hash table, the hash function h() is calculated as:

h(k) = k mod m

For example, If the size of a hash table is 10 and k = 112 then h(k) = 112 mod 10 = 2. The value of m must not be the powers of 2. This is because the powers of 2 in binary format are 10, 100, 1000, …. When we find k mod m, we will always get the lower order p-bits.

if m = 22, k = 17, then h(k) = 17 mod 22 = 10001 mod 100 = 01
if m = 23, k = 17, then h(k) = 17 mod 22 = 10001 mod 100 = 001
if m = 24, k = 17, then h(k) = 17 mod 22 = 10001 mod 100 = 0001
if m = 2p, then h(k) = p lower bits of m
2. Multiplication Method
h(k) = ⌊m(kA mod 1)⌋

where,

kA mod 1 gives the fractional part kA,
⌊ ⌋ gives the floor value
A is any constant. The value of A lies between 0 and 1. But, an optimal choice will be ≈ (√5-1)/2 suggested by Knuth.
3. Universal Hashing
In Universal hashing, the hash function is chosen at random independent of keys.

Python, Java and C/C++ Examples
Python
Java
C
C++
# Python program to demonstrate working of HashTable 

hashTable = [[],] * 10

def checkPrime(n):
    if n == 1 or n == 0:
        return 0

    for i in range(2, n//2):
        if n % i == 0:
            return 0

    return 1


def getPrime(n):
    if n % 2 == 0:
        n = n + 1

    while not checkPrime(n):
        n += 2

    return n


def hashFunction(key):
    capacity = getPrime(10)
    return key % capacity


def insertData(key, data):
    index = hashFunction(key)
    hashTable[index] = [key, data]

def removeData(key):
    index = hashFunction(key)
    hashTable[index] = 0

insertData(123, "apple")
insertData(432, "mango")
insertData(213, "banana")
insertData(654, "guava")

print(hashTable)

removeData(123)

print(hashTable)
Applications of Hash Table
Hash tables are implemented where

constant time lookup and insertion is required
cryptographic applications
indexing data is required
















Heap Data Structure
In this tutorial, you will learn what heap data structure is. Also, you will find working examples of heap operations in C, C++, Java and Python.

Heap data structure is a complete binary tree that satisfies the heap property, where any given node is

always greater than its child node/s and the key of the root node is the largest among all other nodes. This property is also called max heap property.
always smaller than the child node/s and the key of the root node is the smallest among all other nodes. This property is also called min heap property.
Max-heap
Max-heap
Min-heap
Min-heap
This type of data structure is also called a binary heap.

Heap Operations
Some of the important operations performed on a heap are described below along with their algorithms.

Heapify
Heapify is the process of creating a heap data structure from a binary tree. It is used to create a Min-Heap or a Max-Heap.

Let the input array be
heap initial array
Initial Array
Create a complete binary tree from the array
Complete binary tree
Complete binary tree
Start from the first index of non-leaf node whose index is given by n/2 - 1.
heapify
Start from the first on leaf node
Set current element i as largest.
The index of left child is given by 2i + 1 and the right child is given by 2i + 2.
If leftChild is greater than currentElement (i.e. element at ith index), set leftChildIndex as largest.
If rightChild is greater than element in largest, set rightChildIndex as largest.
Swap largest with currentElement
heapify
Swap if necessary
Repeat steps 3-7 until the subtrees are also heapified.
Algorithm

Heapify(array, size, i)
  set i as largest
  leftChild = 2i + 1
  rightChild = 2i + 2
  
  if leftChild > array[largest]
    set leftChildIndex as largest
  if rightChild > array[largest]
    set rightChildIndex as largest

  swap array[i] and array[largest]
To create a Max-Heap:

MaxHeap(array, size)
  loop from the first index of non-leaf node down to zero
    call heapify
For Min-Heap, both leftChild and rightChild must be larger than the parent for all nodes.

Insert Element into Heap
Algorithm for insertion in Max Heap

If there is no node, 
  create a newNode.
else (a node is already present)
  insert the newNode at the end (last node from left to right.)
  
heapify the array
Insert the new element at the end of the tree.
insertion in heap
Insert at the end
Heapify the tree.
insertion in heap
Heapify the array
For Min Heap, the above algorithm is modified so that parentNode is always smaller than newNode.

Delete Element from Heap
Algorithm for deletion in Max Heap

If nodeToBeDeleted is the leafNode
  remove the node
Else swap nodeToBeDeleted with the lastLeafNode
  remove noteToBeDeleted
   
heapify the array
Select the element to be deleted.
deletion in heap
Select the element to be deleted
Swap it with the last element.
deletion in heap
Swap with the last element
Remove the last element.
deletion in heap
Remove the last element
Heapify the tree.
deletion in heap
Heapify the array
For Min Heap, above algorithm is modified so that both childNodes are greater smaller than currentNode.

Peek (Find max/min)
Peek operation returns the maximum element from Max Heap or minimum element from Min Heap without deleting the node.

For both Max heap and Min Heap

return rootNode
Extract-Max/Min
Extract-Max returns the node with maximum value after removing it from a Max Heap whereas Extract-Min returns the node with minimum after removing it from Min Heap.

Python, Java, C/C++ Examples
Python
Java
C
C++
# Max-Heap data structure in Python

def heapify(arr, n, i):
    largest = i
    l = 2 * i + 1
    r = 2 * i + 2 
    
    if l < n and arr[i] < arr[l]:
        largest = l
    
    if r < n and arr[largest] < arr[r]:
        largest = r
    
    if largest != i:
        arr[i],arr[largest] = arr[largest],arr[i]
        heapify(arr, n, largest)

def insert(array, newNum):
    size = len(array)
    if size == 0:
        array.append(newNum)
    else:
        array.append(newNum);
        for i in range((size//2)-1, -1, -1):
            heapify(array, size, i)

def deleteNode(array, num):
    size = len(array)
    i = 0
    for i in range(0, size):
        if num == array[i]:
            break
        
    array[i], array[size-1] = array[size-1], array[i]

    array.remove(num)
    
    for i in range((len(array)//2)-1, -1, -1):
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
Heap Data Structure Applications
Heap is used while implementing a priority queue.
Dijkstra's Algorithm
Heap Sort
















Fibonacci Heap
In this tutorial, you will learn what a Fibonacci Heap is. Also, you will find working examples of different operations on a fibonacci heap in C, C++, Java and Python.

A fibonacci heap is a data structure that consists of a collection of trees which follow min heap or max heap property. We have already discussed min heap and max heap property in the Heap Data Structure article. These two properties are the characteristics of the trees present on a fibonacci heap.

In a fibonacci heap, a node can have more than two children or no children at all. Also, it has more efficient heap operations than that supported by the binomial and binary heaps.

The fibonacci heap is called a fibonacci heap because the trees are constructed in a way such that a tree of order n has at least Fn+2 nodes in it, where Fn+2 is the (n + 2)th Fibonacci number.

Fibonacci Heap
Fibonacci Heap
Properties of a Fibonacci Heap
Important properties of a Fibonacci heap are:

It is a set of min heap-ordered trees. (i.e. The parent is always smaller than the children.)
A pointer is maintained at the minimum element node.
It consists of a set of marked nodes. (Decrease key operation)
The trees within a Fibonacci heap are unordered but rooted.
Memory Representation of the Nodes in a Fibonacci Heap
The roots of all the trees are linked together for faster access. The child nodes of a parent node are connected to each other through a circular doubly linked list as shown below.

There are two main advantages of using a circular doubly linked list.

Deleting a node from the tree takes O(1) time.
The concatenation of two such lists takes O(1) time.
Fibonacci Heap Structure
Fibonacci Heap Structure
Operations on a Fibonacci Heap
Insertion
Algorithm

insert(H, x)
    degree[x] = 0
    p[x] = NIL
    child[x] = NIL
    left[x] = x
    right[x] = x
    mark[x] = FALSE
    concatenate the root list containing x with root list H 
    if min[H] == NIL or key[x] < key[min[H]]
        then min[H] = x
    n[H] = n[H] + 1
Inserting a node into an already existing heap follows the steps below.

Create a new node for the element.
Check if the heap is empty.
If the heap is empty, set the new node as a root node and mark it min.
Else, insert the node into the root list and update min.
Insertion operation in fibonacci heap
Insertion Example
Find Min
The minimum element is always given by the min pointer.

Union
Union of two fibonacci heaps consists of following steps.

Concatenate the roots of both the heaps.
Update min by selecting a minimum key from the new root lists.
Union of two heaps
Union of two heaps
Extract Min
It is the most important operation on a fibonacci heap. In this operation, the node with minimum value is removed from the heap and the tree is re-adjusted.

The following steps are followed:

Delete the min node.
Set the min-pointer to the next root in the root list.
Create an array of size equal to the maximum degree of the trees in the heap before deletion.
Do the following (steps 5-7) until there are no multiple roots with the same degree.
Map the degree of current root (min-pointer) to the degree in the array.
Map the degree of next root to the degree in array.
If there are more than two mappings for the same degree, then apply union operation to those roots such that the min-heap property is maintained (i.e. the minimum is at the root).
An implementation of the above steps can be understood in the example below.

We will perform an extract-min operation on the heap below.
Extract min
Fibonacci Heap
Delete the min node, add all its child nodes to the root list and set the min-pointer to the next root in the root list.
Delete the min node
Delete the min node
The maximum degree in the tree is 3. Create an array of size 4 and map degree of the next roots with the array.
Create an array
Create an array
Here, 23 and 7 have the same degrees, so unite them.
Unite those having the same degrees
Unite those having the same degrees
Again, 7 and 17 have the same degrees, so unite them as well.
Unite those having the same degrees
Unite those having the same degrees
Again 7 and 24 have the same degree, so unite them.
Unite those having the same degrees
Unite those having the same degrees
Map the next nodes.
Map the remaining nodes
Map the remaining nodes
Again, 52 and 21 have the same degree, so unite them
Unite those having the same degrees
Unite those having the same degrees
Similarly, unite 21 and 18.
Unite those having the same degrees
Unite those having the same degrees
Map the remaining root.
Map the remaining nodes
Map the remaining nodes
The final heap is.
Final heap
Final fibonacci heap
Decreasing a Key and Deleting a Node
These are the most important operations which are discussed in Decrease Key and Delete Node Operations.

Python, Java and C/C++ Examples
Python
Java
C
C++
# Fibonacci Heap in python

import math

# Creating fibonacci tree
class FibonacciTree:
    def __init__(self, value):
        self.value = value
        self.child = []
        self.order = 0

    # Adding tree at the end of the tree
    def add_at_end(self, t):
        self.child.append(t)
        self.order = self.order + 1


# Creating Fibonacci heap
class FibonacciHeap:
    def __init__(self):
        self.trees = []
        self.least = None
        self.count = 0

    # Insert a node
    def insert_node(self, value):
        new_tree = FibonacciTree(value)
        self.trees.append(new_tree)
        if (self.least is None or value < self.least.value):
            self.least = new_tree
        self.count = self.count + 1

    # Get minimum value
    def get_min(self):
        if self.least is None:
            return None
        return self.least.value

    # Extract the minimum value
    def extract_min(self):
        smallest = self.least
        if smallest is not None:
            for child in smallest.child:
                self.trees.append(child)
            self.trees.remove(smallest)
            if self.trees == []:
                self.least = None
            else:
                self.least = self.trees[0]
                self.consolidate()
            self.count = self.count - 1
            return smallest.value

    # Consolidate the tree
    def consolidate(self):
        aux = (floor_log(self.count) + 1) * [None]

        while self.trees != []:
            x = self.trees[0]
            order = x.order
            self.trees.remove(x)
            while aux[order] is not None:
                y = aux[order]
                if x.value > y.value:
                    x, y = y, x
                x.add_at_end(y)
                aux[order] = None
                order = order + 1
            aux[order] = x

        self.least = None
        for k in aux:
            if k is not None:
                self.trees.append(k)
                if (self.least is None
                        or k.value < self.least.value):
                    self.least = k


def floor_log(x):
    return math.frexp(x)[1] - 1


fibonacci_heap = FibonacciHeap()

fibonacci_heap.insert_node(7)
fibonacci_heap.insert_node(3)
fibonacci_heap.insert_node(17)
fibonacci_heap.insert_node(24)

print('the minimum value of the fibonacci heap: {}'.format(fibonacci_heap.get_min()))

print('the minimum value removed: {}'.format(fibonacci_heap.extract_min()))
Complexities
Insertion	O(1)
Find Min	O(1)
Union	O(1)
Extract Min	O(log n)
Decrease Key	O(1)
Delete Node	O(log n)
Fibonacci Heap Applications
To improve the asymptotic running time of Dijkstra's algorithm.
















Decrease Key and Delete Node Operations on a Fibonacci Heap
In this tutorial, you will learn how decrease key and delete node operations work. Also, you will find working examples of these operations on a fibonacci heap in C, C++, Java and Python.

A fibonacci heap is a tree based data structure which consists of a collection of trees with min heap or max heap property. Its operations are more efficient in terms of time complexity than those of its similar data structures like binomial heap and binary heap.

Now, we will discuss two of its important operations.

Decrease a key: decreases the value of a the key to any lower value
Delete a node: deletes the given node
Decreasing a Key
In decreasing a key operation, the value of a key is decreased to a lower value.

Following functions are used for decreasing the key.

Decrease-Key
Select the node to be decreased, x, and change its value to the new value k.
If the parent of x, y, is not null and the key of parent is greater than that of the k then call Cut(x) and Cascading-Cut(y) subsequently.
If the key of x is smaller than the key of min, then mark x as min.
Cut
Remove x from the current position and add it to the root list.
If x is marked, then mark it as false.
Cascading-Cut
If the parent of y is not null then follow the following steps.
If y is unmarked, then mark y.
Else, call Cut(y) and Cascading-Cut(parent of y).
Decrease Key Example
The above operations can be understood in the examples below.

Example: Decreasing 46 to 15.
Decrease the value 46 to 15.
Decrease 46 to 15
Decrease 46 to 15
Cut part: Since 24 ≠ nill and 15 < its parent, cut it and add it to the root list. Cascading-Cut part: mark 24.
Cut and Cascading part
Add 15 to root list and mark 24
Example: Decreasing 35 to 5
Decrease the value 35 to 5.
Decrease 35 to 5
Decrease 35 to 5
Cut part: Since 26 ≠ nill and 5<its parent, cut it and add it to the root list.
Cut 5 and add it to root list
Cut 5 and add it to root list
Cascading-Cut part: Since 26 is marked, the flow goes to Cut and Cascading-Cut.
Cut(26): Cut 26 and add it to the root list and mark it as false.
Cut 26 and add it to root list
Cut 26 and add it to root list

Cascading-Cut(24):
Since the 24 is also marked, again call Cut(24) and Cascading-Cut(7). These operations result in the tree below.
Cut 24 and add it to root list
Cut 24 and add it to root list
Since 5 < 7, mark 5 as min.
Mark the min
Mark 5 as min
Deleting a Node
This process makes use of decrease-key and extract-min operations. The following steps are followed for deleting a node.

Let k be the node to be deleted.
Apply decrease-key operation to decrease the value of k to the lowest possible value (i.e. -∞).
Apply extract-min operation to remove this node.
Decrease key and Delete node operations in Python, Java and C/C++
Python
Java
C
C++
# Fibonacci Heap in python

import math

class FibonacciTree:
    def __init__(self, key):
        self.key = key
        self.children = []
        self.order = 0

    def add_at_end(self, t):
        self.children.append(t)
        self.order = self.order + 1


class FibonacciHeap:
    def __init__(self):
        self.trees = []
        self.least = None
        self.count = 0

    def insert(self, key):
        new_tree = FibonacciTree(key)
        self.trees.append(new_tree)
        if (self.least is None or key < self.least.key):
            self.least = new_tree
        self.count = self.count + 1

    def get_min(self):
        if self.least is None:
            return None
        return self.least.key

    def extract_min(self):
        smallest = self.least
        if smallest is not None:
            for child in smallest.children:
                self.trees.append(child)
            self.trees.remove(smallest)
            if self.trees == []:
                self.least = None
            else:
                self.least = self.trees[0]
                self.consolidate()
            self.count = self.count - 1
            return smallest.key

    def consolidate(self):
        aux = (floor_log2(self.count) + 1) * [None]

        while self.trees != []:
            x = self.trees[0]
            order = x.order
            self.trees.remove(x)
            while aux[order] is not None:
                y = aux[order]
                if x.key > y.key:
                    x, y = y, x
                x.add_at_end(y)
                aux[order] = None
                order = order + 1
            aux[order] = x

        self.least = None
        for k in aux:
            if k is not None:
                self.trees.append(k)
                if (self.least is None
                        or k.key < self.least.key):
                    self.least = k


def floor_log2(x):
    return math.frexp(x)[1] - 1


fheap = FibonacciHeap()

fheap.insert(11)
fheap.insert(10)
fheap.insert(39)
fheap.insert(26)
fheap.insert(24)

print('Minimum value: {}'.format(fheap.get_min()))

print('Minimum value removed: {}'.format(fheap.extract_min()))
Complexities
Decrease Key	O(1)
Delete Node	O(log n)

















