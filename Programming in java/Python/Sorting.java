Bubble Sort
In this tutorial, you will learn about the bubble sort algorithm and its implementation in Python, Java, C, and C++.

Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are not in the intended order.

Just like the movement of air bubbles in the water that rise up to the surface, each element of the array move to the end in each iteration. Therefore, it is called a bubble sort.

Working of Bubble Sort
Suppose we are trying to sort the elements in ascending order.

1. First Iteration (Compare and Swap)

Starting from the first index, compare the first and the second elements.
If the first element is greater than the second element, they are swapped.
Now, compare the second and the third elements. Swap them if they are not in order.
The above process goes on until the last element.
Compare two adjacent elements and swap them if the first element is greater than the next element
Compare the Adjacent Elements
2. Remaining Iteration

The same process goes on for the remaining iterations.

After each iteration, the largest element among the unsorted elements is placed at the end.

Continue the swapping and put the largest element among the unsorted list at the end
Put the largest element at the end
In each iteration, the comparison takes place up to the last unsorted element.

Swapping occurs only if the first element is greater than the next element
Compare the adjacent elements
The array is sorted when all the unsorted elements are placed at their correct positions.

The array is sorted if all the elements are kept in the right order.
The array is sorted if all elements are kept in the right order
Bubble Sort Algorithm
bubbleSort(array)
  for i <- 1 to indexOfLastUnsortedElement-1
    if leftElement > rightElement
      swap leftElement and rightElement
end bubbleSort
Bubble Sort Code in Python, Java and C/C++
Python
Java
C
C++
# Bubble sort in Python

def bubbleSort(array):
    
  # loop to access each array element
  for i in range(len(array)):

    # loop to compare array elements
    for j in range(0, len(array) - i - 1):

      # compare two adjacent elements
      # change > to < to sort in descending order
      if array[j] > array[j + 1]:

        # swapping elements if elements
        # are not in the intended order
        temp = array[j]
        array[j] = array[j+1]
        array[j+1] = temp


data = [-2, 45, 0, 11, -9]

bubbleSort(data)

print('Sorted Array in Ascending Order:')
print(data)
Optimized Bubble Sort Algorithm
In the above algorithm, all the comparisons are made even if the array is already sorted.

This increases the execution time.

To solve this, we can introduce an extra variable swapped. The value of swapped is set true if there occurs swapping of elements. Otherwise, it is set false.

After an iteration, if there is no swapping, the value of swapped will be false. This means elements are already sorted and there is no need to perform further iterations.

This will reduce the execution time and helps to optimize the bubble sort.

Algorithm for optimized bubble sort is

bubbleSort(array)
  swapped <- false
  for i <- 1 to indexOfLastUnsortedElement-1
    if leftElement > rightElement
      swap leftElement and rightElement
      swapped <- true
end bubbleSort
Optimized Bubble Sort in Python, Java, and C/C++
Python
Java
C
C++
// Optimized Bubble sort in Java

import java.util.Arrays;

class Main {

  // perform the bubble sort
  static void bubbleSort(int array[]) {
    int size = array.length;
    
    // loop to access each array element
    for (int i = 0; i < (size-1); i++) {
    
      // check if swapping occurs
      boolean swapped = false;
      
      // loop to compare adjacent elements
      for (int j = 0; j < (size-i-1); j++) {

        // compare two array elements
        // change > to < to sort in descending order
        if (array[j] > array[j + 1]) {

          // swapping occurs if elements
          // are not in the intended order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
          swapped = true;
        }
      }
      // no swapping means the array is already sorted
      // so no need for further comparison
      if (!swapped)
        break;

    }
  }

  public static void main(String args[]) {
      
    int[] data = { -2, 45, 0, 11, -9 };
    
    // call method using the class name
    Main.bubbleSort(data);
    
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}
Bubble Sort Complexity
Time Complexity	 
Best	O(n)
Worst	O(n2)
Average	O(n2)
Space Complexity	O(1)
Stability	Yes
Complexity in Detail
Bubble Sort compares the adjacent elements.

Cycle	Number of Comparisons
1st	(n-1)
2nd	(n-2)
3rd	(n-3)
.......	......
last	1
Hence, the number of comparisons is

(n-1) + (n-2) + (n-3) +.....+ 1 = n(n-1)/2
nearly equals to n2

Hence, Complexity: O(n2)

Also, if we observe the code, bubble sort requires two loops. Hence, the complexity is n*n = n2

1. Time Complexities
Worst Case Complexity: O(n2)
If we want to sort in ascending order and the array is in descending order then the worst case occurs.
Best Case Complexity: O(n)
If the array is already sorted, then there is no need for sorting.
Average Case Complexity: O(n2)
It occurs when the elements of the array are in jumbled order (neither ascending nor descending).
2. Space Complexity
Space complexity is O(1) because an extra variable is used for swapping.
In the optimized bubble sort algorithm, two extra variables are used. Hence, the space complexity will be O(2).
Bubble Sort Applications
Bubble sort is used if

complexity does not matter
short and simple code is preferred
Similar Sorting Algorithms
Quicksort
Insertion Sort
Merge Sort
Selection Sort





Selection Sort Algorithm
In this tutorial, you will learn about the selection sort algorithm and its implementation in Python, Java, C, and C++.

Selection sort is a sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list.

Working of Selection Sort
Set the first element as minimum.
Selection Sort Steps
Select first element as minimum
Compare minimum with the second element. If the second element is smaller than minimum, assign the second element as minimum.

Compare minimum with the third element. Again, if the third element is smaller, then assign minimum to the third element otherwise do nothing. The process goes on until the last element.
Selection Sort Steps
Compare minimum with the remaining elements
After each iteration, minimum is placed in the front of the unsorted list.
Selection Sort Steps
Swap the first with minimum
For each iteration, indexing starts from the first unsorted element. Step 1 to 3 are repeated until all the elements are placed at their correct positions.
Selection Sort Steps
The first iteration
Selection sort steps
The second iteration
Selection sort steps
The third iteration
Selection sort steps
The fourth iteration
Selection Sort Algorithm
selectionSort(array, size)
  repeat (size - 1) times
  set the first unsorted element as the minimum
  for each of the unsorted elements
    if element < currentMinimum
      set element as new minimum
  swap minimum with first unsorted position
end selectionSort
Selection Sort Code in Python, Java, and C/C++
Python
Java
C
C++
// Selection sort in Java

import java.util.Arrays;

class SelectionSort {
  void selectionSort(int array[]) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  // driver code
  public static void main(String args[]) {
    int[] data = { 20, 12, 10, 15, 2 };
    SelectionSort ss = new SelectionSort();
    ss.selectionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}
Selection Sort Complexity
Time Complexity	 
Best	O(n2)
Worst	O(n2)
Average	O(n2)
Space Complexity	O(1)
Stability	No
Cycle	Number of Comparison
1st	(n-1)
2nd	(n-2)
3rd	(n-3)
...	...
last	1
Number of comparisons: (n - 1) + (n - 2) + (n - 3) + ..... + 1 = n(n - 1) / 2 nearly equals to n2.

Complexity = O(n2)

Also, we can analyze the complexity by simply observing the number of loops. There are 2 loops so the complexity is n*n = n2.

Time Complexities:

Worst Case Complexity: O(n2)
If we want to sort in ascending order and the array is in descending order then, the worst case occurs.
Best Case Complexity: O(n2)
It occurs when the array is already sorted
Average Case Complexity: O(n2)
It occurs when the elements of the array are in jumbled order (neither ascending nor descending).
The time complexity of the selection sort is the same in all cases. At every step, you have to find the minimum element and put it in the right place. The minimum element is not known until the end of the array is not reached.

Space Complexity:

Space complexity is O(1) because an extra variable temp is used.

Selection Sort Applications
The selection sort is used when

a small list is to be sorted
cost of swapping does not matter
checking of all the elements is compulsory
cost of writing to a memory matters like in flash memory (number of writes/swaps is O(n) as compared to O(n2) of bubble sort)
Similar Sorting Algorithms
Bubble Sort
Quicksort
Insertion Sort
Merge Sort









Insertion Sort Algorithm
In this tutorial, you will learn about insertion sort algorithm and its implementation in C, C++, Java and Python.

Insertion sort is a sorting algorithm that places an unsorted element at its suitable place in each iteration.

Insertion sort works similarly as we sort cards in our hand in a card game.

We assume that the first card is already sorted then, we select an unsorted card. If the unsorted card is greater than the card in hand, it is placed on the right otherwise, to the left. In the same way, other unsorted cards are taken and put in their right place.

A similar approach is used by insertion sort.

Working of Insertion Sort
Suppose we need to sort the following array.

Insertion Sort Steps
Initial array
The first element in the array is assumed to be sorted. Take the second element and store it separately in key.

Compare key with the first element. If the first element is greater than key, then key is placed in front of the first element.
Insertion Sort Steps
If the first element is greater than key, then key is placed in front of the first element.
Now, the first two elements are sorted.

Take the third element and compare it with the elements on the left of it. Placed it just behind the element smaller than it. If there is no element smaller than it, then place it at the beginning of the array.
Insertion Sort Steps
Place 1 at the beginning
Similarly, place every unsorted element at its correct position.
Insertion Sort Steps
Place 4 behind 1
Insertion Sort Steps
Place 3 behind 1 and the array is sorted
Insertion Sort Algorithm

insertionSort(array)
  mark first element as sorted
  for each unsorted element X
    'extract' the element X
    for j <- lastSortedIndex down to 0
      if current element j > X
        move sorted element to the right by 1
    break loop and insert X here
end insertionSort
Insertion Sort in Python, Java, and C/C++
Python
Java
C
C++
// Insertion sort in Java

import java.util.Arrays;

class InsertionSort {

