What is an Algorithm?
In this tutorial, we will learn what algorithms are with the help of examples.

In computer programming terms, an algorithm is a set of well-defined instructions to solve a particular problem. It takes a set of input and produces a desired output. For example,

An algorithm to add two numbers:

Take two number inputs

Add numbers using the + operator

Display the result

Qualities of Good Algorithms
Input and output should be defined precisely.
Each step in the algorithm should be clear and unambiguous.
Algorithms should be most effective among many different ways to solve a problem.
An algorithm shouldn't' include computer code. Instead, the algorithm should be written in such a way that it can be used in different programming languages.
Algorithm Examples
Algorithm to add two numbers

Algorithm to find the largest among three numbers

Algorithm to find all the roots of the quadratic equation

Algorithm to find the factorial

Algorithm to check prime number

Algorithm of Fibonacci series

Algorithm 1: Add two numbers entered by the user
Step 1: Start
Step 2: Declare variables num1, num2 and sum. 
Step 3: Read values num1 and num2. 
Step 4: Add num1 and num2 and assign the result to sum.
        sum←num1+num2 
Step 5: Display sum 
Step 6: Stop
Algorithm 2: Find the largest number among three numbers
Step 1: Start
Step 2: Declare variables a,b and c.
Step 3: Read variables a,b and c.
Step 4: If a > b
           If a > c
              Display a is the largest number.
           Else
              Display c is the largest number.
        Else
           If b > c
              Display b is the largest number.
           Else
              Display c is the greatest number.  
Step 5: Stop
Algorithm 3: Find Root of the quadratic equatin ax2 + bx + c = 0
Step 1: Start
Step 2: Declare variables a, b, c, D, x1, x2, rp and ip;
Step 3: Calculate discriminant
         D ← b2-4ac
Step 4: If D ≥ 0
              r1 ← (-b+√D)/2a
              r2 ← (-b-√D)/2a 
              Display r1 and r2 as roots.
        Else     
              Calculate real part and imaginary part
              rp ← -b/2a
              ip ← √(-D)/2a
              Display rp+j(ip) and rp-j(ip) as roots
Step 5: Stop             
Algorithm 4: Find the factorial of a number
Step 1: Start
Step 2: Declare variables n, factorial and i.
Step 3: Initialize variables
          factorial ← 1
          i ← 1
Step 4: Read value of n
Step 5: Repeat the steps until i = n
     5.1: factorial ← factorial*i
     5.2: i ← i+1
Step 6: Display factorial
Step 7: Stop
Algorithm 5: Check whether a number is prime or not
Step 1: Start
Step 2: Declare variables n, i, flag.
Step 3: Initialize variables
        flag ← 1
        i ← 2  
Step 4: Read n from the user.
Step 5: Repeat the steps until i=(n/2)
     5.1 If remainder of n÷i equals 0
            flag ← 0
            Go to step 6
     5.2 i ← i+1
Step 6: If flag = 0
           Display n is not prime
        else
           Display n is prime
Step 7: Stop 
Algorithm 6: Find the Fibonacci series till the term less than 1000
Step 1: Start 
Step 2: Declare variables first_term,second_term and temp. 
Step 3: Initialize variables first_term ← 0 second_term ← 1 
Step 4: Display first_term and second_term 
Step 5: Repeat the steps until second_term ≤ 1000 
     5.1: temp ← second_term 
     5.2: second_term ← second_term + first_term 
     5.3: first_term ← temp 
     5.4: Display second_term 
Step 6: Stop




Data Structure and Types
In this article, you will learn about data strucrture and its types.

What are Data Structures?
Data structure is a storage that is used to store and organize data. It is a way of arranging data on a computer so that it can be accessed and updated efficiently.

Depending on your requirement and project, it is important to choose the right data structure for your project. For example, if you want to store data sequentially in the memory, then you can go for the Array data structure.

Storing data sequentially in the array data structure
Array data Structure Representation
Note: Data structure and data types are slightly different. Data structure is the collection of data types arranged in a specific order.

Types of Data Structure
Basically, data structures are divided into two categories:

Linear data structure
Non-linear data structure
Let's' learn about each type in detail.

Linear data structures
In linear data structures, the elements are arranged in sequence one after the other. Since elements are arranged in particular order, they are easy to implement.

However, when the complexity of the program increases, the linear data structures might not be the best choice because of operational complexities.

Popular linear data structures are:

1. Array Data Structure
In an array, elements in memory are arranged in continuous memory. All the elements of an array are of the same type. And, the type of elements that can be stored in the form of arrays is determined by the programming language.

To learn more, visit Java Array.

An array
An array with each element represented by an index
2. Stack Data Structure
In stack data structure, elements are stored in the LIFO principle. That is, the last element stored in a stack will be removed first.

It works just like a pile of plates where the last plate kept on the pile will be removed first. To learn more, visit Stack Data Structure.

stack
In a stack, operations can be perform only from one end (top here).
3. Queue Data Structure
Unlike stack, the queue data structure works in the FIFO principle where first element stored in the queue will be removed first.

It works just like a queue of people in the ticket counter where first person on the queue will get the ticket first. To learn more, visit Queue Data Structure.
 

queue
In a queue, addition and removal are performed from separate ends.
4. Linked List Data Structure
In linked list data structure, data elements are connected through a series of nodes. And, each node contains the data items and address to the next node.

To learn more, visit Linked List Data Structure.
 

A linked list
A linked list
Non linear data structures
Unlike linear data structures, elements in non-linear data structures are not in any sequence. Instead they are arranged in a hierarchical manner where one element will be connected to one or more elements.

Non-linear data structures are further divided into graph and tree based data structures.

1. Graph Data Structure
In graph data structure, each node is called vertex and each vertex is connected to other vertices through edges.

To learn more, visit Graph Data Structure.

Graph data structure example
Graph data structure example
Popular Graph Based Data Structures:

Spanning Tree and Minimum Spanning Tree
Strongly Connected Components
Adjacency Matrix
Adjacency List
2. Trees Data Structure
Similar to a graph, a tree is also a collection of vertices and edges. However, in tree data structure, there can only be one edge between two vertices.

To learn more, visit Tree Data Structure.

Tree data structure example
Tree data structure example
Popular Tree based Data Structure

Binary Tree
Binary Search Tree
AVL Tree
B-Tree
B+ Tree
Red-Black Tree
Linear Vs Non-linear Data Structures
Now that we know about linear and non-linear data structures, let's' see the major differences between them.

Linear Data Structures	Non Linear Data Structures
The data items are arranged in sequential order, one after the other.	The data items are arranged in non-sequential order (hierarchical manner).
All the items are present on the single layer.	The data items are present at different layers.
It can be traversed on a single run. That is, if we start from the first element, we can traverse all the elements sequentially in a single pass.	It requires multiple runs. That is, if we start from the first element it might not be possible to traverse all the elements in a single pass.
The memory utilization is not efficient.	Different structures utilize memory in different efficient ways depending on the need.
The time complexity increase with the data size.	Time complexity remains the same.
Example: Arrays, Stack, Queue	Example: Tree, Graph, Map
Why Data Structure?
Knowledge about data structures help you understand the working of each data structure. And, based on that you can select the right data structures for your project.

This helps you write memory and time efficient code.

To learn more about the importance of data structure, visit Why Learn Data Structure?









Why Learn Data Structures and Algorithms?
In this article, we will learn why every programmer should learn data structures and algorithms with the help of examples.

This article is for those who have just started learning algorithms and wondered how impactful it will be to boost their career/programming skills. It is also for those who wonder why big companies like Google, Facebook, and Amazon hire programmers who are exceptionally good at optimizing Algorithms.

What are Algorithms?
Informally, an algorithm is nothing but a mention of steps to solve a problem. They are essentially a solution.

For example, an algorithm to solve the problem of factorials might look something like this:

Problem: Find the factorial of n

Initialize fact = 1
For every value v in range 1 to n:
    Multiply the fact by v
fact contains the factorial of n
Here, the algorithm is written in English. If it was written in a programming language, we would call it to code instead. Here is a code for finding the factorial of a number in C++.

int factorial(int n) {
    int fact = 1;
    for (int v = 1; v <= n; v++) {
        fact = fact * v;
    }
    return fact;
}
Programming is all about data structures and algorithms. Data structures are used to hold data while algorithms are used to solve the problem using that data.

Data structures and algorithms (DSA) goes through solutions to standard problems in detail and gives you an insight into how efficient it is to use each one of them. It also teaches you the science of evaluating the efficiency of an algorithm. This enables you to choose the best of various choices.

Use of Data Structures and Algorithms to Make Your Code Scalable
Time is precious.

Suppose, Alice and Bob are trying to solve a simple problem of finding the sum of the first 1011 natural numbers. While Bob was writing the algorithm, Alice implemented it proving that it is as simple as criticizing Donald Trump.

Algorithm (by Bob)

Initialize sum = 0
for every natural number n in range 1 to 1011 (inclusive):
    add n to sum
sum is your answer
Code (by Alice)

int findSum() {
    int sum = 0;
    for (int v = 1; v <= 100000000000; v++) {
        sum += v;
    }
    return sum;
}
Alice and Bob are feeling euphoric of themselves that they could build something of their own in almost no time. Let's sneak into their workspace and listen to their conversation.

Alice: Let's run this code and find out the sum.
Bob: I ran this code a few minutes back but it's still not showing the output. What's wrong with it?
Oops, something went wrong! A computer is the most deterministic machine. Going back and trying to run it again won't help. So let's analyze what's wrong with this simple code.

Two of the most valuable resources for a computer program are time and memory.

The time taken by the computer to run code is:

Time to run code = number of instructions * time to execute each instruction
The number of instructions depends on the code you used, and the time taken to execute each code depends on your machine and compiler.

In this case, the total number of instructions executed (let's say x) are x = 1 + (1011 + 1) + (1011) + 1, which is x = 2 * 1011 + 3

Let us assume that a computer can execute y = 108 instructions in one second (it can vary subject to machine configuration). The time taken to run above code is

Time taken to run code = x/y (greater than 16 minutes)
Is it possible to optimize the algorithm so that Alice and Bob do not have to wait for 16 minutes every time they run this code?

I am sure that you already guessed the right method. The sum of first N natural numbers is given by the formula:

Sum = N * (N + 1) / 2
Converting it into code will look something like this:

int sum(int N) {
    return N * (N + 1) / 2;
}
This code executes in just one instruction and gets the task done no matter what the value is. Let it be greater than the total number of atoms in the universe. It will find the result in no time.

The time taken to solve the problem, in this case, is 1/y (which is 10 nanoseconds). By the way, the fusion reaction of a hydrogen bomb takes 40-50 ns, which means your program will complete successfully even if someone throws a hydrogen bomb on your computer at the same time you ran your code. :)

Note: Computers take a few instructions (not 1) to compute multiplication and division. I have said 1 just for the sake of simplicity.

More on Scalability
Scalability is scale plus ability, which means the quality of an algorithm/system to handle the problem of larger size.

Consider the problem of setting up a classroom of 50 students. One of the simplest solutions is to book a room, get a blackboard, a few chalks, and the problem is solved.

But what if the size of the problem increases? What if the number of students increased to 200?

The solution still holds but it needs more resources. In this case, you will probably need a much larger room (probably a theater), a projector screen and a digital pen.

What if the number of students increased to 1000?

The solution fails or uses a lot of resources when the size of the problem increases. This means, your solution wasn't' scalable.

What is a scalable solution then?

Consider a site like Khanacademy, millions of students can see videos, read answers at the same time and no more resources are required. So, the solution can solve the problems of larger size under resource crunch.

If you see our first solution to find the sum of first N natural numbers, it wasn't scalable. It's because it required linear growth in time with the linear growth in the size of the problem. Such algorithms are also known as linearly scalable algorithms.

Our second solution was very scalable and didn't require the use of any more time to solve a problem of larger size. These are known as constant-time algorithms.

Memory is expensive
Memory is not always available in abundance. While dealing with code/system which requires you to store or produce a lot of data, it is critical for your algorithm to save the usage of memory wherever possible. For example: While storing data about people, you can save memory by storing only their date of birth, not their age. You can always calculate it on the fly using their date of birth and current date.

Examples of an Algorithm's Efficiency
Here are some examples of what learning algorithms and data structures enable you to do:

Example 1: Age Group Problem
Problems like finding the people of a certain age group can easily be solved with a little modified version of the binary search algorithm (assuming that the data is sorted).

The naive algorithm which goes through all the persons one by one, and checks if it falls in the given age group is linearly scalable. Whereas, binary search claims itself to be a logarithmically scalable algorithm. This means that if the size of the problem is squared, the time taken to solve it is only doubled.

Suppose, it takes 1 second to find all the people at a certain age for a group of 1000. Then for a group of 1 million people,

the binary search algorithm will take only 2 seconds to solve the problem
the naive algorithm might take 1 million seconds, which is around 12 days
The same binary search algorithm is used to find the square root of a number.

Example 2: Rubik's Cube Problem
Imagine you are writing a program to find the solution of a Rubik's cube.

This cute looking puzzle has annoyingly 43,252,003,274,489,856,000 positions, and these are just positions! Imagine the number of paths one can take to reach the wrong positions.

Fortunately, the way to solve this problem can be represented by the graph data structure. There is a graph algorithm known as Dijkstra's' algorithm which allows you to solve this problem in linear time. Yes, you heard it right. It means that it allows you to reach the solved position in a minimum number of states.

Example 3: DNA Problem
DNA is a molecule that carries genetic information. They are made up of smaller units which are represented by Roman characters A, C, T, and G.

Imagine yourself working in the field of bioinformatics. You are assigned the work of finding out the occurrence of a particular pattern in a DNA strand.

It is a famous problem in computer science academia. And, the simplest algorithm takes the time proportional to

(number of character in DNA strand) * (number of characters in pattern)
A typical DNA strand has millions of such units. Eh! worry not. KMP algorithm can get this done in time which is proportional to

(number of character in DNA strand) + (number of characters in pattern)
The * operator replaced by + makes a lot of change.

Considering that the pattern was of 100 characters, your algorithm is now 100 times faster. If your pattern was of 1000 characters, the KMP algorithm would be almost 1000 times faster. That is, if you were able to find the occurrence of pattern in 1 second, it will now take you just 1 ms. We can also put this in another way. Instead of matching 1 strand, you can match 1000 strands of similar length at the same time.

And there are infinite such stories...

Final Words
Generally, software development involves learning new technologies on a daily basis. You get to learn most of these technologies while using them in one of your projects. However, it is not the case with algorithms.

If you don't know algorithms well, you won't be able to identify if you can optimize the code you are writing right now. You are expected to know them in advance and apply them wherever possible and critical.

We specifically talked about the scalability of algorithms. A software system consists of many such algorithms. Optimizing any one of them leads to a better system.

However, it's' important to note that this is not the only way to make a system scalable. For example, a technique known as distributed computing allows independent parts of a program to run to multiple machines together making it even more scalable.







Asymptotic Analysis: Big-O Notation and More
In this tutorial, you will learn what asymptotic notations are. Also, you will learn about Big-O notation, Theta notation and Omega notation.

The efficiency of an algorithm depends on the amount of time, storage and other resources required to execute the algorithm. The efficiency is measured with the help of asymptotic notations.

An algorithm may not have the same performance for different types of inputs. With the increase in the input size, the performance will change.

The study of change in performance of the algorithm with the change in the order of the input size is defined as asymptotic analysis.

Asymptotic Notations
Asymptotic notations are the mathematical notations used to describe the running time of an algorithm when the input tends towards a particular value or a limiting value.

For example: In bubble sort, when the input array is already sorted, the time taken by the algorithm is linear i.e. the best case.

But, when the input array is in reverse condition, the algorithm takes the maximum time (quadratic) to sort the elements i.e. the worst case.

When the input array is neither sorted nor in reverse order, then it takes average time. These durations are denoted using asymptotic notations.

There are mainly three asymptotic notations:

Big-O notation
Omega notation
Theta notation
Big-O Notation (O-notation)
Big-O notation represents the upper bound of the running time of an algorithm. Thus, it gives the worst-case complexity of an algorithm.

Asymptotic Analysis: Big-O notation
Big-O gives the upper bound of a function
O(g(n)) = { f(n): there exist positive constants c and n0
            such that 0 ≤ f(n) ≤ cg(n) for all n ≥ n0 }
The above expression can be described as a function f(n) belongs to the set O(g(n)) if there exists a positive constant c such that it lies between 0 and cg(n), for sufficiently large n.

For any value of n, the running time of an algorithm does not cross the time provided by O(g(n)).

Since it gives the worst-case running time of an algorithm, it is widely used to analyze an algorithm as we are always interested in the worst-case scenario.

Omega Notation (Ω-notation)
Omega notation represents the lower bound of the running time of an algorithm. Thus, it provides the best case complexity of an algorithm.

Asymptotic Analysis: Omega Notation
Omega gives the lower bound of a function
Ω(g(n)) = { f(n): there exist positive constants c and n0 
            such that 0 ≤ cg(n) ≤ f(n) for all n ≥ n0 }
The above expression can be described as a function f(n) belongs to the set Ω(g(n)) if there exists a positive constant c such that it lies above cg(n), for sufficiently large n.

For any value of n, the minimum time required by the algorithm is given by Omega Ω(g(n)).

Theta Notation (Θ-notation)
Theta notation encloses the function from above and below. Since it represents the upper and the lower bound of the running time of an algorithm, it is used for analyzing the average-case complexity of an algorithm.

Asymptotic Analysis: Theta notation
Theta bounds the function within constants factors
For a function g(n), Θ(g(n)) is given by the relation:

Θ(g(n)) = { f(n): there exist positive constants c1, c2 and n0
            such that 0 ≤ c1g(n) ≤ f(n) ≤ c2g(n) for all n ≥ n0 }
The above expression can be described as a function f(n) belongs to the set Θ(g(n)) if there exist positive constants c1 and c2 such that it can be sandwiched between c1g(n) and c2g(n), for sufficiently large n.

If a function f(n) lies anywhere in between c1g(n) and c2g(n) for all n ≥ n0, then f(n) is said to be asymptotically tight bound.






Master Theorem
In this tutorial, you will learn what master theorem is and how it is used for solving recurrence relations.

The master method is a formula for solving recurrence relations of the form:

T(n) = aT(n/b) + f(n),
where,
n = size of input
a = number of subproblems in the recursion
n/b = size of each subproblem. All subproblems are assumed 
     to have the same size.
f(n) = cost of the work done outside the recursive call, 
      which includes the cost of dividing the problem and
      cost of merging the solutions

Here, a ≥ 1 and b > 1 are constants, and f(n) is an asymptotically positive function.
An asymptotically positive function means that for a sufficiently large value of n, we have f(n) > 0.

The master theorem is used in calculating the time complexity of recurrence relations (divide and conquer algorithms) in a simple and quick way.

Master Theorem
If a ≥ 1 and b > 1 are constants and f(n) is an asymptotically positive function, then the time complexity of a recursive relation is given by

T(n) = aT(n/b) + f(n)

where, T(n) has the following asymptotic bounds:

    1. If f(n) = O(nlogb a-ϵ), then T(n) = Θ(nlogb a).

    2. If f(n) = Θ(nlogb a), then T(n) = Θ(nlogb a * log n).

    3. If f(n) = Ω(nlogb a+ϵ), then T(n) = Θ(f(n)).

ϵ > 0 is a constant.
Each of the above conditions can be interpreted as:

If the cost of solving the sub-problems at each level increases by a certain factor, the value of f(n) will become polynomially smaller than nlogb a. Thus, the time complexity is oppressed by the cost of the last level ie. nlogb a
If the cost of solving the sub-problem at each level is nearly equal, then the value of f(n) will be nlogb a. Thus, the time complexity will be f(n) times the total number of levels ie. nlogb a * log n
If the cost of solving the subproblems at each level decreases by a certain factor, the value of f(n) will become polynomially larger than nlogb a. Thus, the time complexity is oppressed by the cost of f(n).
Solved Example of Master Theorem
T(n) = 3T(n/2) + n2
Here,
a = 3
n/b = n/2
f(n) = n2

logb a = log2 3 ≈ 1.58 < 2

ie. f(n) < nlogb a+ϵ , where, ϵ is a constant.

Case 3 implies here.

Thus, T(n) = f(n) = Θ(n2) 
Master Theorem Limitations
The master theorem cannot be used if:

T(n) is not monotone. eg. T(n) = sin n
f(n) is not a polynomial. eg. f(n) = 2n
a is not a constant. eg. a = 2n
a < 1








Divide and Conquer Algorithm
In this tutorial, you will learn how the divide and conquer algorithm works. We will also compare the divide and conquer approach versus other approaches to solve a recursive problem.

A divide and conquer algorithm is a strategy of solving a large problem by

breaking the problem into smaller sub-problems
solving the sub-problems, and
combining them to get the desired output.
To use the divide and conquer algorithm, recursion is used. Learn about recursion in different programming languages:

Recursion in Java
Recursion in Python
Recursion in C++
How Divide and Conquer Algorithms Work?
Here are the steps involved:

Divide: Divide the given problem into sub-problems using recursion.
Conquer: Solve the smaller sub-problems recursively. If the subproblem is small enough, then solve it directly.
Combine: Combine the solutions of the sub-problems that are part of the recursive process to solve the actual problem.
Let us understand this concept with the help of an example.

Here, we will sort an array using the divide and conquer approach (ie. merge sort).

Let the given array be:
initial array for merge sort
Array for merge sort
Divide the array into two halves.
Divide the array into two subparts
Divide the array into two subparts

Again, divide each subpart recursively into two halves until you get individual elements.
Divide the array into smaller subparts
Divide the array into smaller subparts
Now, combine the individual elements in a sorted manner. Here, conquer and combine steps go side by side.
Combine the subparts
Combine the subparts
Time Complexity
The complexity of the divide and conquer algorithm is calculated using the master theorem.

T(n) = aT(n/b) + f(n),
where,
n = size of input
a = number of subproblems in the recursion
n/b = size of each subproblem. All subproblems are assumed to have the same size.
f(n) = cost of the work done outside the recursive call, which includes the cost of dividing the problem and cost of merging the solutions

Let us take an example to find the time complexity of a recursive problem.

For a merge sort, the equation can be written as:

T(n) = aT(n/b) + f(n)
     = 2T(n/2) + O(n)
Where, 
a = 2 (each time, a problem is divided into 2 subproblems)
n/b = n/2 (size of each sub problem is half of the input)
f(n) = time taken to divide the problem and merging the subproblems
T(n/2) = O(n log n) (To understand this, please refer to the master theorem.)

Now, T(n) = 2T(n log n) + O(n)
          ≈ O(n log n)
Divide and Conquer Vs Dynamic approach
The divide and conquer approach divides a problem into smaller subproblems; these subproblems are further solved recursively. The result of each subproblem is not stored for future reference, whereas, in a dynamic approach, the result of each subproblem is stored for future reference.

Use the divide and conquer approach when the same subproblem is not solved multiple times. Use the dynamic approach when the result of a subproblem is to be used multiple times in the future.

Let us understand this with an example. Suppose we are trying to find the Fibonacci series. Then,

Divide and Conquer approach:

fib(n)
    If n < 2, return 1
    Else , return f(n - 1) + f(n -2)
Dynamic approach:

mem = []
fib(n)
    If n in mem: return mem[n] 
    else,     
        If n < 2, f = 1
        else , f = f(n - 1) + f(n -2)
        mem[n] = f
        return f
In a dynamic approach, mem stores the result of each subproblem.

Advantages of Divide and Conquer Algorithm
The complexity for the multiplication of two matrices using the naive method is O(n3), whereas using the divide and conquer approach (i.e. Strassen's matrix multiplication) is O(n2.8074). This approach also simplifies other problems, such as the Tower of Hanoi.
'This approach is suitable for multiprocessing systems.
It makes efficient use of memory caches.
Divide and Conquer Applications
Binary Search
Merge Sort
Quick Sort
Strassen's' Matrix multiplication
Karatsuba Algorithm





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
// Stack implementation in Java

class Stack {
  private int arr[];
  private int top;
  private int capacity;

  // Creating a stack
  Stack(int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
  }

  // Add elements into stack
  public void push(int x) {
    if (isFull()) {
      System.out.println("OverFlow\nProgram Terminated\n");
      System.exit(1);
    }

    System.out.println("Inserting " + x);
    arr[++top] = x;
  }

  // Remove element from stack
  public int pop() {
    if (isEmpty()) {
      System.out.println("STACK EMPTY");
      System.exit(1);
    }
    return arr[top--];
  }

  // Utility function to return the size of the stack
  public int size() {
    return top + 1;
  }

  // Check if the stack is empty
  public Boolean isEmpty() {
    return top == -1;
  }

  // Check if the stack is full
  public Boolean isFull() {
    return top == capacity - 1;
  }

  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    stack.pop();
    System.out.println("\nAfter popping out");

    stack.printStack();

  }
}
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
// Queue implementation in Java

