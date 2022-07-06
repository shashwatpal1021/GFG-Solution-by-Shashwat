find the second largest element in an array.

N:
#include <stdio.h>

int getlargest(int a[],int n)
{
    int largest=0;
    
    for(int i=1;i<n;i++)
    {
        if(a[i]>a[largest])
        {
            largest=i;
        }
    }
    return largest;
}

int secondlargest(int a[],int n)
{
    int largest=getlargest(a,n);
    int res=-1;
    
    for(int i=0;i<n;i++)
    {
        if(a[i]!=a[largest])
        {
            if(res==-1)
            res=i;
            else if(a[i]>a[res])
            res=i;
        }
    }
    return res;
}
int main() 
{
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int pos=secondlargest(a,n);
    printf("%d ",a[pos]);
    
	return 0;
    
}

E:
#include <stdio.h>

int secondlargest(int a[],int n)
{
    int largest=0;
    int res=-1;
    
    for(int i=1;i<n;i++)
    {
        if(a[i]>a[largest])
        {
            res=largest;
            largest=i;
        }
        else if(a[i]!=a[largest])
        {
            if(res==-1||a[i]>a[res])
            res=i;
        }
    }
    return res;
}
int main() 
{
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int pos=secondlargest(a,n);
    printf("%d ",a[pos]);
    
	return 0;
    
}


check if an array is sorted by
N:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static boolean isSorted(int arr[], int n)
    {
    	for(int i = 1; i < n; i++)
    	{
    	    if(arr[i] < arr[i - 1])
    	        return false;
    	}

    	return true;
    } 

    public static void main(String args[]) 
    { 
       int arr[] = {5, 12, 30, 2, 35}, n = 5;

       System.out.println(isSorted(arr, n));
    } 
}
E:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static boolean isSorted(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[j] < arr[i])
    				return false;
    		}
    	}

    	return true;
    } 

    public static void main(String args[]) 
    { 
       int arr[] = {7, 2, 30, 10}, n = 4;

       System.out.println(isSorted(arr, n));
    } 
}


reverse an array

import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static void reverse(int arr[], int n)
    {
    	int low = 0, high = n - 1;

    	while(low < high)
    	{
    		int temp = arr[low];

    		arr[low] = arr[high];

    		arr[high] = temp;

    		low++;
    		high--;
    	}
    }

    public static void main(String args[]) 
    { 
       int arr[] = {10, 5, 7, 30}, n = 4;

       System.out.println("Before Reverse");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       reverse(arr, n);

       System.out.println("After Reverse");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}