  void insertionSort(int array[]) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change key<array[j] to key>array[j].
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      // Place key at after the element just smaller than it.
      array[j + 1] = key;
    }
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = { 9, 5, 1, 4, 3 };
    InsertionSort is = new InsertionSort();
    is.insertionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}
Insertion Sort Complexity
Time Complexity	 
Best	O(n)
Worst	O(n2)
Average	O(n2)
Space Complexity	O(1)
Stability	Yes
Time Complexities

Worst Case Complexity: O(n2)
Suppose, an array is in ascending order, and you want to sort it in descending order. In this case, worst case complexity occurs.

Each element has to be compared with each of the other elements so, for every nth element, (n-1) number of comparisons are made.

Thus, the total number of comparisons = n*(n-1) ~ n2
Best Case Complexity: O(n)
When the array is already sorted, the outer loop runs for n number of times whereas the inner loop does not run at all. So, there are only n number of comparisons. Thus, complexity is linear.
Average Case Complexity: O(n2)
It occurs when the elements of an array are in jumbled order (neither ascending nor descending).
Space Complexity

Space complexity is O(1) because an extra variable key is used.

Insertion Sort Applications
The insertion sort is used when:

the array is has a small number of elements
there are only a few elements left to be sorted
Similar Sorting Algorithms
Bubble Sort
Quicksort
Merge Sort
Selection Sort






Merge Sort Algorithm
In this tutorial, you will learn about merge sort algorithm and its implementation in C, C++, Java and Python.

Merge Sort is one of the most popular sorting algorithms that is based on the principle of Divide and Conquer Algorithm.

Here, a problem is divided into multiple sub-problems. Each sub-problem is solved individually. Finally, sub-problems are combined to form the final solution.

merge sort example
Merge Sort example
Divide and Conquer Strategy
Using the Divide and Conquer technique, we divide a problem into subproblems. When the solution to each subproblem is ready, we 'combine' the results from the subproblems to solve the main problem.

Suppose we had to sort an array A. A subproblem would be to sort a sub-section of this array starting at index p and ending at index r, denoted as A[p..r].

Divide

If q is the half-way point between p and r, then we can split the subarray A[p..r] into two arrays A[p..q] and A[q+1, r].

Conquer

In the conquer step, we try to sort both the subarrays A[p..q] and A[q+1, r]. If we haven't yet reached the base case, we again divide both these subarrays and try to sort them.

Combine

When the conquer step reaches the base step and we get two sorted subarrays A[p..q] and A[q+1, r] for array A[p..r], we combine the results by creating a sorted array A[p..r] from two sorted subarrays A[p..q] and A[q+1, r].

MergeSort Algorithm
The MergeSort function repeatedly divides the array into two halves until we reach a stage where we try to perform MergeSort on a subarray of size 1 i.e. p == r.

After that, the merge function comes into play and combines the sorted arrays into larger arrays until the whole array is merged.

MergeSort(A, p, r):
    if p > r 
        return
    q = (p+r)/2
    mergeSort(A, p, q)
    mergeSort(A, q+1, r)
    merge(A, p, q, r)
To sort an entire array, we need to call MergeSort(A, 0, length(A)-1).

As shown in the image below, the merge sort algorithm recursively divides the array into halves until we reach the base case of array with 1 element. After that, the merge function picks up the sorted sub-arrays and merges them to gradually sort the entire array.

merge sort algorithm visualization
Merge sort in action
The merge Step of Merge Sort
Every recursive algorithm is dependent on a base case and the ability to combine the results from base cases. Merge sort is no different. The most important part of the merge sort algorithm is, you guessed it, merge step.

The merge step is the solution to the simple problem of merging two sorted lists(arrays) to build one large sorted list(array).

The algorithm maintains three pointers, one for each of the two arrays and one for maintaining the current index of the final sorted array.

Have we reached the end of any of the arrays?
    No:
        Compare current elements of both arrays 
        Copy smaller element into sorted array
        Move pointer of element containing smaller element
    Yes:
        Copy all remaining elements of non-empty array
merge two sorted arrays
Merge step
Writing the Code for Merge Algorithm
A noticeable difference between the merging step we described above and the one we use for merge sort is that we only perform the merge function on consecutive sub-arrays.

This is why we only need the array, the first position, the last index of the first subarray(we can calculate the first index of the second subarray) and the last index of the second subarray.

Our task is to merge two subarrays A[p..q] and A[q+1..r] to create a sorted array A[p..r]. So the inputs to the function are A, p, q and r

The merge function works as follows:

Create copies of the subarrays L ← A[p..q] and M ← A[q+1..r].
Create three pointers i, j and k
i maintains current index of L, starting at 1
j maintains current index of M, starting at 1
k maintains the current index of A[p..q], starting at p.
Until we reach the end of either L or M, pick the larger among the elements from L and M and place them in the correct position at A[p..q]
When we run out of elements in either L or M, pick up the remaining elements and put in A[p..q]
In code, this would look like:

// Merge two subarrays L and M into arr
void merge(int arr[], int p, int q, int r) {

    // Create L ← A[p..q] and M ← A[q+1..r]
    int n1 = q - p + 1;
    int n2 = r - q;

    int L[n1], M[n2];

    for (int i = 0; i < n1; i++)
        L[i] = arr[p + i];
    for (int j = 0; j < n2; j++)
        M[j] = arr[q + 1 + j];

    // Maintain current index of sub-arrays and main array
    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    // Until we reach either end of either L or M, pick larger among
    // elements L and M and place them in the correct position at A[p..r]
    while (i < n1 && j < n2) {
        if (L[i] <= M[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = M[j];
            j++;
        }
        k++;
    }

    // When we run out of elements in either L or M,
    // pick up the remaining elements and put in A[p..r]
    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    while (j < n2) {
        arr[k] = M[j];
        j++;
        k++;
    }
}
Merge( ) Function Explained Step-By-Step
A lot is happening in this function, so let's take an example to see how this would work.

As usual, a picture speaks a thousand words.

Merging two consecutive subarrays of array
Merging two consecutive subarrays of array
The array A[0..5] contains two sorted subarrays A[0..3] and A[4..5]. Let us see how the merge function will merge the two arrays.

void merge(int arr[], int p, int q, int r) {
// Here, p = 0, q = 4, r = 6 (size of array)
Step 1: Create duplicate copies of sub-arrays to be sorted
    // Create L ← A[p..q] and M ← A[q+1..r]
    int n1 = q - p + 1 = 3 - 0 + 1 = 4;
    int n2 = r - q = 5 - 3 = 2;

    int L[4], M[2];

    for (int i = 0; i < 4; i++)
        L[i] = arr[p + i];
        // L[0,1,2,3] = A[0,1,2,3] = [1,5,10,12]

    for (int j = 0; j < 2; j++)
        M[j] = arr[q + 1 + j];
        // M[0,1] = A[4,5] = [6,9]
Create copies of subarrays for merging
Create copies of subarrays for merging
Step 2: Maintain current index of sub-arrays and main array
    
    int i, j, k;
    i = 0; 
    j = 0; 
    k = p; 
Maintain indices of copies of sub array and main array
Maintain indices of copies of sub array and main array
Step 3: Until we reach the end of either L or M, pick larger among elements L and M and place them in the correct position at A[p..r]
    while (i < n1 && j < n2) { 
        if (L[i] <= M[j]) { 
            arr[k] = L[i]; i++; 
        } 
        else { 
            arr[k] = M[j]; 
            j++; 
        } 
        k++; 
    }
Comparing individual elements of sorted subarrays until we reach end of one
Comparing individual elements of sorted subarrays until we reach end of one
Step 4: When we run out of elements in either L or M, pick up the remaining elements and put in A[p..r]
    // We exited the earlier loop because j < n2 doesn't hold
    while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }
Copy the remaining elements from the first array to main subarray
Copy the remaining elements from the first array to main subarray
    // We exited the earlier loop because i < n1 doesn't hold  
    while (j < n2)
    {
        arr[k] = M[j];
        j++;
        k++;
    }
}
Copy remaining elements of second array to main subarray
Copy remaining elements of second array to main subarray
This step would have been needed if the size of M was greater than L.

At the end of the merge function, the subarray A[p..r] is sorted.

Merge Sort Code in Python, Java, and C/C++
Python
Java
C
C++
// Merge sort in Java

class MergeSort {

  // Merge two subarrays L and M into arr
  void merge(int arr[], int p, int q, int r) {

    // Create L ← A[p..q] and M ← A[q+1..r]
    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];

    for (int i = 0; i < n1; i++)
      L[i] = arr[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = arr[q + 1 + j];

    // Maintain current index of sub-arrays and main array
    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    // Until we reach either end of either L or M, pick larger among
    // elements L and M and place them in the correct position at A[p..r]
    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = M[j];
        j++;
      }
      k++;
    }

    // When we run out of elements in either L or M,
    // pick up the remaining elements and put in A[p..r]
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = M[j];
      j++;
      k++;
    }
  }

  // Divide the array into two subarrays, sort them and merge them
  void mergeSort(int arr[], int l, int r) {
    if (l < r) {

      // m is the point where the array is divided into two subarrays
      int m = (l + r) / 2;

      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);

      // Merge the sorted subarrays
      merge(arr, l, m, r);
    }
  }

  // Print the array
  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  // Driver program
  public static void main(String args[]) {
    int arr[] = { 6, 5, 12, 10, 9, 1 };

    MergeSort ob = new MergeSort();
    ob.mergeSort(arr, 0, arr.length - 1);

    System.out.println("Sorted array:");
    printArray(arr);
  }
}
Merge Sort Complexity
Time Complexity	 
Best	O(n*log n)
Worst	O(n*log n)
Average	O(n*log n)
Space Complexity	O(n)
Stability	Yes
Time Complexity
Best Case Complexity: O(n*log n)

Worst Case Complexity: O(n*log n)

Average Case Complexity: O(n*log n)

Space Complexity
The space complexity of merge sort is O(n).

Merge Sort Applications
Inversion count problem
External sorting
E-commerce applications
Similar Sorting Algorithms
Quicksort
Insertion Sort
Selection Sort
Bucket Sort









Quicksort Algorithm
In this tutorial, you will learn about the quick sort algorithm and its implementation in Python, Java, C, and C++.

Quicksort is a sorting algorithm based on the divide and conquer approach where

An array is divided into subarrays by selecting a pivot element (element selected from the array).

While dividing the array, the pivot element should be positioned in such a way that elements less than pivot are kept on the left side and elements greater than pivot are on the right side of the pivot.
The left and right subarrays are also divided using the same approach. This process continues until each subarray contains a single element.
At this point, elements are already sorted. Finally, elements are combined to form a sorted array.
Working of Quicksort Algorithm
1. Select the Pivot Element

There are different variations of quicksort where the pivot element is selected from different positions. Here, we will be selecting the rightmost element of the array as the pivot element.

Quick Sort Steps
Select a pivot element
2. Rearrange the Array

Now the elements of the array are rearranged so that elements that are smaller than the pivot are put on the left and the elements greater than the pivot are put on the right.

Quick Sort Steps
Put all the smaller elements on the left and greater on the right of pivot element
Here''s how we rearrange the array:

A pointer is fixed at the pivot element. The pivot element is compared with the elements beginning from the first index.
Quick Sort Steps
Comparison of pivot element with element beginning from the first index
If the element is greater than the pivot element, a second pointer is set for that element.
Quick Sort Steps
If the element is greater than the pivot element, a second pointer is set for that element.
Now, pivot is compared with other elements. If an element smaller than the pivot element is reached, the smaller element is swapped with the greater element found earlier.
Quick Sort Steps
Pivot is compared with other elements.
Again, the process is repeated to set the next greater element as the second pointer. And, swap it with another smaller element.
Quick Sort Steps
The process is repeated to set the next greater element as the second pointer.
The process goes on until the second last element is reached.
Quick Sort Steps
The process goes on until the second last element is reached.
Finally, the pivot element is swapped with the second pointer.
Quick Sort Steps
Finally, the pivot element is swapped with the second pointer.
3. Divide Subarrays

Pivot elements are again chosen for the left and the right sub-parts separately. And, step 2 is repeated.

Quick Sort Steps
Select pivot element of in each half and put at correct place using recursion
 

The subarrays are divided until each subarray is formed of a single element. At this point, the array is already sorted.

Quick Sort Algorithm

quickSort(array, leftmostIndex, rightmostIndex)
  if (leftmostIndex < rightmostIndex)
    pivotIndex <- partition(array,leftmostIndex, rightmostIndex)
    quickSort(array, leftmostIndex, pivotIndex - 1)
    quickSort(array, pivotIndex, rightmostIndex)

partition(array, leftmostIndex, rightmostIndex)
  set rightmostIndex as pivotIndex
  storeIndex <- leftmostIndex - 1
  for i <- leftmostIndex + 1 to rightmostIndex
  if element[i] < pivotElement
    swap element[i] and element[storeIndex]
    storeIndex++
  swap pivotElement and element[storeIndex+1]
return storeIndex + 1
Visual Illustration of Quicksort Algorithm
You can understand the working of quicksort algorithm with the help of the illustrations below.

Quick Sort Steps
Sorting the elements on the left of pivot using recursion
Quick Sort Steps
Sorting the elements on the right of pivot using recursion
Quicksort Code in Python, Java, and C/C++
Python
Java
C
C++
// Quick sort in Java

import java.util.Arrays;

class Quicksort {

  // method to find the partition position
  static int partition(int array[], int low, int high) {
    
    // choose the rightmost element as pivot
    int pivot = array[high];
    
    // pointer for greater element
    int i = (low - 1);

    // traverse through all elements
    // compare each element with pivot
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {

        // if element smaller than pivot is found
        // swap it with the greatr element pointed by i
        i++;

        // swapping element at i with element at j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    // swapt the pivot element with the greater element specified by i
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    // return the position from where partition is done
    return (i + 1);
  }

  static void quickSort(int array[], int low, int high) {
    if (low < high) {

      // find pivot element such that
      // elements smaller than pivot are on the left
      // elements greater than pivot are on the right
      int pi = partition(array, low, high);
      
      // recursive call on the left of pivot
      quickSort(array, low, pi - 1);

      // recursive call on the right of pivot
      quickSort(array, pi + 1, high);
    }
  }
}

// Main class
class Main {
  public static void main(String args[]) {

    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
    System.out.println("Unsorted Array");
    System.out.println(Arrays.toString(data));

    int size = data.length;

    // call quicksort() on array data
    Quicksort.quickSort(data, 0, size - 1);

    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}
Quicksort Complexity
Time Complexity	 
Best	O(n*log n)
Worst	O(n2)
Average	O(n*log n)
Space Complexity	O(log n)
Stability	No
1. Time Complexities
Worst Case Complexity [Big-O]: O(n2)
It occurs when the pivot element picked is either the greatest or the smallest element.

This condition leads to the case in which the pivot element lies in an extreme end of the sorted array. One sub-array is always empty and another sub-array contains n - 1 elements. Thus, quicksort is called only on this sub-array.

However, the quicksort algorithm has better performance for scattered pivots.
Best Case Complexity [Big-omega]: O(n*log n)
It occurs when the pivot element is always the middle element or near to the middle element.
Average Case Complexity [Big-theta]: O(n*log n)
It occurs when the above conditions do not occur.
2. Space Complexity
The space complexity for quicksort is O(log n).

Quicksort Applications
Quicksort algorithm is used when

the programming language is good for recursion
time complexity matters
space complexity matters
Similar Sorting Algorithms
Insertion Sort
Merge Sort
Selection Sort
Bucket Sort










Counting Sort Algorithm
In this tutorial, you will learn about the counting sort algorithm and its implementation in Python, Java, C, and C++.

Counting sort is a sorting algorithm that sorts the elements of an array by counting the number of occurrences of each unique element in the array. The count is stored in an auxiliary array and the sorting is done by mapping the count as an index of the auxiliary array.

Working of Counting Sort
Find out the maximum element (let it be max) from the given array.
Counting Sort steps
Given array
Initialize an array of length max+1 with all elements 0. This array is used for storing the count of the elements in the array.
Counting Sort Step
Count array
Store the count of each element at their respective index in count array

For example: if the count of element 3 is 2 then, 2 is stored in the 3rd position of count array. If element "5" is not present in the array, then 0 is stored in 5th position.
Counting Sort Step
Count of each element stored
Store cumulative sum of the elements of the count array. It helps in placing the elements into the correct index of the sorted array.
Counting Sort Step
Cumulative count
Find the index of each element of the original array in the count array. This gives the cumulative count. Place the element at the index calculated as shown in figure below.
Counting Sort Steps
Counting sort
After placing each element at its correct position, decrease its count by one.
Counting Sort Algorithm
countingSort(array, size)
  max <- find largest element in array
  initialize count array with all zeros
  for j <- 0 to size
    find the total count of each unique element and 
    store the count at jth index in count array
  for i <- 1 to max
    find the cumulative sum and store it in count array itself
  for j <- size down to 1
    restore the elements to array
    decrease count of each element restored by 1
Counting Sort Code in Python, Java, and C/C++
Python
Java
C
C++
# Counting sort in Python programming


def countingSort(array):
    size = len(array)
    output = [0] * size