public class Queue {
  int SIZE = 5;
  int items[] = new int[SIZE];
  int front, rear;

  Queue() {
    front = -1;
    rear = -1;
  }

  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1)
        front = 0;
      rear++;
      items[rear] = element;
      System.out.println("Inserted " + element);
    }
  }

  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    } else {
      element = items[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      } /* Q has only one element, so we reset the queue after deleting it. */
      else {
        front++;
      }
      System.out.println("Deleted -> " + element);
      return (element);
    }
  }

  void display() {
    /* Function to display elements of Queue */
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("\nFront index-> " + front);
      System.out.println("Items -> ");
      for (i = front; i <= rear; i++)
        System.out.print(items[i] + "  ");

      System.out.println("\nRear index-> " + rear);
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();

    // deQueue is not possible on empty queue
    q.deQueue();

    // enQueue 5 elements
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    q.enQueue(5);

    // 6th element can't be added to because the queue is full
    q.enQueue(6);

    q.display();

    // deQueue removes element entered first i.e. 1
    q.deQueue();

    // Now we have just 4 elements
    q.display();

  }
}
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
// Circular Queue implementation in Java

public class CQueue {
  int SIZE = 5; // Size of Circular Queue
  int front, rear;
  int items[] = new int[SIZE];

  CQueue() {
    front = -1;
    rear = -1;
  }

  // Check if the queue is full
  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    if (front == rear + 1) {
      return true;
    }
    return false;
  }

  // Check if the queue is empty
  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  // Adding an element
  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1)
        front = 0;
      rear = (rear + 1) % SIZE;
      items[rear] = element;
      System.out.println("Inserted " + element);
    }
  }

  // Removing an element
  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    } else {
      element = items[front];
      if (front == rear) {
        front = -1;
        rear = -1;
      } /* Q has only one element, so we reset the queue after deleting it. */
      else {
        front = (front + 1) % SIZE;
      }
      return (element);
    }
  }

  void display() {
    /* Function to display status of Circular Queue */
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("Front -> " + front);
      System.out.println("Items -> ");
      for (i = front; i != rear; i = (i + 1) % SIZE)
        System.out.print(items[i] + " ");
      System.out.println(items[i]);
      System.out.println("Rear -> " + rear);
    }
  }

  public static void main(String[] args) {

    CQueue q = new CQueue();

    // Fails because front = -1
    q.deQueue();

    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    q.enQueue(5);

    // Fails to enqueue because front == 0 && rear == SIZE - 1
    q.enQueue(6);

    q.display();

    int elem = q.deQueue();

    if (elem != -1) {
      System.out.println("Deleted Element is " + elem);
    }
    q.display();

    q.enQueue(7);

    q.display();

    // Fails to enqueue because front == rear + 1
    q.enQueue(8);
  }

}
Circular Queue Complexity Analysis
The complexity of the enqueue and dequeue operations of a circular queue is O(1) for (array implementations).

Applications of Circular Queue
CPU scheduling
Memory management
Traffic Management







Priority Queue
In this tutorial, you will learn what priority queue is. Also, you will learn about it's implementations in Python, Java, C, and C++.

'A priority queue is a special type of queue in which each element is associated with a priority value. And, elements are served on the basis of their priority. That is, higher priority elements are served first.

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
// Priority Queue implementation in Java

import java.util.ArrayList;

class Heap {
  // Function to heapify the tree
  void heapify(ArrayList<Integer> hT, int i) {
    int size = hT.size();
    // Find the largest among root, left child and right child
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    if (l < size && hT.get(l) > hT.get(largest))
      largest = l;
    if (r < size && hT.get(r) > hT.get(largest))
      largest = r;

    // Swap and continue heapifying if root is not largest
    if (largest != i) {
      int temp = hT.get(largest);
      hT.set(largest, hT.get(i));
      hT.set(i, temp);

      heapify(hT, largest);
    }
  }

  // Function to insert an element into the tree
  void insert(ArrayList<Integer> hT, int newNum) {
    int size = hT.size();
    if (size == 0) {
      hT.add(newNum);
    } else {
      hT.add(newNum);
      for (int i = size / 2 - 1; i >= 0; i--) {
        heapify(hT, i);
      }
    }
  }

  // Function to delete an element from the tree
  void deleteNode(ArrayList<Integer> hT, int num) {
    int size = hT.size();
    int i;
    for (i = 0; i < size; i++) {
      if (num == hT.get(i))
        break;
    }

    int temp = hT.get(i);
    hT.set(i, hT.get(size - 1));
    hT.set(size - 1, temp);

    hT.remove(size - 1);
    for (int j = size / 2 - 1; j >= 0; j--) {
      heapify(hT, j);
    }
  }