remove duplicates from sorted array
N:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static int remDups(int arr[], int n)
    {
    	int temp[] = new int[n];

    	temp[0] = arr[0];

    	int res = 1;

    	for(int i = 1; i < n; i++)
    	{
    		if(temp[res - 1] != arr[i])
    		{
    			temp[res] = arr[i];
    			res++;
    		}
    	}

    	for(int i = 0; i < res; i++)
    	{
    		arr[i] = temp[i];
    	}

    	return res;
    }

    public static void main(String args[]) 
    { 
       int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;

       System.out.println("Before Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       n = remDups(arr, n);

       System.out.println("After Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}
E:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static int remDups(int arr[], int n)
    {
    	int res = 1;

    	for(int i = 1; i < n; i++)
    	{
    		if(arr[res - 1] != arr[i])
    		{
    			arr[res] = arr[i];
    			res++;
    		}
    	}

    	return res;
    }

    public static void main(String args[]) 
    { 
       int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;

       System.out.println("Before Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       n = remDups(arr, n);

       System.out.println("After Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}

left rotate by one place in
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static void lRotateOne(int arr[], int n)
    {
    	int temp = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		arr[i - 1] = arr[i];
    	}

    	arr[n - 1] = temp;
    }

    public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5;

       System.out.println("Before Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       lRotateOne(arr, n);

       System.out.println("After Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}

left rotate by d place 
N:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static void lRotateOne(int arr[], int n)
    {
    	int temp = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		arr[i - 1] = arr[i];
    	}

    	arr[n - 1] = temp;
    }

    static void leftRotate(int arr[], int d, int n)
    {
    	for(int i = 0; i < d; i++)
    	{
    		lRotateOne(arr, n);
    	}
    }

    public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

       System.out.println("Before Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       leftRotate(arr, d, n);

       System.out.println("After Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}
E:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static void leftRotate(int arr[], int d, int n)
    {
    	int temp[] = new int[d];

    	for(int i = 0; i  < d; i++)
    	{
    		temp[i] = arr[i];
    	}

    	for(int i = d; i  < n; i++)
    	{
    		arr[i - d] = arr[i];
    	}

    	for(int i = 0; i  < d; i++)
    	{
    		arr[n - d + i] = temp[i];
    	}	
    }

    public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

       System.out.println("Before Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       leftRotate(arr, d, n);

       System.out.println("After Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}
R:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static void leftRotate(int arr[], int d, int n)
    {
    	reverse(arr, 0, d - 1);

    	reverse(arr, d, n - 1);

    	reverse(arr, 0, n - 1);

    }

    static void reverse(int arr[], int low, int high)
    {
    	while(low < high)
    	{
    		int temp = arr[low];
    		arr[low] = arr[high];
    		arr[high] = temp;

    		low++;
    		high--;
    	}
    }

    public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

       System.out.println("Before Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       leftRotate(arr, d, n);

       System.out.println("After Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}

leader problem 
there is no element greater than it on the right side.

N:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static void leaders(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    		boolean flag = false;

    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[i] <= arr[j])
    			{
    				flag = true;
    				break;
    			}
    		}

    		if(flag == false)
    		{
    			System.out.print(arr[i]+" ");
    		}
    	}
    }


    public static void main(String args[]) 
    { 
       int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;

       leaders(arr, n);

    } 

}
E:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static void leaders(int arr[], int n)
    {
    	int curr_ldr = arr[n - 1];

    	System.out.print(curr_ldr+" ");

    	for(int i = n - 2; i >= 0; i--)
    	{
    		if(curr_ldr < arr[i])
    		{
    			curr_ldr = arr[i];

    			System.out.print(curr_ldr+" ");
    		}
    	}
    }


    public static void main(String args[]) 
    { 
       int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;

       leaders(arr, n);

    } 

}

Maximum Difference problem is to find the maximum of arr[j] - arr[i] where j>i.:

N:import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxDiff(int arr[], int n)
    {
    	int res = arr[1] - arr[0];

    	for(int i = 0; i < n - 1; i++)
    	{
    		for(int j = i + 1; j < n; j++)
    		{
    			res = Math.max(res, arr[j] - arr[i]);
    		}
    	}

    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;

       System.out.println(maxDiff(arr, n));

    } 

}

E:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxDiff(int arr[], int n)
    {
    	int res = arr[1] - arr[0], minVal = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		
    			res = Math.max(res, arr[i] - minVal);
    			
    			minVal = Math.min(minVal, arr[i]);
    	}

    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;

       System.out.println(maxDiff(arr,n));

    } 

}

Frequencies in A Sorted Array

import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static void printFreq(int arr[], int n)
    {
    	int freq = 1, i = 1;

    	while(i < n)
    	{
    		while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}

    		System.out.println(arr[i - 1] + " " + freq);

    		i++;
    		freq = 1;
    	}
    }


    public static void main(String args[]) 
    { 
       int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;

       printFreq(arr, n);

    } 

}

Stock Buy and Sell Problem.

import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxProfit(int price[], int start, int end)
    {
    	if(end <= start)
    		return 0;

    	int profit = 0;

    	for(int i = start; i < end; i++)
    	{
    		for(int j = i + 1; j <= end; j++)
    		{
    			if(price[j] > price[i])
    			{
    				int curr_profit = price[j] - price[i] 
    								  + maxProfit(price, start, i - 1)
    								  + maxProfit(price, j + 1, end);

    				profit = Math.max(profit, curr_profit);
    			}
    		}
    	}

    	return profit;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, 5, 3, 8, 12}, n = 5;

       System.out.println(maxProfit(arr, 0, n-1));

    } 

}

the Stock Buy and Sell Problem.2
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxProfit(int price[], int n)
    {
    	int profit = 0;

    	for(int i = 1; i < n; i++)
    	{
    		if(price[i] > price[i - 1])
    			profit += price[i] - price[i -1];
    	}
    
    	return profit;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, 5, 3, 8, 12}, n = 5;

       System.out.println(maxProfit(arr, n));

    } 

}