    # Initialize count array
    count = [0] * 10

    # Store the count of each elements in count array
    for i in range(0, size):
        count[array[i]] += 1

    # Store the cummulative count
    for i in range(1, 10):
        count[i] += count[i - 1]

    # Find the index of each element of the original array in count array
    # place the elements in output array
    i = size - 1
    while i >= 0:
        output[count[array[i]] - 1] = array[i]
        count[array[i]] -= 1
        i -= 1

    # Copy the sorted elements into original array
    for i in range(0, size):
        array[i] = output[i]


data = [4, 2, 2, 8, 3, 3, 1]
countingSort(data)
print("Sorted Array in Ascending Order: ")
print(data)
Complexity
Time Complexity	 
Best	O(n+k)
Worst	O(n+k)
Average	O(n+k)
Space Complexity	O(max)
Stability	Yes
Time Complexities

There are mainly four main loops. (Finding the greatest value can be done outside the function.)

for-loop	time of counting
1st	O(max)
2nd	O(size)
3rd	O(max)
4th	O(size)
Overall complexity = O(max)+O(size)+O(max)+O(size) = O(max+size)

Worst Case Complexity: O(n+k)
Best Case Complexity: O(n+k)
Average Case Complexity: O(n+k)
In all the above cases, the complexity is the same because no matter how the elements are placed in the array, the algorithm goes through n+k times.

There is no comparison between any elements, so it is better than comparison based sorting techniques. But, it is bad if the integers are very large because the array of that size should be made.

Space Complexity

The space complexity of Counting Sort is O(max). Larger the range of elements, larger is the space complexity.

Counting Sort Applications
Counting sort is used when:

there are smaller integers with multiple counts.
linear complexity is the need.
Similar Sorting Algorithms
Quicksort
Merge Sort
Bucket Sort
Radix Sort












Radix Sort Algorithm
In this tutorial, you will learn about the radix sort algorithm and its implementation in Python, Java, C, and C++.

Radix sort is a sorting algorithm that sorts the elements by first grouping the individual digits of the same place value. Then, sort the elements according to their increasing/decreasing order.

Suppose, we have an array of 8 elements. First, we will sort elements based on the value of the unit place. Then, we will sort elements based on the value of the tenth place. This process goes on until the last significant place.

Let the initial array be [121, 432, 564, 23, 1, 45, 788]. It is sorted according to radix sort as shown in the figure below.

Radix Sort Working
Working of Radix Sort
Please go through the counting sort before reading this article because counting sort is used as an intermediate sort in radix sort.

Working of Radix Sort
Find the largest element in the array, i.e. max. Let X be the number of digits in max. X is calculated because we have to go through all the significant places of all elements.

In this array [121, 432, 564, 23, 1, 45, 788], we have the largest number 788. It has 3 digits. Therefore, the loop should go up to hundreds place (3 times).
Now, go through each significant place one by one.

Use any stable sorting technique to sort the digits at each significant place. We have used counting sort for this.

Sort the elements based on the unit place digits (X=0).
Radix Sort working with Counting Sort as intermediate step
Using counting sort to sort elements based on unit place
Now, sort the elements based on digits at tens place.
Radix Sort Step
Sort elements based on tens place
Finally, sort the elements based on the digits at hundreds place.
Selection Sort Step
Sort elements based on hundreds place
Radix Sort Algorithm
radixSort(array)
  d <- maximum number of digits in the largest element
  create d buckets of size 0-9
  for i <- 0 to d
    sort the elements according to ith place digits using countingSort

countingSort(array, d)
  max <- find largest element among dth place elements
  initialize count array with all zeros
  for j <- 0 to size
    find the total count of each unique digit in dth place of elements and
    store the count at jth index in count array
  for i <- 1 to max
    find the cumulative sum and store it in count array itself
  for j <- size down to 1
    restore the elements to array
    decrease count of each element restored by 1
Radix Sort Code in Python, Java, and C/C++
Python
Java
C
C++
// Radix Sort in Java Programming

import java.util.Arrays;

class RadixSort {

  // Using counting sort to sort the elements in the basis of significant places
  void countingSort(int array[], int size, int place) {
    int[] output = new int[size + 1];
    int max = array[0];
    for (int i = 1; i < size; i++) {
      if (array[i] > max)
        max = array[i];
    }
    int[] count = new int[max + 1];

    for (int i = 0; i < max; ++i)
      count[i] = 0;

    // Calculate count of elements
    for (int i = 0; i < size; i++)
      count[(array[i] / place) % 10]++;

    // Calculate cumulative count
    for (int i = 1; i < 10; i++)
      count[i] += count[i - 1];

    // Place the elements in sorted order
    for (int i = size - 1; i >= 0; i--) {
      output[count[(array[i] / place) % 10] - 1] = array[i];
      count[(array[i] / place) % 10]--;
    }

    for (int i = 0; i < size; i++)
      array[i] = output[i];
  }

  // Function to get the largest element from an array
  int getMax(int array[], int n) {
    int max = array[0];
    for (int i = 1; i < n; i++)
      if (array[i] > max)
        max = array[i];
    return max;
  }

  // Main function to implement radix sort
  void radixSort(int array[], int size) {
    // Get maximum element
    int max = getMax(array, size);

    // Apply counting sort to sort elements based on place value.
    for (int place = 1; max / place > 0; place *= 10)
      countingSort(array, size, place);
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = { 121, 432, 564, 23, 1, 45, 788 };
    int size = data.length;
    RadixSort rs = new RadixSort();
    rs.radixSort(data, size);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}
Radix Sort Complexity
Time Complexity	 
Best	O(n+k)
Worst	O(n+k)
Average	O(n+k)
Space Complexity	O(max)
Stability	Yes
Since radix sort is a non-comparative algorithm, it has advantages over comparative sorting algorithms.

For the radix sort that uses counting sort as an intermediate stable sort, the time complexity is O(d(n+k)).

Here, d is the number cycle and O(n+k) is the time complexity of counting sort.

Thus, radix sort has linear time complexity which is better than O(nlog n) of comparative sorting algorithms.

If we take very large digit numbers or the number of other bases like 32-bit and 64-bit numbers then it can perform in linear time however the intermediate sort takes large space.

This makes radix sort space inefficient. This is the reason why this sort is not used in software libraries.

Radix Sort Applications
Radix sort is implemented in

DC3 algorithm (Kärkkäinen-Sanders-Burkhardt) while making a suffix array.
places where there are numbers in large ranges.
Similar Sorting Algorithms
Quicksort
Merge Sort
Bucket Sort
Counting Sort







Bucket Sort Algorithm
In this tutorial, you will learn about the bucket sort algorithm and its implementation in Python, Java, C, and C++.

Bucket Sort is a sorting algorithm that divides the unsorted array elements into several groups called buckets. Each bucket is then sorted by using any of the suitable sorting algorithms or recursively applying the same bucket algorithm.

Finally, the sorted buckets are combined to form a final sorted array.

Scatter Gather Approach

The process of bucket sort can be understood as a scatter-gather approach. Here, elements are first scattered into buckets then the elements in each bucket are sorted. Finally, the elements are gathered in order.

Bucket Sort Working
Working of Bucket Sort
Working of Bucket Sort
Suppose, the input array is:
Bucket Sort Steps
Input array

Create an array of size 10. Each slot of this array is used as a bucket for storing elements.
Bucket Sort Steps
Array in which each position is a bucket
Insert elements into the buckets from the array. The elements are inserted according to the range of the bucket.

In our example code, we have buckets each of ranges from 0 to 1, 1 to 2, 2 to 3,...... (n-1) to n.
Suppose, an input element is .23 is taken. It is multiplied by size = 10 (ie. .23*10=2.3). Then, it is converted into an integer (ie. 2.3≈2). Finally, .23 is inserted into bucket-2.
Bucket Sort Steps
Insert elements into the buckets from the array

Similarly, .25 is also inserted into the same bucket. Everytime, the floor value of the floating point number is taken.

If we take integer numbers as input, we have to divide it by the interval (10 here) to get the floor value.

Similarly, other elements are inserted into their respective buckets.
Bucket Sort Steps
Insert all the elements into the buckets from the array
The elements of each bucket are sorted using any of the stable sorting algorithms. Here, we have used quicksort (inbuilt function).
Bucket Sort Steps
Sort the elements in each bucket
The elements from each bucket are gathered.

It is done by iterating through the bucket and inserting an individual element into the original array in each cycle. The element from the bucket is erased once it is copied into the original array.
Bucket Sort Steps
Gather elements from each bucket
Bucket Sort Algorithm
bucketSort()
  create N buckets each of which can hold a range of values
  for all the buckets
    initialize each bucket with 0 values
  for all the buckets
    put elements into buckets matching the range
  for all the buckets 
    sort elements in each bucket
  gather elements from each bucket
end bucketSort
Bucket Sort Code in Python, Java, and C/C++
Python
Java
C
C++
// Bucket sort in Java

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
  public void bucketSort(float[] arr, int n) {
    if (n <= 0)
      return;
    @SuppressWarnings("unchecked")
    ArrayList<Float>[] bucket = new ArrayList[n];

    // Create empty buckets
    for (int i = 0; i < n; i++)
      bucket[i] = new ArrayList<Float>();

    // Add elements into the buckets
    for (int i = 0; i < n; i++) {
      int bucketIndex = (int) arr[i] * n;
      bucket[bucketIndex].add(arr[i]);
    }

    // Sort the elements of each bucket
    for (int i = 0; i < n; i++) {
      Collections.sort((bucket[i]));
    }

    // Get the sorted array
    int index = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0, size = bucket[i].size(); j < size; j++) {
        arr[index++] = bucket[i].get(j);
      }
    }
  }

  // Driver code
  public static void main(String[] args) {
    BucketSort b = new BucketSort();
    float[] arr = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
        (float) 0.51 };
    b.bucketSort(arr, 7);

    for (float i : arr)
      System.out.print(i + "  ");
  }
}
Bucket Sort Complexity
Time Complexity	 
Best	O(n+k)
Worst	O(n2)
Average	O(n)
Space Complexity	O(n+k)
Stability	Yes
Worst Case Complexity: O(n2)
When there are elements of close range in the array, they are likely to be placed in the same bucket. This may result in some buckets having more number of elements than others.
It makes the complexity depend on the sorting algorithm used to sort the elements of the bucket.
The complexity becomes even worse when the elements are in reverse order. If insertion sort is used to sort elements of the bucket, then the time complexity becomes O(n2).
Best Case Complexity: O(n+k)
It occurs when the elements are uniformly distributed in the buckets with a nearly equal number of elements in each bucket.
The complexity becomes even better if the elements inside the buckets are already sorted.
If insertion sort is used to sort elements of a bucket then the overall complexity in the best case will be linear ie. O(n+k). O(n) is the complexity for making the buckets and O(k) is the complexity for sorting the elements of the bucket using algorithms having linear time complexity at the best case.
Average Case Complexity: O(n)
It occurs when the elements are distributed randomly in the array. Even if the elements are not distributed uniformly, bucket sort runs in linear time. It holds true until the sum of the squares of the bucket sizes is linear in the total number of elements.
Bucket Sort Applications
Bucket sort is used when:

input is uniformly distributed over a range.
there are floating point values









Heap Sort Algorithm
In this tutorial, you will learn about the heap sort algorithm and its implementation in Python, Java, C, and C++.

Heap Sort is a popular and efficient sorting algorithm in computer programming. Learning how to write the heap sort algorithm requires knowledge of two types of data structures - arrays and trees.

The initial set of numbers that we want to sort is stored in an array e.g. [10, 3, 76, 34, 23, 32] and after sorting, we get a sorted array [3,10,23,32,34,76].

Heap sort works by visualizing the elements of the array as a special kind of complete binary tree called a heap.

Note: As a prerequisite, you must know about a complete binary tree and heap data structure.

Relationship between Array Indexes and Tree Elements
A complete binary tree has an interesting property that we can use to find the children and parents of any node.

If the index of any element in the array is i, the element in the index 2i+1 will become the left child and element in 2i+2 index will become the right child. Also, the parent of any element at index i is given by the lower bound of (i-1)/2.

