find the second largest element in an array.

N:{
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
}

E:
{
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
}

check if an array is sorted by
N:
{
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
}
E:
{
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
}