Trapping Rain Water Problem.
N:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int getWater(int arr[], int n)
    {
    	int res = 0;

    	for(int i = 1; i < n - 1; i++)
    	{
    		int lMax = arr[i];

    		for(int j = 0; j < i; j++)
    			lMax = Math.max(lMax, arr[j]);

    		int rMax = arr[i];

    		for(int j = i + 1; j < n; j++)
    			rMax = Math.max(rMax, arr[j]);

    		res = res + (Math.min(lMax, rMax) - arr[i]);
    	}
    
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {3, 0, 1, 2, 5}, n = 5;

      System.out.println( getWater(arr, n));

    } 

}
E:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int getWater(int arr[], int n)
    {
    	int res = 0;

    	int lMax[] = new int[n];
    	int rMax[] = new int[n];

    	lMax[0] = arr[0];
    	for(int i = 1; i < n; i++)
    		lMax[i] = Math.max(arr[i], lMax[i - 1]);


    	rMax[n - 1] = arr[n - 1];
    	for(int i = n - 2; i >= 0; i--)
    		rMax[i] = Math.max(arr[i], rMax[i + 1]);

    	for(int i = 1; i < n - 1; i++)
    		res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {5, 0, 6, 2, 3}, n = 5;

      System.out.println( getWater(arr, n));

    } 

}

maximum consecutive 1s in a binary array.

N:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxConsecutiveOnes(int arr[], int n)
    {
    	int res = 0;

    	for(int i = 0; i < n; i++)
    	{
    		int curr = 0;

    		for(int j = i; j < n; j++)
    		{
    			if(arr[j] == 1) curr++;
    			else break;
    		}

    		res = Math.max(res, curr);
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {0, 1, 1, 1, 0, 1, 1}, n = 7;

       System.out.println(maxConsecutiveOnes(arr, n));

    } 

}
E:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxConsecutiveOnes(int arr[], int n)
    {
    	int res = 0, curr = 0;

    	for(int i = 0; i < n; i++)
    	{
    		if(arr[i] == 0)
    			curr = 0;
    		else
    		{
    			curr++;

    			res = Math.max(res, curr);
    		}
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {0, 1, 1, 0, 1, 1, 1}, n = 7;

       System.out.println(maxConsecutiveOnes(arr, n));

    } 

}

Maximum subarray sum:

N:import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxSum(int arr[], int n)
    {
    	int res = arr[0];

    	for(int i = 0; i < n; i++)
    	{
    		int curr = 0;

    		for(int j = i; j < n; j++)
    		{
    			curr = curr + arr[j];

    			res = Math.max(res, curr);
    		}
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, -2, 3, -1, 2}, n = 5;

       System.out.println(maxSum(arr, n));

    } 

}
E:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxSum(int arr[], int n)
    {
    	int res = arr[0];

    	int maxEnding = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		maxEnding = Math.max(maxEnding + arr[i], arr[i]);

    		res = Math.max(maxEnding, res);
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, -2, 3, -1, 2}, n = 5;

       System.out.println(maxSum(arr, n));

    } 

}

 find the length of the longest subarray that has alternating even odd elements
 N:
 import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxEvenOdd(int arr[], int n)
    {
    	int res = 1;

    	for(int i = 0; i < n; i++)
    	{
    		int curr = 1;

    		for(int j = i + 1; j < n; j++)
    		{
    			if((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0)
    			   ||(arr[j] % 2 != 0 && arr[j - 1] % 2 == 0))
    				curr++;
    			else
    				break;
    		}

    		res = Math.max(res, curr);
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {5, 10, 20, 6, 3, 8}, n = 6;

       System.out.println(maxEvenOdd(arr, n));

    } 

}
E:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxEvenOdd(int arr[], int n)
    {
    	int res = 1;
    	int curr = 1;

    	for(int i = 1; i < n; i++)
    	{
    			if((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)
    			   ||(arr[i] % 2 != 0 && arr[i - 1] % 2 == 0))
    				{
    					curr++;

    					res = Math.max(res, curr);
    				}
    				else
    					curr = 1;
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {5, 10, 20, 6, 3, 8}, n = 6;

       System.out.println(maxEvenOdd(arr, n));

    } 

}