on the left, there is a graph and on the right there is an array representation of the same graph to compare equivalent indices
Relationship between array and heap indices
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

What is Heap Data Structure?
Heap is a special tree-based data structure. A binary tree is said to follow a heap data structure if

it is a complete binary tree
All nodes in the tree follow the property that they are greater than their children i.e. the largest element is at the root and both its children and smaller than the root and so on. Such a heap is called a max-heap. If instead, all nodes are smaller than their children, it is called a min-heap
The following example diagram shows Max-Heap and Min-Heap.

max heap min heap comparison
Max Heap and Min Heap
To learn more about it, please visit Heap Data Structure.

How to "heapify" a tree
Starting from a complete binary tree, we can modify it to become a Max-Heap by running a function called heapify on all the non-leaf elements of the heap.

Since heapify uses recursion, it can be difficult to grasp. So let''s first think about how you would heapify a tree with just three elements.

heapify(array)
    Root = array[0]
    Largest = largest( array[0] , array [2*0 + 1]. array[2*0+2])
    if(Root != Largest)
          Swap(Root, Largest)
graph shows how base case of heapify works
Heapify base cases
The example above shows two scenarios - one in which the root is the largest element and we don't need to do anything. And another in which the root had a larger element as a child and we needed to swap to maintain max-heap property.

If you're worked with recursive algorithms before, you've probably identified that this must be the base case.

Now let's think of another scenario in which there is more than one level.

image showing tree data with root element containing two max-heap subtrees
How to heapify root element when its subtrees are already max heaps
The top element isn''t a max-heap but all the sub-trees are max-heaps.

To maintain the max-heap property for the entire tree, we will have to keep pushing 2 downwards until it reaches its correct position.

steps to heapify root element when both of its subtrees are already max-heaps
How to heapify root element when its subtrees are max-heaps
Thus, to maintain the max-heap property in a tree where both sub-trees are max-heaps, we need to run heapify on the root element repeatedly until it is larger than its children or it becomes a leaf node.

We can combine both these conditions in one heapify function as

void heapify(int arr[], int n, int i) {
  // Find largest among root, left child and right child
  int largest = i;
  int left = 2 * i + 1;
  int right = 2 * i + 2;

  if (left < n && arr[left] > arr[largest])
    largest = left;

  if (right < n && arr[right] > arr[largest])
    largest = right;

    // Swap and continue heapifying if root is not largest
    if (largest != i) {
      swap(&arr[i], &arr[largest]);
      heapify(arr, n, largest);
  }
}
This function works for both the base case and for a tree of any size. We can thus move the root element to the correct position to maintain the max-heap status for any tree size as long as the sub-trees are max-heaps.

Build max-heap
To build a max-heap from any tree, we can thus start heapifying each sub-tree from the bottom up and end up with a max-heap after the function is applied to all the elements including the root element.

In the case of a complete tree, the first index of a non-leaf node is given by n/2 - 1. All other nodes after that are leaf-nodes and thus don't need to be heapified.

'So, we can build a maximum heap as

    // Build heap (rearrange array)
    for (int i = n / 2 - 1; i >= 0; i--)
      heapify(arr, n, i);
steps to build max heap for heap sort
Create array and calculate i
steps to build max heap for heap sort
Steps to build max heap for heap sort
steps to build max heap for heap sort
Steps to build max heap for heap sort
steps to build max heap for heap sort
Steps to build max heap for heap sort
As shown in the above diagram, we start by heapifying the lowest smallest trees and gradually move up until we reach the root element.

If you''ve understood everything till here, congratulations, you are on your way to mastering the Heap sort.

Working of Heap Sort
Since the tree satisfies Max-Heap property, then the largest item is stored at the root node.
Swap: Remove the root element and put at the end of the array (nth position) Put the last item of the tree (heap) at the vacant place.
Remove: Reduce the size of the heap by 1.
Heapify: Heapify the root element again so that we have the highest element at root.
The process is repeated until all the items of the list are sorted.
procedures for implementing heap sort
Swap, Remove, and Heapify
The code below shows the operation.

    // Heap sort
    for (int i = n - 1; i >= 0; i--) {
      swap(&arr[0], &arr[i]);

      // Heapify root element to get highest element at root again
      heapify(arr, i, 0);
    }
Heap Sort Code in Python, Java, and C/C++
Python
Java
C
C++
// Heap Sort in Java
  
  public class HeapSort {
  
    public void sort(int arr[]) {
      int n = arr.length;
  
      // Build max heap
      for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
      }
  
      // Heap sort
      for (int i = n - 1; i >= 0; i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
  
        // Heapify root element
        heapify(arr, i, 0);
      }
    }
  
    void heapify(int arr[], int n, int i) {
      // Find largest among root, left child and right child
      int largest = i;
      int l = 2 * i + 1;
      int r = 2 * i + 2;
  
      if (l < n && arr[l] > arr[largest])
        largest = l;
  
      if (r < n && arr[r] > arr[largest])
        largest = r;
  
      // Swap and continue heapifying if root is not largest
      if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
  
        heapify(arr, n, largest);
      }
    }
  
    // Function to print an array
    static void printArray(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
      System.out.println();
    }
  
    // Driver code
    public static void main(String args[]) {
      int arr[] = { 1, 12, 9, 5, 6, 10 };
  
      HeapSort hs = new HeapSort();
      hs.sort(arr);
  
      System.out.println("Sorted array is");
      printArray(arr);
    }
  }
Heap Sort Complexity
Time Complexity	 
Best	O(nlog n)
Worst	O(nlog n)
Average	O(nlog n)
Space Complexity	O(1)
Stability	No
Heap Sort has O(nlog n) time complexities for all the cases ( best case, average case, and worst case).

Let us understand the reason why. The height of a complete binary tree containing n elements is log n

As we have seen earlier, to fully heapify an element whose subtrees are already max-heaps, we need to keep comparing the element with its left and right children and pushing it downwards until it reaches a point where both its children are smaller than it.

In the worst case scenario, we will need to move an element from the root to the leaf node making a multiple of log(n) comparisons and swaps.

During the build_max_heap stage, we do that for n/2 elements so the worst case complexity of the build_heap step is n/2*log n ~ nlog n.

During the sorting step, we exchange the root element with the last element and heapify the root element. For each element, this again takes log n worst time because we might have to bring the element all the way from the root to the leaf. Since we repeat this n times, the heap_sort step is also nlog n.

Also since the build_max_heap and heap_sort steps are executed one after another, the algorithmic complexity is not multiplied and it remains in the order of nlog n.

Also it performs sorting in O(1) space complexity. Compared with Quick Sort, it has a better worst case ( O(nlog n) ). Quick Sort has complexity O(n^2) for worst case. But in other cases, Quick Sort is fast. Introsort is an alternative to heapsort that combines quicksort and heapsort to retain advantages of both: worst case speed of heapsort and average speed of quicksort.

Heap Sort Applications
Systems concerned with security and embedded systems such as Linux Kernel use Heap Sort because of the O(n log n) upper bound on Heapsort's running time and constant O(1) upper bound on its auxiliary storage.

'Although Heap Sort has O(n log n) time complexity even for the worst case, it doesn't have more applications ( compared to other sorting algorithms like Quick Sort, Merge Sort ). However, its underlying data structure, heap, can be efficiently used if we want to extract the smallest (or largest) from the list of items without the overhead of keeping the remaining items in the sorted order. For e.g Priority Queues.












Shell Sort Algorithm
In this tutorial, you will learn about the shell sort algorithm and its implementation in Python, Java, C, and C++.

Shell sort is a generalized version of the insertion sort algorithm. It first sorts elements that are far apart from each other and successively reduces the interval between the elements to be sorted.

The interval between the elements is reduced based on the sequence used. Some of the optimal sequences that can be used in the shell sort algorithm are:

Shell's original sequence: N/2 , N/4 , …, 1
Knuth's increments: 1, 4, 13, …, (3k – 1) / 2
Sedgewick's increments: 1, 8, 23, 77, 281, 1073, 4193, 16577...4j+1+ 3·2j+ 1
Hibbard's increments: 1, 3, 7, 15, 31, 63, 127, 255, 511…
Papernov & Stasevich increment: 1, 3, 5, 9, 17, 33, 65,...
Pratt: 1, 2, 3, 4, 6, 9, 8, 12, 18, 27, 16, 24, 36, 54, 81....
Note: The performance of the shell sort depends on the type of sequence used for a given input array.

Working of Shell Sort
Suppose, we need to sort the following array.
Shell sort step
Initial array
We are using the shell's original sequence (N/2, N/4, ...1) as intervals in our algorithm.

In the first loop, if the array size is N = 8 then, the elements lying at the interval of N/2 = 4 are compared and swapped if they are not in order.
The 0th element is compared with the 4th element.
If the 0th element is greater than the 4th one then, the 4th element is first stored in temp variable and the 0th element (ie. greater element) is stored in the 4th position and the element stored in temp is stored in the 0th position.
Shell Sort step
Rearrange the elements at n/2 interval

This process goes on for all the remaining elements.
Shell Sort steps
Rearrange all the elements at n/2 interval
In the second loop, an interval of N/4 = 8/4 = 2 is taken and again the elements lying at these intervals are sorted.
Shell Sort step
Rearrange the elements at n/4 interval

You might get confused at this point.
Shell Sort step
All the elements in the array lying at the current interval are compared.

The elements at 4th and 2nd position are compared. The elements at 2nd and 0th position are also compared. All the elements in the array lying at the current interval are compared.
The same process goes on for remaining elements.
Shell Sort step
Rearrange all the elements at n/4 interval
Finally, when the interval is N/8 = 8/8 =1 then the array elements lying at the interval of 1 are sorted. The array is now completely sorted.
Shell Sort step
Rearrange the elements at n/8 interval
Shell Sort Algorithm
shellSort(array, size)
  for interval i <- size/2n down to 1
    for each interval "i" in array
        sort all the elements at interval "i"
end shellSort
Shell Sort Code in Python, Java, and C/C++
Python
Java
C
C++
// Shell sort in Java programming

import java.util.Arrays;

// Shell sort
class ShellSort {

  // Rearrange elements at each n/2, n/4, n/8, ... intervals
  void shellSort(int array[], int n) {
  for (int interval = n / 2; interval > 0; interval /= 2) {
    for (int i = interval; i < n; i += 1) {
    int temp = array[i];
    int j;
    for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
      array[j] = array[j - interval];
    }
    array[j] = temp;
    }
  }
  }

  // Driver code
  public static void main(String args[]) {
  int[] data = { 9, 8, 3, 7, 5, 6, 4, 1 };
  int size = data.length;
  ShellSort ss = new ShellSort();
  ss.shellSort(data, size);
  System.out.println("Sorted Array in Ascending Order: ");
  System.out.println(Arrays.toString(data));
  }
}
Shell Sort Complexity
Time Complexity	 
Best	O(nlog n)
Worst	O(n2)
Average	O(nlog n)
Space Complexity	O(1)
Stability	No
Shell sort is an unstable sorting algorithm because this algorithm does not examine the elements lying in between the intervals.

Time Complexity
Worst Case Complexity: less than or equal to O(n2)
Worst case complexity for shell sort is always less than or equal to O(n2).

According to Poonen Theorem, worst case complexity for shell sort is Θ(Nlog N)2/(log log N)2) or Θ(Nlog N)2/log log N) or Θ(N(log N)2) or something in between.
Best Case Complexity: O(n*log n)
When the array is already sorted, the total number of comparisons for each interval (or increment) is equal to the size of the array.
Average Case Complexity: O(n*log n)
It is around O(n1.25).
The complexity depends on the interval chosen. The above complexities differ for different increment sequences chosen. Best increment sequence is unknown.

Space Complexity:
The space complexity for shell sort is O(1).

Shell Sort Applications
Shell sort is used when:

calling a stack is overhead. uClibc library uses this sort.
recursion exceeds a limit. bzip2 compressor uses it.
Insertion sort does not perform well when the close elements are far apart. Shell sort helps in reducing the distance between the close elements. Thus, there will be less number of swappings to be performed.







Linear Search
In this tutorial, you will learn about linear search. Also, you will find working examples of linear search C, C++, Java and Python.

Linear search is a sequential searching algorithm where we start from one end and check every element of the list until the desired element is found. It is the simplest searching algorithm.

How Linear Search Works?
The following steps are followed to search for an element k = 1 in the list below.

Initial array
Array to be searched for
Start from the first element, compare k with each element x.
Element not found
Compare with each element
If x == k, return the index.
Element found
Element found
Else, return not found.
Linear Search Algorithm
LinearSearch(array, key)
  for each item in the array
    if item == value
      return its index
Python, Java and C/C++ Examples
Python
Java
C
C++
// Linear Search in Java

class LinearSearch {
  public static int linearSearch(int array[], int x) {
  int n = array.length;

  // Going through array sequencially
  for (int i = 0; i < n; i++) {
    if (array[i] == x)
    return i;
  }
  return -1;
  }

