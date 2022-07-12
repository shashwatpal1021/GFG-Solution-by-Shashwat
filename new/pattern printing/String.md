# IsSubSequence

/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    
    static boolean isSubSeq(String s1, String s2, int n, int m){
        int j = 0;
        for(int i = 0; i < n && j < m; i++){
            if(s1.charAt(i) == s2.charAt(j))
            j++;
        }
        
        return j == m;
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();
		
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		
		System.out.println(isSubSeq(s1, s2, n, m));
		
	}
}
 ## Recursive
/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    
    static boolean isSubSeq(String s1, String s2, int n, int m){
        if( m == 0 )
            return true;
        
        if( n == 0 )
            return false;
            
        if ( s1.charAt(n-1) == s2.charAt(m-1) )
            return isSubSeq(s1, s2, n-1, m-1);
        
        else
            return isSubSeq(s1, s2, n-1, m);
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();
		
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		
		System.out.println(isSubSeq(s1, s2, n, m));
		
	}
}

# Anagram
### Naive

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
  
    static boolean areAnagram(String s1, String s2) 
    { 
       
        if (s1.length() != s2.length()) 
            return false; 
  
       char a1[]=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);
        char a2[]=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
        
        return s1.equals(s2);
    } 
  
    public static void main(String args[]) 
    { 
        String str1 = "abaac"; 
        String str2 = "aacba";  
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
} 

### Efficient

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
    
    static final int CHAR=256;
        
    static boolean areAnagram(String s1, String s2) 
    { 
       
        if (s1.length() != s2.length()) 
            return false; 
  
       int[] count=new int[CHAR];
    for(int i=0;i<s1.length();i++){
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;
    }
    
    for(int i=0;i<CHAR;i++){
        if(count[i]!=0)return false;
    }
    return true;
    } 
  
    public static void main(String args[]) 
    { 
        String str1 = "abaac"; 
        String str2 = "aacba";  
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
} 


# Left Most Repeating Character 

### Naive

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
        
    static int leftMost(String str) 
    {
    for(int i=0;i<str.length();i++){
        for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j))return i;
        }
    }
    return -1;
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));  
    } 
} 

### Better
import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
        static final int CHAR=256;
    static int leftMost(String str) 
    {
    int[] count=new int[CHAR];
    for(int i=0;i<str.length();i++){
        count[str.charAt(i)]++;
    }
    for(int i=0;i<str.length();i++){
        if(count[str.charAt(i)]>1)return i;
    }
    return -1;
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));  
    } 
} 

### Efficient 1

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
        static final int CHAR=256;
    static int leftMost(String str) 
    {
    int[] fIndex=new int[CHAR];
    Arrays.fill(fIndex,-1);
    int res=Integer.MAX_VALUE;
    for(int i=0;i<str.length();i++){
        int fi=fIndex[str.charAt(i)];
        if(fi==-1)
        fIndex[str.charAt(i)]=i;
        else
        res=Math.min(res,fi);
    }
    
    return (res==Integer.MAX_VALUE)?-1:res;
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));  
    } 
} 

### Efficient 2

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
        static final int CHAR=256;
    static int leftMost(String str) 
    {
    boolean[] visited=new boolean[CHAR];
    int res=-1;
    for(int i=str.length()-1;i>=0;i--){
        if(visited[str.charAt(i)])
        res=i;
        else
        visited[str.charAt(i)]=true;
    }
    
    return res;
    
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));  
    } 
} 

# reverse word in a string

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
       
    static void reverse(char str[],int low, int high){
    while(low<=high){
        //swap
        char temp=str[low];
        str[low]=str[high];
        str[high]=temp;
        //
        low++;
        high--;
    }
    }

    static void reverseWords(char str[],int n){
    int start=0;
    for(int end=0;end<n;end++){
        if(str[end]==' '){
            reverse(str,start,end-1);
            start=end+1;
        }
    }
    reverse(str,start,n-1);
    reverse(str,0,n-1);
    }
  
    public static void main(String args[]) 
    {   String s = "Welcome to Gfg";int n=s.length();
        char[] str = s.toCharArray();
        System.out.println("After reversing words in the string:");
        reverseWords(str,n);
        System.out.println(str);  
    } 
} 

# string are Rotation

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
    
    static boolean areRotations(String s1,String s2){
    if(s1.length()!=s2.length())return false;
    return ((s1+s1).indexOf(s2)>=0);
    }


  
    public static void main(String args[]) 
    {   String s1 = "ABCD";String s2="CDAB";
        if(areRotations(s1,s2)){System.out.println("Strings are rotations of each other");}
        else{System.out.println("Strings are not rotations of each other");}  
    } 
} 