find maximum circular sum subarray of a given array
N:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxCircularSum(int arr[], int n)
    {
    	int res = arr[0];

    	for(int i = 0; i < n; i++)
    	{
    		int curr_max = arr[i];
    		int curr_sum = arr[i];

    		for(int j = 1; j < n; j++)
    		{
    			int index = (i + j) % n;

    			curr_sum += arr[index];

    			curr_max = Math.max(curr_max, curr_sum);
    		}

    		res = Math.max(res, curr_max);
    	}
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {5, -2, 3, 4}, n = 4;

       System.out.println(maxCircularSum(arr, n));

    } 

}
E:
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static int normalMaxSum(int arr[], int n)
    {
    	int res = arr[0];

    	int maxEnding = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		maxEnding = Math.max(maxEnding + arr[i], arr[i]);

    		res = Math.max(maxEnding, res);
    	}
    	
    	return res;
    }

    static int overallMaxSum(int arr[], int n)
    {
    	int max_normal = normalMaxSum(arr, n);

    	if(max_normal < 0)
    		return max_normal;

    	int arr_sum = 0;

    	for(int i = 0; i < n; i++)
    	{
    		arr_sum += arr[i];

    		arr[i] = -arr[i];
    	}

    	int max_circular = arr_sum + normalMaxSum(arr, n);

    	return Math.max(max_circular, max_normal);
    }


    public static void main(String args[]) 
    { 
       int arr[] = {8, -4, 3, -5, 4}, n = 5;

       System.out.println(overallMaxSum(arr, n));

    } 

}

sliding window

Find subarray with given sum

class SubarraySum 
{ 
	/* Returns true if the there is a subarray of arr[] with sum equal to 
	'sum' otherwise returns false. Also, prints the result */
	int subArraySum(int arr[], int n, int sum) 
	{ 
		int curr_sum = arr[0], start = 0, i; 

		// Pick a starting point 
		for (i = 1; i <= n; i++) 
		{ 
			// If curr_sum exceeds the sum, then remove the starting elements 
			while (curr_sum > sum && start < i-1) 
			{ 
				curr_sum = curr_sum - arr[start]; 
				start++; 
			} 
			
			// If curr_sum becomes equal to sum, then return true 
			if (curr_sum == sum) 
			{ 
				int p = i-1; 
				System.out.println("Sum found between indexes " + start 
						+ " and " + p); 
				return 1; 
			} 
			
			// Add this element to curr_sum 
			if (i < n) 
			curr_sum = curr_sum + arr[i]; 
			
		} 

		System.out.println("No subarray found"); 
		return 0; 
	} 

	public static void main(String[] args) 
	{ 
		SubarraySum arraysum = new SubarraySum(); 
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
		int n = arr.length; 
		int sum = 23; 
		arraysum.subArraySum(arr, n, sum); 
	} 
} 

Maximum Sum of K Consecutive elements(Naive)


import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 

    static int maxSum(int arr[], int n, int k)
    {
    	int max_sum = Integer.MIN_VALUE;
    	for(int i = 0; i + k - 1 < n; i++)
    	{
    		int sum = 0;

    		for(int j = 0; j < k; j++)
    		{
    			sum += arr[i + j];
    		}

    		max_sum = Math.max(max_sum, sum);
    	}

    	return max_sum;

    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

       System.out.println(maxSum(arr, n, k));

    } 

}
Maximum Sum of K Consecutive elements(Efficient)

import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 

    static int maxSum(int arr[], int n, int k)
    {
    	int curr_sum = 0;

    	for(int i = 0; i < k; i++)
    		curr_sum += arr[i];

    	int max_sum = curr_sum;

    	for(int i = k; i < n; i++)
    	{
    		curr_sum += (arr[i] - arr[i - k]);

    		max_sum = Math.max(max_sum, curr_sum);
    	}

    	return max_sum;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

       System.out.println(maxSum(arr, n, k));

    } 

}


Prefix Sum Array