  public static void main(String args[]) {
  int array[] = { 2, 4, 0, 1, 9 };
  int x = 1;

  int result = linearSearch(array, x);

  if (result == -1)
    System.out.print("Element not found");
  else
    System.out.print("Element found at index: " + result);
  }
}
Linear Search Complexities
Time Complexity: O(n)

Space Complexity: O(1)

Linear Search Applications
For searching operations in smaller arrays (<100 items).







Binary Search
In this tutorial, you will learn how Binary Search sort works. Also, you will find working examples of Binary Search in C, C++, Java and Python.

Binary Search is a searching algorithm for finding an element's position in a sorted array.


'In this approach, the element is always searched in the middle of a portion of an array.

Binary search can be implemented only on a sorted list of items. If the elements are not sorted already, we need to sort them first.

Binary Search Working
Binary Search Algorithm can be implemented in two ways which are discussed below.

Iterative Method
Recursive Method
The recursive method follows the divide and conquer approach.

The general steps for both methods are discussed below.

The array in which searching is to be performed is:
initial array Binary Search
Initial array

Let x = 4 be the element to be searched.
Set two pointers low and high at the lowest and the highest positions respectively.
setting pointers Binary Search
Setting pointers
Find the middle element mid of the array ie. arr[(low + high)/2] = 6.
mid element Binary Search
Mid element
If x == mid, then return mid.Else, compare the element to be searched with m.
If x > mid, compare x with the middle element of the elements on the right side of mid. This is done by setting low to low = mid + 1.
Else, compare x with the middle element of the elements on the left side of mid. This is done by setting high to high = mid - 1.
finding mid element Binary Search
Finding mid element
Repeat steps 3 to 6 until low meets high.
mid element Binary Search
Mid element
x = 4 is found.
found Binary Search
Found
Binary Search Algorithm
Iteration Method
do until the pointers low and high meet each other.
    mid = (low + high)/2
    if (x == arr[mid])
        return mid
    else if (x > arr[mid]) // x is on the right side
        low = mid + 1
    else                       // x is on the left side
        high = mid - 1
Recursive Method
binarySearch(arr, x, low, high)
    if low > high
        return False 
    else
        mid = (low + high) / 2 
        if x == arr[mid]
            return mid
        else if x > arr[mid]        // x is on the right side
            return binarySearch(arr, x, mid + 1, high)
        else                               // x is on the right side
            return binarySearch(arr, x, low, mid - 1)
Python, Java, C/C++ Examples (Iterative Method)
Python
Java
C
C++
// Binary Search in Java

class BinarySearch {
  int binarySearch(int array[], int x, int low, int high) {

    // Repeat until the pointers low and high meet each other
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (array[mid] == x)
        return mid;

      if (array[mid] < x)
        low = mid + 1;

      else
        high = mid - 1;
    }