## Anagram search

### naive

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
    static final int CHAR=256;
    static boolean areAnagram(String pat, String txt,int i) 
    { 
        int[] count=new int[CHAR];
    for(int j=0;j<pat.length();j++){
        count[pat.charAt(j)]++;
        count[txt.charAt(i+j)]--;
    }
    for(int j=0;j<CHAR;j++){
        if(count[j]!=0)return false;
    }
    return true;
    } 
    
    static boolean isPresent(String txt,String pat){
    int n=txt.length();
    int m=pat.length();
    for(int i=0;i<=n-m;i++){
        if(areAnagram(pat,txt,i))return true;
    }
    return false;
    }
    
    public static void main(String args[]) 
    { 
        String txt = "geeksforgeeks"; 
        String pat = "frog";  
        if (isPresent(txt, pat)) 
            System.out.println("Anagram search found"); 
        else
            System.out.println("Anagram search not found"); 
    } 
} 

### Efficient 

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
    static final int CHAR=256;
    static boolean areSame(int CT[],int CP[]){
    for(int i=0;i<CHAR;i++){
        if(CT[i]!=CP[i])return false;
    }
    return true;
    }
    
    static boolean isPresent(String txt,String pat){
    int[] CT=new int[CHAR];int[] CP=new int[CHAR];
    for(int i=0;i<pat.length();i++){
        CT[txt.charAt(i)]++;
        CP[pat.charAt(i)]++;
    }
    for(int i=pat.length();i<txt.length();i++){
        if(areSame(CT,CP))return true;
        CT[txt.charAt(i)]++;
        CT[txt.charAt(i-pat.length())]--;
    }
    return false;
    }
    
    public static void main(String args[]) 
    { 
        String txt = "geeksforgeeks"; 
        String pat = "frog";  
        if (isPresent(txt, pat)) 
            System.out.println("Anagram search found"); 
        else
            System.out.println("Anagram search not found"); 
    } 
} 

## Longest Substring with Distinct character

#### Navie

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
    static boolean areDistinct(String str, int i, int j) 
    { 
    
	boolean visited[]=new boolean[256]; 

	for (int k = i; k <= j; k++) { 
		if (visited[str.charAt(k)] == true) 
			return false; 
		visited[str.charAt(k)] = true; 
	} 
	return true; 
    } 

    static int longestDistinct(String str) 
    { 
	int n = str.length(); 
	int res = 0;
	for (int i = 0; i < n; i++) 
		for (int j = i; j < n; j++) 
			if (areDistinct(str, i, j)) 
				res = Math.max(res, j - i + 1); 
	return res; 
    } 
    
    public static void main(String args[]) 
    { 
        String str = "geeksforgeeks"; 
	    int len = longestDistinct(str);  
        System.out.print("The length of the longest distinct characters substring is "+ len); 
    } 
} 

### Better

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
    
    static int longestDistinct(String str) 
    { 
	int n = str.length(); 
	int res = 0;
	for (int i = 0; i < n; i++){
	    boolean visited[]=new boolean[256];
	    for(int j=i;j<n;j++){
	        if(visited[str.charAt(j)]==true){
	            break;
	        }
	        else{
	            res=Math.max(res,j-i+1);
	            visited[str.charAt(j)]=true;
	        }
	    }
	} 
	return res; 
    } 
    
    public static void main(String args[]) 
    { 
        String str = "geeksforgeeks"; 
	    int len = longestDistinct(str);  
        System.out.print("The length of the longest distinct characters substring is "+ len); 
    } 
} 

### Efficient

import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG { 
    
    static int longestDistinct(String str) 
    { 
	int n = str.length(); 
	int res = 0;
	int prev[]=new int[256];
	Arrays.fill(prev,-1);
	int i=0;
	for (int j = 0; j < n; j++){
	    i=Math.max(i,prev[str.charAt(j)]+1);
	    int maxEnd=j-i+1;
	    res=Math.max(res,maxEnd);
	    prev[str.charAt(j)]=j;
	} 
	return res; 
    } 
    
    public static void main(String args[]) 
    { 
        String str = "geeksforgeeks"; 
	    int len = longestDistinct(str);  
        System.out.print("The length of the longest distinct characters substring is "+ len); 
    } 
} 