import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 

    static int[] preSum(int arr[], int n)
    {
    	
    	int prefix_sum[] = new int[n];

    	prefix_sum[0] = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		prefix_sum[i] = prefix_sum[i - 1] + arr[i];
    	}
    	
    	return prefix_sum;
    }

    static int getSum(int prefix_sum[], int l, int r)
    {
    	if(l != 0)
    		return prefix_sum[r] - prefix_sum[l - 1];
    	else
    		return prefix_sum[r];
    }
    
    
    public static void main(String args[]) 
    { 
       int arr[] = {2, 8, 3, 9, 6, 5, 4}, n = 7;

       int prefix_sum[] = preSum(arr, n);

       System.out.println(getSum(prefix_sum, 1, 3));
       
       System.out.println(getSum(prefix_sum, 0, 2));
       
    } 

}
Equilibrium Point(Naive Method)
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 

  
    static boolean checkEquilibrium(int arr[], int n)
    {
    	for(int i  = 0; i < n; i++)
    	{
    		int l_sum = 0, r_sum = 0;

    		for(int j = 0; j < i; j++)
    			l_sum += arr[j];

    		for(int j = i + 1; j < n; j++)
    			r_sum += arr[j];

    		if(l_sum == r_sum)
    			return true;
    	}

    	return false;
    }
    public static void main(String args[]) 
    { 
       int arr[] = {3, 4, 8, -9, 20, 6}, n = 6;

       System.out.println(checkEquilibrium(arr, n));

    } 

}
Equilibrium Point(Efficient Method)
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 

  
    static boolean checkEquilibrium(int arr[], int n)
    {
    	int sum = 0;

    	for(int i = 0; i < n; i++)
    	{
    		sum += arr[i];
    	}

    	int l_sum = 0;

    	for(int i = 0; i < n; i++)
    	{
    		if(l_sum == sum - arr[i])
    			return true;

    		l_sum += arr[i];

    		sum -= arr[i];
    	}

    	return false;
    }
    public static void main(String args[]) 
    { 
       int arr[] = {3, 4, 8, -9, 20, 6}, n = 6;

       System.out.println(checkEquilibrium(arr, n));

    } 

}

Maximum Occuring Element

import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 


    static int maxOcc(int L[], int R[], int n)
    {	
	    	int arr[] = new int[1000];

	    	for(int i = 0; i < n; i++)
	    	{
	    		arr[L[i]]++;

	    		arr[R[i] + 1]--;
	    	}

	    	int maxm = arr[0], res = 0;

	    	for(int i = 1; i < 1000; i++)
	    	{
	    		arr[i] += arr[i - 1];

	    		if(maxm < arr[i])
	    		{
	    			maxm = arr[i];

	    			res = i;
	    		}
	    	}

	    	return res;
    }
    public static void main(String args[]) 
    { 
       int L[] = {1, 2, 3}, R[] = {3, 5, 7}, n = 3;

      System.out.println(maxOcc(L, R, n)); 
      
    } 

}


# searching

Given a sorted array with repetition and an element x, we need to find index of first occurrence of x.
N:
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
	
	

	static int firstOccurrence(int arr[], int n, int x)
	{
		for(int i = 0; i < n; i++)
			if(arr[i] == x)
				return i;

		return -1;
	}

	public static void main(String args[]) 
    {
        int arr[] = {5, 10, 10, 15, 15}, n = 5;

		int x = 15;
    
        System.out.println(firstOccurrence(arr, n, x));
		
    } 

}
E recur:
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
	
	

	static int firstOcc(int arr[], int low, int high, int x)
	{
		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if(x > arr[mid])
			return firstOcc(arr, mid + 1, high, x);

		else if(x < arr[mid])
			return firstOcc(arr, low, mid - 1, x);

		else
		{
			if(mid == 0 || arr[mid - 1] != arr[mid])
				return mid;

			else
				return firstOcc(arr, low, mid - 1, x);
		}
	}

	public static void main(String args[]) 
    {
        int arr[] = {5, 10, 10, 15, 20, 20, 20}, n = 7;

		int x = 20;
		
		System.out.println(firstOcc(arr, 0, n - 1, x));


    } 

}
E Ite:
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
	
	

	static int firstOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == 0 || arr[mid - 1] != arr[mid])
					return mid;

				else
					high = mid - 1;
			}

		}

		return -1;
	}

	public static void main(String args[]) 
    {
        int arr[] = {5, 10, 10, 10, 20}, n = 5;

		int x = 10;

        System.out.println(firstOcc(arr, n, x));
    } 

}

Given a sorted array with repetition and an element x, we need to find index of last occurrence of x.
iter:

import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
	
	

	static int lastOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == n - 1 || arr[mid + 1] != arr[mid])
					return mid;

				else
					low = mid + 1;
			}

		}

		return -1;
	}


	public static void main(String args[]) 
    {
        int arr[] = {5, 10, 10, 10, 10, 20, 20}, n = 7;

		int x = 10;

		System.out.println(lastOcc(arr, n, x));

    } 

}