    return -1;
  }

  public static void main(String args[]) {
    BinarySearch ob = new BinarySearch();
    int array[] = { 3, 4, 5, 6, 7, 8, 9 };
    int n = array.length;
    int x = 4;
    int result = ob.binarySearch(array, x, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}
Python, Java, C/C++ Examples (Recursive Method)
Python
Java
C
C++
// Binary Search in Java

class BinarySearch {
  int binarySearch(int array[], int x, int low, int high) {

    if (high >= low) {
      int mid = low + (high - low) / 2;

      // If found at mid, then return it
      if (array[mid] == x)
        return mid;

      // Search the left half
      if (array[mid] > x)
        return binarySearch(array, x, low, mid - 1);

      // Search the right half
      return binarySearch(array, x, mid + 1, high);
    }

    return -1;
  }

  public static void main(String args[]) {
    BinarySearch ob = new BinarySearch();
    int array[] = { 3, 4, 5, 6, 7, 8, 9 };
    int n = array.length;
    int x = 4;
    int result = ob.binarySearch(array, x, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}
Binary Search Complexity
Time Complexities

Best case complexity: O(1)
Average case complexity: O(log n)
Worst case complexity: O(log n)
Space Complexity

The space complexity of the binary search is O(1).

Binary Search Applications
In libraries of Java, .Net, C++ STL
While debugging, the binary search is used to pinpoint the place where the error happens.





Greedy Algorithm
In this tutorial, you will learn what a Greedy Algorithm is. Also, you will find an example of a greedy approach.

A greedy algorithm is an approach for solving a problem by selecting the best option available at the moment. It doesn't worry whether the current best result will bring the overall optimal result.

The algorithm never reverses the earlier decision even if the choice is wrong. It works in a top-down approach.

This algorithm may not produce the best result for all the problems. It's because it always goes for the local best choice to produce the global best result.

However, we can determine if the algorithm can be used with any problem if the problem has the following properties:

1. Greedy Choice Property

If an optimal solution to the problem can be found by choosing the best choice at each step without reconsidering the previous steps once chosen, the problem can be solved using a greedy approach. This property is called greedy choice property.

2. Optimal Substructure

If the optimal overall solution to the problem corresponds to the optimal solution to its subproblems, then the problem can be solved using a greedy approach. This property is called optimal substructure.

Advantages of Greedy Approach
The algorithm is easier to describe.
This algorithm can perform better than other algorithms (but, not in all cases).
Drawback of Greedy Approach
As mentioned earlier, the greedy algorithm doesn't always produce the optimal solution. This is the major disadvantage of the algorithm

For example, suppose we want to find the longest path in the graph below from root to leaf. Let's use the greedy algorithm here.

Apply greedy approach to this tree to find the longest route
Apply greedy approach to this tree to find the longest route
Greedy Approach

1. Let's start with the root node 20. The weight of the right child is 3 and the weight of the left child is 2.

2. Our problem is to find the largest path. And, the optimal solution at the moment is 3. So, the greedy algorithm will choose 3.

3. Finally the weight of an only child of 3 is 1. This gives us our final result 20 + 3 + 1 = 24.

However, it is not the optimal solution. There is another path that carries more weight (20 + 2 + 10 = 32) as shown in the image below.

Longest path
Longest path
Therefore, greedy algorithms do not always give an optimal/feasible solution.

Greedy Algorithm
To begin with, the solution set (containing answers) is empty.
At each step, an item is added to the solution set until a solution is reached.
If the solution set is feasible, the current item is kept.
Else, the item is rejected and never considered again.
Let's now use this algorithm to solve a problem.

Example - Greedy Approach
Problem: You have to make a change of an amount using the smallest possible number of coins.
Amount: $18

Available coins are
  $5 coin
  $2 coin
  $1 coin
There is no limit to the number of each coin you can use.
Solution:

Create an empty solution-set = { }. Available coins are {5, 2, 1}.
We are supposed to find the sum = 18. Let's start with sum = 0.
Always select the coin with the largest value (i.e. 5) until the sum > 18. (When we select the largest value at each step, we hope to reach the destination faster. This concept is called greedy choice property.)
In the first iteration, solution-set = {5} and sum = 5.
In the second iteration, solution-set = {5, 5} and sum = 10.
In the third iteration, solution-set = {5, 5, 5} and sum = 15.
In the fourth iteration, solution-set = {5, 5, 5, 2} and sum = 17. (We cannot select 5 here because if we do so, sum = 20 which is greater than 18. So, we select the 2nd largest item which is 2.)
Similarly, in the fifth iteration, select 1. Now sum = 18 and solution-set = {5, 5, 5, 2, 1}.
Different Types of Greedy Algorithm
Selection Sort
Knapsack Problem
Minimum Spanning Tree
Single-Source Shortest Path Problem
Job Scheduling Problem
Prim's Minimal Spanning Tree Algorithm
Kruskal's Minimal Spanning Tree Algorithm
Dijkstra's Minimal Spanning Tree Algorithm
Huffman Coding
Ford-Fulkerson Algorithm







Ford-Fulkerson Algorithm
In this tutorial, you will learn what Ford-Fulkerson algorithm is. Also, you will find working examples of finding maximum flow in a flow network in C, C++, Java and Python.

Ford-Fulkerson algorithm is a greedy approach for calculating the maximum possible flow in a network or a graph.

A term, flow network, is used to describe a network of vertices and edges with a source (S) and a sink (T). Each vertex, except S and T, can receive and send an equal amount of stuff through it. S can only send and T can only receive stuff.

We can visualize the understanding of the algorithm using a flow of liquid inside a network of pipes of different capacities. Each pipe has a certain capacity of liquid it can transfer at an instance. For this algorithm, we are going to find how much liquid can be flowed from the source to the sink at an instance using the network.

Flow network
Flow network graph
Terminologies Used
Augmenting Path
It is the path available in a flow network.

Residual Graph
It represents the flow network that has additional possible flow.

Residual Capacity
It is the capacity of the edge after subtracting the flow from the maximum capacity.

How Ford-Fulkerson Algorithm works?
The algorithm follows:

Initialize the flow in all the edges to 0.
While there is an augmenting path between the source and the sink, add this path to the flow.
Update the residual graph.
We can also consider reverse-path if required because if we do not consider them, we may never find a maximum flow.

The above concepts can be understood with the example below.

Ford-Fulkerson Example
The flow of all the edges is 0 at the beginning.

Flow network
Flow network graph example
Select any arbitrary path from S to T. In this step, we have selected path S-A-B-T.
Find a path
Find a path

The minimum capacity among the three edges is 2 (B-T). Based on this, update the flow/capacity for each path.
Update the capacities
Update the capacities
Select another path S-D-C-T. The minimum capacity among these edges is 3 (S-D).
Find next path
Find next path

Update the capacities according to this.
Update the capacities
Update the capacities
Now, let us consider the reverse-path B-D as well. Selecting path S-A-B-D-C-T. The minimum residual capacity among the edges is 1 (D-C).
Find next path
Find next path

Updating the capacities.
Update the capacities
Update the capacities

The capacity for forward and reverse paths are considered separately.
Adding all the flows = 2 + 3 + 1 = 6, which is the maximum possible flow on the flow network.
Note that if the capacity for any edge is full, then that path cannot be used.

Python, Java and C/C++ Examples
Python
Java
C
C++
// Ford-Fulkerson algorith in Java

import java.util.LinkedList;

class FordFulkerson {
  static final int V = 6;

  // Using BFS as a searching algorithm 
  boolean bfs(int Graph[][], int s, int t, int p[]) {
    boolean visited[] = new boolean[V];
    for (int i = 0; i < V; ++i)
      visited[i] = false;

    LinkedList<Integer> queue = new LinkedList<Integer>();
    queue.add(s);
    visited[s] = true;
    p[s] = -1;

    while (queue.size() != 0) {
      int u = queue.poll();

      for (int v = 0; v < V; v++) {
        if (visited[v] == false && Graph[u][v] > 0) {
          queue.add(v);
          p[v] = u;
          visited[v] = true;
        }
      }
    }

    return (visited[t] == true);
  }

  // Applying fordfulkerson algorithm
  int fordFulkerson(int graph[][], int s, int t) {
    int u, v;
    int Graph[][] = new int[V][V];

    for (u = 0; u < V; u++)
      for (v = 0; v < V; v++)
        Graph[u][v] = graph[u][v];

    int p[] = new int[V];

    int max_flow = 0;

    # Updating the residual calues of edges
    while (bfs(Graph, s, t, p)) {
      int path_flow = Integer.MAX_VALUE;
      for (v = t; v != s; v = p[v]) {
        u = p[v];
        path_flow = Math.min(path_flow, Graph[u][v]);
      }

      for (v = t; v != s; v = p[v]) {
        u = p[v];
        Graph[u][v] -= path_flow;
        Graph[v][u] += path_flow;
      }

      // Adding the path flows
      max_flow += path_flow;
    }

    return max_flow;
  }

  public static void main(String[] args) throws java.lang.Exception {
    int graph[][] = new int[][] { { 0, 8, 0, 0, 3, 0 }, { 0, 0, 9, 0, 0, 0 }, { 0, 0, 0, 0, 7, 2 },
        { 0, 0, 0, 0, 0, 5 }, { 0, 0, 7, 4, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
    FordFulkerson m = new FordFulkerson();

    System.out.println("Max Flow: " + m.fordFulkerson(graph, 0, 5));

  }
}
Ford-Fulkerson Applications
Water distribution pipeline
Bipartite matching problem
Circulation with demands











Dijkstra's Algorithm
Dijkstra's algorithm allows us to find the shortest path between any two vertices of a graph.

It differs from the minimum spanning tree because the shortest distance between two vertices might not include all the vertices of the graph.

How Dijkstra's Algorithm works
Dijkstra's Algorithm works on the basis that any subpath B -> D of the shortest path A -> D between vertices A and D is also the shortest path between vertices B and D.

shortest subpath property is used by dijkstra's algorithm
Each subpath is the shortest path
Djikstra used this property in the opposite direction i.e we overestimate the distance of each vertex from the starting vertex. Then we visit each node and its neighbors to find the shortest subpath to those neighbors.

The algorithm uses a greedy approach in the sense that we find the next best solution hoping that the end result is the best solution for the whole problem.

Example of Dijkstra's algorithm
It is easier to start with an example and then think about the algorithm.

Start with a weighted graph
Start with a weighted graph
Choose a starting vertex and assign infinity path values to all other devices
Choose a starting vertex and assign infinity path values to all other devices
Go to each vertex and update its path length
Go to each vertex and update its path length
If the path length of the adjacent vertex is lesser than new path length, don't update it
If the path length of the adjacent vertex is lesser than new path length, don't update it
Avoid updating path lengths of already visited vertices
Avoid updating path lengths of already visited vertices
After each iteration, we pick the unvisited vertex with the least path length. So we choose 5 before 7
After each iteration, we pick the unvisited vertex with the least path length. So we choose 5 before 7
Notice how the rightmost vertex has its path length updated twice
Notice how the rightmost vertex has its path length updated twice
Repeat until all the vertices have been visited
Repeat until all the vertices have been visited
Djikstra's algorithm pseudocode
We need to maintain the path distance of every vertex. We can store that in an array of size v, where v is the number of vertices.

We also want to be able to get the shortest path, not only know the length of the shortest path. For this, we map each vertex to the vertex that last updated its path length.

Once the algorithm is over, we can backtrack from the destination vertex to the source vertex to find the path.

A minimum priority queue can be used to efficiently receive the vertex with least path distance.

function dijkstra(G, S)
    for each vertex V in G
        distance[V] <- infinite
        previous[V] <- NULL
        If V != S, add V to Priority Queue Q
    distance[S] <- 0
	
    while Q IS NOT EMPTY
        U <- Extract MIN from Q
        for each unvisited neighbour V of U
            tempDistance <- distance[U] + edge_weight(U, V)
            if tempDistance < distance[V]
                distance[V] <- tempDistance
                previous[V] <- U
    return distance[], previous[]
Code for Dijkstra's Algorithm
The implementation of Dijkstra's Algorithm in C++ is given below. The complexity of the code can be improved, but the abstractions are convenient to relate the code with the algorithm.

Python
Java
C
C++
// Dijkstra's Algorithm in Java

public class Dijkstra {

  public static void dijkstra(int[][] graph, int source) {
    int count = graph.length;
    boolean[] visitedVertex = new boolean[count];
    int[] distance = new int[count];
    for (int i = 0; i < count; i++) {
      visitedVertex[i] = false;
      distance[i] = Integer.MAX_VALUE;
    }

    // Distance of self loop is zero
    distance[source] = 0;
    for (int i = 0; i < count; i++) {

      // Update the distance between neighbouring vertex and source vertex
      int u = findMinDistance(distance, visitedVertex);
      visitedVertex[u] = true;

      // Update all the neighbouring vertex distances
      for (int v = 0; v < count; v++) {
        if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
          distance[v] = distance[u] + graph[u][v];
        }
      }
    }
    for (int i = 0; i < distance.length; i++) {
      System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
    }

  }

  // Finding the minimum distance
  private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
    int minDistance = Integer.MAX_VALUE;
    int minDistanceVertex = -1;
    for (int i = 0; i < distance.length; i++) {
      if (!visitedVertex[i] && distance[i] < minDistance) {
        minDistance = distance[i];
        minDistanceVertex = i;
      }
    }
    return minDistanceVertex;
  }

  public static void main(String[] args) {
    int graph[][] = new int[][] { { 0, 0, 1, 2, 0, 0, 0 }, { 0, 0, 2, 0, 0, 3, 0 }, { 1, 2, 0, 1, 3, 0, 0 },
        { 2, 0, 1, 0, 0, 0, 1 }, { 0, 0, 3, 0, 0, 2, 0 }, { 0, 3, 0, 0, 2, 0, 1 }, { 0, 0, 0, 1, 0, 1, 0 } };
    Dijkstra T = new Dijkstra();
    T.dijkstra(graph, 0);
  }
}
Dijkstra's Algorithm Complexity
Time Complexity: O(E Log V)

where, E is the number of edges and V is the number of vertices.

Space Complexity: O(V)

Dijkstra's Algorithm Applications
To find the shortest path
In social networking applications
In a telephone network
To find the locations in the map









Kruskal's Algorithm
In this tutorial, you will learn how Kruskal's Algorithmworks. Also, you will find working examples of Kruskal's Algorithm in C, C++, Java and Python.

Kruskal's algorithm is a minimum spanning tree algorithm that takes a graph as input and finds the subset of the edges of that graph which

form a tree that includes every vertex
has the minimum sum of weights among all the trees that can be formed from the graph
How Kruskal's algorithm works
It falls under a class of algorithms called greedy algorithms that find the local optimum in the hopes of finding a global optimum.

We start from the edges with the lowest weight and keep adding edges until we reach our goal.

The steps for implementing Kruskal's algorithm are as follows:

Sort all the edges from low weight to high
Take the edge with the lowest weight and add it to the spanning tree. If adding the edge created a cycle, then reject this edge.
Keep adding edges until we reach all vertices.
Example of Kruskal's algorithm
Start with a weighted graph
Start with a weighted graph
Choose the edge with the least weight, if there are more than 1, choose anyone
Choose the edge with the least weight, if there are more than 1, choose anyone
Choose the next shortest edge and add it
Choose the next shortest edge and add it
Choose the next shortest edge that doesn't create a cycle and add it
Choose the next shortest edge that doesn't create a cycle and add it
Choose the next shortest edge that doesn't create a cycle and add it
Choose the next shortest edge that doesn't create a cycle and add it
Repeat until you have a spanning tree
Repeat until you have a spanning tree
Kruskal Algorithm Pseudocode
Any minimum spanning tree algorithm revolves around checking if adding an edge creates a loop or not.

The most common way to find this out is an algorithm called Union FInd. The Union-Find algorithm divides the vertices into clusters and allows us to check if two vertices belong to the same cluster or not and hence decide whether adding an edge creates a cycle.

KRUSKAL(G):
A = ∅
For each vertex v ∈ G.V:
    MAKE-SET(v)
For each edge (u, v) ∈ G.E ordered by increasing order by weight(u, v):
    if FIND-SET(u) ≠ FIND-SET(v):       
    A = A ∪ {(u, v)}
    UNION(u, v)
return A
Python, Java and C/C++ Examples
Python
Java
C
C++
// Kruskal's algorithm in Java

import java.util.*;

class Graph {
  class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public int compareTo(Edge compareEdge) {
      return this.weight - compareEdge.weight;
    }
  };

  // Union
  class subset {
    int parent, rank;
  };

  int vertices, edges;
  Edge edge[];

  // Graph creation
  Graph(int v, int e) {
    vertices = v;
    edges = e;
    edge = new Edge[edges];
    for (int i = 0; i < e; ++i)
      edge[i] = new Edge();
  }

  int find(subset subsets[], int i) {
    if (subsets[i].parent != i)
      subsets[i].parent = find(subsets, subsets[i].parent);
    return subsets[i].parent;
  }

  void Union(subset subsets[], int x, int y) {
    int xroot = find(subsets, x);
    int yroot = find(subsets, y);

    if (subsets[xroot].rank < subsets[yroot].rank)
      subsets[xroot].parent = yroot;
    else if (subsets[xroot].rank > subsets[yroot].rank)
      subsets[yroot].parent = xroot;
    else {
      subsets[yroot].parent = xroot;
      subsets[xroot].rank++;
    }
  }

  // Applying Krushkal Algorithm
  void KruskalAlgo() {
    Edge result[] = new Edge[vertices];
    int e = 0;
    int i = 0;
    for (i = 0; i < vertices; ++i)
      result[i] = new Edge();

    // Sorting the edges
    Arrays.sort(edge);
    subset subsets[] = new subset[vertices];
    for (i = 0; i < vertices; ++i)
      subsets[i] = new subset();

    for (int v = 0; v < vertices; ++v) {
      subsets[v].parent = v;
      subsets[v].rank = 0;
    }
    i = 0;
    while (e < vertices - 1) {
      Edge next_edge = new Edge();
      next_edge = edge[i++];
      int x = find(subsets, next_edge.src);
      int y = find(subsets, next_edge.dest);
      if (x != y) {
        result[e++] = next_edge;
        Union(subsets, x, y);
      }
    }
    for (i = 0; i < e; ++i)
      System.out.println(result[i].src + " - " + result[i].dest + ": " + result[i].weight);
  }

  public static void main(String[] args) {
    int vertices = 6; // Number of vertices
    int edges = 8; // Number of edges
    Graph G = new Graph(vertices, edges);

    G.edge[0].src = 0;
    G.edge[0].dest = 1;
    G.edge[0].weight = 4;

    G.edge[1].src = 0;
    G.edge[1].dest = 2;
    G.edge[1].weight = 4;

    G.edge[2].src = 1;
    G.edge[2].dest = 2;
    G.edge[2].weight = 2;

    G.edge[3].src = 2;
    G.edge[3].dest = 3;
    G.edge[3].weight = 3;

    G.edge[4].src = 2;
    G.edge[4].dest = 5;
    G.edge[4].weight = 2;

    G.edge[5].src = 2;
    G.edge[5].dest = 4;
    G.edge[5].weight = 4;

    G.edge[6].src = 3;
    G.edge[6].dest = 4;
    G.edge[6].weight = 3;

    G.edge[7].src = 5;
    G.edge[7].dest = 4;
    G.edge[7].weight = 3;
    G.KruskalAlgo();
  }
}
Kruskal's vs Prim's Algorithm
Prim's algorithm is another popular minimum spanning tree algorithm that uses a different logic to find the MST of a graph. Instead of starting from an edge, Prim's algorithm starts from a vertex and keeps adding lowest-weight edges which aren't in the tree, until all vertices have been covered.

Kruskal's Algorithm Complexity
The time complexity Of Kruskal's Algorithm is: O(E log E).

Kruskal's Algorithm Applications
In order to layout electrical wiring
In computer network (LAN connection)






Prim's Algorithm
In this tutorial, you will learn how Prim's Algorithm works. Also, you will find working examples of Prim's Algorithm in C, C++, Java and Python.

Prim's algorithm is a minimum spanning tree algorithm that takes a graph as input and finds the subset of the edges of that graph which

form a tree that includes every vertex
has the minimum sum of weights among all the trees that can be formed from the graph
How Prim's algorithm works
It falls under a class of algorithms called greedy algorithms that find the local optimum in the hopes of finding a global optimum.

We start from one vertex and keep adding edges with the lowest weight until we reach our goal.

The steps for implementing Prim's algorithm are as follows:

Initialize the minimum spanning tree with a vertex chosen at random.
Find all the edges that connect the tree to new vertices, find the minimum and add it to the tree
Keep repeating step 2 until we get a minimum spanning tree
Example of Prim's algorithm
Start with a weighted graph
Start with a weighted graph
Choose a vertex
Choose a vertex
Choose the shortest edge from this vertex and add it
Choose the shortest edge from this vertex and add it
Choose the nearest vertex not yet in the solution
Choose the nearest vertex not yet in the solution
Choose the nearest edge not yet in the solution, if there are multiple choices, choose one at random
Choose the nearest edge not yet in the solution, if there are multiple choices, choose one at random
Repeat until you have a spanning tree
Repeat until you have a spanning tree
Prim's Algorithm pseudocode
The pseudocode for prim's algorithm shows how we create two sets of vertices U and V-U. U contains the list of vertices that have been visited and V-U the list of vertices that haven't. One by one, we move vertices from set V-U to set U by connecting the least weight edge.

T = ∅;
U = { 1 };
while (U ≠ V)
    let (u, v) be the lowest cost edge such that u ∈ U and v ∈ V - U;
    T = T ∪ {(u, v)}
    U = U ∪ {v}
Python, Java and C/C++ Examples
Although adjacency matrix representation of graphs is used, this algorithm can also be implemented using Adjacency List to improve its efficiency.

Python
Java
C
C++
// Prim's Algorithm in Java

import java.util.Arrays;

class PGraph {

  public void Prim(int G[][], int V) {

    int INF = 9999999;

    int no_edge; // number of edge

    // create a array to track selected vertex
    // selected will become true otherwise false
    boolean[] selected = new boolean[V];

    // set selected false initially
    Arrays.fill(selected, false);

    // set number of edge to 0
    no_edge = 0;

    // the number of egde in minimum spanning tree will be
    // always less than (V -1), where V is number of vertices in
    // graph

    // choose 0th vertex and make it true
    selected[0] = true;

    // print for edge and weight
    System.out.println("Edge : Weight");

    while (no_edge < V - 1) {
      // For every vertex in the set S, find the all adjacent vertices
      // , calculate the distance from the vertex selected at step 1.
      // if the vertex is already in the set S, discard it otherwise
      // choose another vertex nearest to selected vertex at step 1.

      int min = INF;
      int x = 0; // row number
      int y = 0; // col number

      for (int i = 0; i < V; i++) {
        if (selected[i] == true) {
          for (int j = 0; j < V; j++) {
            // not in selected and there is an edge
            if (!selected[j] && G[i][j] != 0) {
              if (min > G[i][j]) {
                min = G[i][j];
                x = i;
                y = j;
              }
            }
          }
        }
      }
      System.out.println(x + " - " + y + " :  " + G[x][y]);
      selected[y] = true;
      no_edge++;
    }
  }

  public static void main(String[] args) {
    PGraph g = new PGraph();

    // number of vertices in grapj
    int V = 5;

    // create a 2d array of size 5x5
    // for adjacency matrix to represent graph
    int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
        { 0, 42, 66, 31, 0 } };

    g.Prim(G, V);
  }
}
Prim's vs Kruskal's Algorithm
Kruskal's algorithm is another popular minimum spanning tree algorithm that uses a different logic to find the MST of a graph. Instead of starting from a vertex, Kruskal's algorithm sorts all the edges from low weight to high and keeps adding the lowest edges, ignoring those edges that create a cycle.

Prim's Algorithm Complexity
The time complexity of Prim's algorithm is O(E log V).

Prim's Algorithm Application
Laying cables of electrical wiring
In network designed
To make protocols in network cycles
'









Huffman Coding
In this tutorial, you will learn how Huffman Coding works. Also, you will find working examples of Huffman Coding in C, C++, Java and Python.

Huffman Coding is a technique of compressing data to reduce its size without losing any of the details. It was first developed by David Huffman.

Huffman Coding is generally useful to compress the data in which there are frequently occurring characters.

How Huffman Coding works?
Suppose the string below is to be sent over a network.

string
Initial string
Each character occupies 8 bits. There are a total of 15 characters in the above string. Thus, a total of 8 * 15 = 120 bits are required to send this string.

Using the Huffman Coding technique, we can compress the string to a smaller size.

Huffman coding first creates a tree using the frequencies of the character and then generates code for each character.

Once the data is encoded, it has to be decoded. Decoding is done using the same tree.

Huffman Coding prevents any ambiguity in the decoding process using the concept of prefix code ie. a code associated with a character should not be present in the prefix of any other code. The tree created above helps in maintaining the property.

Huffman coding is done with the help of the following steps.

Calculate the frequency of each character in the string.
frequency of string
Frequency of string
Sort the characters in increasing order of the frequency. These are stored in a priority queue Q.
huffman coding
Characters sorted according to the frequency
Make each unique character as a leaf node.
Create an empty node z. Assign the minimum frequency to the left child of z and assign the second minimum frequency to the right child of z. Set the value of the z as the sum of the above two minimum frequencies.
huffman coding
Getting the sum of the least numbers
Remove these two minimum frequencies from Q and add the sum into the list of frequencies (* denote the internal nodes in the figure above).
Insert node z into the tree.
Repeat steps 3 to 5 for all the characters.
huffman coding
Repeat steps 3 to 5 for all the characters.
 
huffman coding
Repeat steps 3 to 5 for all the characters.
For each non-leaf node, assign 0 to the left edge and 1 to the right edge.
huffman coding
Assign 0 to the left edge and 1 to the right edge
For sending the above string over a network, we have to send the tree as well as the above compressed-code. The total size is given by the table below.

 

Character	Frequency	Code	Size
A	5	11	5*2 = 10
B	1	100	1*3 = 3
C	6	0	6*1 = 6
D	3	101	3*3 = 9
4 * 8 = 32 bits	15 bits	 	28 bits
 

Without encoding, the total size of the string was 120 bits. After encoding the size is reduced to 32 + 15 + 28 = 75.

Decoding the code
For decoding the code, we can take the code and traverse through the tree to find the character.

Let 101 is to be decoded, we can traverse from the root as in the figure below.

huffman coding
Decoding
Huffman Coding Algorithm
create a priority queue Q consisting of each unique character.
sort then in ascending order of their frequencies.
for all the unique characters:
    create a newNode
    extract minimum value from Q and assign it to leftChild of newNode
    extract minimum value from Q and assign it to rightChild of newNode
    calculate the sum of these two minimum values and assign it to the value of newNode
    insert this newNode into the tree
return rootNode
Python, Java and C/C++ Examples
Python
Java
C
C++
// Huffman Coding in Java

import java.util.PriorityQueue;
import java.util.Comparator;

class HuffmanNode {
  int item;
  char c;
  HuffmanNode left;
  HuffmanNode right;
}

// For comparing the nodes
class ImplementComparator implements Comparator<HuffmanNode> {
  public int compare(HuffmanNode x, HuffmanNode y) {
    return x.item - y.item;
  }
}

// IMplementing the huffman algorithm
public class Huffman {
  public static void printCode(HuffmanNode root, String s) {
    if (root.left == null && root.right == null && Character.isLetter(root.c)) {

      System.out.println(root.c + "   |  " + s);

      return;
    }
    printCode(root.left, s + "0");
    printCode(root.right, s + "1");
  }

  public static void main(String[] args) {

    int n = 4;
    char[] charArray = { 'A', 'B', 'C', 'D' };
    int[] charfreq = { 5, 1, 6, 3 };

    PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new ImplementComparator());

    for (int i = 0; i < n; i++) {
      HuffmanNode hn = new HuffmanNode();

      hn.c = charArray[i];
      hn.item = charfreq[i];

      hn.left = null;
      hn.right = null;

      q.add(hn);
    }

    HuffmanNode root = null;

    while (q.size() > 1) {

      HuffmanNode x = q.peek();
      q.poll();

      HuffmanNode y = q.peek();
      q.poll();

      HuffmanNode f = new HuffmanNode();

      f.item = x.item + y.item;
      f.c = '-';
      f.left = x;
      f.right = y;
      root = f;

      q.add(f);
    }
    System.out.println(" Char | Huffman code ");
    System.out.println("--------------------");
    printCode(root, "");
  }
}
Huffman Coding Complexity
The time complexity for encoding each unique character based on its frequency is O(nlog n).