  // Print the tree
  void printArray(ArrayList<Integer> array, int size) {
    for (Integer i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // Driver code
  public static void main(String args[]) {

    ArrayList<Integer> array = new ArrayList<Integer>();
    int size = array.size();

    Heap h = new Heap();
    h.insert(array, 3);
    h.insert(array, 4);
    h.insert(array, 9);
    h.insert(array, 5);
    h.insert(array, 2);

    System.out.println("Max-Heap array: ");
    h.printArray(array, size);

    h.deleteNode(array, 4);
    System.out.println("After deleting an element: ");
    h.printArray(array, size);
  }
}
Priority Queue Applications
Some of the applications of a priority queue are:

Dijkstra''s algorithm
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
// Deque implementation in Java

class Deque {
  static final int MAX = 100;
  int arr[];
  int front;
  int rear;
  int size;

  public Deque(int size) {
    arr = new int[MAX];
    front = -1;
    rear = 0;
    this.size = size;
  }

  boolean isFull() {
    return ((front == 0 && rear == size - 1) || front == rear + 1);
  }

  boolean isEmpty() {
    return (front == -1);
  }

  void insertfront(int key) {
    if (isFull()) {
      System.out.println("Overflow");
      return;
    }

    if (front == -1) {
      front = 0;
      rear = 0;
    }

    else if (front == 0)
      front = size - 1;

    else
      front = front - 1;

    arr[front] = key;
  }

  void insertrear(int key) {
    if (isFull()) {
      System.out.println(" Overflow ");
      return;
    }

    if (front == -1) {
      front = 0;
      rear = 0;
    }

    else if (rear == size - 1)
      rear = 0;

    else
      rear = rear + 1;

    arr[rear] = key;
  }

  void deletefront() {
    if (isEmpty()) {
      System.out.println("Queue Underflow\n");
      return;
    }

    // Deque has only one element
    if (front == rear) {
      front = -1;
      rear = -1;
    } else if (front == size - 1)
      front = 0;

    else
      front = front + 1;
  }

  void deleterear() {
    if (isEmpty()) {
      System.out.println(" Underflow");
      return;
    }

    if (front == rear) {
      front = -1;
      rear = -1;
    } else if (rear == 0)
      rear = size - 1;
    else
      rear = rear - 1;
  }

  int getFront() {
    if (isEmpty()) {
      System.out.println(" Underflow");
      return -1;
    }
    return arr[front];
  }

  int getRear() {
    if (isEmpty() || rear < 0) {
      System.out.println(" Underflow\n");
      return -1;
    }
    return arr[rear];
  }

  public static void main(String[] args) {

    Deque dq = new Deque(4);

    System.out.println("Insert element at rear end : 12 ");
    dq.insertrear(12);

    System.out.println("insert element at rear end : 14 ");
    dq.insertrear(14);

    System.out.println("get rear element : " + dq.getRear());

    dq.deleterear();
    System.out.println("After delete rear element new rear become : " + dq.getRear());

    System.out.println("inserting element at front end");
    dq.insertfront(13);

    System.out.println("get front element: " + dq.getFront());

    dq.deletefront();

    System.out.println("After delete front element new front become : " + +dq.getFront());

  }
}
Time Complexity
The time complexity of all the above operations is constant i.e. O(1).

Applications of Deque Data Structure
In undo operations on software.
To store history in browsers.
For implementing both stacks and queues.






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
If you didn''t understand any of the lines above, all you need is a refresher on pointers and structs.

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
// Linked list implementation in Java

class LinkedList {
  // Creating a node
  Node head;

  static class Node {
    int value;
    Node next;

    Node(int d) {
      value = d;
      next = null;
    }
  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();

    // Assign value values
    linkedList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    // Connect nodess
    linkedList.head.next = second;
    second.next = third;

    // printing node-value
    while (linkedList.head != null) {
      System.out.print(linkedList.head.value + " ");
      linkedList.head = linkedList.head.next;
    }
  }
}
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

Here''s a list of basic linked list operations that we will cover in this article.

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
// Linked list operations in Java

class LinkedList {
  Node head;

  // Create a node
  class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  // Insert at the beginning
  public void insertAtBeginning(int new_data) {
    // insert the data
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }

  // Insert after a node
  public void insertAfter(Node prev_node, int new_data) {
    if (prev_node == null) {
      System.out.println("The given previous node cannot be null");
      return;
    }
    Node new_node = new Node(new_data);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
  }

  // Insert at the end
  public void insertAtEnd(int new_data) {
    Node new_node = new Node(new_data);

    if (head == null) {
      head = new Node(new_data);
      return;
    }

    new_node.next = null;

    Node last = head;
    while (last.next != null)
      last = last.next;

    last.next = new_node;
    return;
  }

  // Delete a node
  void deleteNode(int position) {
    if (head == null)
      return;

    Node temp = head;

    if (position == 0) {
      head = temp.next;
      return;
    }
    // Find the key to be deleted
    for (int i = 0; temp != null && i < position - 1; i++)
      temp = temp.next;

    // If the key is not present
    if (temp == null || temp.next == null)
      return;

    // Remove the node
    Node next = temp.next.next;

    temp.next = next;
  }

  // Search a node
  boolean search(Node head, int key) {
    Node current = head;
    while (current != null) {
      if (current.data == key)
        return true;
      current = current.next;
    }
    return false;
  }

  // Sort the linked list
  void sortLinkedList(Node head) {
    Node current = head;
    Node index = null;
    int temp;

    if (head == null) {
      return;
    } else {
      while (current != null) {
        // index points to the node next to current
        index = current.next;

        while (index != null) {
          if (current.data > index.data) {
            temp = current.data;
            current.data = index.data;
            index.data = temp;
          }
          index = index.next;
        }
        current = current.next;
      }
    }
  }

  // Print the linked list
  public void printList() {
    Node tnode = head;
    while (tnode != null) {
      System.out.print(tnode.data + " ");
      tnode = tnode.next;
    }

  }

  public static void main(String[] args) {
    LinkedList llist = new LinkedList();

    llist.insertAtEnd(1);
    llist.insertAtBeginning(2);
    llist.insertAtBeginning(3);
    llist.insertAtEnd(4);
    llist.insertAfter(llist.head.next, 5);

    System.out.println("Linked list: ");
    llist.printList();

    System.out.println("\nAfter deleting an element: ");
    llist.deleteNode(3);
    llist.printList();

    System.out.println();
    int item_to_find = 3;
    if (llist.search(llist.head, item_to_find))
      System.out.println(item_to_find + " is found");
    else
      System.out.println(item_to_find + " is not found");

    llist.sortLinkedList(llist.head);
    System.out.println("\nSorted List: ");
    llist.printList();
  }
}






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
// Java program to demonstrate working of HashTable 

import java.util.*; 

class HashTable { 
  public static void main(String args[]) 
  {
  Hashtable<Integer, Integer> 
    ht = new Hashtable<Integer, Integer>(); 
  
  ht.put(123, 432); 
  ht.put(12, 2345);
  ht.put(15, 5643); 
  ht.put(3, 321);

  ht.remove(12);

  System.out.println(ht); 
  } 
} 
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
// Max-Heap data structure in Java

import java.util.ArrayList;

class Heap {
  void heapify(ArrayList<Integer> hT, int i) {
    int size = hT.size();
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    if (l < size && hT.get(l) > hT.get(largest))
      largest = l;
    if (r < size && hT.get(r) > hT.get(largest))
      largest = r;

    if (largest != i) {
      int temp = hT.get(largest);
      hT.set(largest, hT.get(i));
      hT.set(i, temp);

      heapify(hT, largest);
    }
  }

  void insert(ArrayList<Integer> hT, int newNum) {
    int size = hT.size();
    if (size == 0) {
      hT.add(newNum);
    } else {
      hT.add(newNum);
      for (int i = size / 2 - 1; i >= 0; i--) {
        heapify(hT, i);
      }
    }
  }

  void deleteNode(ArrayList<Integer> hT, int num)
  {
    int size = hT.size();
    int i;
    for (i = 0; i < size; i++)
    {
      if (num == hT.get(i))
        break;
    }

    int temp = hT.get(i);
    hT.set(i, hT.get(size-1));
    hT.set(size-1, temp);

    hT.remove(size-1);
    for (int j = size / 2 - 1; j >= 0; j--)
    {
      heapify(hT, j);
    }
  }

  void printArray(ArrayList<Integer> array, int size) {
    for (Integer i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {

    ArrayList<Integer> array = new ArrayList<Integer>();
    int size = array.size();

    Heap h = new Heap();
    h.insert(array, 3);
    h.insert(array, 4);
    h.insert(array, 9);
    h.insert(array, 5);
    h.insert(array, 2);

    System.out.println("Max-Heap array: ");
    h.printArray(array, size);

    h.deleteNode(array, 4);
    System.out.println("After deleting an element: ");
    h.printArray(array, size);
  }
}
Heap Data Structure Applications
Heap is used while implementing a priority queue.
Dijkstra''s Algorithm
Heap Sort
Previous Tutorial:








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
// Operations on Fibonacci Heap in Java

class node {
  node parent;
  node left;
  node right;
  node child;
  int degree;
  boolean mark;
  int key;

  public node() {
    this.degree = 0;
    this.mark = false;
    this.parent = null;
    this.left = this;
    this.right = this;
    this.child = null;
    this.key = Integer.MAX_VALUE;
  }

  node(int x) {
    this();
    this.key = x;
  }

  void set_parent(node x) {
    this.parent = x;
  }

  node get_parent() {
    return this.parent;
  }

  void set_left(node x) {
    this.left = x;
  }

  node get_left() {
    return this.left;
  }

  void set_right(node x) {
    this.right = x;
  }

  node get_right() {
    return this.right;
  }

  void set_child(node x) {
    this.child = x;
  }

  node get_child() {
    return this.child;
  }

  void set_degree(int x) {
    this.degree = x;
  }

  int get_degree() {
    return this.degree;
  }

  void set_mark(boolean m) {
    this.mark = m;
  }

  boolean get_mark() {
    return this.mark;
  }

  void set_key(int x) {
    this.key = x;
  }

  int get_key() {
    return this.key;
  }
}

public class fibHeap {
  node min;
  int n;
  boolean trace;
  node found;

  public boolean get_trace() {
    return trace;
  }

  public void set_trace(boolean t) {
    this.trace = t;
  }

  public static fibHeap create_heap() {
    return new fibHeap();
  }

  fibHeap() {
    min = null;
    n = 0;
    trace = false;
  }

  private void insert(node x) {
    if (min == null) {
      min = x;
      x.set_left(min);
      x.set_right(min);
    } else {
      x.set_right(min);
      x.set_left(min.get_left());
      min.get_left().set_right(x);
      min.set_left(x);
      if (x.get_key() < min.get_key())
        min = x;
    }
    n += 1;
  }

  public void insert(int key) {
    insert(new node(key));
  }

  public void display() {
    display(min);
    System.out.println();
  }

  private void display(node c) {
    System.out.print("(");
    if (c == null) {
      System.out.print(")");
      return;
    } else {
      node temp = c;
      do {
        System.out.print(temp.get_key());
        node k = temp.get_child();
        display(k);
        System.out.print("->");
        temp = temp.get_right();
      } while (temp != c);
      System.out.print(")");
    }
  }

  public static void merge_heap(fibHeap H1, fibHeap H2, fibHeap H3) {
    H3.min = H1.min;

    if (H1.min != null && H2.min != null) {
      node t1 = H1.min.get_left();
      node t2 = H2.min.get_left();
      H1.min.set_left(t2);
      t1.set_right(H2.min);
      H2.min.set_left(t1);
      t2.set_right(H1.min);
    }
    if (H1.min == null || (H2.min != null && H2.min.get_key() < H1.min.get_key()))
      H3.min = H2.min;
    H3.n = H1.n + H2.n;
  }

  public int find_min() {
    return this.min.get_key();
  }

  private void display_node(node z) {
    System.out.println("right: " + ((z.get_right() == null) ? "-1" : z.get_right().get_key()));
    System.out.println("left: " + ((z.get_left() == null) ? "-1" : z.get_left().get_key()));
    System.out.println("child: " + ((z.get_child() == null) ? "-1" : z.get_child().get_key()));
    System.out.println("degree " + z.get_degree());
  }

  public int extract_min() {
    node z = this.min;
    if (z != null) {
      node c = z.get_child();
      node k = c, p;
      if (c != null) {
        do {
          p = c.get_right();
          insert(c);
          c.set_parent(null);
          c = p;
        } while (c != null && c != k);
      }
      z.get_left().set_right(z.get_right());
      z.get_right().set_left(z.get_left());
      z.set_child(null);
      if (z == z.get_right())
        this.min = null;
      else {
        this.min = z.get_right();
        this.consolidate();
      }
      this.n -= 1;
      return z.get_key();
    }
    return Integer.MAX_VALUE;
  }

  public void consolidate() {
    double phi = (1 + Math.sqrt(5)) / 2;
    int Dofn = (int) (Math.log(this.n) / Math.log(phi));
    node[] A = new node[Dofn + 1];
    for (int i = 0; i <= Dofn; ++i)
      A[i] = null;
    node w = min;
    if (w != null) {
      node check = min;
      do {
        node x = w;
        int d = x.get_degree();
        while (A[d] != null) {
          node y = A[d];
          if (x.get_key() > y.get_key()) {
            node temp = x;
            x = y;
            y = temp;
            w = x;
          }
          fib_heap_link(y, x);
          check = x;
          A[d] = null;
          d += 1;
        }
        A[d] = x;
        w = w.get_right();
      } while (w != null && w != check);
      this.min = null;
      for (int i = 0; i <= Dofn; ++i) {
        if (A[i] != null) {
          insert(A[i]);
        }
      }
    }
  }

  private void fib_heap_link(node y, node x) {
    y.get_left().set_right(y.get_right());
    y.get_right().set_left(y.get_left());

    node p = x.get_child();
    if (p == null) {
      y.set_right(y);
      y.set_left(y);
    } else {
      y.set_right(p);
      y.set_left(p.get_left());
      p.get_left().set_right(y);
      p.set_left(y);
    }
    y.set_parent(x);
    x.set_child(y);
    x.set_degree(x.get_degree() + 1);
    y.set_mark(false);
  }

  private void find(int key, node c) {
    if (found != null || c == null)
      return;
    else {
      node temp = c;
      do {
        if (key == temp.get_key())
          found = temp;
        else {
          node k = temp.get_child();
          find(key, k);
          temp = temp.get_right();
        }
      } while (temp != c && found == null);
    }
  }

  public node find(int k) {
    found = null;
    find(k, this.min);
    return found;
  }

  public void decrease_key(int key, int nval) {
    node x = find(key);
    decrease_key(x, nval);
  }

  private void decrease_key(node x, int k) {
    if (k > x.get_key())
      return;
    x.set_key(k);
    node y = x.get_parent();
    if (y != null && x.get_key() < y.get_key()) {
      cut(x, y);
      cascading_cut(y);
    }
    if (x.get_key() < min.get_key())
      min = x;
  }

  private void cut(node x, node y) {
    x.get_right().set_left(x.get_left());
    x.get_left().set_right(x.get_right());

    y.set_degree(y.get_degree() - 1);

    x.set_right(null);
    x.set_left(null);
    insert(x);
    x.set_parent(null);
    x.set_mark(false);
  }

  private void cascading_cut(node y) {
    node z = y.get_parent();
    if (z != null) {
      if (y.get_mark() == false)
        y.set_mark(true);
      else {
        cut(y, z);
        cascading_cut(z);
      }
    }
  }

  public void delete(node x) {
    decrease_key(x, Integer.MIN_VALUE);
    int p = extract_min();
  }

  public static void main(String[] args) {
    fibHeap obj = create_heap();
    obj.insert(7);
    obj.insert(26);
    obj.insert(30);
    obj.insert(39);
    obj.insert(10);
    obj.display();

    System.out.println(obj.extract_min());
    obj.display();
    System.out.println(obj.extract_min());
    obj.display();
    System.out.println(obj.extract_min());
    obj.display();
    System.out.println(obj.extract_min());
    obj.display();
    System.out.println(obj.extract_min());
    obj.display();
  }
}
Complexities
Decrease Key	O(1)
Delete Node	O(log n)




Tree Data Structure
In this tutorial, you will learn about tree data structure. Also, you will learn about different types of trees and the terminologies used in tree.

A tree is a nonlinear hierarchical data structure that consists of nodes connected by edges.

tree in data structure
A Tree
Why Tree Data Structure?
Other data structures such as arrays, linked list, stack, and queue are linear data structures that store data sequentially. In order to perform any operation in a linear data structure, the time complexity increases with the increase in the data size. But, it is not acceptable in today's computational world.

Different tree data structures allow quicker and easier access to the data as it is a non-linear data structure.

Tree Terminologies
Node
A node is an entity that contains a key or value and pointers to its child nodes.

The last nodes of each path are called leaf nodes or external nodes that do not contain a link/pointer to child nodes.

The node having at least a child node is called an internal node.

Edge
It is the link between any two nodes.

Nodes and edges of a tree
Nodes and edges of a tree
Root
It is the topmost node of a tree.

Height of a Node
The height of a node is the number of edges from the node to the deepest leaf (ie. the longest path from the node to a leaf node).

Depth of a Node
The depth of a node is the number of edges from the root to the node.

Height of a Tree
The height of a Tree is the height of the root node or the depth of the deepest node.

Height and depth of each node in a tree
Height and depth of each node in a tree
Degree of a Node
The degree of a node is the total number of branches of that node.

Forest
A collection of disjoint trees is called a forest.

Forest in data structure
Creating forest from a tree
You can create a forest by cutting the root of a tree.

Types of Tree
Binary Tree
Binary Search Tree
AVL Tree
B-Tree
Tree Traversal
In order to perform any operation on a tree, you need to reach to the specific node. The tree traversal algorithm helps in visiting a required node in the tree.

To learn more, please visit tree traversal.

Tree Applications
Binary Search Trees(BSTs) are used to quickly check whether an element is present in a set or not.
Heap is a kind of tree that is used for heap sort.
A modified version of a tree called Tries is used in modern routers to store routing information.
Most popular databases use B-Trees and T-Trees, which are variants of the tree structure we learned above to store their data
Compilers use a syntax tree to validate the syntax of every program you write.





Tree Traversal - inorder, preorder and postorder
In this tutorial, you will learn about different tree traversal techniques. Also, you will find working examples of different tree traversal methods in C, C++, Java and Python.

Traversing a tree means visiting every node in the tree. You might, for instance, want to add all the values in the tree or find the largest one. For all these operations, you will need to visit each node of the tree.

Linear data structures like arrays, stacks, queues, and linked list have only one way to read the data. But a hierarchical data structure like a tree can be traversed in different ways.

sample tree to learn tree traversal - root node contains 1 with leftchild as 12 and right child as 9. The left child of root further has left child 5 and right child 6
Tree traversal
Let's think about how we can read the elements of the tree in the image shown above.

Starting from top, Left to right

1 -> 12 -> 5 -> 6 -> 9
Starting from bottom, Left to right

5 -> 6 -> 12 -> 9 -> 1
Although this process is somewhat easy, it doesn't respect the hierarchy of the tree, only the depth of the nodes.

Instead, we use traversal methods that take into account the basic structure of a tree i.e.

struct node {
    int data;
    struct node* left;
    struct node* right;
}
The struct node pointed to by left and right might have other left and right children so we should think of them as sub-trees instead of sub-nodes.

According to this structure, every tree is a combination of

A node carrying data
Two subtrees
root node with left subtree and right subtree
Left and Right Subtree
Remember that our goal is to visit each node, so we need to visit all the nodes in the subtree, visit the root node and visit all the nodes in the right subtree as well.

Depending on the order in which we do this, there can be three types of traversal.

Inorder traversal
First, visit all the nodes in the left subtree
Then the root node
Visit all the nodes in the right subtree
inorder(root->left)
display(root->data)
inorder(root->right)
Preorder traversal
Visit root node
Visit all the nodes in the left subtree
Visit all the nodes in the right subtree
display(root->data)
preorder(root->left)
preorder(root->right)
Postorder traversal
Visit all the nodes in the left subtree
Visit all the nodes in the right subtree
Visit the root node
postorder(root->left)
postorder(root->right)
display(root->data)
Let's visualize in-order traversal. We start from the root node.

outlining left subtree, right subtree and root node
Left and Right Subtree
We traverse the left subtree first. We also need to remember to visit the root node and the right subtree when this tree is done.

Let's put all this in a stack so that we remember.

we put the left subtree, root node and right subtree in a stack in that order so that we can display root node and traverse right subtree when we are done with left subtree
Stack
Now we traverse to the subtree pointed on the TOP of the stack.

Again, we follow the same rule of inorder

Left subtree -> root -> right subtree
After traversing the left subtree, we are left with

situation of stack after traversing left subtree, stack now contains the elements of left subtree, followed by root, followed by right child of root
Final Stack
Since the node "5" doesn't have any subtrees, we print it directly. After that we print its parent "12" and then the right child "6".

Putting everything on a stack was helpful because now that the left-subtree of the root node has been traversed, we can print it and go to the right subtree.

After going through all the elements, we get the inorder traversal as

5 -> 12 -> 6 -> 1 -> 9
We don't have to create the stack ourselves because recursion maintains the correct order for us.

Python, Java and C/C++ Examples
Python
Java
C
C+
// Tree traversal in Java

class Node {
  int item;
  Node left, right;

  public Node(int key) {
  item = key;
  left = right = null;
  }
}

class BinaryTree {
  // Root of Binary Tree
  Node root;

  BinaryTree() {
  root = null;
  }

  void postorder(Node node) {
  if (node == null)
    return;

  // Traverse left
  postorder(node.left);
  // Traverse right
  postorder(node.right);
  // Traverse root
  System.out.print(node.item + "->");
  }

  void inorder(Node node) {
  if (node == null)
    return;

  // Traverse left
  inorder(node.left);
  // Traverse root
  System.out.print(node.item + "->");
  // Traverse right
  inorder(node.right);
  }

  void preorder(Node node) {
  if (node == null)
    return;

  // Traverse root
  System.out.print(node.item + "->");
  // Traverse left
  preorder(node.left);
  // Traverse right
  preorder(node.right);
  }

  public static void main(String[] args) {
  BinaryTree tree = new BinaryTree();
  tree.root = new Node(1);
  tree.root.left = new Node(12);
  tree.root.right = new Node(9);
  tree.root.left.left = new Node(5);
  tree.root.left.right = new Node(6);

  System.out.println("Inorder traversal");
  tree.inorder(tree.root);

  System.out.println("\nPreorder traversal ");
  tree.preorder(tree.root);

  System.out.println("\nPostorder traversal");
  tree.postorder(tree.root);
  }
}







Binary Tree
In this tutorial, you will learn about binary tree and its different types. Also, you will find working examples of binary tree in C, C++, Java and Python.

A binary tree is a tree data structure in which each parent node can have at most two children. Each node of a binary tree consists of three items:

data item

address of left child

address of right child

Binary Tree
Binary Tree
Types of Binary Tree
1. Full Binary Tree
A full Binary tree is a special type of binary tree in which every parent node/internal node has either two or no children.

Full binary tree
Full Binary Tree
To learn more, please visit full binary tree.

2. Perfect Binary Tree
A perfect binary tree is a type of binary tree in which every internal node has exactly two child nodes and all the leaf nodes are at the same level.

Perfect binary tree
Perfect Binary Tree
To learn more, please visit perfect binary tree.

3. Complete Binary Tree
A complete binary tree is just like a full binary tree, but with two major differences

Every level must be completely filled
All the leaf elements must lean towards the left.
The last leaf element might not have a right sibling i.e. a complete binary tree doesn't have to be a full binary tree.
'Complete Binary Tree
Complete Binary Tree
To learn more, please visit complete binary tree.

4. Degenerate or Pathological Tree
A degenerate or pathological tree is the tree having a single child either left or right.

Degenerate Binary Tree
Degenerate Binary Tree
5. Skewed Binary Tree
A skewed binary tree is a pathological/degenerate tree in which the tree is either dominated by the left nodes or the right nodes. Thus, there are two types of skewed binary tree: left-skewed binary tree and right-skewed binary tree.

Skewed Binary Tree
Skewed Binary Tree
6. Balanced Binary Tree
It is a type of binary tree in which the difference between the height of the left and the right subtree for each node is either 0 or 1.

Balanced Binary Tree
Balanced Binary Tree
To learn more, please visit balanced binary tree.

Binary Tree Representation
A node of a binary tree is represented by a structure containing a data part and two pointers to other structures of the same type.

struct node
{
 int data;
 struct node *left;
 struct node *right;
};
Binary tree
Binary Tree Representation
Python, Java and C/C++ Examples
Python
Java
C
C++
// Binary Tree in Java

// Node creation
class Node {
  int key;
  Node left, right;

  public Node(int item) {
  key = item;
  left = right = null;
  }
}

class BinaryTree {
  Node root;

  BinaryTree(int key) {
  root = new Node(key);
  }

  BinaryTree() {
  root = null;
  }

  // Traverse Inorder
  public void traverseInOrder(Node node) {
  if (node != null) {
    traverseInOrder(node.left);
    System.out.print(" " + node.key);
    traverseInOrder(node.right);
  }
  }

  // Traverse Postorder
  public void traversePostOrder(Node node) {
  if (node != null) {
    traversePostOrder(node.left);
    traversePostOrder(node.right);
    System.out.print(" " + node.key);
  }
  }

  // Traverse Preorder
  public void traversePreOrder(Node node) {
  if (node != null) {
    System.out.print(" " + node.key);
    traversePreOrder(node.left);
    traversePreOrder(node.right);
  }
  }

  public static void main(String[] args) {
  BinaryTree tree = new BinaryTree();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.right = new Node(3);
  tree.root.left.left = new Node(4);

  System.out.print("Pre order Traversal: ");
  tree.traversePreOrder(tree.root);
  System.out.print("\nIn order Traversal: ");
  tree.traverseInOrder(tree.root);
  System.out.print("\nPost order Traversal: ");
  tree.traversePostOrder(tree.root);
  }
}
Binary Tree Applications
For easy and quick access to data
In router algorithms
To implement heap data structure
Syntax tree








Full Binary Tree
In this tutorial, you will learn about full binary tree and its different theorems. Also, you will find working examples to check full binary tree in C, C++, Java and Python.

A full Binary tree is a special type of binary tree in which every parent node/internal node has either two or no children.

It is also known as a proper binary tree.

full binary tree
Full Binary Tree
Full Binary Tree Theorems
Let, i = the number of internal nodes
       n = be the total number of nodes
       l = number of leaves
      λ = number of levels
The number of leaves is i + 1.
The total number of nodes is 2i + 1.
The number of internal nodes is (n – 1) / 2.
The number of leaves is (n + 1) / 2.
The total number of nodes is 2l – 1.
The number of internal nodes is l – 1.
The number of leaves is at most 2λ - 1.
Python, Java and C/C++ Examples
The following code is for checking if a tree is a full binary tree.

Python
Java
C
C++
// Checking if a binary tree is a full binary tree in Java

class Node {
  int data;
  Node leftChild, rightChild;

  Node(int item) {
  data = item;
  leftChild = rightChild = null;
  }
}

class BinaryTree {
  Node root;

  // Check for Full Binary Tree
  boolean isFullBinaryTree(Node node) {

  // Checking tree emptiness
  if (node == null)
    return true;

  // Checking the children
  if (node.leftChild == null && node.rightChild == null)
    return true;

  if ((node.leftChild != null) && (node.rightChild != null))
    return (isFullBinaryTree(node.leftChild) && isFullBinaryTree(node.rightChild));

  return false;
  }

  public static void main(String args[]) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.leftChild = new Node(2);
    tree.root.rightChild = new Node(3);
    tree.root.leftChild.leftChild = new Node(4);
    tree.root.leftChild.rightChild = new Node(5);
    tree.root.rightChild.leftChild = new Node(6);
    tree.root.rightChild.rightChild = new Node(7);

    if (tree.isFullBinaryTree(tree.root))
      System.out.print("The tree is a full binary tree");
    else
      System.out.print("The tree is not a full binary tree");
  }
}







Perfect Binary Tree
In this tutorial, you will learn about the perfect binary tree. Also, you will find working examples for checking a perfect binary tree in C, C++, Java and Python.

A perfect binary tree is a type of binary tree in which every internal node has exactly two child nodes and all the leaf nodes are at the same level.

Perfect Binary Tree
Perfect Binary Tree
All the internal nodes have a degree of 2.

Recursively, a perfect binary tree can be defined as:

If a single node has no children, it is a perfect binary tree of height h = 0,
If a node has h > 0, it is a perfect binary tree if both of its subtrees are of height h - 1 and are non-overlapping.
Perfect Binary Tree (Recursive Representation)
Perfect Binary Tree (Recursive Representation)
Python, Java and C/C++ Examples
The following code is for checking whether a tree is a perfect binary tree.

Python
Java
C
C++
// Checking if a binary tree is a perfect binary tree in Java

class PerfectBinaryTree {

  static class Node {
    int key;
    Node left, right;
  }

  // Calculate the depth
  static int depth(Node node) {
    int d = 0;
    while (node != null) {
      d++;
      node = node.left;
    }
    return d;
  }

  // Check if the tree is perfect binary tree
  static boolean is_perfect(Node root, int d, int level) {

    // Check if the tree is empty
    if (root == null)
      return true;

    // If for children
    if (root.left == null && root.right == null)
      return (d == level + 1);

    if (root.left == null || root.right == null)
      return false;

    return is_perfect(root.left, d, level + 1) && is_perfect(root.right, d, level + 1);
  }

  // Wrapper function
  static boolean is_Perfect(Node root) {
    int d = depth(root);
    return is_perfect(root, d, 0);
  }

  // Create a new node
  static Node newNode(int k) {
    Node node = new Node();
    node.key = k;
    node.right = null;
    node.left = null;
    return node;
  }

  public static void main(String args[]) {
    Node root = null;
    root = newNode(1);
    root.left = newNode(2);
    root.right = newNode(3);
    root.left.left = newNode(4);
    root.left.right = newNode(5);

    if (is_Perfect(root) == true)
      System.out.println("The tree is a perfect binary tree");
    else
      System.out.println("The tree is not a perfect binary tree");
  }
}
Perfect Binary Tree Theorems
A perfect binary tree of height h has 2h + 1 – 1 node.
A perfect binary tree with n nodes has height log(n + 1) – 1 = Θ(ln(n)).
A perfect binary tree of height h has 2h leaf nodes.
The average depth of a node in a perfect binary tree is Θ(ln(n)).





Complete Binary Tree
In this tutorial, you will learn about a complete binary tree and its different types. Also, you will find working examples of a complete binary tree in C, C++, Java and Python.

A complete binary tree is a binary tree in which all the levels are completely filled except possibly the lowest one, which is filled from the left.

A complete binary tree is just like a full binary tree, but with two major differences

All the leaf elements must lean towards the left.
The last leaf element might not have a right sibling i.e. a complete binary tree doesn't have to be a full binary tree.
'Complete Binary Tree
Complete Binary Tree
Full Binary Tree vs Complete Binary Tree
Comparison between full binary tree and complete binary tree
Comparison between full binary tree and complete binary tree
Comparison between full binary tree and complete binary tree
Comparison between full binary tree and complete binary tree
Comparison between full binary tree and complete binary tree
Comparison between full binary tree and complete binary tree
Comparison between full binary tree and complete binary tree
Comparison between full binary tree and complete binary tree
How a Complete Binary Tree is Created?
Select the first element of the list to be the root node. (no. of elements on level-I: 1)
Complete binary tree creation
Select the first element as root
Put the second element as a left child of the root node and the third element as the right child. (no. of elements on level-II: 2)
Complete binary tree creation
12 as a left child and 9 as a right child
Put the next two elements as children of the left node of the second level. Again, put the next two elements as children of the right node of the second level (no. of elements on level-III: 4) elements).
Keep repeating until you reach the last element.
Complete binary tree creation
5 as a left child and 6 as a right child
Python, Java and C/C++ Examples
Python
Java
C
C++
// Checking if a binary tree is a complete binary tree in Java

// Node creation
class Node {
  int data;
  Node left, right;

  Node(int item) {
    data = item;
    left = right = null;
  }
}

class BinaryTree {
  Node root;

  // Count the number of nodes
  int countNumNodes(Node root) {
    if (root == null)
      return (0);
    return (1 + countNumNodes(root.left) + countNumNodes(root.right));
  }

  // Check for complete binary tree
  boolean checkComplete(Node root, int index, int numberNodes) {

    // Check if the tree is empty
    if (root == null)
      return true;

    if (index >= numberNodes)
      return false;

    return (checkComplete(root.left, 2 * index + 1, numberNodes)
        && checkComplete(root.right, 2 * index + 2, numberNodes));
  }

  public static void main(String args[]) {
    BinaryTree tree = new BinaryTree();

    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.right = new Node(5);
    tree.root.left.left = new Node(4);
    tree.root.right.left = new Node(6);

    int node_count = tree.countNumNodes(tree.root);
    int index = 0;

    if (tree.checkComplete(tree.root, index, node_count))
      System.out.println("The tree is a complete binary tree");
    else
      System.out.println("The tree is not a complete binary tree");
  }
}
Relationship between array indexes and tree element
A complete binary tree has an interesting property that we can use to find the children and parents of any node.

If the index of any element in the array is i, the element in the index 2i+1 will become the left child and element in 2i+2 index will become the right child. Also, the parent of any element at index i is given by the lower bound of (i-1)/2.

Let''s test it out,

Left child of 1 (index 0)
= element in (2*0+1) index 
= element in 1 index 
= 12


Right child of 1
= element in (2*0+2) index
= element in 2 index 
= 9

Similarly,
Left child of 12 (index 1)
= element in (2*1+1) index
= element in 3 index
= 5

Right child of 12
= element in (2*1+2) index
= element in 4 index
= 6

Let us also confirm that the rules hold for finding parent of any node

Parent of 9 (position 2) 
= (2-1)/2 
= ½ 
= 0.5
~ 0 index 
= 1

Parent of 12 (position 1) 
= (1-1)/2 
= 0 index 
= 1
Understanding this mapping of array indexes to tree positions is critical to understanding how the Heap Data Structure works and how it is used to implement Heap Sort.

Complete Binary Tree Applications
Heap-based data structures
Heap sort





Balanced Binary Tree
In this tutorial, you will learn about a balanced binary tree and its different types. Also, you will find working examples of a balanced binary tree in C, C++, Java and Python.

A balanced binary tree, also referred to as a height-balanced binary tree, is defined as a binary tree in which the height of the left and right subtree of any node differ by not more than 1.

To learn more about the height of a tree/node, visit Tree Data Structure.Following are the conditions for a height-balanced binary tree:

difference between the left and the right subtree for any node is not more than one
the left subtree is balanced
the right subtree is balanced
Balanced Binary Tree Example
Balanced Binary Tree with depth at each level
Unbalanced Binary Tree Example
Unbalanced Binary Tree with depth at each level
Python, Java and C/C++ Examples
The following code is for checking whether a tree is height-balanced.

Python
Java
C
C++
// Checking if a binary tree is height balanced in Java

// Node creation
class Node {

  int data;
  Node left, right;

  Node(int d) {
    data = d;
    left = right = null;
  }
}

// Calculate height
class Height {
  int height = 0;
}

class BinaryTree {

  Node root;

  // Check height balance
  boolean checkHeightBalance(Node root, Height height) {

    // Check for emptiness
    if (root == null) {
      height.height = 0;
      return true;
    }

    Height leftHeighteight = new Height(), rightHeighteight = new Height();
    boolean l = checkHeightBalance(root.left, leftHeighteight);
    boolean r = checkHeightBalance(root.right, rightHeighteight);
    int leftHeight = leftHeighteight.height, rightHeight = rightHeighteight.height;

    height.height = (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;

    if ((leftHeight - rightHeight >= 2) || (rightHeight - leftHeight >= 2))
      return false;

    else
      return l && r;
  }

  public static void main(String args[]) {
    Height height = new Height();

    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    if (tree.checkHeightBalance(tree.root, height))
      System.out.println("The tree is balanced");
    else
      System.out.println("The tree is not balanced");
  }
}
Balanced Binary Tree Applications
AVL tree
Balanced Binary Search Tree







Binary Search Tree(BST)
In this tutorial, you will learn how Binary Search Tree works. Also, you will find working examples of Binary Search Tree in C, C++, Java and Python.

Binary search tree is a data structure that quickly allows us to maintain a sorted list of numbers.

It is called a binary tree because each tree node has a maximum of two children.
It is called a search tree because it can be used to search for the presence of a number in O(log(n)) time.
The properties that separate a binary search tree from a regular binary tree is

All nodes of left subtree are less than the root node
All nodes of right subtree are more than the root node
Both subtrees of each node are also BSTs i.e. they have the above two properties
A tree having a right subtree with one value smaller than the root is shown to demonstrate that it is not a valid binary search tree
A tree having a right subtree with one value smaller than the root is shown to demonstrate that it is not a valid binary search tree
The binary tree on the right isn't a binary search tree because the right subtree of the node "3" contains a value smaller than it.

There are two basic operations that you can perform on a binary search tree:

Search Operation
The algorithm depends on the property of BST that if each left subtree has values below root and each right subtree has values above the root.

If the value is below the root, we can say for sure that the value is not in the right subtree; we need to only search in the left subtree and if the value is above the root, we can say for sure that the value is not in the left subtree; we need to only search in the right subtree.

Algorithm:

If root == NULL 
    return NULL;
If number == root->data 
    return root->data;
If number < root->data 
    return search(root->left)
If number > root->data 
    return search(root->right)
Let us try to visualize this with a diagram.

4 is not found so, traverse through the left subtree of 8
4 is not found so, traverse through the left subtree of 8
4 is not found so, traverse through the right subtree of 3
4 is not found so, traverse through the right subtree of 3
4 is not found so, traverse through the left subtree of 6
4 is not found so, traverse through the left subtree of 6
4 is found
4 is found
If the value is found, we return the value so that it gets propagated in each recursion step as shown in the image below.

If you might have noticed, we have called return search(struct node*) four times. When we return either the new node or NULL, the value gets returned again and again until search(root) returns the final result.

if the value is found in any of the subtrees, it is propagated up so that in the end it is returned, otherwise null is returned
If the value is found in any of the subtrees, it is propagated up so that in the end it is returned, otherwise null is returned
If the value is not found, we eventually reach the left or right child of a leaf node which is NULL and it gets propagated and returned.

Insert Operation
Inserting a value in the correct position is similar to searching because we try to maintain the rule that the left subtree is lesser than root and the right subtree is larger than root.

We keep going to either right subtree or left subtree depending on the value and when we reach a point left or right subtree is null, we put the new node there.

Algorithm:

If node == NULL 
    return createNode(data)
if (data < node->data)
    node->left  = insert(node->left, data);
else if (data > node->data)
    node->right = insert(node->right, data);  
return node;
The algorithm isn't as simple as it looks. Let's try to visualize how we add a number to an existing BST.

4<8 so, transverse through the left child of 8
4<8 so, transverse through the left child of 8
4>3 so, transverse through the right child of 4
4>3 so, transverse through the right child of 8
4<6 so, transverse through the left child of 6
4<6 so, transverse through the left child of 6
Insert 4 as a left child of 6
Insert 4 as a left child of 6
We have attached the node but we still have to exit from the function without doing any damage to the rest of the tree. This is where the return node; at the end comes in handy. In the case of NULL, the newly created node is returned and attached to the parent node, otherwise the same node is returned without any change as we go up until we return to the root.

This makes sure that as we move back up the tree, the other node connections aren't changed.

Image showing the importance of returning the root element at the end so that the elements don't lose their position during the upward recursion step.
Image showing the importance of returning the root element at the end so that the elements don't lose their position during the upward recursion step.
Deletion Operation
There are three cases for deleting a node from a binary search tree.

Case I
In the first case, the node to be deleted is the leaf node. In such a case, simply delete the node from the tree.

4 is to be deleted
4 is to be deleted
Delete the node
Delete the node
Case II
In the second case, the node to be deleted lies has a single child node. In such a case follow the steps below:

Replace that node with its child node.
Remove the child node from its original position.
6 is to be deleted
6 is to be deleted
copy the value of its child to the node
copy the value of its child to the node and delete the child
Final tree
Final tree
Case III
In the third case, the node to be deleted has two children. In such a case follow the steps below:

Get the inorder successor of that node.
Replace the node with the inorder successor.
Remove the inorder successor from its original position.
3 is to be deleted
3 is to be deleted
Copy the value of the inorder successor (4) to the node
Copy the value of the inorder successor (4) to the node
delete the inorder successor
Delete the inorder successor
Python, Java and C/C++ Examples
Python
Java
C
C++
// Binary Search Tree operations in Java

class BinarySearchTree {
  class Node {
    int key;
    Node left, right;

    public Node(int item) {
      key = item;
      left = right = null;
    }
  }

  Node root;

  BinarySearchTree() {
    root = null;
  }

  void insert(int key) {
    root = insertKey(root, key);
  }

  // Insert key in the tree
  Node insertKey(Node root, int key) {
    // Return a new node if the tree is empty
    if (root == null) {
      root = new Node(key);
      return root;
    }

    // Traverse to the right place and insert the node
    if (key < root.key)
      root.left = insertKey(root.left, key);
    else if (key > root.key)
      root.right = insertKey(root.right, key);

    return root;
  }

  void inorder() {
    inorderRec(root);
  }

  // Inorder Traversal
  void inorderRec(Node root) {
    if (root != null) {
      inorderRec(root.left);
      System.out.print(root.key + " -> ");
      inorderRec(root.right);
    }
  }

  void deleteKey(int key) {
    root = deleteRec(root, key);
  }

  Node deleteRec(Node root, int key) {
    // Return if the tree is empty
    if (root == null)
      return root;

    // Find the node to be deleted
    if (key < root.key)
      root.left = deleteRec(root.left, key);
    else if (key > root.key)
      root.right = deleteRec(root.right, key);
    else {
      // If the node is with only one child or no child
      if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;

      // If the node has two children
      // Place the inorder successor in position of the node to be deleted
      root.key = minValue(root.right);

      // Delete the inorder successor
      root.right = deleteRec(root.right, root.key);
    }

    return root;
  }

  // Find the inorder successor
  int minValue(Node root) {
    int minv = root.key;
    while (root.left != null) {
      minv = root.left.key;
      root = root.left;
    }
    return minv;
  }

  // Driver Program to test above functions
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(8);
    tree.insert(3);
    tree.insert(1);
    tree.insert(6);
    tree.insert(7);
    tree.insert(10);
    tree.insert(14);
    tree.insert(4);

    System.out.print("Inorder traversal: ");
    tree.inorder();

    System.out.println("\n\nAfter deleting 10");
    tree.deleteKey(10);
    System.out.print("Inorder traversal: ");
    tree.inorder();
  }
}
Binary Search Tree Complexities
Time Complexity
Operation	Best Case Complexity	Average Case Complexity	Worst Case Complexity
Search	O(log n)	O(log n)	O(n)
Insertion	O(log n)	O(log n)	O(n)
Deletion	O(log n)	O(log n)	O(n)
Here, n is the number of nodes in the tree.

Space Complexity
The space complexity for all the operations is O(n).

Binary Search Tree Applications
In multilevel indexing in the database
For dynamic sorting
For managing virtual memory areas in Unix kernel





AVL Tree
In this tutorial, you will learn what an avl tree is. Also, you will find working examples of various operations performed on an avl tree in C, C++, Java and Python.

AVL tree is a self-balancing binary search tree in which each node maintains extra information called a balance factor whose value is either -1, 0 or +1.

AVL tree got its name after its inventor Georgy Adelson-Velsky and Landis.

Balance Factor
Balance factor of a node in an AVL tree is the difference between the height of the left subtree and that of the right subtree of that node.

Balance Factor = (Height of Left Subtree - Height of Right Subtree) or (Height of Right Subtree - Height of Left Subtree)

The self balancing property of an avl tree is maintained by the balance factor. The value of balance factor should always be -1, 0 or +1.

An example of a balanced avl tree is:

avl tree
Avl tree
Operations on an AVL tree
Various operations that can be performed on an AVL tree are:

Rotating the subtrees in an AVL Tree
In rotation operation, the positions of the nodes of a subtree are interchanged.

There are two types of rotations:

Left Rotate
In left-rotation, the arrangement of the nodes on the right is transformed into the arrangements on the left node.

Algorithm

Let the initial tree be:
left-rotate
Left rotate
If y has a left subtree, assign x as the parent of the left subtree of y.
left-rotate
Assign x as the parent of the left subtree of y
If the parent of x is NULL, make y as the root of the tree.
Else if x is the left child of p, make y as the left child of p.
Else assign y as the right child of p.
left-rotate
Change the parent of x to that of y
Make y as the parent of x.
left-rotate
Assign y as the parent of x.
Right Rotate
In left-rotation, the arrangement of the nodes on the left is transformed into the arrangements on the right node.

Let the initial tree be:
right-rotate
Initial tree
If x has a right subtree, assign y as the parent of the right subtree of x.
right-rotate
Assign y as the parent of the right subtree of x
If the parent of y is NULL, make x as the root of the tree.
Else if y is the right child of its parent p, make x as the right child of p.
Else assign x as the left child of p.
right-rotate
Assign the parent of y as the parent of x.
Make x as the parent of y.
right-rotate
Assign x as the parent of y
Left-Right and Right-Left Rotate
In left-right rotation, the arrangements are first shifted to the left and then to the right.

Do left rotation on x-y.
left-right rotate
Left rotate x-y
Do right rotation on y-z.
left-right rotate
Right rotate z-y
In right-left rotation, the arrangements are first shifted to the right and then to the left.

Do right rotation on x-y.
right-left rotate
Right rotate x-y
Do left rotation on z-y.
right-left rotate
Left rotate z-y
Algorithm to insert a newNode
A newNode is always inserted as a leaf node with balance factor equal to 0.

Let the initial tree be:
initial tree
Initial tree for insertion

Let the node to be inserted be:
new node
New node
Go to the appropriate leaf node to insert a newNode using the following recursive steps. Compare newKey with rootKey of the current tree.
If newKey < rootKey, call insertion algorithm on the left subtree of the current node until the leaf node is reached.
Else if newKey > rootKey, call insertion algorithm on the right subtree of current node until the leaf node is reached.
Else, return leafNode.
avl tree insertion
Finding the location to insert newNode
Compare leafKey obtained from the above steps with newKey:
If newKey < leafKey, make newNode as the leftChild of leafNode.
Else, make newNode as rightChild of leafNode.
avl tree insertion
Inserting the new node
Update balanceFactor of the nodes.
avl tree insertion
Updating the balance factor after insertion
If the nodes are unbalanced, then rebalance the node.
If balanceFactor > 1, it means the height of the left subtree is greater than that of the right subtree. So, do a right rotation or left-right rotation
If newNodeKey < leftChildKey do right rotation.
Else, do left-right rotation.
insertion in avl tree
Balancing the tree with rotation
insertion in avl tree
Balancing the tree with rotation
If balanceFactor < -1, it means the height of the right subtree is greater than that of the left subtree. So, do right rotation or right-left rotation
If newNodeKey > rightChildKey do left rotation.
Else, do right-left rotation
The final tree is:
left-right insertion
Final balanced tree
Algorithm to Delete a node
A node is always deleted as a leaf node. After deleting a node, the balance factors of the nodes get changed. In order to rebalance the balance factor, suitable rotations are performed.

Locate nodeToBeDeleted (recursion is used to find nodeToBeDeleted in the code used below).
node to be deleted
Locating the node to be deleted
There are three cases for deleting a node:
If nodeToBeDeleted is the leaf node (ie. does not have any child), then remove nodeToBeDeleted.
If nodeToBeDeleted has one child, then substitute the contents of nodeToBeDeleted with that of the child. Remove the child.
If nodeToBeDeleted has two children, find the inorder successor w of nodeToBeDeleted (ie. node with a minimum value of key in the right subtree).
finding the successor
Finding the successor
Substitute the contents of nodeToBeDeleted with that of w.
substitute the node to be deleted
Substitute the node to be deleted
Remove the leaf node w.
remove w
Remove w
Update balanceFactor of the nodes.
update bf
Update bf
Rebalance the tree if the balance factor of any of the nodes is not equal to -1, 0 or 1.
If balanceFactor of currentNode > 1,
If balanceFactor of leftChild >= 0, do right rotation.
right-rotate
Right-rotate for balancing the tree
Else do left-right rotation.
If balanceFactor of currentNode < -1,
If balanceFactor of rightChild <= 0, do left rotation.
Else do right-left rotation.
The final tree is:
avl tree
Avl tree final
Python, Java and C/C++ Examples
Python
Java
C
C++
// AVL tree implementation in Java

// Create node
class Node {
  int item, height;
  Node left, right;

  Node(int d) {
    item = d;
    height = 1;
  }
}

// Tree class
class AVLTree {
  Node root;

  int height(Node N) {
    if (N == null)
      return 0;
    return N.height;
  }

  int max(int a, int b) {
    return (a > b) ? a : b;
  }

  Node rightRotate(Node y) {
    Node x = y.left;
    Node T2 = x.right;
    x.right = y;
    y.left = T2;
    y.height = max(height(y.left), height(y.right)) + 1;
    x.height = max(height(x.left), height(x.right)) + 1;
    return x;
  }

  Node leftRotate(Node x) {
    Node y = x.right;
    Node T2 = y.left;
    y.left = x;
    x.right = T2;
    x.height = max(height(x.left), height(x.right)) + 1;
    y.height = max(height(y.left), height(y.right)) + 1;
    return y;
  }

  // Get balance factor of a node
  int getBalanceFactor(Node N) {
    if (N == null)
      return 0;
    return height(N.left) - height(N.right);
  }

  // Insert a node
  Node insertNode(Node node, int item) {

    // Find the position and insert the node
    if (node == null)
      return (new Node(item));
    if (item < node.item)
      node.left = insertNode(node.left, item);
    else if (item > node.item)
      node.right = insertNode(node.right, item);
    else
      return node;

    // Update the balance factor of each node
    // And, balance the tree
    node.height = 1 + max(height(node.left), height(node.right));
    int balanceFactor = getBalanceFactor(node);
    if (balanceFactor > 1) {
      if (item < node.left.item) {
        return rightRotate(node);
      } else if (item > node.left.item) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
    }
    if (balanceFactor < -1) {
      if (item > node.right.item) {
        return leftRotate(node);
      } else if (item < node.right.item) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
    }
    return node;
  }

  Node nodeWithMimumValue(Node node) {
    Node current = node;
    while (current.left != null)
      current = current.left;
    return current;
  }

  // Delete a node
  Node deleteNode(Node root, int item) {

    // Find the node to be deleted and remove it
    if (root == null)
      return root;
    if (item < root.item)
      root.left = deleteNode(root.left, item);
    else if (item > root.item)
      root.right = deleteNode(root.right, item);
    else {
      if ((root.left == null) || (root.right == null)) {
        Node temp = null;
        if (temp == root.left)
          temp = root.right;
        else
          temp = root.left;
        if (temp == null) {
          temp = root;
          root = null;
        } else
          root = temp;
      } else {
        Node temp = nodeWithMimumValue(root.right);
        root.item = temp.item;
        root.right = deleteNode(root.right, temp.item);
      }
    }
    if (root == null)
      return root;

    // Update the balance factor of each node and balance the tree
    root.height = max(height(root.left), height(root.right)) + 1;
    int balanceFactor = getBalanceFactor(root);
    if (balanceFactor > 1) {
      if (getBalanceFactor(root.left) >= 0) {
        return rightRotate(root);
      } else {
        root.left = leftRotate(root.left);
        return rightRotate(root);
      }
    }
    if (balanceFactor < -1) {
      if (getBalanceFactor(root.right) <= 0) {
        return leftRotate(root);
      } else {
        root.right = rightRotate(root.right);
        return leftRotate(root);
      }
    }
    return root;
  }

  void preOrder(Node node) {
    if (node != null) {
      System.out.print(node.item + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  // Print the tree
  private void printTree(Node currPtr, String indent, boolean last) {
    if (currPtr != null) {
      System.out.print(indent);
      if (last) {
        System.out.print("R----");
        indent += "   ";
      } else {
        System.out.print("L----");
        indent += "|  ";
      }
      System.out.println(currPtr.item);
      printTree(currPtr.left, indent, false);
      printTree(currPtr.right, indent, true);
    }
  }

  // Driver code
  public static void main(String[] args) {
    AVLTree tree = new AVLTree();
    tree.root = tree.insertNode(tree.root, 33);
    tree.root = tree.insertNode(tree.root, 13);
    tree.root = tree.insertNode(tree.root, 53);
    tree.root = tree.insertNode(tree.root, 9);
    tree.root = tree.insertNode(tree.root, 21);
    tree.root = tree.insertNode(tree.root, 61);
    tree.root = tree.insertNode(tree.root, 8);
    tree.root = tree.insertNode(tree.root, 11);
    tree.printTree(tree.root, "", true);
    tree.root = tree.deleteNode(tree.root, 13);
    System.out.println("After Deletion: ");
    tree.printTree(tree.root, "", true);
  }
}
Complexities of Different Operations on an AVL Tree
Insertion	Deletion	Search
O(log n)	O(log n)	O(log n)
AVL Tree Applications
For indexing large records in databases
For searching in large databases






B-tree
In this tutorial, you will learn what a B-tree is. Also, you will find working examples of search operation on a B-tree in C, C++, Java and Python.

B-tree is a special type of self-balancing search tree in which each node can contain more than one key and can have more than two children. It is a generalized form of the binary search tree.

It is also known as a height-balanced m-way tree.

B-tree example
B-tree
Why do you need a B-tree data strcuture?
The need for B-tree arose with the rise in the need for lesser time in accessing the physical storage media like a hard disk. The secondary storage devices are slower with a larger capacity. There was a need for such types of data structures that minimize the disk accesses.

Other data structures such as a binary search tree, avl tree, red-black tree, etc can store only one key in one node. If you have to store a large number of keys, then the height of such trees becomes very large and the access time increases.

However, B-tree can store many keys in a single node and can have multiple child nodes. This decreases the height significantly allowing faster disk accesses.

B-tree Properties
For each node x, the keys are stored in increasing order.
In each node, there is a boolean value x.leaf which is true if x is a leaf.
If n is the order of the tree, each internal node can contain at most n - 1 keys along with a pointer to each child.
Each node except root can have at most n children and at least n/2 children.
All leaves have the same depth (i.e. height-h of the tree).
The root has at least 2 children and contains a minimum of 1 key.
If n ≥ 1, then for any n-key B-tree of height h and minimum degree t ≥ 2, h ≥ logt (n+1)/2.
Operations on a B-tree
Searching an element in a B-tree
Searching for an element in a B-tree is the generalized form of searching an element in a Binary Search Tree. The following steps are followed.

Starting from the root node, compare k with the first key of the node.
If k = the first key of the node, return the node and the index.
If k.leaf = true, return NULL (i.e. not found).
If k < the first key of the root node, search the left child of this key recursively.
If there is more than one key in the current node and k > the first key, compare k with the next key in the node.
If k < next key, search the left child of this key (ie. k lies in between the first and the second keys).
Else, search the right child of the key.
Repeat steps 1 to 4 until the leaf is reached.
Searching Example
Let us search key k = 17 in the tree below of degree 3.
B-tree
B-tree
k is not found in the root so, compare it with the root key.
Not found on the root node
k is not found on the root node
Since k > 11, go to the right child of the root node.
Go to the right subtree
Go to the right subtree
Compare k with 16. Since k > 16, compare k with the next key 18.
Compare with the keys from left to right
Compare with the keys from left to right
Since k < 18, k lies between 16 and 18. Search in the right child of 16 or the left child of 18.
k lies in between 16 and 18
k lies in between 16 and 18
k is found.
k is found
k is found
Algorithm for Searching an Element
BtreeSearch(x, k)
 i = 1
 while i ≤ n[x] and k ≥ keyi[x]        // n[x] means number of keys in x node
    do i = i + 1
if i  n[x] and k = keyi[x]
    then return (x, i)
if leaf [x]
    then return NIL
else
    return BtreeSearch(ci[x], k)
To learn more about different B-tree operations, please visit

Insertion on B-tree
Deletion on B-tree
B-tree operations code in Python, Java, and C/C++
Python
Java
C
C++

// Searching a key on a B-tree in Java 

public class BTree {

  private int T;

  // Node creation
  public class Node {
    int n;
    int key[] = new int[2 * T - 1];
    Node child[] = new Node[2 * T];
    boolean leaf = true;

    public int Find(int k) {
      for (int i = 0; i < this.n; i++) {
        if (this.key[i] == k) {
          return i;
        }
      }
      return -1;
    };
  }

  public BTree(int t) {
    T = t;
    root = new Node();
    root.n = 0;
    root.leaf = true;
  }

  private Node root;

  // Search key
  private Node Search(Node x, int key) {
    int i = 0;
    if (x == null)
      return x;
    for (i = 0; i < x.n; i++) {
      if (key < x.key[i]) {
        break;
      }
      if (key == x.key[i]) {
        return x;
      }
    }
    if (x.leaf) {
      return null;
    } else {
      return Search(x.child[i], key);
    }
  }

  // Splitting the node
  private void Split(Node x, int pos, Node y) {
    Node z = new Node();
    z.leaf = y.leaf;
    z.n = T - 1;
    for (int j = 0; j < T - 1; j++) {
      z.key[j] = y.key[j + T];
    }
    if (!y.leaf) {
      for (int j = 0; j < T; j++) {
        z.child[j] = y.child[j + T];
      }
    }
    y.n = T - 1;
    for (int j = x.n; j >= pos + 1; j--) {
      x.child[j + 1] = x.child[j];
    }
    x.child[pos + 1] = z;

    for (int j = x.n - 1; j >= pos; j--) {
      x.key[j + 1] = x.key[j];
    }
    x.key[pos] = y.key[T - 1];
    x.n = x.n + 1;
  }

  // Inserting a value
  public void Insert(final int key) {
    Node r = root;
    if (r.n == 2 * T - 1) {
      Node s = new Node();
      root = s;
      s.leaf = false;
      s.n = 0;
      s.child[0] = r;
      Split(s, 0, r);
      insertValue(s, key);
    } else {
      insertValue(r, key);
    }
  }

  // Insert the node
  final private void insertValue(Node x, int k) {

    if (x.leaf) {
      int i = 0;
      for (i = x.n - 1; i >= 0 && k < x.key[i]; i--) {
        x.key[i + 1] = x.key[i];
      }
      x.key[i + 1] = k;
      x.n = x.n + 1;
    } else {
      int i = 0;
      for (i = x.n - 1; i >= 0 && k < x.key[i]; i--) {
      }
      ;
      i++;
      Node tmp = x.child[i];
      if (tmp.n == 2 * T - 1) {
        Split(x, i, tmp);
        if (k > x.key[i]) {
          i++;
        }
      }
      insertValue(x.child[i], k);
    }

  }

  public void Show() {
    Show(root);
  }

  // Display
  private void Show(Node x) {
    assert (x == null);
    for (int i = 0; i < x.n; i++) {
      System.out.print(x.key[i] + " ");
    }
    if (!x.leaf) {
      for (int i = 0; i < x.n + 1; i++) {
        Show(x.child[i]);
      }
    }
  }

  // Check if present
  public boolean Contain(int k) {
    if (this.Search(root, k) != null) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    BTree b = new BTree(3);
    b.Insert(8);
    b.Insert(9);
    b.Insert(10);
    b.Insert(11);
    b.Insert(15);
    b.Insert(20);
    b.Insert(17);

    b.Show();

    if (b.Contain(12)) {
      System.out.println("\nfound");
    } else {
      System.out.println("\nnot found");
    }
    ;
  }
}
Searching Complexity on B Tree
Worst case Time complexity: Θ(log n)

Average case Time complexity: Θ(log n)

Best case Time complexity: Θ(log n)

Average case Space complexity: Θ(n)

Worst case Space complexity: Θ(n)

B Tree Applications
databases and file systems
to store blocks of data (secondary storage media)
multilevel indexing





Insertion into a B-tree
In this tutorial, you will learn how to insert a key into a btree. Also, you will find working examples of inserting keys into a B-tree in C, C++, Java and Python.

Inserting an element on a B-tree consists of two events: searching the appropriate node to insert the element and splitting the node if required.Insertion operation always takes place in the bottom-up approach.

Let us understand these events below.

Insertion Operation
If the tree is empty, allocate a root node and insert the key.
Update the allowed number of keys in the node.
Search the appropriate node for insertion.
If the node is full, follow the steps below.
Insert the elements in increasing order.
Now, there are elements greater than its limit. So, split at the median.
Push the median key upwards and make the left keys as a left child and the right keys as a right child.
If the node is not full, follow the steps below.
Insert the node in increasing order.
Insertion Example
Let us understand the insertion operation with the illustrations below.

The elements to be inserted are 8, 9, 10, 11, 15, 20, 17.

Inserting elements into a B-tree
Inserting elements into a B-tree
Algorithm for Inserting an Element
BreeInsertion(T, k)
r  root[T]
if n[r] = 2t - 1
    s = AllocateNode()
    root[T] = s
    leaf[s] = FALSE
    n[s] <- 0
    c1[s] <- r
    BtreeSplitChild(s, 1, r)
    BtreeInsertNonFull(s, k)
else BtreeInsertNonFull(r, k)
BtreeInsertNonFull(x, k)
i = n[x]
if leaf[x]
    while i ≥ 1 and k < keyi[x]
        keyi+1 [x] = keyi[x]
        i = i - 1
    keyi+1[x] = k
    n[x] = n[x] + 1
else while i ≥ 1 and k < keyi[x]
        i = i - 1
    i = i + 1
    if n[ci[x]] == 2t - 1
        BtreeSplitChild(x, i, ci[x])
        if k &rt; keyi[x]
            i = i + 1
    BtreeInsertNonFull(ci[x], k)
BtreeSplitChild(x, i)
BtreeSplitChild(x, i, y)
z = AllocateNode()
leaf[z] = leaf[y]
n[z] = t - 1
for j = 1 to t - 1
    keyj[z] = keyj+t[y]
if not leaf [y]
    for j = 1 to t
        cj[z] = cj + t[y]
n[y] = t - 1
for j = n[x] + 1 to i + 1
    cj+1[x] = cj[x]
ci+1[x] = z
for j = n[x] to i
    keyj+1[x] = keyj[x]
keyi[x] = keyt[y]
n[x] = n[x] + 1
Python, Java and C/C++ Examples
Python
Java
C
C++
// Inserting a key on a B-tree in Java 

public class BTree {

  private int T;

  // Node Creation
  public class Node {
    int n;
    int key[] = new int[2 * T - 1];
    Node child[] = new Node[2 * T];
    boolean leaf = true;

    public int Find(int k) {
      for (int i = 0; i < this.n; i++) {
        if (this.key[i] == k) {
          return i;
        }
      }
      return -1;
    };
  }

  public BTree(int t) {
    T = t;
    root = new Node();
    root.n = 0;
    root.leaf = true;
  }

  private Node root;

  // split
  private void split(Node x, int pos, Node y) {
    Node z = new Node();
    z.leaf = y.leaf;
    z.n = T - 1;
    for (int j = 0; j < T - 1; j++) {
      z.key[j] = y.key[j + T];
    }
    if (!y.leaf) {
      for (int j = 0; j < T; j++) {
        z.child[j] = y.child[j + T];
      }
    }
    y.n = T - 1;
    for (int j = x.n; j >= pos + 1; j--) {
      x.child[j + 1] = x.child[j];
    }
    x.child[pos + 1] = z;

    for (int j = x.n - 1; j >= pos; j--) {
      x.key[j + 1] = x.key[j];
    }
    x.key[pos] = y.key[T - 1];
    x.n = x.n + 1;
  }

  // insert key
  public void insert(final int key) {
    Node r = root;
    if (r.n == 2 * T - 1) {
      Node s = new Node();
      root = s;
      s.leaf = false;
      s.n = 0;
      s.child[0] = r;
      split(s, 0, r);
      _insert(s, key);
    } else {
      _insert(r, key);
    }
  }

  // insert node
  final private void _insert(Node x, int k) {

    if (x.leaf) {
      int i = 0;
      for (i = x.n - 1; i >= 0 && k < x.key[i]; i--) {
        x.key[i + 1] = x.key[i];
      }
      x.key[i + 1] = k;
      x.n = x.n + 1;
    } else {
      int i = 0;
      for (i = x.n - 1; i >= 0 && k < x.key[i]; i--) {
      }
      ;
      i++;
      Node tmp = x.child[i];
      if (tmp.n == 2 * T - 1) {
        split(x, i, tmp);
        if (k > x.key[i]) {
          i++;
        }
      }
      _insert(x.child[i], k);
    }

  }

  public void display() {
    display(root);
  }

  // Display the tree
  private void display(Node x) {
    assert (x == null);
    for (int i = 0; i < x.n; i++) {
      System.out.print(x.key[i] + " ");
    }
    if (!x.leaf) {
      for (int i = 0; i < x.n + 1; i++) {
        display(x.child[i]);
      }
    }
  }

  public static void main(String[] args) {
    BTree b = new BTree(3);
    b.insert(8);
    b.insert(9);
    b.insert(10);
    b.insert(11);
    b.insert(15);
    b.insert(20);
    b.insert(17);

    b.display();
  }
}







Deletion from a B-tree
In this tutorial, you will learn how to delete a key from a b-tree. Also, you will find working examples of deleting keys from a B-tree in C, C++, Java and Python.

Deleting an element on a B-tree consists of three main events: searching the node where the key to be deleted exists, deleting the key and balancing the tree if required.

While deleting a tree, a condition called underflow may occur. Underflow occurs when a node contains less than the minimum number of keys it should hold.

The terms to be understood before studying deletion operation are:

Inorder Predecessor
The largest key on the left child of a node is called its inorder predecessor.
Inorder Successor
The smallest key on the right child of a node is called its inorder successor.
Deletion Operation
Before going through the steps below, one must know these facts about a B tree of degree m.

A node can have a maximum of m children. (i.e. 3)
A node can contain a maximum of m - 1 keys. (i.e. 2)
A node should have a minimum of ⌈m/2⌉ children. (i.e. 2)
A node (except root node) should contain a minimum of ⌈m/2⌉ - 1 keys. (i.e. 1)
There are three main cases for deletion operation in a B tree.

Case I
The key to be deleted lies in the leaf. There are two cases for it.

The deletion of the key does not violate the property of the minimum number of keys a node should hold.

In the tree below, deleting 32 does not violate the above properties.
Delete a key from a B-tree
Deleting a leaf key (32) from B-tree
The deletion of the key violates the property of the minimum number of keys a node should hold. In this case, we borrow a key from its immediate neighboring sibling node in the order of left to right.

First, visit the immediate left sibling. If the left sibling node has more than a minimum number of keys, then borrow a key from this node.

Else, check to borrow from the immediate right sibling node.

In the tree below, deleting 31 results in the above condition. Let us borrow a key from the left sibling node.
Delete a key from a B-tree
Deleting a leaf key (31)
If both the immediate sibling nodes already have a minimum number of keys, then merge the node with either the left sibling node or the right sibling node. This merging is done through the parent node.

Deleting 30 results in the above case.
 
Delete a key from a B-tree
Delete a leaf key (30)
Case II
If the key to be deleted lies in the internal node, the following cases occur.

The internal node, which is deleted, is replaced by an inorder predecessor if the left child has more than the minimum number of keys.
Deleting an internal node
Deleting an internal node (33)
The internal node, which is deleted, is replaced by an inorder successor if the right child has more than the minimum number of keys.
If either child has exactly a minimum number of keys then, merge the left and the right children.
 
Deleting an internal node
Deleting an internal node (30)
After merging if the parent node has less than the minimum number of keys then, look for the siblings as in Case I.
Case III
In this case, the height of the tree shrinks. If the target key lies in an internal node, and the deletion of the key leads to a fewer number of keys in the node (i.e. less than the minimum required), then look for the inorder predecessor and the inorder successor. If both the children contain a minimum number of keys then, borrowing cannot take place. This leads to Case II(3) i.e. merging the children.

Again, look for the sibling to borrow a key. But, if the sibling also has only a minimum number of keys then, merge the node with the sibling along with the parent. Arrange the children accordingly (increasing order).

Deleting an internal node
Deleting an internal node (10)
Python, Java and C/C++ Examples
Python
Java
C
C++
// Inserting a key on a B-tree in Java

import java.util.Stack;

public class BTree {

  private int T;

  public class Node {
    int n;
    int key[] = new int[2 * T - 1];
    Node child[] = new Node[2 * T];
    boolean leaf = true;

    public int Find(int k) {
      for (int i = 0; i < this.n; i++) {
        if (this.key[i] == k) {
          return i;
        }
      }
      return -1;
    };
  }

  public BTree(int t) {
    T = t;
    root = new Node();
    root.n = 0;
    root.leaf = true;
  }

  private Node root;

  // Search the key
  private Node Search(Node x, int key) {
    int i = 0;
    if (x == null)
      return x;
    for (i = 0; i < x.n; i++) {
      if (key < x.key[i]) {
        break;
      }
      if (key == x.key[i]) {
        return x;
      }
    }
    if (x.leaf) {
      return null;
    } else {
      return Search(x.child[i], key);
    }
  }

  // Split function
  private void Split(Node x, int pos, Node y) {
    Node z = new Node();
    z.leaf = y.leaf;
    z.n = T - 1;
    for (int j = 0; j < T - 1; j++) {
      z.key[j] = y.key[j + T];
    }
    if (!y.leaf) {
      for (int j = 0; j < T; j++) {
        z.child[j] = y.child[j + T];
      }
    }
    y.n = T - 1;
    for (int j = x.n; j >= pos + 1; j--) {
      x.child[j + 1] = x.child[j];
    }
    x.child[pos + 1] = z;

    for (int j = x.n - 1; j >= pos; j--) {
      x.key[j + 1] = x.key[j];
    }
    x.key[pos] = y.key[T - 1];
    x.n = x.n + 1;
  }

  // Insert the key
  public void Insert(final int key) {
    Node r = root;
    if (r.n == 2 * T - 1) {
      Node s = new Node();
      root = s;
      s.leaf = false;
      s.n = 0;
      s.child[0] = r;
      Split(s, 0, r);
      _Insert(s, key);
    } else {
      _Insert(r, key);
    }
  }

  // Insert the node
  final private void _Insert(Node x, int k) {

    if (x.leaf) {
      int i = 0;
      for (i = x.n - 1; i >= 0 && k < x.key[i]; i--) {
        x.key[i + 1] = x.key[i];
      }
      x.key[i + 1] = k;
      x.n = x.n + 1;
    } else {
      int i = 0;
      for (i = x.n - 1; i >= 0 && k < x.key[i]; i--) {
      }
      ;
      i++;
      Node tmp = x.child[i];
      if (tmp.n == 2 * T - 1) {
        Split(x, i, tmp);
        if (k > x.key[i]) {
          i++;
        }
      }
      _Insert(x.child[i], k);
    }

  }

  public void Show() {
    Show(root);
  }

  private void Remove(Node x, int key) {
    int pos = x.Find(key);
    if (pos != -1) {
      if (x.leaf) {
        int i = 0;
        for (i = 0; i < x.n && x.key[i] != key; i++) {
        }
        ;
        for (; i < x.n; i++) {
          if (i != 2 * T - 2) {
            x.key[i] = x.key[i + 1];
          }
        }
        x.n--;
        return;
      }
      if (!x.leaf) {

        Node pred = x.child[pos];
        int predKey = 0;
        if (pred.n >= T) {
          for (;;) {
            if (pred.leaf) {
              System.out.println(pred.n);
              predKey = pred.key[pred.n - 1];
              break;
            } else {
              pred = pred.child[pred.n];
            }
          }
          Remove(pred, predKey);
          x.key[pos] = predKey;
          return;
        }

        Node nextNode = x.child[pos + 1];
        if (nextNode.n >= T) {
          int nextKey = nextNode.key[0];
          if (!nextNode.leaf) {
            nextNode = nextNode.child[0];
            for (;;) {
              if (nextNode.leaf) {
                nextKey = nextNode.key[nextNode.n - 1];
                break;
              } else {
                nextNode = nextNode.child[nextNode.n];
              }
            }
          }
          Remove(nextNode, nextKey);
          x.key[pos] = nextKey;
          return;
        }

        int temp = pred.n + 1;
        pred.key[pred.n++] = x.key[pos];
        for (int i = 0, j = pred.n; i < nextNode.n; i++) {
          pred.key[j++] = nextNode.key[i];
          pred.n++;
        }
        for (int i = 0; i < nextNode.n + 1; i++) {
          pred.child[temp++] = nextNode.child[i];
        }

        x.child[pos] = pred;
        for (int i = pos; i < x.n; i++) {
          if (i != 2 * T - 2) {
            x.key[i] = x.key[i + 1];
          }
        }
        for (int i = pos + 1; i < x.n + 1; i++) {
          if (i != 2 * T - 1) {
            x.child[i] = x.child[i + 1];
          }
        }
        x.n--;
        if (x.n == 0) {
          if (x == root) {
            root = x.child[0];
          }
          x = x.child[0];
        }
        Remove(pred, key);
        return;
      }
    } else {
      for (pos = 0; pos < x.n; pos++) {
        if (x.key[pos] > key) {
          break;
        }
      }
      Node tmp = x.child[pos];
      if (tmp.n >= T) {
        Remove(tmp, key);
        return;
      }
      if (true) {
        Node nb = null;
        int devider = -1;

        if (pos != x.n && x.child[pos + 1].n >= T) {
          devider = x.key[pos];
          nb = x.child[pos + 1];
          x.key[pos] = nb.key[0];
          tmp.key[tmp.n++] = devider;
          tmp.child[tmp.n] = nb.child[0];
          for (int i = 1; i < nb.n; i++) {
            nb.key[i - 1] = nb.key[i];
          }
          for (int i = 1; i <= nb.n; i++) {
            nb.child[i - 1] = nb.child[i];
          }
          nb.n--;
          Remove(tmp, key);
          return;
        } else if (pos != 0 && x.child[pos - 1].n >= T) {

          devider = x.key[pos - 1];
          nb = x.child[pos - 1];
          x.key[pos - 1] = nb.key[nb.n - 1];
          Node child = nb.child[nb.n];
          nb.n--;

          for (int i = tmp.n; i > 0; i--) {
            tmp.key[i] = tmp.key[i - 1];
          }
          tmp.key[0] = devider;
          for (int i = tmp.n + 1; i > 0; i--) {
            tmp.child[i] = tmp.child[i - 1];
          }
          tmp.child[0] = child;
          tmp.n++;
          Remove(tmp, key);
          return;
        } else {
          Node lt = null;
          Node rt = null;
          boolean last = false;
          if (pos != x.n) {
            devider = x.key[pos];
            lt = x.child[pos];
            rt = x.child[pos + 1];
          } else {
            devider = x.key[pos - 1];
            rt = x.child[pos];
            lt = x.child[pos - 1];
            last = true;
            pos--;
          }
          for (int i = pos; i < x.n - 1; i++) {
            x.key[i] = x.key[i + 1];
          }
          for (int i = pos + 1; i < x.n; i++) {
            x.child[i] = x.child[i + 1];
          }
          x.n--;
          lt.key[lt.n++] = devider;

          for (int i = 0, j = lt.n; i < rt.n + 1; i++, j++) {
            if (i < rt.n) {
              lt.key[j] = rt.key[i];
            }
            lt.child[j] = rt.child[i];
          }
          lt.n += rt.n;
          if (x.n == 0) {
            if (x == root) {
              root = x.child[0];
            }
            x = x.child[0];
          }
          Remove(lt, key);
          return;
        }
      }
    }
  }

  public void Remove(int key) {
    Node x = Search(root, key);
    if (x == null) {
      return;
    }
    Remove(root, key);
  }

  public void Task(int a, int b) {
    Stack<Integer> st = new Stack<>();
    FindKeys(a, b, root, st);
    while (st.isEmpty() == false) {
      this.Remove(root, st.pop());
    }
  }

  private void FindKeys(int a, int b, Node x, Stack<Integer> st) {
    int i = 0;
    for (i = 0; i < x.n && x.key[i] < b; i++) {
      if (x.key[i] > a) {
        st.push(x.key[i]);
      }
    }
    if (!x.leaf) {
      for (int j = 0; j < i + 1; j++) {
        FindKeys(a, b, x.child[j], st);
      }
    }
  }

  public boolean Contain(int k) {
    if (this.Search(root, k) != null) {
      return true;
    } else {
      return false;
    }
  }

  // Show the node
  private void Show(Node x) {
    assert (x == null);
    for (int i = 0; i < x.n; i++) {
      System.out.print(x.key[i] + " ");
    }
    if (!x.leaf) {
      for (int i = 0; i < x.n + 1; i++) {
        Show(x.child[i]);
      }
    }
  }

  public static void main(String[] args) {
    BTree b = new BTree(3);
    b.Insert(8);
    b.Insert(9);
    b.Insert(10);
    b.Insert(11);
    b.Insert(15);
    b.Insert(20);
    b.Insert(17);

    b.Show();

    b.Remove(10);
    System.out.println();
    b.Show();
  }
}
Deletion Complexity
Best case Time complexity: Θ(log n)

Average case Space complexity: Θ(n)

Worst case Space complexity: Θ(n)









B+ Tree
In this tutorial, you will learn what a B+ tree is. Also, you will find working examples of searching operation on a B+ tree in C, C++, Java and Python.

A B+ tree is an advanced form of a self-balancing tree in which all the values are present in the leaf level.

An important concept to be understood before learning B+ tree is multilevel indexing. In multilevel indexing, the index of indices is created as in figure below. It makes accessing the data easier and faster.

Multilevel Indexing using B+ tree
Multilevel Indexing using B+ tree
Properties of a B+ Tree
All leaves are at the same level.
The root has at least two children.
Each node except root can have a maximum of m children and at least m/2 children.
Each node can contain a maximum of m - 1 keys and a minimum of ⌈m/2⌉ - 1 keys.
Comparison between a B-tree and a B+ Tree
 

B-tree
B-tree
B+ tree
B+ tree
The data pointers are present only at the leaf nodes on a B+ tree whereas the data pointers are present in the internal, leaf or root nodes on a B-tree.

The leaves are not connected with each other on a B-tree whereas they are connected on a B+ tree.

Operations on a B+ tree are faster than on a B-tree.

Searching on a B+ Tree
The following steps are followed to search for data in a B+ Tree of order m. Let the data to be searched be k.

Start from the root node. Compare k with the keys at the root node [k1, k2, k3,......km - 1].
If k < k1, go to the left child of the root node.
Else if k == k1, compare k2. If k < k2, k lies between k1 and k2. So, search in the left child of k2.
If k > k2, go for k3, k4,...km-1 as in steps 2 and 3.
Repeat the above steps until a leaf node is reached.
If k exists in the leaf node, return true else return false.
Searching Example on a B+ Tree
Let us search k = 45 on the following B+ tree.

B+ tree
B+ tree
Compare k with the root node.
B+ tree search
k is not found at the root
Since k > 25, go to the right child.
B+ tree search
Go to right of the root
Compare k with 35. Since k > 30, compare k with 45.
B+ tree search
k not found
Since k ≥ 45, so go to the right child.
B+ tree search
go to the right
k is found.
B+ tree search
k is found
Python, Java and C/C++ Examples
Python
Java
C
C++
// Searching on a B+ tree in Java

import java.util.*;

public class BPlusTree {
  int m;
  InternalNode root;
  LeafNode firstLeaf;

  // Binary search program
  private int binarySearch(DictionaryPair[] dps, int numPairs, int t) {
    Comparator<DictionaryPair> c = new Comparator<DictionaryPair>() {
      @Override
      public int compare(DictionaryPair o1, DictionaryPair o2) {
        Integer a = Integer.valueOf(o1.key);
        Integer b = Integer.valueOf(o2.key);
        return a.compareTo(b);
      }
    };
    return Arrays.binarySearch(dps, 0, numPairs, new DictionaryPair(t, 0), c);
  }

  // Find the leaf node
  private LeafNode findLeafNode(int key) {

    Integer[] keys = this.root.keys;
    int i;

    for (i = 0; i < this.root.degree - 1; i++) {
      if (key < keys[i]) {
        break;
      }
    }

    Node child = this.root.childPointers[i];
    if (child instanceof LeafNode) {
      return (LeafNode) child;
    } else {
      return findLeafNode((InternalNode) child, key);
    }
  }

  // Find the leaf node
  private LeafNode findLeafNode(InternalNode node, int key) {

    Integer[] keys = node.keys;
    int i;

    for (i = 0; i < node.degree - 1; i++) {
      if (key < keys[i]) {
        break;
      }
    }
    Node childNode = node.childPointers[i];
    if (childNode instanceof LeafNode) {
      return (LeafNode) childNode;
    } else {
      return findLeafNode((InternalNode) node.childPointers[i], key);
    }
  }

  // Finding the index of the pointer
  private int findIndexOfPointer(Node[] pointers, LeafNode node) {
    int i;
    for (i = 0; i < pointers.length; i++) {
      if (pointers[i] == node) {
        break;
      }
    }
    return i;
  }

  // Get the mid point
  private int getMidpoint() {
    return (int) Math.ceil((this.m + 1) / 2.0) - 1;
  }

  // Balance the tree
  private void handleDeficiency(InternalNode in) {

    InternalNode sibling;
    InternalNode parent = in.parent;

    if (this.root == in) {
      for (int i = 0; i < in.childPointers.length; i++) {
        if (in.childPointers[i] != null) {
          if (in.childPointers[i] instanceof InternalNode) {
            this.root = (InternalNode) in.childPointers[i];
            this.root.parent = null;
          } else if (in.childPointers[i] instanceof LeafNode) {
            this.root = null;
          }
        }
      }
    }

    else if (in.leftSibling != null && in.leftSibling.isLendable()) {
      sibling = in.leftSibling;
    } else if (in.rightSibling != null && in.rightSibling.isLendable()) {
      sibling = in.rightSibling;

      int borrowedKey = sibling.keys[0];
      Node pointer = sibling.childPointers[0];

      in.keys[in.degree - 1] = parent.keys[0];
      in.childPointers[in.degree] = pointer;

      parent.keys[0] = borrowedKey;

      sibling.removePointer(0);
      Arrays.sort(sibling.keys);
      sibling.removePointer(0);
      shiftDown(in.childPointers, 1);
    } else if (in.leftSibling != null && in.leftSibling.isMergeable()) {

    } else if (in.rightSibling != null && in.rightSibling.isMergeable()) {
      sibling = in.rightSibling;
      sibling.keys[sibling.degree - 1] = parent.keys[parent.degree - 2];
      Arrays.sort(sibling.keys, 0, sibling.degree);
      parent.keys[parent.degree - 2] = null;

      for (int i = 0; i < in.childPointers.length; i++) {
        if (in.childPointers[i] != null) {
          sibling.prependChildPointer(in.childPointers[i]);
          in.childPointers[i].parent = sibling;
          in.removePointer(i);
        }
      }

      parent.removePointer(in);

      sibling.leftSibling = in.leftSibling;
    }

    if (parent != null && parent.isDeficient()) {
      handleDeficiency(parent);
    }
  }

  private boolean isEmpty() {
    return firstLeaf == null;
  }

  private int linearNullSearch(DictionaryPair[] dps) {
    for (int i = 0; i < dps.length; i++) {
      if (dps[i] == null) {
        return i;
      }
    }
    return -1;
  }

  private int linearNullSearch(Node[] pointers) {
    for (int i = 0; i < pointers.length; i++) {
      if (pointers[i] == null) {
        return i;
      }
    }
    return -1;
  }

  private void shiftDown(Node[] pointers, int amount) {
    Node[] newPointers = new Node[this.m + 1];
    for (int i = amount; i < pointers.length; i++) {
      newPointers[i - amount] = pointers[i];
    }
    pointers = newPointers;
  }

  private void sortDictionary(DictionaryPair[] dictionary) {
    Arrays.sort(dictionary, new Comparator<DictionaryPair>() {
      @Override
      public int compare(DictionaryPair o1, DictionaryPair o2) {
        if (o1 == null && o2 == null) {
          return 0;
        }
        if (o1 == null) {
          return 1;
        }
        if (o2 == null) {
          return -1;
        }
        return o1.compareTo(o2);
      }
    });
  }

  private Node[] splitChildPointers(InternalNode in, int split) {

    Node[] pointers = in.childPointers;
    Node[] halfPointers = new Node[this.m + 1];

    for (int i = split + 1; i < pointers.length; i++) {
      halfPointers[i - split - 1] = pointers[i];
      in.removePointer(i);
    }

    return halfPointers;
  }

  private DictionaryPair[] splitDictionary(LeafNode ln, int split) {

    DictionaryPair[] dictionary = ln.dictionary;

    DictionaryPair[] halfDict = new DictionaryPair[this.m];

    for (int i = split; i < dictionary.length; i++) {
      halfDict[i - split] = dictionary[i];
      ln.delete(i);
    }

    return halfDict;
  }

  private void splitInternalNode(InternalNode in) {

    InternalNode parent = in.parent;

    int midpoint = getMidpoint();
    int newParentKey = in.keys[midpoint];
    Integer[] halfKeys = splitKeys(in.keys, midpoint);
    Node[] halfPointers = splitChildPointers(in, midpoint);

    in.degree = linearNullSearch(in.childPointers);

    InternalNode sibling = new InternalNode(this.m, halfKeys, halfPointers);
    for (Node pointer : halfPointers) {
      if (pointer != null) {
        pointer.parent = sibling;
      }
    }

    sibling.rightSibling = in.rightSibling;
    if (sibling.rightSibling != null) {
      sibling.rightSibling.leftSibling = sibling;
    }
    in.rightSibling = sibling;
    sibling.leftSibling = in;

    if (parent == null) {

      Integer[] keys = new Integer[this.m];
      keys[0] = newParentKey;
      InternalNode newRoot = new InternalNode(this.m, keys);
      newRoot.appendChildPointer(in);
      newRoot.appendChildPointer(sibling);
      this.root = newRoot;

      in.parent = newRoot;
      sibling.parent = newRoot;

    } else {

      parent.keys[parent.degree - 1] = newParentKey;
      Arrays.sort(parent.keys, 0, parent.degree);

      int pointerIndex = parent.findIndexOfPointer(in) + 1;
      parent.insertChildPointer(sibling, pointerIndex);
      sibling.parent = parent;
    }
  }

  private Integer[] splitKeys(Integer[] keys, int split) {

    Integer[] halfKeys = new Integer[this.m];

    keys[split] = null;

    for (int i = split + 1; i < keys.length; i++) {
      halfKeys[i - split - 1] = keys[i];
      keys[i] = null;
    }

    return halfKeys;
  }

  public void insert(int key, double value) {
    if (isEmpty()) {

      LeafNode ln = new LeafNode(this.m, new DictionaryPair(key, value));

      this.firstLeaf = ln;

    } else {
      LeafNode ln = (this.root == null) ? this.firstLeaf : findLeafNode(key);

      if (!ln.insert(new DictionaryPair(key, value))) {

        ln.dictionary[ln.numPairs] = new DictionaryPair(key, value);
        ln.numPairs++;
        sortDictionary(ln.dictionary);

        int midpoint = getMidpoint();
        DictionaryPair[] halfDict = splitDictionary(ln, midpoint);

        if (ln.parent == null) {

          Integer[] parent_keys = new Integer[this.m];
          parent_keys[0] = halfDict[0].key;
          InternalNode parent = new InternalNode(this.m, parent_keys);
          ln.parent = parent;
          parent.appendChildPointer(ln);

        } else {
          int newParentKey = halfDict[0].key;
          ln.parent.keys[ln.parent.degree - 1] = newParentKey;
          Arrays.sort(ln.parent.keys, 0, ln.parent.degree);
        }

        LeafNode newLeafNode = new LeafNode(this.m, halfDict, ln.parent);

        int pointerIndex = ln.parent.findIndexOfPointer(ln) + 1;
        ln.parent.insertChildPointer(newLeafNode, pointerIndex);

        newLeafNode.rightSibling = ln.rightSibling;
        if (newLeafNode.rightSibling != null) {
          newLeafNode.rightSibling.leftSibling = newLeafNode;
        }
        ln.rightSibling = newLeafNode;
        newLeafNode.leftSibling = ln;

        if (this.root == null) {

          this.root = ln.parent;

        } else {
          InternalNode in = ln.parent;
          while (in != null) {
            if (in.isOverfull()) {
              splitInternalNode(in);
            } else {
              break;
            }
            in = in.parent;
          }
        }
      }
    }
  }

  public Double search(int key) {

    if (isEmpty()) {
      return null;
    }

    LeafNode ln = (this.root == null) ? this.firstLeaf : findLeafNode(key);

    DictionaryPair[] dps = ln.dictionary;
    int index = binarySearch(dps, ln.numPairs, key);

    if (index < 0) {
      return null;
    } else {
      return dps[index].value;
    }
  }

  public ArrayList<Double> search(int lowerBound, int upperBound) {

    ArrayList<Double> values = new ArrayList<Double>();

    LeafNode currNode = this.firstLeaf;
    while (currNode != null) {

      DictionaryPair dps[] = currNode.dictionary;
      for (DictionaryPair dp : dps) {

        if (dp == null) {
          break;
        }

        if (lowerBound <= dp.key && dp.key <= upperBound) {
          values.add(dp.value);
        }
      }
      currNode = currNode.rightSibling;

    }

    return values;
  }

  public BPlusTree(int m) {
    this.m = m;
    this.root = null;
  }

  public class Node {
    InternalNode parent;
  }

  private class InternalNode extends Node {
    int maxDegree;
    int minDegree;
    int degree;
    InternalNode leftSibling;
    InternalNode rightSibling;
    Integer[] keys;
    Node[] childPointers;

    private void appendChildPointer(Node pointer) {
      this.childPointers[degree] = pointer;
      this.degree++;
    }

    private int findIndexOfPointer(Node pointer) {
      for (int i = 0; i < childPointers.length; i++) {
        if (childPointers[i] == pointer) {
          return i;
        }
      }
      return -1;
    }

    private void insertChildPointer(Node pointer, int index) {
      for (int i = degree - 1; i >= index; i--) {
        childPointers[i + 1] = childPointers[i];
      }
      this.childPointers[index] = pointer;
      this.degree++;
    }

    private boolean isDeficient() {
      return this.degree < this.minDegree;
    }

    private boolean isLendable() {
      return this.degree > this.minDegree;
    }

    private boolean isMergeable() {
      return this.degree == this.minDegree;
    }

    private boolean isOverfull() {
      return this.degree == maxDegree + 1;
    }

    private void prependChildPointer(Node pointer) {
      for (int i = degree - 1; i >= 0; i--) {
        childPointers[i + 1] = childPointers[i];
      }
      this.childPointers[0] = pointer;
      this.degree++;
    }

    private void removeKey(int index) {
      this.keys[index] = null;
    }

    private void removePointer(int index) {
      this.childPointers[index] = null;
      this.degree--;
    }

    private void removePointer(Node pointer) {
      for (int i = 0; i < childPointers.length; i++) {
        if (childPointers[i] == pointer) {
          this.childPointers[i] = null;
        }
      }
      this.degree--;
    }

    private InternalNode(int m, Integer[] keys) {
      this.maxDegree = m;
      this.minDegree = (int) Math.ceil(m / 2.0);
      this.degree = 0;
      this.keys = keys;
      this.childPointers = new Node[this.maxDegree + 1];
    }

    private InternalNode(int m, Integer[] keys, Node[] pointers) {
      this.maxDegree = m;
      this.minDegree = (int) Math.ceil(m / 2.0);
      this.degree = linearNullSearch(pointers);
      this.keys = keys;
      this.childPointers = pointers;
    }
  }

  public class LeafNode extends Node {
    int maxNumPairs;
    int minNumPairs;
    int numPairs;
    LeafNode leftSibling;
    LeafNode rightSibling;
    DictionaryPair[] dictionary;

    public void delete(int index) {
      this.dictionary[index] = null;
      numPairs--;
    }

    public boolean insert(DictionaryPair dp) {
      if (this.isFull()) {
        return false;
      } else {
        this.dictionary[numPairs] = dp;
        numPairs++;
        Arrays.sort(this.dictionary, 0, numPairs);

        return true;
      }
    }

    public boolean isDeficient() {
      return numPairs < minNumPairs;
    }

    public boolean isFull() {
      return numPairs == maxNumPairs;
    }

    public boolean isLendable() {
      return numPairs > minNumPairs;
    }

    public boolean isMergeable() {
      return numPairs == minNumPairs;
    }

    public LeafNode(int m, DictionaryPair dp) {
      this.maxNumPairs = m - 1;
      this.minNumPairs = (int) (Math.ceil(m / 2) - 1);
      this.dictionary = new DictionaryPair[m];
      this.numPairs = 0;
      this.insert(dp);
    }

    public LeafNode(int m, DictionaryPair[] dps, InternalNode parent) {
      this.maxNumPairs = m - 1;
      this.minNumPairs = (int) (Math.ceil(m / 2) - 1);
      this.dictionary = dps;
      this.numPairs = linearNullSearch(dps);
      this.parent = parent;
    }
  }

  public class DictionaryPair implements Comparable<DictionaryPair> {
    int key;
    double value;

    public DictionaryPair(int key, double value) {
      this.key = key;
      this.value = value;
    }

    public int compareTo(DictionaryPair o) {
      if (key == o.key) {
        return 0;
      } else if (key > o.key) {
        return 1;
      } else {
        return -1;
      }
    }
  }

  public static void main(String[] args) {
    BPlusTree bpt = null;
    bpt = new BPlusTree(3);
    bpt.insert(5, 33);
    bpt.insert(15, 21);
    bpt.insert(25, 31);
    bpt.insert(35, 41);
    bpt.insert(45, 10);

    if (bpt.search(15) != null) {
      System.out.println("Found");
    } else {
      System.out.println("Not Found");
    }
    ;
  }
}
Search Complexity
Time Complexity
If linear search is implemented inside a node, then total complexity is Θ(logt n).

If binary search is used, then total complexity is Θ(log2t.logt n).

B+ Tree Applications
Multilevel Indexing
Faster operations on the tree (insertion, deletion, search)
Database indexing





Insertion on a B+ Tree
In this tutorial, you will learn about insertion operation on a B+ tree. Also, you will find working examples of inserting elements on a B+ tree in C, C++, Java and Python.

Inserting an element into a B+ tree consists of three main events: searching the appropriate leaf, inserting the element and balancing/splitting the tree.

Let us understand these events below.

Insertion Operation
Before inserting an element into a B+ tree, these properties must be kept in mind.

The root has at least two children.
Each node except root can have a maximum of m children and at least m/2 children.
Each node can contain a maximum of m - 1 keys and a minimum of ⌈m/2⌉ - 1 keys.
The following steps are followed for inserting an element.

Since every element is inserted into the leaf node, go to the appropriate leaf node.
Insert the key into the leaf node.
Case I
If the leaf is not full, insert the key into the leaf node in increasing order.
Case II
If the leaf is full, insert the key into the leaf node in increasing order and balance the tree in the following way.
Break the node at m/2th position.
Add m/2th key to the parent node as well.
If the parent node is already full, follow steps 2 to 3.
Insertion Example
Let us understand the insertion operation with the illustrations below.

The elements to be inserted are 5,15, 25, 35, 45.

Insert 5.
Insert 5
Insert 5
Insert 15.
Insert 15
Insert 15
Insert 25.
Insert 25
Insert 25
Insert 35.
Insert 35
Insert 35
Insert 45.
Insert 45
Insert 45
Python, Java and C/C++ Examples
Python
Java
C
C++
// Searching on a B+ tree in Java

import java.util.*;

public class BPlusTree {
  int m;
  InternalNode root;
  LeafNode firstLeaf;

  // Binary search program
  private int binarySearch(DictionaryPair[] dps, int numPairs, int t) {
    Comparator<DictionaryPair> c = new Comparator<DictionaryPair>() {
      @Override
      public int compare(DictionaryPair o1, DictionaryPair o2) {
        Integer a = Integer.valueOf(o1.key);
        Integer b = Integer.valueOf(o2.key);
        return a.compareTo(b);
      }
    };
    return Arrays.binarySearch(dps, 0, numPairs, new DictionaryPair(t, 0), c);
  }

  // Find the leaf node
  private LeafNode findLeafNode(int key) {

    Integer[] keys = this.root.keys;
    int i;

    for (i = 0; i < this.root.degree - 1; i++) {
      if (key < keys[i]) {
        break;
      }
    }

    Node child = this.root.childPointers[i];
    if (child instanceof LeafNode) {
      return (LeafNode) child;
    } else {
      return findLeafNode((InternalNode) child, key);
    }
  }

  // Find the leaf node
  private LeafNode findLeafNode(InternalNode node, int key) {

    Integer[] keys = node.keys;
    int i;

    for (i = 0; i < node.degree - 1; i++) {
      if (key < keys[i]) {
        break;
      }
    }
    Node childNode = node.childPointers[i];
    if (childNode instanceof LeafNode) {
      return (LeafNode) childNode;
    } else {
      return findLeafNode((InternalNode) node.childPointers[i], key);
    }
  }

  // Finding the index of the pointer
  private int findIndexOfPointer(Node[] pointers, LeafNode node) {
    int i;
    for (i = 0; i < pointers.length; i++) {
      if (pointers[i] == node) {
        break;
      }
    }
    return i;
  }

  // Get the mid point
  private int getMidpoint() {
    return (int) Math.ceil((this.m + 1) / 2.0) - 1;
  }

  // Balance the tree
  private void handleDeficiency(InternalNode in) {

    InternalNode sibling;
    InternalNode parent = in.parent;

    if (this.root == in) {
      for (int i = 0; i < in.childPointers.length; i++) {
        if (in.childPointers[i] != null) {
          if (in.childPointers[i] instanceof InternalNode) {
            this.root = (InternalNode) in.childPointers[i];
            this.root.parent = null;
          } else if (in.childPointers[i] instanceof LeafNode) {
            this.root = null;
          }
        }
      }
    }

    else if (in.leftSibling != null && in.leftSibling.isLendable()) {
      sibling = in.leftSibling;
    } else if (in.rightSibling != null && in.rightSibling.isLendable()) {
      sibling = in.rightSibling;

      int borrowedKey = sibling.keys[0];
      Node pointer = sibling.childPointers[0];

      in.keys[in.degree - 1] = parent.keys[0];
      in.childPointers[in.degree] = pointer;

      parent.keys[0] = borrowedKey;

      sibling.removePointer(0);
      Arrays.sort(sibling.keys);
      sibling.removePointer(0);
      shiftDown(in.childPointers, 1);
    } else if (in.leftSibling != null && in.leftSibling.isMergeable()) {

    } else if (in.rightSibling != null && in.rightSibling.isMergeable()) {
      sibling = in.rightSibling;
      sibling.keys[sibling.degree - 1] = parent.keys[parent.degree - 2];
      Arrays.sort(sibling.keys, 0, sibling.degree);
      parent.keys[parent.degree - 2] = null;

      for (int i = 0; i < in.childPointers.length; i++) {
        if (in.childPointers[i] != null) {
          sibling.prependChildPointer(in.childPointers[i]);
          in.childPointers[i].parent = sibling;
          in.removePointer(i);
        }
      }

      parent.removePointer(in);

      sibling.leftSibling = in.leftSibling;
    }

    if (parent != null && parent.isDeficient()) {
      handleDeficiency(parent);
    }
  }

  private boolean isEmpty() {
    return firstLeaf == null;
  }

  private int linearNullSearch(DictionaryPair[] dps) {
    for (int i = 0; i < dps.length; i++) {
      if (dps[i] == null) {
        return i;
      }
    }
    return -1;
  }

  private int linearNullSearch(Node[] pointers) {
    for (int i = 0; i < pointers.length; i++) {
      if (pointers[i] == null) {
        return i;
      }
    }
    return -1;
  }

  private void shiftDown(Node[] pointers, int amount) {
    Node[] newPointers = new Node[this.m + 1];
    for (int i = amount; i < pointers.length; i++) {
      newPointers[i - amount] = pointers[i];
    }
    pointers = newPointers;
  }

  private void sortDictionary(DictionaryPair[] dictionary) {
    Arrays.sort(dictionary, new Comparator<DictionaryPair>() {
      @Override
      public int compare(DictionaryPair o1, DictionaryPair o2) {
        if (o1 == null && o2 == null) {
          return 0;
        }
        if (o1 == null) {
          return 1;
        }
        if (o2 == null) {
          return -1;
        }
        return o1.compareTo(o2);
      }
    });
  }

  private Node[] splitChildPointers(InternalNode in, int split) {

    Node[] pointers = in.childPointers;
    Node[] halfPointers = new Node[this.m + 1];

    for (int i = split + 1; i < pointers.length; i++) {
      halfPointers[i - split - 1] = pointers[i];
      in.removePointer(i);
    }

    return halfPointers;
  }

  private DictionaryPair[] splitDictionary(LeafNode ln, int split) {

    DictionaryPair[] dictionary = ln.dictionary;

    DictionaryPair[] halfDict = new DictionaryPair[this.m];

    for (int i = split; i < dictionary.length; i++) {
      halfDict[i - split] = dictionary[i];
      ln.delete(i);
    }

    return halfDict;
  }

  private void splitInternalNode(InternalNode in) {

    InternalNode parent = in.parent;

    int midpoint = getMidpoint();
    int newParentKey = in.keys[midpoint];
    Integer[] halfKeys = splitKeys(in.keys, midpoint);
    Node[] halfPointers = splitChildPointers(in, midpoint);

    in.degree = linearNullSearch(in.childPointers);

    InternalNode sibling = new InternalNode(this.m, halfKeys, halfPointers);
    for (Node pointer : halfPointers) {
      if (pointer != null) {
        pointer.parent = sibling;
      }
    }

    sibling.rightSibling = in.rightSibling;
    if (sibling.rightSibling != null) {
      sibling.rightSibling.leftSibling = sibling;
    }
    in.rightSibling = sibling;
    sibling.leftSibling = in;

    if (parent == null) {

      Integer[] keys = new Integer[this.m];
      keys[0] = newParentKey;
      InternalNode newRoot = new InternalNode(this.m, keys);
      newRoot.appendChildPointer(in);
      newRoot.appendChildPointer(sibling);
      this.root = newRoot;

      in.parent = newRoot;
      sibling.parent = newRoot;

    } else {

      parent.keys[parent.degree - 1] = newParentKey;
      Arrays.sort(parent.keys, 0, parent.degree);

      int pointerIndex = parent.findIndexOfPointer(in) + 1;
      parent.insertChildPointer(sibling, pointerIndex);
      sibling.parent = parent;
    }
  }

  private Integer[] splitKeys(Integer[] keys, int split) {

    Integer[] halfKeys = new Integer[this.m];

    keys[split] = null;

    for (int i = split + 1; i < keys.length; i++) {
      halfKeys[i - split - 1] = keys[i];
      keys[i] = null;
    }

    return halfKeys;
  }

  public void insert(int key, double value) {
    if (isEmpty()) {

      LeafNode ln = new LeafNode(this.m, new DictionaryPair(key, value));

      this.firstLeaf = ln;

    } else {
      LeafNode ln = (this.root == null) ? this.firstLeaf : findLeafNode(key);

      if (!ln.insert(new DictionaryPair(key, value))) {

        ln.dictionary[ln.numPairs] = new DictionaryPair(key, value);
        ln.numPairs++;
        sortDictionary(ln.dictionary);

        int midpoint = getMidpoint();
        DictionaryPair[] halfDict = splitDictionary(ln, midpoint);

        if (ln.parent == null) {

          Integer[] parent_keys = new Integer[this.m];
          parent_keys[0] = halfDict[0].key;
          InternalNode parent = new InternalNode(this.m, parent_keys);
          ln.parent = parent;
          parent.appendChildPointer(ln);

        } else {
          int newParentKey = halfDict[0].key;
          ln.parent.keys[ln.parent.degree - 1] = newParentKey;
          Arrays.sort(ln.parent.keys, 0, ln.parent.degree);
        }

        LeafNode newLeafNode = new LeafNode(this.m, halfDict, ln.parent);

        int pointerIndex = ln.parent.findIndexOfPointer(ln) + 1;
        ln.parent.insertChildPointer(newLeafNode, pointerIndex);

        newLeafNode.rightSibling = ln.rightSibling;
        if (newLeafNode.rightSibling != null) {
          newLeafNode.rightSibling.leftSibling = newLeafNode;
        }
        ln.rightSibling = newLeafNode;
        newLeafNode.leftSibling = ln;

        if (this.root == null) {

          this.root = ln.parent;

        } else {
          InternalNode in = ln.parent;
          while (in != null) {
            if (in.isOverfull()) {
              splitInternalNode(in);
            } else {
              break;
            }
            in = in.parent;
          }
        }
      }
    }
  }

  public Double search(int key) {

    if (isEmpty()) {
      return null;
    }

    LeafNode ln = (this.root == null) ? this.firstLeaf : findLeafNode(key);

    DictionaryPair[] dps = ln.dictionary;
    int index = binarySearch(dps, ln.numPairs, key);

    if (index < 0) {
      return null;
    } else {
      return dps[index].value;
    }
  }

  public ArrayList<Double> search(int lowerBound, int upperBound) {

    ArrayList<Double> values = new ArrayList<Double>();

    LeafNode currNode = this.firstLeaf;
    while (currNode != null) {

      DictionaryPair dps[] = currNode.dictionary;
      for (DictionaryPair dp : dps) {

        if (dp == null) {
          break;
        }

        if (lowerBound <= dp.key && dp.key <= upperBound) {
          values.add(dp.value);
        }
      }
      currNode = currNode.rightSibling;

    }

    return values;
  }

  public BPlusTree(int m) {
    this.m = m;
    this.root = null;
  }

  public class Node {
    InternalNode parent;
  }

  private class InternalNode extends Node {
    int maxDegree;
    int minDegree;
    int degree;
    InternalNode leftSibling;
    InternalNode rightSibling;
    Integer[] keys;
    Node[] childPointers;

    private void appendChildPointer(Node pointer) {
      this.childPointers[degree] = pointer;
      this.degree++;
    }

    private int findIndexOfPointer(Node pointer) {
      for (int i = 0; i < childPointers.length; i++) {
        if (childPointers[i] == pointer) {
          return i;
        }
      }
      return -1;
    }

    private void insertChildPointer(Node pointer, int index) {
      for (int i = degree - 1; i >= index; i--) {
        childPointers[i + 1] = childPointers[i];
      }
      this.childPointers[index] = pointer;
      this.degree++;
    }

    private boolean isDeficient() {
      return this.degree < this.minDegree;
    }

    private boolean isLendable() {
      return this.degree > this.minDegree;
    }

    private boolean isMergeable() {
      return this.degree == this.minDegree;
    }

    private boolean isOverfull() {
      return this.degree == maxDegree + 1;
    }

    private void prependChildPointer(Node pointer) {
      for (int i = degree - 1; i >= 0; i--) {
        childPointers[i + 1] = childPointers[i];
      }
      this.childPointers[0] = pointer;
      this.degree++;
    }

    private void removeKey(int index) {
      this.keys[index] = null;
    }

    private void removePointer(int index) {
      this.childPointers[index] = null;
      this.degree--;
    }

    private void removePointer(Node pointer) {
      for (int i = 0; i < childPointers.length; i++) {
        if (childPointers[i] == pointer) {
          this.childPointers[i] = null;
        }
      }
      this.degree--;
    }

    private InternalNode(int m, Integer[] keys) {
      this.maxDegree = m;
      this.minDegree = (int) Math.ceil(m / 2.0);
      this.degree = 0;
      this.keys = keys;
      this.childPointers = new Node[this.maxDegree + 1];
    }

    private InternalNode(int m, Integer[] keys, Node[] pointers) {
      this.maxDegree = m;
      this.minDegree = (int) Math.ceil(m / 2.0);
      this.degree = linearNullSearch(pointers);
      this.keys = keys;
      this.childPointers = pointers;
    }
  }

  public class LeafNode extends Node {
    int maxNumPairs;
    int minNumPairs;
    int numPairs;
    LeafNode leftSibling;
    LeafNode rightSibling;
    DictionaryPair[] dictionary;

    public void delete(int index) {
      this.dictionary[index] = null;
      numPairs--;
    }

    public boolean insert(DictionaryPair dp) {
      if (this.isFull()) {
        return false;
      } else {
        this.dictionary[numPairs] = dp;
        numPairs++;
        Arrays.sort(this.dictionary, 0, numPairs);

        return true;
      }
    }

    public boolean isDeficient() {
      return numPairs < minNumPairs;
    }

    public boolean isFull() {
      return numPairs == maxNumPairs;
    }

    public boolean isLendable() {
      return numPairs > minNumPairs;
    }

    public boolean isMergeable() {
      return numPairs == minNumPairs;
    }

    public LeafNode(int m, DictionaryPair dp) {
      this.maxNumPairs = m - 1;
      this.minNumPairs = (int) (Math.ceil(m / 2) - 1);
      this.dictionary = new DictionaryPair[m];
      this.numPairs = 0;
      this.insert(dp);
    }

    public LeafNode(int m, DictionaryPair[] dps, InternalNode parent) {
      this.maxNumPairs = m - 1;
      this.minNumPairs = (int) (Math.ceil(m / 2) - 1);
      this.dictionary = dps;
      this.numPairs = linearNullSearch(dps);
      this.parent = parent;
    }
  }

  public class DictionaryPair implements Comparable<DictionaryPair> {
    int key;
    double value;

    public DictionaryPair(int key, double value) {
      this.key = key;
      this.value = value;
    }

    public int compareTo(DictionaryPair o) {
      if (key == o.key) {
        return 0;
      } else if (key > o.key) {
        return 1;
      } else {
        return -1;
      }
    }
  }

  public static void main(String[] args) {
    BPlusTree bpt = null;
    bpt = new BPlusTree(3);
    bpt.insert(5, 33);
    bpt.insert(15, 21);
    bpt.insert(25, 31);
    bpt.insert(35, 41);
    bpt.insert(45, 10);

    if (bpt.search(15) != null) {
      System.out.println("Found");
    } else {
      System.out.println("Not Found");
    }
    ;
  }
}
Insertion Complexity
Time complexity: Θ(t.logt n)

The complexity is dominated by Θ(logt n).




Deletion from a B+ Tree
In this tutorial, you will learn about deletion operation on a B+ tree. Also, you will find working examples of deleting elements from a B+ tree in C, C++, Java and Python.

Deleting an element on a B+ tree consists of three main events: searching the node where the key to be deleted exists, deleting the key and balancing the tree if required.Underflow is a situation when there is less number of keys in a node than the minimum number of keys it should hold.

Deletion Operation
Before going through the steps below, one must know these facts about a B+ tree of degree m.

A node can have a maximum of m children. (i.e. 3)
A node can contain a maximum of m - 1 keys. (i.e. 2)
A node should have a minimum of ⌈m/2⌉ children. (i.e. 2)
A node (except root node) should contain a minimum of ⌈m/2⌉ - 1 keys. (i.e. 1)
While deleting a key, we have to take care of the keys present in the internal nodes (i.e. indexes) as well because the values are redundant in a B+ tree. Search the key to be deleted then follow the following steps.

Case I
The key to be deleted is present only at the leaf node not in the indexes (or internal nodes). There are two cases for it:

There is more than the minimum number of keys in the node. Simply delete the key.
Delete a key from a B+tree
Deleting 40 from B-tree
There is an exact minimum number of keys in the node. Delete the key and borrow a key from the immediate sibling. Add the median key of the sibling node to the parent.
Delete a key from a B+tree
Deleting 5 from B-tree
Case II
The key to be deleted is present in the internal nodes as well. Then we have to remove them from the internal nodes as well. There are the following cases for this situation.

If there is more than the minimum number of keys in the node, simply delete the key from the leaf node and delete the key from the internal node as well.
Fill the empty space in the internal node with the inorder successor.
Delete a key from a B+tree
Deleting 45 from B-tree
If there is an exact minimum number of keys in the node, then delete the key and borrow a key from its immediate sibling (through the parent).
Fill the empty space created in the index (internal node) with the borrowed key.
Delete a key from a B+tree
Deleting 35 from B-tree
This case is similar to Case II(1) but here, empty space is generated above the immediate parent node.
After deleting the key, merge the empty space with its sibling.
Fill the empty space in the grandparent node with the inorder successor.
Delete a key from a B+tree
Deleting 25 from B-tree
Case III
In this case, the height of the tree gets shrinked. It is a little complicated.Deleting 55 from the tree below leads to this condition. It can be understood in the illustrations below.

Delete a key from a B+tree
Deleting 55 from B-tree
Python, Java and C/C++ Examples
Python
Java
C
C++

// Searching on a B+ tree in Java
import java.util.*;

public class BPlusTree {
  int m;
  InternalNode root;
  LeafNode firstLeaf;

  // Binary search program
  private int binarySearch(DictionaryPair[] dps, int numPairs, int t) {
    Comparator<DictionaryPair> c = new Comparator<DictionaryPair>() {
      @Override
      public int compare(DictionaryPair o1, DictionaryPair o2) {
        Integer a = Integer.valueOf(o1.key);
        Integer b = Integer.valueOf(o2.key);
        return a.compareTo(b);
      }
    };
    return Arrays.binarySearch(dps, 0, numPairs, new DictionaryPair(t, 0), c);
  }

  // Find the leaf node
  private LeafNode findLeafNode(int key) {

    Integer[] keys = this.root.keys;
    int i;

    for (i = 0; i < this.root.degree - 1; i++) {
      if (key < keys[i]) {
        break;
      }
    }

    Node child = this.root.childPointers[i];
    if (child instanceof LeafNode) {
      return (LeafNode) child;
    } else {
      return findLeafNode((InternalNode) child, key);
    }
  }

  // Find the leaf node
  private LeafNode findLeafNode(InternalNode node, int key) {

    Integer[] keys = node.keys;
    int i;

    for (i = 0; i < node.degree - 1; i++) {
      if (key < keys[i]) {
        break;
      }
    }
    Node childNode = node.childPointers[i];
    if (childNode instanceof LeafNode) {
      return (LeafNode) childNode;
    } else {
      return findLeafNode((InternalNode) node.childPointers[i], key);
    }
  }

  // Finding the index of the pointer
  private int findIndexOfPointer(Node[] pointers, LeafNode node) {
    int i;
    for (i = 0; i < pointers.length; i++) {
      if (pointers[i] == node) {
        break;
      }
    }
    return i;
  }

  // Get the mid point
  private int getMidpoint() {
    return (int) Math.ceil((this.m + 1) / 2.0) - 1;
  }

  // Balance the tree
  private void handleDeficiency(InternalNode in) {

    InternalNode sibling;
    InternalNode parent = in.parent;

    if (this.root == in) {
      for (int i = 0; i < in.childPointers.length; i++) {
        if (in.childPointers[i] != null) {
          if (in.childPointers[i] instanceof InternalNode) {
            this.root = (InternalNode) in.childPointers[i];
            this.root.parent = null;
          } else if (in.childPointers[i] instanceof LeafNode) {
            this.root = null;
          }
        }
      }
    }

    else if (in.leftSibling != null && in.leftSibling.isLendable()) {
      sibling = in.leftSibling;
    } else if (in.rightSibling != null && in.rightSibling.isLendable()) {
      sibling = in.rightSibling;

      int borrowedKey = sibling.keys[0];
      Node pointer = sibling.childPointers[0];

      in.keys[in.degree - 1] = parent.keys[0];
      in.childPointers[in.degree] = pointer;

      parent.keys[0] = borrowedKey;

      sibling.removePointer(0);
      Arrays.sort(sibling.keys);
      sibling.removePointer(0);
      shiftDown(in.childPointers, 1);
    } else if (in.leftSibling != null && in.leftSibling.isMergeable()) {

    } else if (in.rightSibling != null && in.rightSibling.isMergeable()) {
      sibling = in.rightSibling;
      sibling.keys[sibling.degree - 1] = parent.keys[parent.degree - 2];
      Arrays.sort(sibling.keys, 0, sibling.degree);
      parent.keys[parent.degree - 2] = null;

      for (int i = 0; i < in.childPointers.length; i++) {
        if (in.childPointers[i] != null) {
          sibling.prependChildPointer(in.childPointers[i]);
          in.childPointers[i].parent = sibling;
          in.removePointer(i);
        }
      }

      parent.removePointer(in);

      sibling.leftSibling = in.leftSibling;
    }

    if (parent != null && parent.isDeficient()) {
      handleDeficiency(parent);
    }
  }

  private boolean isEmpty() {
    return firstLeaf == null;
  }

  private int linearNullSearch(DictionaryPair[] dps) {
    for (int i = 0; i < dps.length; i++) {
      if (dps[i] == null) {
        return i;
      }
    }
    return -1;
  }

  private int linearNullSearch(Node[] pointers) {
    for (int i = 0; i < pointers.length; i++) {
      if (pointers[i] == null) {
        return i;
      }
    }
    return -1;
  }

  private void shiftDown(Node[] pointers, int amount) {
    Node[] newPointers = new Node[this.m + 1];
    for (int i = amount; i < pointers.length; i++) {
      newPointers[i - amount] = pointers[i];
    }
    pointers = newPointers;
  }

  private void sortDictionary(DictionaryPair[] dictionary) {
    Arrays.sort(dictionary, new Comparator<DictionaryPair>() {
      @Override
      public int compare(DictionaryPair o1, DictionaryPair o2) {
        if (o1 == null && o2 == null) {
          return 0;
        }
        if (o1 == null) {
          return 1;
        }
        if (o2 == null) {
          return -1;
        }
        return o1.compareTo(o2);
      }
    });
  }

  private Node[] splitChildPointers(InternalNode in, int split) {

    Node[] pointers = in.childPointers;
    Node[] halfPointers = new Node[this.m + 1];

    for (int i = split + 1; i < pointers.length; i++) {
      halfPointers[i - split - 1] = pointers[i];
      in.removePointer(i);
    }

    return halfPointers;
  }

  private DictionaryPair[] splitDictionary(LeafNode ln, int split) {

    DictionaryPair[] dictionary = ln.dictionary;

    DictionaryPair[] halfDict = new DictionaryPair[this.m];

    for (int i = split; i < dictionary.length; i++) {
      halfDict[i - split] = dictionary[i];
      ln.delete(i);
    }

    return halfDict;
  }

  private void splitInternalNode(InternalNode in) {

    InternalNode parent = in.parent;

    int midpoint = getMidpoint();
    int newParentKey = in.keys[midpoint];
    Integer[] halfKeys = splitKeys(in.keys, midpoint);
    Node[] halfPointers = splitChildPointers(in, midpoint);

    in.degree = linearNullSearch(in.childPointers);

    InternalNode sibling = new InternalNode(this.m, halfKeys, halfPointers);
    for (Node pointer : halfPointers) {
      if (pointer != null) {
        pointer.parent = sibling;
      }
    }

    sibling.rightSibling = in.rightSibling;
    if (sibling.rightSibling != null) {
      sibling.rightSibling.leftSibling = sibling;
    }
    in.rightSibling = sibling;
    sibling.leftSibling = in;

    if (parent == null) {

      Integer[] keys = new Integer[this.m];
      keys[0] = newParentKey;
      InternalNode newRoot = new InternalNode(this.m, keys);
      newRoot.appendChildPointer(in);
      newRoot.appendChildPointer(sibling);
      this.root = newRoot;

      in.parent = newRoot;
      sibling.parent = newRoot;

    } else {

      parent.keys[parent.degree - 1] = newParentKey;
      Arrays.sort(parent.keys, 0, parent.degree);

      int pointerIndex = parent.findIndexOfPointer(in) + 1;
      parent.insertChildPointer(sibling, pointerIndex);
      sibling.parent = parent;
    }
  }

  private Integer[] splitKeys(Integer[] keys, int split) {

    Integer[] halfKeys = new Integer[this.m];

    keys[split] = null;

    for (int i = split + 1; i < keys.length; i++) {
      halfKeys[i - split - 1] = keys[i];
      keys[i] = null;
    }

    return halfKeys;
  }

  public void insert(int key, double value) {
    if (isEmpty()) {

      LeafNode ln = new LeafNode(this.m, new DictionaryPair(key, value));

      this.firstLeaf = ln;

    } else {
      LeafNode ln = (this.root == null) ? this.firstLeaf : findLeafNode(key);

      if (!ln.insert(new DictionaryPair(key, value))) {

        ln.dictionary[ln.numPairs] = new DictionaryPair(key, value);
        ln.numPairs++;
        sortDictionary(ln.dictionary);

        int midpoint = getMidpoint();
        DictionaryPair[] halfDict = splitDictionary(ln, midpoint);

        if (ln.parent == null) {

          Integer[] parent_keys = new Integer[this.m];
          parent_keys[0] = halfDict[0].key;
          InternalNode parent = new InternalNode(this.m, parent_keys);
          ln.parent = parent;
          parent.appendChildPointer(ln);

        } else {
          int newParentKey = halfDict[0].key;
          ln.parent.keys[ln.parent.degree - 1] = newParentKey;
          Arrays.sort(ln.parent.keys, 0, ln.parent.degree);
        }

        LeafNode newLeafNode = new LeafNode(this.m, halfDict, ln.parent);

        int pointerIndex = ln.parent.findIndexOfPointer(ln) + 1;
        ln.parent.insertChildPointer(newLeafNode, pointerIndex);

        newLeafNode.rightSibling = ln.rightSibling;
        if (newLeafNode.rightSibling != null) {
          newLeafNode.rightSibling.leftSibling = newLeafNode;
        }
        ln.rightSibling = newLeafNode;
        newLeafNode.leftSibling = ln;

        if (this.root == null) {

          this.root = ln.parent;

        } else {
          InternalNode in = ln.parent;
          while (in != null) {
            if (in.isOverfull()) {
              splitInternalNode(in);
            } else {
              break;
            }
            in = in.parent;
          }
        }
      }
    }
  }

  public Double search(int key) {

    if (isEmpty()) {
      return null;
    }

    LeafNode ln = (this.root == null) ? this.firstLeaf : findLeafNode(key);

    DictionaryPair[] dps = ln.dictionary;
    int index = binarySearch(dps, ln.numPairs, key);

    if (index < 0) {
      return null;
    } else {
      return dps[index].value;
    }
  }

  public ArrayList<Double> search(int lowerBound, int upperBound) {

    ArrayList<Double> values = new ArrayList<Double>();

    LeafNode currNode = this.firstLeaf;
    while (currNode != null) {

      DictionaryPair dps[] = currNode.dictionary;
      for (DictionaryPair dp : dps) {

        if (dp == null) {
          break;
        }

        if (lowerBound <= dp.key && dp.key <= upperBound) {
          values.add(dp.value);
        }
      }
      currNode = currNode.rightSibling;

    }

    return values;
  }

  public BPlusTree(int m) {
    this.m = m;
    this.root = null;
  }

  public class Node {
    InternalNode parent;
  }

  private class InternalNode extends Node {
    int maxDegree;
    int minDegree;
    int degree;
    InternalNode leftSibling;
    InternalNode rightSibling;
    Integer[] keys;
    Node[] childPointers;

    private void appendChildPointer(Node pointer) {
      this.childPointers[degree] = pointer;
      this.degree++;
    }

    private int findIndexOfPointer(Node pointer) {
      for (int i = 0; i < childPointers.length; i++) {
        if (childPointers[i] == pointer) {
          return i;
        }
      }
      return -1;
    }

    private void insertChildPointer(Node pointer, int index) {
      for (int i = degree - 1; i >= index; i--) {
        childPointers[i + 1] = childPointers[i];
      }
      this.childPointers[index] = pointer;
      this.degree++;
    }

    private boolean isDeficient() {
      return this.degree < this.minDegree;
    }

    private boolean isLendable() {
      return this.degree > this.minDegree;
    }

    private boolean isMergeable() {
      return this.degree == this.minDegree;
    }

    private boolean isOverfull() {
      return this.degree == maxDegree + 1;
    }

    private void prependChildPointer(Node pointer) {
      for (int i = degree - 1; i >= 0; i--) {
        childPointers[i + 1] = childPointers[i];
      }
      this.childPointers[0] = pointer;
      this.degree++;
    }

    private void removeKey(int index) {
      this.keys[index] = null;
    }

    private void removePointer(int index) {
      this.childPointers[index] = null;
      this.degree--;
    }

    private void removePointer(Node pointer) {
      for (int i = 0; i < childPointers.length; i++) {
        if (childPointers[i] == pointer) {
          this.childPointers[i] = null;
        }
      }
      this.degree--;
    }

    private InternalNode(int m, Integer[] keys) {
      this.maxDegree = m;
      this.minDegree = (int) Math.ceil(m / 2.0);
      this.degree = 0;
      this.keys = keys;
      this.childPointers = new Node[this.maxDegree + 1];
    }

    private InternalNode(int m, Integer[] keys, Node[] pointers) {
      this.maxDegree = m;
      this.minDegree = (int) Math.ceil(m / 2.0);
      this.degree = linearNullSearch(pointers);
      this.keys = keys;
      this.childPointers = pointers;
    }
  }

  public class LeafNode extends Node {
    int maxNumPairs;
    int minNumPairs;
    int numPairs;
    LeafNode leftSibling;
    LeafNode rightSibling;
    DictionaryPair[] dictionary;

    public void delete(int index) {
      this.dictionary[index] = null;
      numPairs--;
    }

    public boolean insert(DictionaryPair dp) {
      if (this.isFull()) {
        return false;
      } else {
        this.dictionary[numPairs] = dp;
        numPairs++;
        Arrays.sort(this.dictionary, 0, numPairs);

        return true;
      }
    }

    public boolean isDeficient() {
      return numPairs < minNumPairs;
    }

    public boolean isFull() {
      return numPairs == maxNumPairs;
    }

    public boolean isLendable() {
      return numPairs > minNumPairs;
    }

    public boolean isMergeable() {
      return numPairs == minNumPairs;
    }

    public LeafNode(int m, DictionaryPair dp) {
      this.maxNumPairs = m - 1;
      this.minNumPairs = (int) (Math.ceil(m / 2) - 1);
      this.dictionary = new DictionaryPair[m];
      this.numPairs = 0;
      this.insert(dp);
    }

    public LeafNode(int m, DictionaryPair[] dps, InternalNode parent) {
      this.maxNumPairs = m - 1;
      this.minNumPairs = (int) (Math.ceil(m / 2) - 1);
      this.dictionary = dps;
      this.numPairs = linearNullSearch(dps);
      this.parent = parent;
    }
  }

  public class DictionaryPair implements Comparable<DictionaryPair> {
    int key;
    double value;

    public DictionaryPair(int key, double value) {
      this.key = key;
      this.value = value;
    }

    public int compareTo(DictionaryPair o) {
      if (key == o.key) {
        return 0;
      } else if (key > o.key) {
        return 1;
      } else {
        return -1;
      }
    }
  }

  public static void main(String[] args) {
    BPlusTree bpt = null;
    bpt = new BPlusTree(3);
    bpt.insert(5, 33);
    bpt.insert(15, 21);
    bpt.insert(25, 31);
    bpt.insert(35, 41);
    bpt.insert(45, 10);

    if (bpt.search(15) != null) {
      System.out.println("Found");
    } else {
      System.out.println("Not Found");
    }
    ;
  }
}










Red-Black Tree
In this tutorial, you will learn what a red-black tree is. Also, you will find working examples of various operations performed on a red-black tree in C, C++, Java and Python.

Red-Black tree is a self-balancing binary search tree in which each node contains an extra bit for denoting the color of the node, either red or black.

A red-black tree satisfies the following properties:

Red/Black Property: Every node is colored, either red or black.
Root Property: The root is black.
Leaf Property: Every leaf (NIL) is black.
Red Property: If a red node has children then, the children are always black.
Depth Property: For each node, any simple path from this node to any of its descendant leaf has the same black-depth (the number of black nodes).
An example of a red-black tree is:

red-black tree
Red Black Tree
Each node has the following attributes:

color
key
leftChild
rightChild
parent (except root node)
How the red-black tree maintains the property of self-balancing?

The red-black color is meant for balancing the tree.

The limitations put on the node colors ensure that any simple path from the root to a leaf is not more than twice as long as any other such path. It helps in maintaining the self-balancing property of the red-black tree.

Operations on a Red-Black Tree
Various operations that can be performed on a red-black tree are:

Rotating the subtrees in a Red-Black Tree
In rotation operation, the positions of the nodes of a subtree are interchanged.

Rotation operation is used for maintaining the properties of a red-black tree when they are violated by other operations such as insertion and deletion.

There are two types of rotations:

Left Rotate
In left-rotation, the arrangement of the nodes on the right is transformed into the arrangements on the left node.

Algorithm

Let the initial tree be:
left-rotate
Initial tree
If y has a left subtree, assign x as the parent of the left subtree of y.
left-rotate
Assign x as the parent of the left subtree of y
If the parent of x is NULL, make y as the root of the tree.
Else if x is the left child of p, make y as the left child of p.
Else assign y as the right child of p.
left-rotate
Change the parent of x to that of y
Make y as the parent of x.
left-rotate
Assign y as the parent of x.
Right Rotate
In right-rotation, the arrangement of the nodes on the left is transformed into the arrangements on the right node.

Let the initial tree be:
right-rotate
Initial Tree
If x has a right subtree, assign y as the parent of the right subtree of x.
right-rotate
Assign y as the parent of the right subtree of x
If the parent of y is NULL, make x as the root of the tree.
Else if y is the right child of its parent p, make x as the right child of p.
Else assign x as the left child of p.
right-rotate
Assign the parent of y as the parent of x
Make x as the parent of y.
right-rotate
Assign x as the parent of y
Left-Right and Right-Left Rotate
In left-right rotation, the arrangements are first shifted to the left and then to the right.

Do left rotation on x-y.
left-right rotate
Left rotate x-y
Do right rotation on y-z.
left-right rotate
Right rotate z-y
In right-left rotation, the arrangements are first shifted to the right and then to the left.

Do right rotation on x-y.
right-left rotate
Right rotate x-y
Do left rotation on z-y.
right-left rotate
Left rotate z-y
Inserting an element into a Red-Black Tree
While inserting a new node, the new node is always inserted as a RED node. After insertion of a new node, if the tree is violating the properties of the red-black tree then, we do the following operations.

Recolor
Rotation
Algorithm to insert a node
Following steps are followed for inserting a new element into a red-black tree:

Let y be the leaf (ie. NIL) and x be the root of the tree.
Check if the tree is empty (ie. whether x is NIL). If yes, insert newNode as a root node and color it black.
Else, repeat steps following steps until leaf (NIL) is reached.
Compare newKey with rootKey.
If newKey is greater than rootKey, traverse through the right subtree.
Else traverse through the left subtree.
Assign the parent of the leaf as a parent of newNode.
If leafKey is greater than newKey, make newNode as rightChild.
Else, make newNode as leftChild.
Assign NULL to the left and rightChild of newNode.
Assign RED color to newNode.
Call InsertFix-algorithm to maintain the property of red-black tree if violated.
Why newly inserted nodes are always red in a red-black tree?

This is because inserting a red node does not violate the depth property of a red-black tree.

If you attach a red node to a red node, then the rule is violated but it is easier to fix this problem than the problem introduced by violating the depth property.

Algorithm to maintain red-black property after insertion
This algorithm is used for maintaining the property of a red-black tree if the insertion of a newNode violates this property.

Do the following while the parent of newNode p is RED.
If p is the left child of grandParent gP of z, do the following.
Case-I:
If the color of the right child of gP of z is RED, set the color of both the children of gP as BLACK and the color of gP as RED.
Assign gP to newNode.
Case-II:
Else if newNode is the right child of p then, assign p to newNode.
Left-Rotate newNode.
Case-III:
Set color of p as BLACK and color of gP as RED.
Right-Rotate gP.
Else, do the following.
If the color of the left child of gP of z is RED, set the color of both the children of gP as BLACK and the color of gP as RED.
Assign gP to newNode.
Else if newNode is the left child of p then, assign p to newNode and Right-Rotate newNode.
Set color of p as BLACK and color of gP as RED.
Left-Rotate gP.
Set the root of the tree as BLACK.
Deleting an element from a Red-Black Tree
This operation removes a node from the tree. After deleting a node, the red-black property is maintained again.

Algorithm to delete a node
Save the color of nodeToBeDeleted in origrinalColor.
If the left child of nodeToBeDeleted is NULL
Assign the right child of nodeToBeDeleted to x.
Transplant nodeToBeDeleted with x.
Else if the right child of nodeToBeDeleted is NULL
Assign the left child of nodeToBeDeleted into x.
Transplant nodeToBeDeleted with x.
Else
Assign the minimum of right subtree of noteToBeDeleted into y.
Save the color of y in originalColor.
Assign the rightChild of y into x.
If y is a child of nodeToBeDeleted, then set the parent of x as y.
Else, transplant y with rightChild of y.
Transplant nodeToBeDeleted with y.
Set the color of y with originalColor.
If the originalColor is BLACK, call DeleteFix(x).
Algorithm to maintain Red-Black property after deletion
This algorithm is implemented when a black node is deleted because it violates the black depth property of the red-black tree.

This violation is corrected by assuming that node x (which is occupying y's original position) has an extra black. This makes node x neither red nor black. It is either doubly black or black-and-red. This violates the red-black properties.

However, the color attribute of x is not changed rather the extra black is represented in x's pointing to the node.

The extra black can be removed if

It reaches the root node.
If x points to a red-black node. In this case, x is colored black.
Suitable rotations and recoloring are performed.
The following algorithm retains the properties of a red-black tree.

Do the following until the x is not the root of the tree and the color of x is BLACK
If x is the left child of its parent then,
Assign w to the sibling of x.
If the right child of parent of x is RED,
Case-I:
Set the color of the right child of the parent of x as BLACK.
Set the color of the parent of x as RED.
Left-Rotate the parent of x.
Assign the rightChild of the parent of x to w.
If the color of both the right and the leftChild of w is BLACK,
Case-II:
Set the color of w as RED
Assign the parent of x to x.
Else if the color of the rightChild of w is BLACK
Case-III:
Set the color of the leftChild of w as BLACK
Set the color of w as RED
Right-Rotate w.
Assign the rightChild of the parent of x to w.
If any of the above cases do not occur, then do the following.
Case-IV:
Set the color of w as the color of the parent of x.
Set the color of the parent of x as BLACK.
Set the color of the right child of w as BLACK.
Left-Rotate the parent of x.
Set x as the root of the tree.
Else the same as above with right changed to left and vice versa.
Set the color of x as BLACK.
Please refer to insertion and deletion operations for more explanation with examples.

Python, Java and C/C++ Examples
Python
Java
C
C++
// Implementing Red-Black Tree in Java

class Node {
  int data;
  Node parent;
  Node left;
  Node right;
  int color;
}

public class RedBlackTree {
  private Node root;
  private Node TNULL;

  // Preorder
  private void preOrderHelper(Node node) {
    if (node != TNULL) {
      System.out.print(node.data + " ");
      preOrderHelper(node.left);
      preOrderHelper(node.right);
    }
  }

  // Inorder
  private void inOrderHelper(Node node) {
    if (node != TNULL) {
      inOrderHelper(node.left);
      System.out.print(node.data + " ");
      inOrderHelper(node.right);
    }
  }

  // Post order
  private void postOrderHelper(Node node) {
    if (node != TNULL) {
      postOrderHelper(node.left);
      postOrderHelper(node.right);
      System.out.print(node.data + " ");
    }
  }

  // Search the tree
  private Node searchTreeHelper(Node node, int key) {
    if (node == TNULL || key == node.data) {
      return node;
    }

    if (key < node.data) {
      return searchTreeHelper(node.left, key);
    }
    return searchTreeHelper(node.right, key);
  }

  // Balance the tree after deletion of a node
  private void fixDelete(Node x) {
    Node s;
    while (x != root && x.color == 0) {
      if (x == x.parent.left) {
        s = x.parent.right;
        if (s.color == 1) {
          s.color = 0;
          x.parent.color = 1;
          leftRotate(x.parent);
          s = x.parent.right;
        }

        if (s.left.color == 0 && s.right.color == 0) {
          s.color = 1;
          x = x.parent;
        } else {
          if (s.right.color == 0) {
            s.left.color = 0;
            s.color = 1;
            rightRotate(s);
            s = x.parent.right;
          }

          s.color = x.parent.color;
          x.parent.color = 0;
          s.right.color = 0;
          leftRotate(x.parent);
          x = root;
        }
      } else {
        s = x.parent.left;
        if (s.color == 1) {
          s.color = 0;
          x.parent.color = 1;
          rightRotate(x.parent);
          s = x.parent.left;
        }

        if (s.right.color == 0 && s.right.color == 0) {
          s.color = 1;
          x = x.parent;
        } else {
          if (s.left.color == 0) {
            s.right.color = 0;
            s.color = 1;
            leftRotate(s);
            s = x.parent.left;
          }

          s.color = x.parent.color;
          x.parent.color = 0;
          s.left.color = 0;
          rightRotate(x.parent);
          x = root;
        }
      }
    }
    x.color = 0;
  }

  private void rbTransplant(Node u, Node v) {
    if (u.parent == null) {
      root = v;
    } else if (u == u.parent.left) {
      u.parent.left = v;
    } else {
      u.parent.right = v;
    }
    v.parent = u.parent;
  }

  private void deleteNodeHelper(Node node, int key) {
    Node z = TNULL;
    Node x, y;
    while (node != TNULL) {
      if (node.data == key) {
        z = node;
      }

      if (node.data <= key) {
        node = node.right;
      } else {
        node = node.left;
      }
    }

    if (z == TNULL) {
      System.out.println("Couldn't find key in the tree");
      return;
    }

    y = z;
    int yOriginalColor = y.color;
    if (z.left == TNULL) {
      x = z.right;
      rbTransplant(z, z.right);
    } else if (z.right == TNULL) {
      x = z.left;
      rbTransplant(z, z.left);
    } else {
      y = minimum(z.right);
      yOriginalColor = y.color;
      x = y.right;
      if (y.parent == z) {
        x.parent = y;
      } else {
        rbTransplant(y, y.right);
        y.right = z.right;
        y.right.parent = y;
      }

      rbTransplant(z, y);
      y.left = z.left;
      y.left.parent = y;
      y.color = z.color;
    }
    if (yOriginalColor == 0) {
      fixDelete(x);
    }
  }

  // Balance the node after insertion
  private void fixInsert(Node k) {
    Node u;
    while (k.parent.color == 1) {
      if (k.parent == k.parent.parent.right) {
        u = k.parent.parent.left;
        if (u.color == 1) {
          u.color = 0;
          k.parent.color = 0;
          k.parent.parent.color = 1;
          k = k.parent.parent;
        } else {
          if (k == k.parent.left) {
            k = k.parent;
            rightRotate(k);
          }
          k.parent.color = 0;
          k.parent.parent.color = 1;
          leftRotate(k.parent.parent);
        }
      } else {
        u = k.parent.parent.right;

        if (u.color == 1) {
          u.color = 0;
          k.parent.color = 0;
          k.parent.parent.color = 1;
          k = k.parent.parent;
        } else {
          if (k == k.parent.right) {
            k = k.parent;
            leftRotate(k);
          }
          k.parent.color = 0;
          k.parent.parent.color = 1;
          rightRotate(k.parent.parent);
        }
      }
      if (k == root) {
        break;
      }
    }
    root.color = 0;
  }

  private void printHelper(Node root, String indent, boolean last) {
    if (root != TNULL) {
      System.out.print(indent);
      if (last) {
        System.out.print("R----");
        indent += "   ";
      } else {
        System.out.print("L----");
        indent += "|  ";
      }

      String sColor = root.color == 1 ? "RED" : "BLACK";
      System.out.println(root.data + "(" + sColor + ")");
      printHelper(root.left, indent, false);
      printHelper(root.right, indent, true);
    }
  }

  public RedBlackTree() {
    TNULL = new Node();
    TNULL.color = 0;
    TNULL.left = null;
    TNULL.right = null;
    root = TNULL;
  }

  public void preorder() {
    preOrderHelper(this.root);
  }

  public void inorder() {
    inOrderHelper(this.root);
  }

  public void postorder() {
    postOrderHelper(this.root);
  }

  public Node searchTree(int k) {
    return searchTreeHelper(this.root, k);
  }

  public Node minimum(Node node) {
    while (node.left != TNULL) {
      node = node.left;
    }
    return node;
  }

  public Node maximum(Node node) {
    while (node.right != TNULL) {
      node = node.right;
    }
    return node;
  }

  public Node successor(Node x) {
    if (x.right != TNULL) {
      return minimum(x.right);
    }

    Node y = x.parent;
    while (y != TNULL && x == y.right) {
      x = y;
      y = y.parent;
    }
    return y;
  }

  public Node predecessor(Node x) {
    if (x.left != TNULL) {
      return maximum(x.left);
    }

    Node y = x.parent;
    while (y != TNULL && x == y.left) {
      x = y;
      y = y.parent;
    }

    return y;
  }

  public void leftRotate(Node x) {
    Node y = x.right;
    x.right = y.left;
    if (y.left != TNULL) {
      y.left.parent = x;
    }
    y.parent = x.parent;
    if (x.parent == null) {
      this.root = y;
    } else if (x == x.parent.left) {
      x.parent.left = y;
    } else {
      x.parent.right = y;
    }
    y.left = x;
    x.parent = y;
  }

  public void rightRotate(Node x) {
    Node y = x.left;
    x.left = y.right;
    if (y.right != TNULL) {
      y.right.parent = x;
    }
    y.parent = x.parent;
    if (x.parent == null) {
      this.root = y;
    } else if (x == x.parent.right) {
      x.parent.right = y;
    } else {
      x.parent.left = y;
    }
    y.right = x;
    x.parent = y;
  }

  public void insert(int key) {
    Node node = new Node();
    node.parent = null;
    node.data = key;
    node.left = TNULL;
    node.right = TNULL;
    node.color = 1;

    Node y = null;
    Node x = this.root;

    while (x != TNULL) {
      y = x;
      if (node.data < x.data) {
        x = x.left;
      } else {
        x = x.right;
      }
    }

    node.parent = y;
    if (y == null) {
      root = node;
    } else if (node.data < y.data) {
      y.left = node;
    } else {
      y.right = node;
    }

    if (node.parent == null) {
      node.color = 0;
      return;
    }

    if (node.parent.parent == null) {
      return;
    }

    fixInsert(node);
  }

  public Node getRoot() {
    return this.root;
  }

  public void deleteNode(int data) {
    deleteNodeHelper(this.root, data);
  }

  public void printTree() {
    printHelper(this.root, "", true);
  }

  public static void main(String[] args) {
    RedBlackTree bst = new RedBlackTree();
    bst.insert(55);
    bst.insert(40);
    bst.insert(65);
    bst.insert(60);
    bst.insert(75);
    bst.insert(57);
    bst.printTree();

    System.out.println("\nAfter deleting:");
    bst.deleteNode(40);
    bst.printTree();
  }
}
Red-Black Tree Applications
To implement finite maps
To implement Java packages: java.util.TreeMap and java.util.TreeSet
To implement Standard Template Libraries (STL) in C++: multiset, map, multimap
In Linux Kernel









Insertion in a Red-Black Tree
In this tutorial, you will learn how a new node can be inserted into a red-black tree is. Also, you will find working examples of insertions performed on a red-black tree in C, C++, Java and Python.

Red-Black tree is a self-balancing binary search tree in which each node contains an extra bit for denoting the color of the node, either red or black.

Before reading this article, please refer to the article on red-black tree.

While inserting a new node, the new node is always inserted as a RED node. After insertion of a new node, if the tree is violating the properties of the red-black tree then, we do the following operations.

Recolor
Rotation
Algorithm to Insert a New Node
Following steps are followed for inserting a new element into a red-black tree:

The newNode be:
New Node
New node
Let y be the leaf (ie. NIL) and x be the root of the tree. The new node is inserted in the following tree.
insertion in red black tree
Initial tree
Check if the tree is empty (ie. whether x is NIL). If yes, insert newNode as a root node and color it black.
Else, repeat steps following steps until leaf (NIL) is reached.
Compare newKey with rootKey.
If newKey is greater than rootKey, traverse through the right subtree.
Else traverse through the left subtree.
insertion in red black tree
Path leading to the node where newNode is to be inserted
Assign the parent of the leaf as parent of newNode.
If leafKey is greater than newKey, make newNode as rightChild.
Else, make newNode as leftChild.
insertion in red black tree
New node inserted
Assign NULL to the left and rightChild of newNode.
Assign RED color to newNode.
insertion in red black tree
Set the color of the newNode red and assign null to the children
Call InsertFix-algorithm to maintain the property of red-black tree if violated.
Why newly inserted nodes are always red in a red-black tree?

This is because inserting a red node does not violate the depth property of a red-black tree.

If you attach a red node to a red node, then the rule is violated but it is easier to fix this problem than the problem introduced by violating the depth property.

Algorithm to Maintain Red-Black Property After Insertion
This algorithm is used for maintaining the property of a red-black tree if insertion of a newNode violates this property.

Do the following until the parent of newNode p is RED.
If p is the left child of grandParent gP of newNode, do the following.
Case-I:
If the color of the right child of gP of newNode is RED, set the color of both the children of gP as BLACK and the color of gP as RED.
insertion in a red-black tree
Color change
Assign gP to newNode.
insertion in a red-black tree
Reassigning newNode

Case-II:
(Before moving on to this step, while loop is checked. If conditions are not satisfied, it the loop is broken.)
Else if newNode is the right child of p then, assign p to newNode.
insertion in a red-black tree
Assigning parent of newNode as newNode
Left-Rotate newNode.
Insertion in a red-black tree
Left Rotate

Case-III:
(Before moving on to this step, while loop is checked. If conditions are not satisfied, it the loop is broken.)
Set color of p as BLACK and color of gP as RED.
insertion in a redblack tree
Color change
Right-Rotate gP.
insertion in a red-black tree
Right Rotate
Else, do the following.
If the color of the left child of gP of z is RED, set the color of both the children of gP as BLACK and the color of gP as RED.
Assign gP to newNode.
Else if newNode is the left child of p then, assign p to newNode and Right-Rotate newNode.
Set color of p as BLACK and color of gP as RED.
Left-Rotate gP.
(This step is performed after coming out of the while loop.)
Set the root of the tree as BLACK.
insertion in a red-black tree
Set root''s color black
The final tree look like this:

insertion in a red-black tree
Final tree
Python, Java and C/C++ Examples
Python
Java
C
C++
// Implementing Red-Black Tree in Java

class Node {
  int data;
  Node parent;
  Node left;
  Node right;
  int color;
}

public class RedBlackTree {
  private Node root;
  private Node TNULL;

  // Preorder
  private void preOrderHelper(Node node) {
    if (node != TNULL) {
      System.out.print(node.data + " ");
      preOrderHelper(node.left);
      preOrderHelper(node.right);
    }
  }

  // Inorder
  private void inOrderHelper(Node node) {
    if (node != TNULL) {
      inOrderHelper(node.left);
      System.out.print(node.data + " ");
      inOrderHelper(node.right);
    }
  }

  // Post order
  private void postOrderHelper(Node node) {
    if (node != TNULL) {
      postOrderHelper(node.left);
      postOrderHelper(node.right);
      System.out.print(node.data + " ");
    }
  }

  // Search the tree
  private Node searchTreeHelper(Node node, int key) {
    if (node == TNULL || key == node.data) {
      return node;
    }

    if (key < node.data) {
      return searchTreeHelper(node.left, key);
    }
    return searchTreeHelper(node.right, key);
  }

  // Balance the tree after deletion of a node
  private void fixDelete(Node x) {
    Node s;
    while (x != root && x.color == 0) {
      if (x == x.parent.left) {
        s = x.parent.right;
        if (s.color == 1) {
          s.color = 0;
          x.parent.color = 1;
          leftRotate(x.parent);
          s = x.parent.right;
        }

        if (s.left.color == 0 && s.right.color == 0) {
          s.color = 1;
          x = x.parent;
        } else {
          if (s.right.color == 0) {
            s.left.color = 0;
            s.color = 1;
            rightRotate(s);
            s = x.parent.right;
          }

          s.color = x.parent.color;
          x.parent.color = 0;
          s.right.color = 0;
          leftRotate(x.parent);
          x = root;
        }
      } else {
        s = x.parent.left;
        if (s.color == 1) {
          s.color = 0;
          x.parent.color = 1;
          rightRotate(x.parent);
          s = x.parent.left;
        }

        if (s.right.color == 0 && s.right.color == 0) {
          s.color = 1;
          x = x.parent;
        } else {
          if (s.left.color == 0) {
            s.right.color = 0;
            s.color = 1;
            leftRotate(s);
            s = x.parent.left;
          }

          s.color = x.parent.color;
          x.parent.color = 0;
          s.left.color = 0;
          rightRotate(x.parent);
          x = root;
        }
      }
    }
    x.color = 0;
  }

  private void rbTransplant(Node u, Node v) {
    if (u.parent == null) {
      root = v;
    } else if (u == u.parent.left) {
      u.parent.left = v;
    } else {
      u.parent.right = v;
    }
    v.parent = u.parent;
  }

  // Balance the node after insertion
  private void fixInsert(Node k) {
    Node u;
    while (k.parent.color == 1) {
      if (k.parent == k.parent.parent.right) {
        u = k.parent.parent.left;
        if (u.color == 1) {
          u.color = 0;
          k.parent.color = 0;
          k.parent.parent.color = 1;
          k = k.parent.parent;
        } else {
          if (k == k.parent.left) {
            k = k.parent;
            rightRotate(k);
          }
          k.parent.color = 0;
          k.parent.parent.color = 1;
          leftRotate(k.parent.parent);
        }
      } else {
        u = k.parent.parent.right;

        if (u.color == 1) {
          u.color = 0;
          k.parent.color = 0;
          k.parent.parent.color = 1;
          k = k.parent.parent;
        } else {
          if (k == k.parent.right) {
            k = k.parent;
            leftRotate(k);
          }
          k.parent.color = 0;
          k.parent.parent.color = 1;
          rightRotate(k.parent.parent);
        }
      }
      if (k == root) {
        break;
      }
    }
    root.color = 0;
  }

  private void printHelper(Node root, String indent, boolean last) {
    if (root != TNULL) {
      System.out.print(indent);
      if (last) {
        System.out.print("R----");
        indent += "   ";
      } else {
        System.out.print("L----");
        indent += "|  ";
      }

      String sColor = root.color == 1 ? "RED" : "BLACK";
      System.out.println(root.data + "(" + sColor + ")");
      printHelper(root.left, indent, false);
      printHelper(root.right, indent, true);
    }
  }

  public RedBlackTree() {
    TNULL = new Node();
    TNULL.color = 0;
    TNULL.left = null;
    TNULL.right = null;
    root = TNULL;
  }

  public void preorder() {
    preOrderHelper(this.root);
  }

  public void inorder() {
    inOrderHelper(this.root);
  }

  public void postorder() {
    postOrderHelper(this.root);
  }

  public Node searchTree(int k) {
    return searchTreeHelper(this.root, k);
  }

  public Node minimum(Node node) {
    while (node.left != TNULL) {
      node = node.left;
    }
    return node;
  }

  public Node maximum(Node node) {
    while (node.right != TNULL) {
      node = node.right;
    }
    return node;
  }

  public Node successor(Node x) {
    if (x.right != TNULL) {
      return minimum(x.right);
    }

    Node y = x.parent;
    while (y != TNULL && x == y.right) {
      x = y;
      y = y.parent;
    }
    return y;
  }

  public Node predecessor(Node x) {
    if (x.left != TNULL) {
      return maximum(x.left);
    }

    Node y = x.parent;
    while (y != TNULL && x == y.left) {
      x = y;
      y = y.parent;
    }

    return y;
  }

  public void leftRotate(Node x) {
    Node y = x.right;
    x.right = y.left;
    if (y.left != TNULL) {
      y.left.parent = x;
    }
    y.parent = x.parent;
    if (x.parent == null) {
      this.root = y;
    } else if (x == x.parent.left) {
      x.parent.left = y;
    } else {
      x.parent.right = y;
    }
    y.left = x;
    x.parent = y;
  }

  public void rightRotate(Node x) {
    Node y = x.left;
    x.left = y.right;
    if (y.right != TNULL) {
      y.right.parent = x;
    }
    y.parent = x.parent;
    if (x.parent == null) {
      this.root = y;
    } else if (x == x.parent.right) {
      x.parent.right = y;
    } else {
      x.parent.left = y;
    }
    y.right = x;
    x.parent = y;
  }

  public void insert(int key) {
    Node node = new Node();
    node.parent = null;
    node.data = key;
    node.left = TNULL;
    node.right = TNULL;
    node.color = 1;

    Node y = null;
    Node x = this.root;

    while (x != TNULL) {
      y = x;
      if (node.data < x.data) {
        x = x.left;
      } else {
        x = x.right;
      }
    }

    node.parent = y;
    if (y == null) {
      root = node;
    } else if (node.data < y.data) {
      y.left = node;
    } else {
      y.right = node;
    }

    if (node.parent == null) {
      node.color = 0;
      return;
    }

    if (node.parent.parent == null) {
      return;
    }

    fixInsert(node);
  }

  public Node getRoot() {
    return this.root;
  }

  public void printTree() {
    printHelper(this.root, "", true);
  }

  public static void main(String[] args) {
    RedBlackTree bst = new RedBlackTree();
    bst.insert(55);
    bst.insert(40);
    bst.insert(65);
    bst.insert(60);
    bst.insert(75);
    bst.insert(57);
    bst.printTree();

  }
}









Deletion From a Red-Black Tree
In this tutorial, you will learn how a node is deleted from a red-black tree is. Also, you will find working examples of deletions performed on a red-black tree in C, C++, Java and Python.

Red-Black tree is a self-balancing binary search tree in which each node contains an extra bit for denoting the color of the node, either red or black.

Before reading this article, please refer to the article on red-black tree.

Deleting a node may or may not disrupt the red-black properties of a red-black tree. If this action violates the red-black properties, then a fixing algorithm is used to regain the red-black properties.

Deleting an element from a Red-Black Tree
This operation removes a node from the tree. After deleting a node, the red-black property is maintained again.

Let the nodeToBeDeleted be:
deletion in a red-black tree
Node to be deleted
Save the color of nodeToBeDeleted in origrinalColor.
deletion in a red-black tree
Saving original color
If the left child of nodeToBeDeleted is NULL
Assign the right child of nodeToBeDeleted to x.
deletion in a red-black tree
Assign x to the rightChild
Transplant nodeToBeDeleted with x.
deletion in a red-black tree
Transplant nodeToBeDeleted with x
Else if the right child of nodeToBeDeleted is NULL
Assign the left child of nodeToBeDeleted into x.
Transplant nodeToBeDeleted with x.
Else
Assign the minimum of right subtree of noteToBeDeleted into y.
Save the color of y in originalColor.
Assign the rightChild of y into x.
If y is a child of nodeToBeDeleted, then set the parent of x as y.
Else, transplant y with rightChild of y.
Transplant nodeToBeDeleted with y.
Set the color of y with originalColor.
If the originalColor is BLACK, call DeleteFix(x).
Algorithm to maintain Red-Black property after deletion
This algorithm is implemented when a black node is deleted because it violates the black depth property of the red-black tree.

This violation is corrected by assuming that node x (which is occupying y's original position) has an extra black. This makes node x neither red nor black. It is either doubly black or black-and-red. This violates the red-black properties.

However, the color attribute of x is not changed rather the extra black is represented in x's pointing to the node.

The extra black can be removed if

It reaches the root node.
If x points to a red-black node. In this case, x is colored black.
Suitable rotations and recolorings are performed.
Following algorithm retains the properties of a red-black tree.

Do the following until the x is not the root of the tree and the color of x is BLACK
If x is the left child of its parent then,
Assign w to the sibling of x.
deletion in a red-black tree
Assigning w
If the sibling of x is RED,
Case-I:
Set the color of the right child of the parent of x as BLACK.
Set the color of the parent of x as RED.
deletion in a red-black tree
Color change
Left-Rotate the parent of x.
deletion in a red-black tree
Left-rotate
Assign the rightChild of the parent of x to w.
deletion in a red-black tree
Reassign w
If the color of both the right and the leftChild of w is BLACK,
Case-II:
Set the color of w as RED
Assign the parent of x to x.
Else if the color of the rightChild of w is BLACK
Case-III:
Set the color of the leftChild of w as BLACK
Set the color of w as RED
deletion in a red-black tree
Color change
Right-Rotate w.
deletion in a red-black tree
Right rotate
Assign the rightChild of the parent of x to w.
deletion in a red-black tree
Reassign w
If any of the above cases do not occur, then do the following.
Case-IV:
Set the color of w as the color of the parent of x.
Set the color of the parent of parent of x as BLACK.
Set the color of the right child of w as BLACK.
deletion in a red-black tree
Color change
Left-Rotate the parent of x.
deletion in a red-black tree
Left-rotate
Set x as the root of the tree.
deletion in a red-black tree
Set x as root
Else same as above with right changed to left and vice versa.
Set the color of x as BLACK.
The workflow of the above cases can be understood with the help of the flowchart below.

deletion-fix algorithm
Flowchart for deletion operation
Python, Java and C/C++ Examples
Python
Java
C
C++
// Implementing Red-Black Tree in Java

class Node {
  int data;
  Node parent;
  Node left;
  Node right;
  int color;
}

public class RedBlackTree {
  private Node root;
  private Node TNULL;

  // Preorder
  private void preOrderHelper(Node node) {
    if (node != TNULL) {
      System.out.print(node.data + " ");
      preOrderHelper(node.left);
      preOrderHelper(node.right);
    }
  }

  // Inorder
  private void inOrderHelper(Node node) {
    if (node != TNULL) {
      inOrderHelper(node.left);
      System.out.print(node.data + " ");
      inOrderHelper(node.right);
    }
  }

  // Post order
  private void postOrderHelper(Node node) {
    if (node != TNULL) {
      postOrderHelper(node.left);
      postOrderHelper(node.right);
      System.out.print(node.data + " ");
    }
  }

  // Search the tree
  private Node searchTreeHelper(Node node, int key) {
    if (node == TNULL || key == node.data) {
      return node;
    }

    if (key < node.data) {
      return searchTreeHelper(node.left, key);
    }
    return searchTreeHelper(node.right, key);
  }

  // Balance the tree after deletion of a node
  private void fixDelete(Node x) {
    Node s;
    while (x != root && x.color == 0) {
      if (x == x.parent.left) {
        s = x.parent.right;
        if (s.color == 1) {
          s.color = 0;
          x.parent.color = 1;
          leftRotate(x.parent);
          s = x.parent.right;
        }

        if (s.left.color == 0 && s.right.color == 0) {
          s.color = 1;
          x = x.parent;
        } else {
          if (s.right.color == 0) {
            s.left.color = 0;
            s.color = 1;
            rightRotate(s);
            s = x.parent.right;
          }

          s.color = x.parent.color;
          x.parent.color = 0;
          s.right.color = 0;
          leftRotate(x.parent);
          x = root;
        }
      } else {
        s = x.parent.left;
        if (s.color == 1) {
          s.color = 0;
          x.parent.color = 1;
          rightRotate(x.parent);
          s = x.parent.left;
        }

        if (s.right.color == 0 && s.right.color == 0) {
          s.color = 1;
          x = x.parent;
        } else {
          if (s.left.color == 0) {
            s.right.color = 0;
            s.color = 1;
            leftRotate(s);
            s = x.parent.left;
          }

          s.color = x.parent.color;
          x.parent.color = 0;
          s.left.color = 0;
          rightRotate(x.parent);
          x = root;
        }
      }
    }
    x.color = 0;
  }

  private void rbTransplant(Node u, Node v) {
    if (u.parent == null) {
      root = v;
    } else if (u == u.parent.left) {
      u.parent.left = v;
    } else {
      u.parent.right = v;
    }
    v.parent = u.parent;
  }

  private void deleteNodeHelper(Node node, int key) {
    Node z = TNULL;
    Node x, y;
    while (node != TNULL) {
      if (node.data == key) {
        z = node;
      }

      if (node.data <= key) {
        node = node.right;
      } else {
        node = node.left;
      }
    }

    if (z == TNULL) {
      System.out.println("Couldn't find key in the tree");
      return;
    }

    y = z;
    int yOriginalColor = y.color;
    if (z.left == TNULL) {
      x = z.right;
      rbTransplant(z, z.right);
    } else if (z.right == TNULL) {
      x = z.left;
      rbTransplant(z, z.left);
    } else {
      y = minimum(z.right);
      yOriginalColor = y.color;
      x = y.right;
      if (y.parent == z) {
        x.parent = y;
      } else {
        rbTransplant(y, y.right);
        y.right = z.right;
        y.right.parent = y;
      }

      rbTransplant(z, y);
      y.left = z.left;
      y.left.parent = y;
      y.color = z.color;
    }
    if (yOriginalColor == 0) {
      fixDelete(x);
    }
  }

  // Balance the node after insertion
  private void fixInsert(Node k) {
    Node u;
    while (k.parent.color == 1) {
      if (k.parent == k.parent.parent.right) {
        u = k.parent.parent.left;
        if (u.color == 1) {
          u.color = 0;
          k.parent.color = 0;
          k.parent.parent.color = 1;
          k = k.parent.parent;
        } else {
          if (k == k.parent.left) {
            k = k.parent;
            rightRotate(k);
          }
          k.parent.color = 0;
          k.parent.parent.color = 1;
          leftRotate(k.parent.parent);
        }
      } else {
        u = k.parent.parent.right;

        if (u.color == 1) {
          u.color = 0;
          k.parent.color = 0;
          k.parent.parent.color = 1;
          k = k.parent.parent;
        } else {
          if (k == k.parent.right) {
            k = k.parent;
            leftRotate(k);
          }
          k.parent.color = 0;
          k.parent.parent.color = 1;
          rightRotate(k.parent.parent);
        }
      }
      if (k == root) {
        break;
      }
    }
    root.color = 0;
  }

  private void printHelper(Node root, String indent, boolean last) {
    if (root != TNULL) {
      System.out.print(indent);
      if (last) {
        System.out.print("R----");
        indent += "   ";
      } else {
        System.out.print("L----");
        indent += "|  ";
      }

      String sColor = root.color == 1 ? "RED" : "BLACK";
      System.out.println(root.data + "(" + sColor + ")");
      printHelper(root.left, indent, false);
      printHelper(root.right, indent, true);
    }
  }

  public RedBlackTree() {
    TNULL = new Node();
    TNULL.color = 0;
    TNULL.left = null;
    TNULL.right = null;
    root = TNULL;
  }

  public void preorder() {
    preOrderHelper(this.root);
  }

  public void inorder() {
    inOrderHelper(this.root);
  }

  public void postorder() {
    postOrderHelper(this.root);
  }

  public Node searchTree(int k) {
    return searchTreeHelper(this.root, k);
  }

  public Node minimum(Node node) {
    while (node.left != TNULL) {
      node = node.left;
    }
    return node;
  }

  public Node maximum(Node node) {
    while (node.right != TNULL) {
      node = node.right;
    }
    return node;
  }

  public Node successor(Node x) {
    if (x.right != TNULL) {
      return minimum(x.right);
    }

    Node y = x.parent;
    while (y != TNULL && x == y.right) {
      x = y;
      y = y.parent;
    }
    return y;
  }

  public Node predecessor(Node x) {
    if (x.left != TNULL) {
      return maximum(x.left);
    }

    Node y = x.parent;
    while (y != TNULL && x == y.left) {
      x = y;
      y = y.parent;
    }

    return y;
  }

  public void leftRotate(Node x) {
    Node y = x.right;
    x.right = y.left;
    if (y.left != TNULL) {
      y.left.parent = x;
    }
    y.parent = x.parent;
    if (x.parent == null) {
      this.root = y;
    } else if (x == x.parent.left) {
      x.parent.left = y;
    } else {
      x.parent.right = y;
    }
    y.left = x;
    x.parent = y;
  }

  public void rightRotate(Node x) {
    Node y = x.left;
    x.left = y.right;
    if (y.right != TNULL) {
      y.right.parent = x;
    }
    y.parent = x.parent;
    if (x.parent == null) {
      this.root = y;
    } else if (x == x.parent.right) {
      x.parent.right = y;
    } else {
      x.parent.left = y;
    }
    y.right = x;
    x.parent = y;
  }

  public void insert(int key) {
    Node node = new Node();
    node.parent = null;
    node.data = key;
    node.left = TNULL;
    node.right = TNULL;
    node.color = 1;

    Node y = null;
    Node x = this.root;

    while (x != TNULL) {
      y = x;
      if (node.data < x.data) {
        x = x.left;
      } else {
        x = x.right;
      }
    }

    node.parent = y;
    if (y == null) {
      root = node;
    } else if (node.data < y.data) {
      y.left = node;
    } else {
      y.right = node;
    }

    if (node.parent == null) {
      node.color = 0;
      return;
    }

    if (node.parent.parent == null) {
      return;
    }

    fixInsert(node);
  }

  public Node getRoot() {
    return this.root;
  }

  public void deleteNode(int data) {
    deleteNodeHelper(this.root, data);
  }

  public void printTree() {
    printHelper(this.root, "", true);
  }

  public static void main(String[] args) {
    RedBlackTree bst = new RedBlackTree();
    bst.insert(55);
    bst.insert(40);
    bst.insert(65);
    bst.insert(60);
    bst.insert(75);
    bst.insert(57);
    bst.printTree();

    System.out.println("\nAfter deleting:");
    bst.deleteNode(40);
    bst.printTree();
  }
}