recur:
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
	
	

	static int lastOcc(int arr[], int low, int high, int x, int n)
	{
		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if(x > arr[mid])
			return lastOcc(arr, mid + 1, high, x, n);

		else if(x < arr[mid])
			return lastOcc(arr, low, mid - 1, x, n);

		else
		{
			if(mid == n - 1 || arr[mid + 1] != arr[mid])
				return mid;

			else
				return lastOcc(arr, mid + 1, high, x, n);
		}
	}

	public static void main(String args[]) 
    {
        int arr[] = {5, 10, 10, 10, 10, 20, 20}, n = 7;

		int x = 10;

        System.out.println(lastOcc(arr, 0, n - 1, x, n));
    } 

}
Given a sorted array and an element x, we need to count occurrences of x in the array.
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
	
	static int firstOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == 0 || arr[mid - 1] != arr[mid])
					return mid;

				else
					high = mid - 1;
			}

		}

		return -1;
	}

	static int lastOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == n - 1 || arr[mid + 1] != arr[mid])
					return mid;

				else
					low = mid + 1;
			}

		}

		return -1;
	}
	
	
	static int countOcc(int arr[], int n, int x)
	{
		int first = firstOcc(arr, n, x);

		if(first == -1)
			return 0;
		else 
			return lastOcc(arr, n, x) - first + 1;
	}

	public static void main(String args[]) 
    {
        int arr[] = {10, 20, 20, 20, 40, 40}, n = 6;

		int x = 20;

		System.out.println(countOcc(arr, n, x));

    } 

}
Given a sorted binary array, we need to count 1s in this array.

import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
	

	static int countOnes(int arr[], int n)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(arr[mid] == 0)
				low = mid + 1;
			else
			{
				if(mid == 0 || arr[mid - 1] == 0)
					return (n - mid);
				else 
					high = mid -1;
			}
		}

		return 0;		
	}

	public static void main(String args[]) 
    {
        int arr[] = {0, 0, 1, 1, 1, 1}, n = 6;


		System.out.println(countOnes(arr, n));

    } 

}
given an integer, we need to find floor of its square root.
N:
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
	

	static int sqRootFloor(int x)
	{
		int i = 1;

		while(i * i <= x)
			i++;

		return i - 1;
	}

	public static void main(String args[]) 
    {

		System.out.println(sqRootFloor(15));

    } 

}

E:
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
	

	static int sqRootFloor(int x)
	{
		int low = 1, high = x, ans = -1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			int mSq = mid * mid;

			if(mSq == x)
				return mid;
			else if(mSq > x)
				high = mid - 1;
			else
			{
				low = mid + 1;
				ans = mid;
			}
		}

		return ans;
	}

	public static void main(String args[]) 
    {

		System.out.println(sqRootFloor(10));

    } 

}


Given an infinite sized array, we need to write an efficient solution to search an element.

N:
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
	

	static int search(int arr[], int x)
	{
		int i = 0;

		while(true)
		{
			if(arr[i] == x) return i;

			if(arr[i] > x) return -1;

			i++;
		}
	}

	public static void main(String args[]) 
    {

		int arr[] = {1, 2, 3, 5, 5};

		int x = 4;

		System.out.println(search(arr, x));

    } 

}

E:  
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 
		static int bSearch(int arr[], int low, int high, int x)
		{
			if(low > high)
				return -1;

			int mid = (low + high) / 2;

			if(arr[mid] == x)
				return mid;

			else if(arr[mid] > x)
				return bSearch(arr, low, mid - 1, x);

			else
				return bSearch(arr, mid + 1, high, x);
		}

	static int search(int arr[], int x)
	{
		if(arr[0] == x) return 0;

		int i = 1;

		while(arr[i] < x)
			i = i * 2;

		if(arr[i] == x) return i;


		return bSearch(arr, i / 2 + 1, i - 1, x);
	}

	public static void main(String args[]) 
    {

		int arr[] = {1, 2, 3, 40, 50};

		int x = 4;

        System.out.println(search(arr, x));


    } 

}