Extracting minimum frequency from the priority queue takes place 2*(n-1) times and its complexity is O(log n). Thus the overall complexity is O(nlog n).

Huffman Coding Applications
Huffman coding is used in conventional compression formats like GZIP, BZIP2, PKZIP, etc.
For text and fax transmissions.











Dynamic Programming
In this tutorial, you will learn what dynamic programming is. Also, you will find the comparison between dynamic programming and greedy algorithms to solve problems.

Dynamic Programming is a technique in computer programming that helps to efficiently solve a class of problems that have overlapping subproblems and optimal substructure property.

If any problem can be divided into subproblems, which in turn are divided into smaller subproblems, and if there are overlapping among these subproblems, then the solutions to these subproblems can be saved for future reference. In this way, efficiency of the CPU can be enhanced. This method of solving a solution is referred to as dynamic programming.

Such problems involve repeatedly calculating the value of the same subproblems to find the optimum solution.

Dynamic Programming Example
Let's find the fibonacci sequence upto 5th term. A fibonacci series is the sequence of numbers in which each number is the sum of the two preceding ones. For example, 0,1,1, 2, 3. Here, each number is the sum of the two preceding numbers.

Algorithm

Let n be the number of terms.

1. If n <= 1, return 1.
2. Else, return the sum of two preceding numbers.
We are calculating the fibonacci sequence up to the 5th term.

The first term is 0.
The second term is 1.
The third term is sum of 0 (from step 1) and 1(from step 2), which is 1.
The fourth term is the sum of the third term (from step 3) and second term (from step 2) i.e. 1 + 1 = 2.
The fifth term is the sum of the fourth term (from step 4) and third term (from step 3) i.e. 2 + 1 = 3.
Hence, we have the sequence 0,1,1, 2, 3. Here, we have used the results of the previous steps as shown below. This is called a dynamic programming approach.

F(0) = 0
F(1) = 1
F(2) = F(1) + F(0)
F(3) = F(2) + F(1)
F(4) = F(3) + F(2)
How Dynamic Programming Works
Dynamic programming works by storing the result of subproblems so that when their solutions are required, they are at hand and we do not need to recalculate them.

This technique of storing the value of subproblems is called memoization. By saving the values in the array, we save time for computations of sub-problems we have already come across.

var m = map(0 → 0, 1 → 1)
function fib(n)
    if key n is not in map m 
        m[n] = fib(n − 1) + fib(n − 2)
    return m[n]
Dynamic programming by memoization is a top-down approach to dynamic programming. By reversing the direction in which the algorithm works i.e. by starting from the base case and working towards the solution, we can also implement dynamic programming in a bottom-up manner.

function fib(n)
    if n = 0
        return 0
    else
        var prevFib = 0, currFib = 1
        repeat n − 1 times
            var newFib = prevFib + currFib
            prevFib = currFib
            currFib  = newFib
    return currentFib
Recursion vs Dynamic Programming
Dynamic programming is mostly applied to recursive algorithms. This is not a coincidence, most optimization problems require recursion and dynamic programming is used for optimization.

But not all problems that use recursion can use Dynamic Programming. Unless there is a presence of overlapping subproblems like in the fibonacci sequence problem, a recursion can only reach the solution using a divide and conquer approach.

That is the reason why a recursive algorithm like Merge Sort cannot use Dynamic Programming, because the subproblems are not overlapping in any way.

Greedy Algorithms vs Dynamic Programming
Greedy Algorithms are similar to dynamic programming in the sense that they are both tools for optimization.

However, greedy algorithms look for locally optimum solutions or in other words, a greedy choice, in the hopes of finding a global optimum. Hence greedy algorithms can make a guess that looks optimum at the time but becomes costly down the line and do not guarantee a globally optimum.

Dynamic programming, on the other hand, finds the optimal solution to subproblems and then makes an informed choice to combine the results of those subproblems to find the most optimum solution.

Different Types of Dynamic Programming Algorithms
Longest Common Subsequence
Floyd-Warshall Algorithm









Floyd-Warshall Algorithm
In this tutorial, you will learn how floyd-warshall algorithm works. Also, you will find working examples of floyd-warshall algorithm in C, C++, Java and Python.

Floyd-Warshall Algorithm is an algorithm for finding the shortest path between all the pairs of vertices in a weighted graph. This algorithm works for both the directed and undirected weighted graphs. But, it does not work for the graphs with negative cycles (where the sum of the edges in a cycle is negative).

A weighted graph is a graph in which each edge has a numerical value associated with it.

Floyd-Warhshall algorithm is also called as Floyd's algorithm, Roy-Floyd algorithm, Roy-Warshall algorithm, or WFI algorithm.

This algorithm follows the dynamic programming approach to find the shortest paths.

How Floyd-Warshall Algorithm Works?
Let the given graph be:

graph
Initial graph
Follow the steps below to find the shortest path between all the pairs of vertices.

Create a matrix A0 of dimension n*n where n is the number of vertices. The row and the column are indexed as i and j respectively. i and j are the vertices of the graph.

Each cell A[i][j] is filled with the distance from the ith vertex to the jth vertex. If there is no path from ith vertex to jth vertex, the cell is left as infinity.
matrix floyd warshall algorithm
Fill each cell with the distance between ith and jth vertex
Now, create a matrix A1 using matrix A0. The elements in the first column and the first row are left as they are. The remaining cells are filled in the following way.

Let k be the intermediate vertex in the shortest path from source to destination. In this step, k is the first vertex. A[i][j] is filled with (A[i][k] + A[k][j]) if (A[i][j] > A[i][k] + A[k][j]).

That is, if the direct distance from the source to the destination is greater than the path through the vertex k, then the cell is filled with A[i][k] + A[k][j].

In this step, k is vertex 1. We calculate the distance from source vertex to destination vertex through this vertex k.
matrix floyd warshall algorithm
Calculate the distance from the source vertex to destination vertex through this vertex k

For example: For A1[2, 4], the direct distance from vertex 2 to 4 is 4 and the sum of the distance from vertex 2 to 4 through vertex (ie. from vertex 2 to 1 and from vertex 1 to 4) is 7. Since 4 < 7, A0[2, 4] is filled with 4.
Similarly, A2 is created using A1. The elements in the second column and the second row are left as they are.

In this step, k is the second vertex (i.e. vertex 2). The remaining steps are the same as in step 2.
matrix floyd warshall algorithm
Calculate the distance from the source vertex to destination vertex through this vertex 2
Similarly, A3 and A4 is also created.
matrix floyd warshall algorithm
Calculate the distance from the source vertex to destination vertex through this vertex 3
 
matrix floyd warshall algorithm
Calculate the distance from the source vertex to destination vertex through this vertex 4
A4 gives the shortest path between each pair of vertices.
Floyd-Warshall Algorithm
n = no of vertices
A = matrix of dimension n*n
for k = 1 to n
    for i = 1 to n
        for j = 1 to n
            Ak[i, j] = min (Ak-1[i, j], Ak-1[i, k] + Ak-1[k, j])
return A
Python, Java and C/C++ Examples
Python
Java
C
C++
// Floyd Warshall Algorithm in Java

class FloydWarshall {
  final static int INF = 9999, nV = 4;

