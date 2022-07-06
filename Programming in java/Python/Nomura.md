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