To search an element in a sorted and rotated array.
N:
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 

	static int search(int arr[], int n, int x)
	{
		for(int i = 0; i < n; i++)
			if(arr[i] == x)
				return i;

		return -1;
	}

	public static void main(String args[]) 
    {

		int arr[] = {100, 200, 400, 1000, 10, 20}, n = 6;

		int x = 10;

        System.out.println(search(arr, n, x));

    } 

}
E:
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 

	static int search(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(arr[mid] == x)
				return mid;
			if(arr[low] < arr[mid])
			{
				if(x >= arr[low] && x < arr[mid])
					high = mid - 1;
				else 
					low = mid + 1;
			}
			else
			{
				if(x > arr[mid] && x <= arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		

		return -1;
	}

	public static void main(String args[]) 
    {

		int arr[] = {10, 20, 40, 60, 5, 8}, n = 6;

		int x = 5;

        System.out.println(search(arr, n, x));

    } 

}


find a peak element

import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 

	static int getPeak(int arr[], int n)
	{
		if(n == 1)
			return arr[0];
		if(arr[0] >= arr[1])
			return arr[0];
		if(arr[n - 1] >= arr[n - 2])
			return arr[n - 1];

		for(int i = 1; i < n - 1; i++)
			if(arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return arr[i];
				
		return -1;
	}

	public static void main(String args[]) 
    {

		int arr[] = {5, 10, 11, 12, 20, 12}, n = 6;

        System.out.println(getPeak(arr, n));

    } 

}

E:
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 

	static int getPeak(int arr[], int n)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if((mid == 0 || arr[mid - 1] <= arr[mid]) &&
				(mid == n - 1 || arr[mid + 1] <= arr[mid]))
				return mid;
			if(mid > 0 && arr[mid - 1] >= arr[mid])
				high = mid -1;
			else
				low = mid + 1;
		}
		
		return -1;
	}

	public static void main(String args[]) 
    {

		int arr[] = {5, 20, 40, 30, 20, 50, 60}, n = 7;

        System.out.println(getPeak(arr, n));

    } 

}
Find pair in unsorted array which gives sum X

// Java implementation using Hashing 
import java.io.*; 
import java.util.HashSet; 

class PairSum { 
	static void printpairs(int arr[], int sum) 
	{ 
		HashSet<Integer> s = new HashSet<Integer>(); 
		for (int i = 0; i < arr.length; ++i) { 
			int temp = sum - arr[i]; 

			// checking for condition 
			if (s.contains(temp)) { 
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")"); 
			} 
			s.add(arr[i]); 
		} 
	} 

	// Main to test the above function 
	public static void main(String[] args) 
	{ 
		int A[] = { 1, 4, 45, 6, 10, 8 }; 
		int n = 16; 
		printpairs(A, n); 
	} 
} 


Find pair in sorted array which gives sum X :

import java.util.*;
import java.io.*;
import java.lang.*;

class Solution
{
    static int isPresent(int arr[], int n, int sum)
    {
        int l = 0, h = n-1;
        
        
        while(l <= h)
        {
            if(arr[l] + arr[h] == sum)
              return 1;
            else if(arr[l] + arr[h] > sum)
                h--;
            else l++;
        }
        
        return 0;
    }
    public static void main (String[] args) {
        int arr[] = new int[]{2, 3, 7, 8, 11};
        int n = arr.length;
        int sum = 14;
        
        System.out.println(isPresent(arr, n, sum));
        
    }
}
Find triplet in an array which gives sum X

// Java program to find a triplet 
class FindTriplet { 