  // Implementing floyd warshall algorithm
  void floydWarshall(int graph[][]) {
    int matrix[][] = new int[nV][nV];
    int i, j, k;

    for (i = 0; i < nV; i++)
      for (j = 0; j < nV; j++)
        matrix[i][j] = graph[i][j];

    // Adding vertices individually
    for (k = 0; k < nV; k++) {
      for (i = 0; i < nV; i++) {
        for (j = 0; j < nV; j++) {
          if (matrix[i][k] + matrix[k][j] < matrix[i][j])
            matrix[i][j] = matrix[i][k] + matrix[k][j];
        }
      }
    }
    printMatrix(matrix);
  }

  void printMatrix(int matrix[][]) {
    for (int i = 0; i < nV; ++i) {
      for (int j = 0; j < nV; ++j) {
        if (matrix[i][j] == INF)
          System.out.print("INF ");
        else
          System.out.print(matrix[i][j] + "  ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int graph[][] = { { 0, 3, INF, 5 }, { 2, 0, INF, 4 }, { INF, 1, 0, INF }, { INF, INF, 2, 0 } };
    FloydWarshall a = new FloydWarshall();
    a.floydWarshall(graph);
  }
}
Floyd Warshall Algorithm Complexity
Time Complexity
There are three loops. Each loop has constant complexities. So, the time complexity of the Floyd-Warshall algorithm is O(n3).

Space Complexity
The space complexity of the Floyd-Warshall algorithm is O(n2).

Floyd Warshall Algorithm Applications
To find the shortest path is a directed graph
To find the transitive closure of directed graphs
To find the Inversion of real matrices
For testing whether an undirected graph is bipartite











Longest Common Subsequence
In this tutorial, you will learn how the longest common subsequence is found. Also, you will find working examples of the longest common subsequence in C, C++, Java and Python.

The longest common subsequence (LCS) is defined as the longest subsequence that is common to all the given sequences, provided that the elements of the subsequence are not required to occupy consecutive positions within the original sequences.

If S1 and S2 are the two given sequences then, Z is the common subsequence of S1 and S2 if Z is a subsequence of both S1 and S2. Furthermore, Z must be a strictly increasing sequence of the indices of both S1 and S2.

In a strictly increasing sequence, the indices of the elements chosen from the original sequences must be in ascending order in Z.

If

S1 = {B, C, D, A, A, C, D}
Then, {A, D, B} cannot be a subsequence of S1 as the order of the elements is not the same (ie. not strictly increasing sequence).

Let us understand LCS with an example.

If

S1 = {B, C, D, A, A, C, D}
S2 = {A, C, D, B, A, C}
Then, common subsequences are {B, C}, {C, D, A, C}, {D, A, C}, {A, A, C}, {A, C}, {C, D}, ...

Among these subsequences, {C, D, A, C} is the longest common subsequence. We are going to find this longest common subsequence using dynamic programming.

Before proceeding further, if you do not already know about dynamic programming, please go through dynamic programming.

Using Dynamic Programming to find the LCS
Let us take two sequences:

Longest Common Subsequence first sequence
The first sequence
Longest Common Subsequence first sequence
Second Sequence
The following steps are followed for finding the longest common subsequence.

Create a table of dimension n+1*m+1 where n and m are the lengths of X and Y respectively. The first row and the first column are filled with zeros.
Longest Common Subsequence initialise table
Initialise a table
Fill each cell of the table using the following logic.
If the character correspoding to the current row and current column are matching, then fill the current cell by adding one to the diagonal element. Point an arrow to the diagonal cell.
Else take the maximum value from the previous column and previous row element for filling the current cell. Point an arrow to the cell with maximum value. If they are equal, point to any of them.
Longest Common Subsequence fill the values
Fill the values
Step 2 is repeated until the table is filled.
Longest Common Subsequence fill all the values
Fill all the values
The value in the last row and the last column is the length of the longest common subsequence.
Longest Common Subsequence length
The bottom right corner is the length of the LCS
In order to find the longest common subsequence, start from the last element and follow the direction of the arrow. The elements corresponding to () symbol form the longest common subsequence.
Longest Common Subsequence create a path
Create a path according to the arrows
Thus, the longest common subsequence is CA.

Longest Common Subsequence result
LCS
How is a dynamic programming algorithm more efficient than the recursive algorithm while solving an LCS problem?

The method of dynamic programming reduces the number of function calls. It stores the result of each function call so that it can be used in future calls without the need for redundant calls.

In the above dynamic algorithm, the results obtained from each comparison between elements of X and the elements of Y are stored in a table so that they can be used in future computations.

So, the time taken by a dynamic approach is the time taken to fill the table (ie. O(mn)). Whereas, the recursion algorithm has the complexity of 2max(m, n).

Longest Common Subsequence Algorithm
X and Y be two given sequences
Initialize a table LCS of dimension X.length * Y.length
X.label = X
Y.label = Y
LCS[0][] = 0
LCS[][0] = 0
Start from LCS[1][1]
Compare X[i] and Y[j]
    If X[i] = Y[j]
        LCS[i][j] = 1 + LCS[i-1, j-1]   
        Point an arrow to LCS[i][j]
    Else
        LCS[i][j] = max(LCS[i-1][j], LCS[i][j-1])
        Point an arrow to max(LCS[i-1][j], LCS[i][j-1])
Python, Java and C/C++ Examples
Python
Java
C
C++
// The longest common subsequence in Java

class LCS_ALGO {
  static void lcs(String S1, String S2, int m, int n) {
    int[][] LCS_table = new int[m + 1][n + 1];

    // Building the mtrix in bottom-up way
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 || j == 0)
          LCS_table[i][j] = 0;
        else if (S1.charAt(i - 1) == S2.charAt(j - 1))
          LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
        else
          LCS_table[i][j] = Math.max(LCS_table[i - 1][j], LCS_table[i][j - 1]);
      }
    }

    int index = LCS_table[m][n];
    int temp = index;

    char[] lcs = new char[index + 1];
    lcs[index] = '\0';

    int i = m, j = n;
    while (i > 0 && j > 0) {
      if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
        lcs[index - 1] = S1.charAt(i - 1);

        i--;
        j--;
        index--;
      }

      else if (LCS_table[i - 1][j] > LCS_table[i][j - 1])
        i--;
      else
        j--;
    }

    // Printing the sub sequences
    System.out.print("S1 : " + S1 + "\nS2 : " + S2 + "\nLCS: ");
    for (int k = 0; k <= temp; k++)
      System.out.print(lcs[k]);
    System.out.println("");
  }

  public static void main(String[] args) {
    String S1 = "ACADB";
    String S2 = "CBDA";
    int m = S1.length();
    int n = S2.length();
    lcs(S1, S2, m, n);
  }
}
Longest Common Subsequence Applications
in compressing genome resequencing data
to authenticate users within their mobile phone through in-air signatures











Backtracking Algorithm
In this tutorial, you will learn what a backtracking algorithm is. Also, you will find an example of a backtracking approach.

A backtracking algorithm is a problem-solving algorithm that uses a brute force approach for finding the desired output.

The Brute force approach tries out all the possible solutions and chooses the desired/best solutions.

The term backtracking suggests that if the current solution is not suitable, then backtrack and try other solutions. Thus, recursion is used in this approach.

This approach is used to solve problems that have multiple solutions. If you want an optimal solution, you must go for dynamic programming.

State Space Tree
A space state tree is a tree representing all the possible states (solution or nonsolution) of the problem from the root as an initial state to the leaf as a terminal state.

State Space Tree
State Space Tree
Backtracking Algorithm
Backtrack(x)
    if x is not a solution
        return false
    if x is a new solution
        add to list of solutions
    backtrack(expand x)
Example Backtracking Approach
Problem: You want to find all the possible ways of arranging 2 boys and 1 girl on 3 benches. Constraint: Girl should not be on the middle bench.

Solution: There are a total of 3! = 6 possibilities. We will try all the possibilities and get the possible solutions. We recursively try all the possibilities.

All the possibilities are:

All the possibilities
All the possibilities
The following state space tree shows the possible solutions.

State state tree
State tree with all the solutions
Backtracking Algorithm Applications
To find all Hamiltonian Paths present in a graph.
To solve the N Queen problem.
Maze solving problem.
The Knight's tour problem.






Rabin-Karp Algorithm
In this tutorial, you will learn what rabin-karp algoroithm is. Also, you will find working examples of rabin-karp algorithm in C, C++, Java and Python.

Rabin-Karp algorithm is an algorithm used for searching/matching patterns in the text using a hash function. Unlike Naive string matching algorithm, it does not travel through every character in the initial phase rather it filters the characters that do not match and then performs the comparison.

A hash function is a tool to map a larger input value to a smaller output value. This output value is called the hash value.

How Rabin-Karp Algorithm Works?
A sequence of characters is taken and checked for the possibility of the presence of the required string. If the possibility is found then, character matching is performed.

Let us understand the algorithm with the following steps:

Let the text be:
text for rabin karp algorithm
Text

And the string to be searched in the above text be:
pattern for rabin karp algorithm
Pattern
Let us assign a numerical value(v)/weight for the characters we will be using in the problem. Here, we have taken first ten alphabets only (i.e. A to J).
text-weights
Text Weights
n be the length of the pattern and m be the length of the text. Here, m = 10 and n = 3.
Let d be the number of characters in the input set. Here, we have taken input set {A, B, C, ..., J}. So, d = 10. You can assume any suitable value for d.
Let us calculate the hash value of the pattern.
hash value of text
Hash value of text
hash value for pattern(p) = Σ(v * dm-1) mod 13 
                      = ((3 * 102) + (4 * 101) + (4 * 100)) mod 13 
                      = 344 mod 13 
                      = 6
In the calculation above, choose a prime number (here, 13) in such a way that we can perform all the calculations with single-precision arithmetic.

The reason for calculating the modulus is given below.

Calculate the hash value for the text-window of size m.
For the first window ABC,
hash value for text(t) = Σ(v * dn-1) mod 13 
                  = ((1 * 102) + (2 * 101) + (3 * 100)) mod 13 
                  = 123 mod 13  
                  = 6
Compare the hash value of the pattern with the hash value of the text. If they match then, character-matching is performed.
In the above examples, the hash value of the first window (i.e. t) matches with p so, go for character matching between ABC and CDD. Since they do not match so, go for the next window.
We calculate the hash value of the next window by subtracting the first term and adding the next term as shown below.
t = ((1 * 102) + ((2 * 101) + (3 * 100)) * 10 + (3 * 100)) mod 13 
  = 233 mod 13  
  = 12
In order to optimize this process, we make use of the previous hash value in the following way.

t = ((d * (t - v[character to be removed] * h) + v[character to be added] ) mod 13  
  = ((10 * (6 - 1 * 9) + 3 )mod 13  
  = 12
Where, h = dm-1 = 103-1 = 100.
For BCC, t = 12 (≠6). Therefore, go for the next window.
After a few searches, we will get the match for the window CDA in the text.
hash value of different windows
Hash value of different windows
Algorithm
n = t.length
m = p.length
h = dm-1 mod q
p = 0
t0 = 0
for i = 1 to m
    p = (dp + p[i]) mod q
    t0 = (dt0 + t[i]) mod q
for s = 0 to n - m
    if p = ts
        if p[1.....m] = t[s + 1..... s + m]
            print "pattern found at position" s
    If s < n-m
        ts + 1 = (d (ts - t[s + 1]h) + t[s + m + 1]) mod q
Python, Java and C/C++ Examples
Python
Java
C
C++
// Rabin-Karp algorithm in Java

public class RabinKarp {
  public final static int d = 10;

  static void search(String pattern, String txt, int q) {
    int m = pattern.length();
    int n = txt.length();
    int i, j;
    int p = 0;
    int t = 0;
    int h = 1;

    for (i = 0; i < m - 1; i++)
      h = (h * d) % q;

    // Calculate hash value for pattern and text
    for (i = 0; i < m; i++) {
      p = (d * p + pattern.charAt(i)) % q;
      t = (d * t + txt.charAt(i)) % q;
    }

    // Find the match
    for (i = 0; i <= n - m; i++) {
      if (p == t) {
        for (j = 0; j < m; j++) {
          if (txt.charAt(i + j) != pattern.charAt(j))
            break;
        }

        if (j == m)
          System.out.println("Pattern is found at position: " + (i + 1));
      }

      if (i < n - m) {
        t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
        if (t < 0)
          t = (t + q);
      }
    }
  }

  public static void main(String[] args) {
    String txt = "ABCCDDAEFG";
    String pattern = "CDD";
    int q = 13;
    search(pattern, txt, q);
  }
}
Limitations of Rabin-Karp Algorithm
Spurious Hit
When the hash value of the pattern matches with the hash value of a window of the text but the window is not the actual pattern then it is called a spurious hit.

Spurious hit increases the time complexity of the algorithm. In order to minimize spurious hit, we use modulus. It greatly reduces the spurious hit.

Rabin-Karp Algorithm Complexity
The average case and best case complexity of Rabin-Karp algorithm is O(m + n) and the worst case complexity is O(mn).

The worst-case complexity occurs when spurious hits occur a number for all the windows.

Rabin-Karp Algorithm Applications
For pattern matching
For searching string in a bigger text
Previous Tutorial:
















