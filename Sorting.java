/*
Example: 1

// Java program to sort an array 
// using Arrays.sort()
import java.util.Arrays; 

public class Test
{ 
    public static void main(String[] args) 
    { 
        // Our arr contains 8 elements 
        int[] arr1 = {5, 20, 12, 30};
        char[] arr2 = {'B', 'B', 'A', 'C', 'A'};
        
        // Sorting the first array
        Arrays.sort(arr1); 
        
        // Displaying the first array
        System.out.println(Arrays.toString(arr1));

        // Sorting the second array
        Arrays.sort(arr2); 
        
        // Displaying the second array
        System.out.println(Arrays.toString(arr2)); 
    } 
} 


Example: 2

// A sample Java program to sort a subarray 
// using Arrays.sort(). 
import java.util.Arrays; 

public class SortExample 
{ 
    public static void main(String[] args) 
    { 
        int[] arr = {5, 30, 20, 10, 8}; 

        // Sort subarray from index 1 to 3, i.e., 
        // only sort subarray {30, 20, 10} and 
        // keep other elements as it is. 
        Arrays.sort(arr, 1, 4); 

        System.out.println(Arrays.toString(arr)); 
    } 
} 



Example: 3

// A sample Java program to implementing
// Comparable alongside Arrays.sort(). 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

// A user-defined Point class implementing 
// Comparable interface
class Point implements Comparable<Point>
{
    int x, y;
    
    // Costructor intialising x & y
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    // compareTo() function defining the
    // nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(Point P)
    {
        // Comparing two objects by
        // Subtracting the passed object 
        // from current object
        return this.x - P.x;
    }
}

// Main class
class Test 
{ 
    public static void main(String[] args) 
    { 
        // Array of 3 objects
        Point arr[] = {
            new Point(10, 20), 
            new Point(3, 12), 
            new Point(5, 7) };
            
        // Sorting the object containing array 
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.println(
                arr[i].x + " " + arr[i].y);
    } 
} 



Example: 4

// A sample Java program to implementing
// Comparator alongside Arrays.sort(). 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

// Point class which does not implement
// Comparable interface. Thus the objects
// of this class are not comparable.
class Point
{
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// This class implements 
// Comparator interface to compare 
class MyCmp implements Comparator<Point>
{
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(Point p1, Point p2)
    {
        return p1.x - p2.x;
    }
}

// Main class
class Test 
{ 
    public static void main(String[] args) 
    { 
        // Array of 3 objects
        Point arr[] = {
            new Point(10, 20), 
            new Point(3, 12), 
            new Point(5, 7) };
            
        // Sorting the object containing the array 
        // by passing the array and object MyCmp
        Arrays.sort(arr, new MyCmp());
        
        // Displaying the sorted array
        for(int i = 0; i < arr.length; i++)
            System.out.println(
                arr[i].x + " " + arr[i].y);
    } 
} 


Example: 5

// A sample Java program to sort a subarray 
// in descending order using Arrays.sort(). 
import java.util.Arrays; 
import java.util.Collections; 

public class SortExample 
{ 
    public static void main(String[] args) 
    { 
        Integer[] arr = {5, 20, 10, 12}; 

        // Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't 
        // work for primitive types. 
        Arrays.sort(arr, Collections.reverseOrder()); 

        System.out.println(Arrays.toString(arr)); 
    } 
}




// A sample Java program to sort a subarray 
// using Arrays.sort(). 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

// This class implements 
// Comparator interface to compare 
class MyCmp implements Comparator<Integer>
{
    // Sorts the Integers
    public int compare(Integer a, Integer b)
    {
        return a%2 - b%2;
    }
}

// Main class
class Test 
{ 
    public static void main(String[] args) 
    { 
        // Integer array
        Integer[] arr = {5, 20, 10, 3, 12};
            
        // Sorting arrays by passing
        // arr and MyCmp object
        Arrays.sort(arr, new MyCmp());
        
        // Displaying the sorted array
        System.out.println(Arrays.toString(arr));
    } 
} 



// Using Collection sort

Example: 1


// Java program to demonstrate 
// working of Collections.sort() 
import java.util.*; 

public class Collectionsorting 
{ 
    public static void main(String[] args) 
    { 
        // Create a list of strings 
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(10); 
        list.add(5); 
        list.add(20); 
        
        // List is sorted in the natural order
        Collections.sort(list);
        
        // Displaying the sorted list
        System.out.println(list);
        
        // Sorting the list in reverse order
        Collections.sort(list, Collections.reverseOrder()); 

        // Let us print the sorted list 
        System.out.println(list); 
    } 
} 


Example:2


// Java program to demonstrate 
// working of Collections.sort() 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

// A user-defined Point class implementing 
// Comparable interface
class Point implements Comparable<Point>
{
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    // compareTo() function defining the
    // nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(Point P)
    {
        return this.x - P.x;
    }
}

class GfG 
{ 
    public static void main(String[] args) 
    { 
        // Create a list of Integers 
        List<Point> list = new ArrayList<Point>(); 
        list.add(new Point(5, 10)); 
        list.add(new Point(2, 20));  
        list.add(new Point(10, 30)); 
        
        // List is sorted in the natural order
        Collections.sort(list);
        
        // Displaying the points
        for (Point p: list)
            System.out.println(p.x + " " + p.y);
    } 
} 


Example: 3

// Java program to demonstrate 
// working of Collections.sort() 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

// Point class which does not implement
// Comparable interface. Thus the objects
// of this class are not comparable.
class Point
{
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// This class implements 
// Comparator interface
class MyCmp implements Comparator<Point>
{
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(Point p1, Point p2)
    {
        return p1.x - p2.x;
    }
}

// Main Class
class GfG 
{ 
    public static void main(String[] args) 
    { 
        // Create a list of Integers 
        List<Point> list = new ArrayList<Point>(); 
        list.add(new Point(5, 10)); 
        list.add(new Point(2, 20));  
        list.add(new Point(10, 30)); 
        
        // List is sorted in natural order
        // Passing the list and MyCmp object
        Collections.sort(list, new MyCmp());
        
        // Displaying the points
        for (Point p: list)
            System.out.println(p.x + " " + p.y);
    } 
} 



// Bubble sort


package whatever //do not write package name here 

import java.io.*;

class GFG {
    
    static void bubbleSort(int arr[], int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if( arr[j] > arr[j + 1]){
                    
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
    }
    
	public static void main (String[] args) {
	    int a[] = {2, 1, 4, 3};
	    bubbleSort(a, 4);
	    
	    for(int i = 0; i < 4; i++){
	        System.out.print(a[i] + " ");
	    }
	}
}

optimized


/*package whatever //do not write package name here 

import java.io.*;

class GFG {
    
    static void bubbleSort(int arr[], int n){
        boolean swapped;
        
        for(int i = 0; i < n; i++){
            
            swapped = false;
            
            for(int j = 0; j < n - i - 1; j++){
                if( arr[j] > arr[j + 1]){
                    
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swapped = true;
                    
                }
            }
            if(swapped == false)
            break;
        }
    }
    
	public static void main (String[] args) {
	    int a[] = {2, 1, 4, 3};
	    bubbleSort(a, 4);
	    
	    for(int i = 0; i < 4; i++){
	        System.out.print(a[i] + " ");
	    }
	}
}


Selection  


/*package whatever //do not write package name here 

import java.io.*;

class GFG {
    
    
    static void selectionSort(int arr[], int n){
        for(int i = 0; i < n; i++){
            int min_ind = i;
            
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }
    
    
	public static void main (String[] args) {
	    int a[] = {2, 1, 4, 3};
	    selectionSort(a, 4);
	    
	    for(int i = 0; i < 4; i++){
	        System.out.print(a[i] + " ");
	    }
	}
}



      Insertion sort

      import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{50,20,40,60,10,30};
        
        int n = arr.length;
        iSort(arr,n);
        
        for(int x:arr)
            System.out.print(x+" ");
        
    }
    
    static void iSort(int arr[],int n){
    
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}



        Merge Sort

        Naive

        import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10,15};
        
        int m = a.length;
        int n = b.length;
        merge(a,b,m,n);
        
    }
    
    static void merge(int a[], int b[], int m, int n){
    
        int[] c=new int[m+n];
        for(int i=0;i<m;i++)
            c[i]=a[i];
        for(int j=0;j<n;j++)
            c[j+m]=b[j];
        
        Arrays.sort(c);
        
        for(int i=0;i<m+n;i++)
            System.out.print(c[i]+" ");
    }
}


optimized

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10,15};
        
        int m = a.length;
        int n = b.length;
        merge(a,b,m,n);
        
    }
    
    static void merge(int a[], int b[], int m, int n){
    
        int i=0,j=0;
        while(i<m && j<n){
            if(a[i]<b[j])
                System.out.print(a[i++]+" ");
            else
                System.out.print(b[j++]+" ");
        }
        while(i<m)
            System.out.print(a[i++]+" ");
        while(j<n)
            System.out.print(b[j++]+" ");    
    }
}


Merge function of merge sort

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
	    int l=0,h=8,m=3;
        
        merge(a,l,m,h);
	    for(int x: a)
	        System.out.print(x+" ");
        
    }
    
    static void merge(int arr[], int l, int m, int h){
    
        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];int[]right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];    
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];    
    }
}


Merge sorted algo

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,5,30,15,7};
	    int l=0,r=4;
        
        mergeSort(a,l,r);
    	for(int x: a)
	        System.out.print(x+" ");
        
    }
    
    static void merge(int arr[], int l, int m, int h){
    
        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];int[]right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];    
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];    
    }
    
    static void mergeSort(int arr[],int l,int r){
        if(r>l){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
}


Intersection of two sorted Arrays

naive

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        
        int m = a.length;
        int n = b.length;
	    intersection(a,b,m,n);
        
    }
    
    static void intersection(int a[], int b[], int m, int n){
    
        for(int i=0;i<m;i++){
            if(i>0 && a[i-1]==a[i])
                continue;
            for(int j=0;j<n;j++)
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
        }    
    }
}


Efficient

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        
        int m = a.length;
        int n = b.length;
	    intersection(a,b,m,n);
        
    }
    
    static void intersection(int a[], int b[], int m, int n){
    
         int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                System.out.print(a[i]+" ");
                i++;j++;
            }
        }   
    }
}



Union of two Sorted

Naive

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{3,8,10};
        int b[] = new int[]{2,8,9,10,15};
        
        int m = a.length;
        int n = b.length;
	    printUnion(a,b,m,n);
        
    }
    
    static void printUnion(int a[], int b[], int m, int n){
    
        int[] c=new int[m+n];
        for(int i=0;i<m;i++)
            c[i]=a[i];
        for(int i=0;i<n;i++)
            c[i+m]=b[i];
        Arrays.sort(c);
        
        for(int i=0;i<m+n;i++){
            if(i==0||c[i]!=c[i-1])
                System.out.print(c[i]+" ");
        }
    }
}


Efficient


import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{3,8,8};
        int b[] = new int[]{2,8,8,10,15};
        
        int m = a.length;
        int n = b.length;
	    printUnion(a,b,m,n);
        
    }
    
    static void printUnion(int a[], int b[], int m, int n){
    
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){i++;continue;}
            if(j>0 && b[j-1]==b[j]){j++;continue;}
            if(a[i]<b[j]){System.out.print(a[i]+" ");i++;}
            else if(a[i]>b[j]){System.out.print(b[j]+" ");j++;}
            else{System.out.print(a[i]+" ");i++;j++;}
        }
            while(i<m){if(i==0||a[i]!=a[i-1])System.out.print(a[i]+" ");i++;}
            while(j<n){if(j==0||b[j]!=b[j-1])System.out.print(b[j]+" ");j++;}
    }
}


Count inversions in Array

Naive

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{2,4,1,3,5};
        
        int n = arr.length;
	    System.out.print(countInversions(arr,n));
        
    }
    
    static int countInversions(int arr[], int n){
    
        int res=0;
        for(int i=0;i<(n-1);i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                    res++;
            }
        }
        return res;
    }
}


Efficient

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{2,4,1,3,5};
        
        int n = arr.length;
	    System.out.print(countInv(arr,0,n-1));
        
    }
    
    static int countInv(int arr[], int l, int r)
    {
        int res = 0;
        if (l<r) {
           
            int m = (r + l) / 2;
     
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countAndMerge(arr, l, m , r);
        }
        return res;
    }
    
    static int countAndMerge(int arr[], int l, int m, int r)
    {
        int n1=m-l+1, n2=r-m;
        int[] left=new int[n1];int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];    
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                {arr[k++]=left[i++];}
            else{
                arr[k++]=right[j++];
                res=res+(n1-i);
            }
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];
        return res;
    }
}


Naive Partition

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{5,13,6,9,12,11,8};
        
        int n = arr.length;
        partition(arr,0,n-1,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
    
    static void partition(int arr[], int l, int h, int p)
    {
        int[] temp=new int[h-l+1];int index=0;
        for(int i=l;i<=h;i++)
            if(arr[i]<=arr[p] && i!= p)
                {
                    temp[index]=arr[i];index++;
                }
        temp[index++] = arr[p];
        for(int i=l;i<=h;i++)
            if(arr[i]>arr[p])
                {
                    temp[index]=arr[i];index++;
                }
        for(int i=l;i<=h;i++)
            arr[i]=temp[i-l];
    }
}


Lamuto Partition

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{10,80,30,90,40,50,70};
        
        int n = arr.length;
        iPartition(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
    
    static int iPartition(int arr[], int l, int h)
    {   
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
}


Hoare partition

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{5,3,8,4,2,7,1,10};
        
        int n = arr.length;
        partition(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
    
    static int partition(int arr[], int l, int h)
    {   
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}


Quick Sort using Lomuto Partition

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{8,4,7,9,3,10,5};
        
        int n = arr.length;
        qSort(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
    
    static int iPartition(int arr[], int l, int h)
    {   
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
    
    static void qSort(int arr[],int l,int h){
        if(l<h){
            int p=iPartition(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
    }
}


QuickSort using Hoare Partition

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{8,4,7,9,3,10,5};
        
        int n = arr.length;
        qSort(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
    
    static int partition(int arr[], int l, int h)
    {   
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    
    static void qSort(int arr[],int l,int h){
        if(l<h){
            int p=partition(arr,l,h);
            qSort(arr,l,p);
            qSort(arr,p+1,h);
        }
    }
}


Tail call elimination in QuickSort

#include <bits/stdc++.h>
using namespace std;

int partition(int arr[], int l, int h)
{   
    int pivot=arr[l];
    int i=l-1,j=h+1;
    while(true){
        do{
            i++;
        }while(arr[i]<pivot);
        do{
            j--;
        }while(arr[j]>pivot);
        if(i>=j)return j;
        swap(arr[i],arr[j]);
    }
}

void qSort(int arr[],int l,int h){
    Begin:
    if(l<h){
        int p=partition(arr,l,h);
        qSort(arr,l,p);
        l=p+1;
        goto Begin;
    }
}
 
int main() {
	
    int arr[]={8,4,7,9,3,10,5};
	
	int n=sizeof(arr)/sizeof(arr[0]);
	
	qSort(arr,0,n-1);
	
	for(int x: arr)
	    cout<<x<<" ";
}



Kth smallest element

Naive

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{10,5,30,12};
        
        int n = arr.length;int k=2;
        
	    System.out.print(kthSmallest(arr,n,k));
        
    }
    
    static int kthSmallest(int arr[], int n, int k)
    {   
        Arrays.sort(arr);
        return arr[k-1];
    }
}


Efficient

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{10,4,5,8,11,6,26};
        
        int n = arr.length;int k=5;
        int index=kthSmallest(arr,n,k);
        
        System.out.print(arr[index]);
        
    }
    
    static int partition(int arr[], int l, int h)
    {   
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
    
    static int kthSmallest(int arr[],int n,int k){
        int l=0,r=n-1;
        while(l<=r){
            int p=partition(arr,l,r);
            if(p==k-1)
                return p;
            else if(p>k-1)
                r=p-1;
            else
                l=p+1;
        }
        return -1;
    }
}


 chocolate distribution 

 import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{7,3,2,4,9,12,56};
        
        int n = arr.length;int m=3;
        
        System.out.print(minDiff(arr,n,m));
        
    }
    
    static int minDiff(int arr[],int n,int m){
        if(m>n)
            return -1;
        Arrays.sort(arr);
        int res=arr[m-1]-arr[0];
        for(int i=0;(i+m-1)<n;i++)
            res=Math.min(res,arr[i+m-1]-arr[i]);
        return res;
    }
}

 Sorted an Array with two types of elements

Naive 


import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{13,-12,18,-10};
        
        int n = arr.length;
        
        sort(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }
    
    static void sort(int arr[],int n){
        int[] temp=new int[n];int i=0;
        
        for(int j=0;j<n;j++)
            if(arr[j]<0)
                temp[i++]=arr[j];
        for(int j=0;j<n;j++)
            if(arr[j]>=0)
                temp[i++]=arr[j];
        for(int j=0;j<n;j++)
            arr[j]=temp[j];
    }
}


Efficient

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{13,-12,18,-10};
        
        int n = arr.length;
        
        sort(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }
    
    static void sort(int arr[],int n){
        int i=-1,j=n;
        while(true)
        {
            do{i++;}while(arr[i]<0);
            do{j--;}while(arr[j]>=0);
            if(i>=j)return;
            
            //swapping arr[i] & arr[j]
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
    }
}


Sorted an Array with three types of elements

Naive

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{0,1,1,2,0,1,1,2};
        
        int n = arr.length;
        
        sort(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }
    
    static void sort(int arr[],int n){
        int[] temp=new int[n];int i=0;
        
        for(int j=0;j<n;j++)
            if(arr[j]==0)
                temp[i++]=arr[j];
        for(int j=0;j<n;j++)
            if(arr[j]==1)
                temp[i++]=arr[j];
        for(int k=0;k<n;k++)
            if(arr[k]==2)
                temp[i++]=arr[k];
        for(int j=0;j<n;j++)
            arr[j]=temp[j];
    }
}


Efficient

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{0,1,1,2,0,1,1,2};
        
        int n = arr.length;
        
        sort(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }
    
    static void sort(int arr[],int n){
        int l=0,h=n-1,mid=0;
        while(mid<=h){
            switch(arr[mid]){
                case 0:
                    //swapping arr[l] & arr[mid])
                    int temp=arr[l];
                    arr[l]=arr[mid];
                    arr[mid]=temp;
                    
                    l++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    //swapping arr[h] & arr[mid])
                    temp=arr[h];
                    arr[h]=arr[mid];
                    arr[mid]=temp;
                    
                    h--;
                    break;
            }
        }
        
    }
}


Minimum diff in an array


Naive 

/*package whatever //do not write package name here *

import java.util.*;

class GFG {
    
    int getMinDiff(int arr[], int n){
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            for(int j = 0;j < i;j++){
                res = Math.min(res, Math.abs(arr[i] - arr[j]));
            }
        }
        return res;
    }
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
		arr[i] = sc.nextInt();
		
		GFG gfg = new GFG();
		System.out.println(gfg.getMinDiff(arr, n));
	}
}

Efficient

/*package whatever //do not write package name here *

import java.util.*;

class GFG {
    
    int getMinDiff(int arr[], int n){
        Arrays.sort(arr);
        
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            res = Math.min(res, arr[i] - arr[i-1]);
        }
        return res;
    }
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
		arr[i] = sc.nextInt();
		
		GFG gfg = new GFG();
		System.out.println(gfg.getMinDiff(arr, n));
	}
}



Merge overlapping intervals

import java.util.*;
import java.lang.*;
import java.io.*;

class Interval implements Comparable<Interval>
{ 
    int s, e;
    
    Interval(int s, int e)
    {
        this.s = s;
        this.e = e;
    }
    
    public int compareTo(Interval a)  
    { return this.s - a.s; }
};



class Solution
{
    public static void main (String[] args) 
    {
        Interval arr[] = { new Interval(5,10),new Interval(3,15),new Interval(18,30),
                                        new Interval(2,7) };
        
        int n = arr.length;
        
        mergeIntervals(arr, n);
    }
    
    static void mergeIntervals(Interval arr[], int n)  
    {  
        Arrays.sort(arr);  
      
        int res = 0;  
       
        for (int i=1; i<n; i++)  
        {  
            if (arr[res].e >=  arr[i].s)  
            {   
                arr[res].e = Math.max(arr[res].e, arr[i].e);  
                arr[res].s = Math.min(arr[res].s, arr[i].s);  
            }  
            else { 
                res++; 
                arr[res] = arr[i];  
            }     
        }  
        
        for (int i = 0; i <= res; i++)  
            System.out.print(  "[" + arr[i].s + ", " + arr[i].e + "] ");  
    } 
}


Meeting the maximum guests

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = { 900, 600, 700};
        int dep[] = { 1000, 800, 730};
        int n = arr.length; 
        
        System.out.print(maxGuest(arr,dep, n));
        
    }
    
    static int maxGuest(int arr[],int dep[],int n)  
    {  
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1,j=0,res=1,curr=1;
        while(i<n && j<n){
            if(arr[i]<dep[j]){
                curr++;i++;
            }
            else{
                curr--;j++;
            }
            res=Math.max(curr,res);
        }
       return res;
    } 
}


Cycle Sort

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = { 20,40,50,10,30 }; 
        int n = arr.length; 
        cycleSortDistinct(arr, n); 
   
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
        
    }
    
    static void cycleSortDistinct(int arr[], int n) 
    { 
        for(int cs=0;cs<n-1;cs++){
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1;i<n;i++)
                if(arr[i]<item)
                    pos++;
            //swap(item,arr[pos])
            
            int temp=item;
            item=arr[pos];
            arr[pos]=temp;
            while(pos!=cs){
                pos=cs;
                for(int i=cs+1;i<n;i++)
                    if(arr[i]<item)
                        pos++;
                        
                //swap(item,arr[pos])
                temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }
        }
    }
}


Heap Sort

import java.util.*;
import java.io.*;
import java.lang.*;
  
public class HeapSort 
{ 
	public void buildheap(int arr[],int n){
        for (int i = n / 2 - 1; i >= 0; i--) 
		    heapify(arr, n, i);
    }
	
	public void sort(int arr[]) 
	{ 
		int n = arr.length; 

		buildheap(arr,n); 
 
		for (int i=n-1; i>0; i--) 
		{ 
			 
			int temp = arr[0]; 
			arr[0] = arr[i]; 
			arr[i] = temp; 

			heapify(arr, i, 0); 
		} 
	} 

	void heapify(int arr[], int n, int i) 
	{ 
		int largest = i;  
		int l = 2*i + 1; 
		int r = 2*i + 2; 

		if (l < n && arr[l] > arr[largest]) 
			largest = l; 
 
		if (r < n && arr[r] > arr[largest]) 
			largest = r; 

		if (largest != i) 
		{ 
			int swap = arr[i]; 
			arr[i] = arr[largest]; 
			arr[largest] = swap; 

			heapify(arr, n, largest); 
		} 
	} 

	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 
 
	public static void main(String args[]) 
	{ 
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		int n = arr.length; 

		HeapSort ob = new HeapSort(); 
		ob.sort(arr); 

		System.out.println("Sorted array is"); 
		printArray(arr); 
	} 
} 


Counting Sort

Naive

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = { 1,4,4,1,0,1 };
        int n = arr.length; int k=5;
        countSort(arr, n, k); 
   
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
        
    }
    
    static void countSort(int arr[], int n, int k) 
    { 
        int[] count=new int[k];
        for(int i=0;i<k;i++)
            count[i]=0;
        for(int i=0;i<n;i++)
            count[arr[i]]++;
            
        int index=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<count[i];j++){
                arr[index]=i;
                index++;
            }
        }
    }
}


Effficient

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = { 1,4,4,1,0,1 };
        int n = arr.length; int k=5;
        countSort(arr, n, k); 
   
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
        
    }
    
    static void countSort(int arr[], int n, int k) 
    { 
        int[] count=new int[k];
        for(int i=0;i<k;i++)
            count[i]=0;
        for(int i=0;i<n;i++)
            count[arr[i]]++;
            
        for(int i=1;i<k;i++)
        count[i]=count[i-1]+count[i];
    
        int[] output=new int[n];
        for(int i=n-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++)
            arr[i]=output[i];
    }
}


Radix Sort

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = { 319,212,6,8,100,50 };
        int n = arr.length; 
        radixsort(arr, n); 
   
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
        
    }
    
    static void countingSort(int arr[], int n, int exp) 
    { 
        int[] output=new int[n];  
        int[] count=new int[10]; 
        for (int i = 0; i < n; i++) 
            count[(arr[i] / exp) % 10]++; 
      
        for (int i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
      
        for (int i = n - 1; i >= 0; i--) { 
            output[count[(arr[i] / exp) % 10] - 1] = arr[i]; 
            count[(arr[i] / exp) % 10]--; 
        } 
      
        for (int i = 0; i < n; i++) 
            arr[i] = output[i]; 
    }
    
    public static void radixsort(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
      
        for (int exp = 1; mx / exp > 0; exp *= 10) 
            countingSort(arr, n, exp); 
    }
}


Bucket sort

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = { 30,40,10,80,5,12,70 };
        int n = arr.length; int k=4;
        bucketSort(arr, n, k); 
   
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
        
    }
    
    static void bucketSort(int arr[], int n, int k) { 
        
        int max_val=arr[0];
        for(int i=1;i<n;i++)
            max_val=Math.max(max_val,arr[i]); 
        max_val++;
        
        @SuppressWarnings("unchecked") 
        Vector<Integer>[] buckets = new Vector[n]; 
  
        for (int i = 0; i < n; i++) { 
            buckets[i] = new Vector<Integer>(); 
        } 
   
        for (int i = 0; i < n; i++) { 
            int idx = (arr[i] * k)/max_val; 
            buckets[(int)idx].add(arr[i]); 
        } 
  
        for (int i = 0; i < k; i++) { 
            Collections.sort(buckets[i]); 
        } 
  
        int index = 0; 
        for (int i = 0; i < k; i++) { 
            for (int j = 0; j < buckets[i].size(); j++) { 
                arr[index++] = buckets[i].get(j); 
            } 
        } 
    }
}


*/