	// returns true if there is triplet with sum equal 
	// to 'sum' present in A[]. Also, prints the triplet 
	boolean find3Numbers(int A[], int arr_size, int sum) 
	{ 
		int l, r; 

		/* Sort the elements */
		quickSort(A, 0, arr_size - 1); 

		/* Now fix the first element one by one and find the 
		other two elements */
		for (int i = 0; i < arr_size - 2; i++) { 

			// To find the other two elements, start two index variables 
			// from two corners of the array and move them toward each 
			// other 
			l = i + 1; // index of the first element in the remaining elements 
			r = arr_size - 1; // index of the last element 
			while (l < r) { 
				if (A[i] + A[l] + A[r] == sum) { 
					System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]); 
					return true; 
				} 
				else if (A[i] + A[l] + A[r] < sum) 
					l++; 

				else // A[i] + A[l] + A[r] > sum 
					r--; 
			} 
		} 

		// If we reach here, then no triplet was found 
		return false; 
	} 

	int partition(int A[], int si, int ei) 
	{ 
		int x = A[ei]; 
		int i = (si - 1); 
		int j; 

		for (j = si; j <= ei - 1; j++) { 
			if (A[j] <= x) { 
				i++; 
				int temp = A[i]; 
				A[i] = A[j]; 
				A[j] = temp; 
			} 
		} 
		int temp = A[i + 1]; 
		A[i + 1] = A[ei]; 
		A[ei] = temp; 
		return (i + 1); 
	} 

	/* Implementation of Quick Sort 
	A[] --> Array to be sorted 
	si --> Starting index 
	ei --> Ending index 
	*/
	void quickSort(int A[], int si, int ei) 
	{ 
		int pi; 

		/* Partitioning index */
		if (si < ei) { 
			pi = partition(A, si, ei); 
			quickSort(A, si, pi - 1); 
			quickSort(A, pi + 1, ei); 
		} 
	} 

	// Driver program to test above functions 
	public static void main(String[] args) 
	{ 
		FindTriplet triplet = new FindTriplet(); 
		int A[] = { 1, 4, 45, 6, 10, 8 }; 
		int sum = 22; 
		int arr_size = A.length; 

		triplet.find3Numbers(A, arr_size, sum); 
	} 
} 
median of two sorted array
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 

	static double getMed(int a1[], int a2[], int n1, int n2)
	{
		int begin1 = 0, end1 = n1;

		while(begin1 < end1)
		{
			int i1 = (begin1 + end1) / 2;
			int i2 = ((n1 + n2 + 1) / 2 )- i1;

			int min1 = (i1 == n1)?Integer.MAX_VALUE:a1[i1];
			int max1 = (i1 == 0)?Integer.MIN_VALUE:a1[i1 - 1];
			
			int min2 = (i2 == n2)?Integer.MAX_VALUE:a2[i2];
			int max2 = (i2 == 0)?Integer.MIN_VALUE:a2[i2 - 1];

			if(max1 <= min2 && max2 <= min1)
			{
				if((n1 + n2) % 2 == 0)
					return ((double)Math.max(max1, max2) + Math.min(min1, min2)) / 2;
				else
					return (double) Math.max(max1, max2);
			}
			else if(max1 > min2)
				end1 = i1 - 1;
			else 
				begin1 = i1 + 1;
		}
		
		return -1;
	}

	public static void main(String args[]) 
    {

		int a1[] = {10, 20, 30, 40, 50}, n1 = 5, a2[] = {5, 15, 25, 35, 45}, n2 = 5;
		
        System.out.println(getMed(a1, a2, n1, n2));


    } 

}


Repeating Elements 1
import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 

	static int repeat(int arr[], int n)
	{
		boolean visit[] = new boolean[n];

		for(int i = 0; i < n; i++)
		{
			if(visit[arr[i]])
				return arr[i];
			visit[arr[i]] = true;
		}

		return -1;
	}

	public static void main(String args[]) 
    {

		int arr[] = {0, 2, 1, 3, 2, 2}, n= 6;

        System.out.println(repeat(arr, n));

    } 

}
Repeating Elements 2

import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 

	static int repeat(int arr[], int n)
	{
		int slow = arr[0], fast = arr[0];

		do{
			slow = arr[slow];
			fast = arr[arr[fast]];
		
		}while(slow != fast);
		
		slow = arr[0];

		while(slow != fast)
		{
			slow = arr[slow];
			fast = arr[fast];
		}
		return slow;
	}

	public static void main(String args[]) 
    {

		int arr[] = {1, 3, 2, 4, 6, 5, 7, 3}, n= 8;

        System.out.println(repeat(arr, n));

    } 

}


# sorting


Bubble Sort.

N:/*package whatever //do not write package name here */

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
E:
/*package whatever //do not write package name here */

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


Selection Sort.

/*package whatever //do not write package name here */

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


Insertion Sort

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


 two sorted arrays and merge them.


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


E:import java.util.*;
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


Merge Sorting Algorithm


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


two sorted arrays and picking out the intersection elements from the two arrays.


N:import java.util.*;
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
E:import java.util.*;
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

union of the two arrays.:

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
E:
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


QuickSort using the method of Lomuto Partition

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


Kth smallest element from a given array.import java.util.*;
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
E:import java.util.*;
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


Cycle Sort algorithm,
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



