public class ArraysInGFG {
   /*
   public static void main(String[] args) {

      // ArrayList Syntax

      ArrayList<Integer> al = new ArrayList<>();
      al.add(10);
      al.add(20);
      al.add(30);
      System.out.println(al);
   }
   */

   // insert 

   static int insert(int arr[], int n, int x, int cap, int pos) {
      if (n == cap)
         return n;

      int idx = pos - 1;

      for (int i = n - 1; i >= idx; i--) {
         arr[i + 1] = arr[i];
      }

      arr[idx] = x;

      return n + 1;
   }

   // search

   static int search(int arr[], int n, int x) {
      for (int i = 0; i < n; i++) {
         if (arr[i] == x)
            return i;
      }

      return -1;
   }

   // Delete

   static int deleteEle(int arr[], int n, int x) {
      int i = 0;

      for (i = 0; i < n; i++) {
         if (arr[i] == x)
            break;
      }

      if (i == n)
         return n;

      for (int j = i; j < n - 1; j++) {
         arr[j] = arr[j + 1];
      }

      return n - 1;
   }

   // Second Largest

   // Naive
/*
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
int largest = getlargest(a, n);
int res = -1;

for (int i = 0; i < n; i++) {
if (a[i] != a[largest]) {
   if (res == -1)
      res = i;
   else if (a[i] > a[res])
      res = i;
}
}
return res;
}

// Efficient solx for second largest

int secondlargest(int a[], int n) {
int largest = 0;
int res = -1;

for (int i = 1; i < n; i++) {
if (a[i] > a[largest]) {
   res = largest;
   largest = i;
} else if (a[i] != a[largest]) {
   if (res == -1 || a[i] > a[res])
      res = i;
}
}
return res;
}
*/

//check if an array is sorted

//Naive
   
static boolean isSorted(int arr[], int n) {
   for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
         if (arr[j] < arr[i])
            return false;
      }
   }

   return true;
}
// Efficient solx 

static boolean isSorted(int arr[], int n) {
   for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1])
         return false;
   }

   return true;
}

// Reverse in array

static void reverse(int arr[], int n) {
   int low = 0, high = n - 1;

   while (low < high) {
      int temp = arr[low];

      arr[low] = arr[high];

      arr[high] = temp;

      low++;
      high--;
   }
}

// Remove duplicates from a sorted array

//naive

static int remDups(int arr[], int n) {
   int temp[] = new int[n];

   temp[0] = arr[0];

   int res = 1;

   for (int i = 1; i < n; i++) {
      if (temp[res - 1] != arr[i]) {
         temp[res] = arr[i];
         res++;
      }
   }

   for (int i = 0; i < res; i++) {
      arr[i] = temp[i];
   }

   return res;
}

//Efficient

static int remDups(int arr[], int n) {
   int res = 1;

   for (int i = 1; i < n; i++) {
      if (arr[res - 1] != arr[i]) {
         arr[res] = arr[i];
         res++;
      }
   }

   return res;
}

// left rotate an array by one

static void lRotateOne(int arr[], int n) {
   int temp = arr[0];

   for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
   }

   arr[n - 1] = temp;
}

// left rotate an array by d 

//naive

static void lRotateOne(int arr[], int n) {
   int temp = arr[0];

   for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
   }

   arr[n - 1] = temp;
}

static void leftRotate(int arr[], int d, int n) {
   for (int i = 0; i < d; i++) {
      lRotateOne(arr, n);
   }
}

// efficient

static void leftRotate(int arr[], int d, int n) {
   int temp[] = new int[d];

   for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
   }

   for (int i = d; i < n; i++) {
      arr[i - d] = arr[i];
   }

   for (int i = 0; i < d; i++) {
      arr[n - d + i] = temp[i];
   }
}

// Reversal

static void leftRotate(int arr[], int d, int n) {
   reverse(arr, 0, d - 1);

   reverse(arr, d, n - 1);

   reverse(arr, 0, n - 1);

}

static void reverse(int arr[], int low, int high) {
   while (low < high) {
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;

      low++;
      high--;
   }
}

// Leader in an Array Problem

// Naive

static void leaders(int arr[], int n) {
   for (int i = 0; i < n; i++) {
      boolean flag = false;

      for (int j = i + 1; j < n; j++) {
         if (arr[i] <= arr[j]) {
            flag = true;
            break;
         }
      }

      if (flag == false) {
         System.out.print(arr[i] + " ");
      }
   }
}

// Efficient

static void leaders(int arr[], int n) {
   int curr_ldr = arr[n - 1];

   System.out.print(curr_ldr + " ");

   for (int i = n - 2; i >= 0; i--) {
      if (curr_ldr < arr[i]) {
         curr_ldr = arr[i];

         System.out.print(curr_ldr + " ");
      }
   }
}

// max Diff problem with order

//Naive

static int maxDiff(int arr[], int n) {
   int res = arr[1] - arr[0];

   for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
         res = Math.max(res, arr[j] - arr[i]);
      }
   }

   return res;
}

//Efficient

static int maxDiff(int arr[], int n) {
   int res = arr[1] - arr[0], minVal = arr[0];

   for (int i = 1; i < n; i++) {

      res = Math.max(res, arr[i] - minVal);

      minVal = Math.min(minVal, arr[i]);
   }

   return res;
}


// Frequencies in a sorted Array

static void printFreq(int arr[], int n) {
   int freq = 1, i = 1;

   while (i < n) {
      while (i < n && arr[i] == arr[i - 1]) {
         freq++;
         i++;
      }

      System.out.println(arr[i - 1] + " " + freq);

      i++;
      freq = 1;
   }
}

// Stock Buy and Sell Part 1

static int maxProfit(int price[], int start, int end) {
   if (end <= start)
      return 0;

   int profit = 0;

   for (int i = start; i < end; i++) {
      for (int j = i + 1; j <= end; j++) {
         if (price[j] > price[i]) {
            int curr_profit = price[j] - price[i]
                  + maxProfit(price, start, i - 1)
                  + maxProfit(price, j + 1, end);

            profit = Math.max(profit, curr_profit);
         }
      }
   }

   return profit;
}

// part 2

static int maxProfit(int price[], int n) {
   int profit = 0;

   for (int i = 1; i < n; i++) {
      if (price[i] > price[i - 1])
         profit += price[i] - price[i - 1];
   }

   return profit;
}

// Trapping Rain Water

// Naive

static int getWater(int arr[], int n) {
   int res = 0;

   for (int i = 1; i < n - 1; i++) {
      int lMax = arr[i];

      for (int j = 0; j < i; j++)
         lMax = Math.max(lMax, arr[j]);

      int rMax = arr[i];

      for (int j = i + 1; j < n; j++)
         rMax = Math.max(rMax, arr[j]);

      res = res + (Math.min(lMax, rMax) - arr[i]);
   }

   return res;
}

// Efficient

static int getWater(int arr[], int n) {
   int res = 0;

   int lMax[] = new int[n];
   int rMax[] = new int[n];

   lMax[0] = arr[0];
   for (int i = 1; i < n; i++)
      lMax[i] = Math.max(arr[i], lMax[i - 1]);

   rMax[n - 1] = arr[n - 1];
   for (int i = n - 2; i >= 0; i--)
      rMax[i] = Math.max(arr[i], rMax[i + 1]);

   for (int i = 1; i < n - 1; i++)
      res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);

   return res;
}

// Max consecutive 1s

// Naive

static int maxConsecutiveOnes(int arr[], int n) {
   int res = 0;

   for (int i = 0; i < n; i++) {
      int curr = 0;

      for (int j = i; j < n; j++) {
         if (arr[j] == 1)
            curr++;
         else
            break;
      }

      res = Math.max(res, curr);
   }

   return res;
}

// Efficient

static int maxConsecutiveOnes(int arr[], int n) {
   int res = 0, curr = 0;

   for (int i = 0; i < n; i++) {
      if (arr[i] == 0)
         curr = 0;
      else {
         curr++;

         res = Math.max(res, curr);
      }
   }

   return res;
}

// Max subarray sum

// Naive

static int maxSum(int arr[], int n) {
   int res = arr[0];

   for (int i = 0; i < n; i++) {
      int curr = 0;

      for (int j = i; j < n; j++) {
         curr = curr + arr[j];

         res = Math.max(res, curr);
      }
   }

   return res;
}

// Efficient

static int maxSum(int arr[], int n) {
   int res = arr[0];

   int maxEnding = arr[0];

   for (int i = 1; i < n; i++) {
      maxEnding = Math.max(maxEnding + arr[i], arr[i]);

      res = Math.max(maxEnding, res);
   }

   return res;
}

// Longest Even Odd Subarray

// Naive

static int maxEvenOdd(int arr[], int n) {
   int res = 1;

   for (int i = 0; i < n; i++) {
      int curr = 1;

      for (int j = i + 1; j < n; j++) {
         if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0)
               || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0))
            curr++;
         else
            break;
      }

      res = Math.max(res, curr);
   }

   return res;
}

// Efficient

static int maxEvenOdd(int arr[], int n) {
   int res = 1;
   int curr = 1;

   for (int i = 1; i < n; i++) {
      if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)
            || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
         curr++;

         res = Math.max(res, curr);
      } else
         curr = 1;
   }

   return res;
}

// max circular sum

// naive 

static int maxCircularSum(int arr[], int n) {
   int res = arr[0];

   for (int i = 0; i < n; i++) {
      int curr_max = arr[i];
      int curr_sum = arr[i];

      for (int j = 1; j < n; j++) {
         int index = (i + j) % n;

         curr_sum += arr[index];

         curr_max = Math.max(curr_max, curr_sum);
      }

      res = Math.max(res, curr_max);
   }
   return res;
}

// Efficient

static int normalMaxSum(int arr[], int n) {
   int res = arr[0];

   int maxEnding = arr[0];

   for (int i = 1; i < n; i++) {
      maxEnding = Math.max(maxEnding + arr[i], arr[i]);

      res = Math.max(maxEnding, res);
   }

   return res;
}

// Majority Element

//Naive

static int findMajority(int arr[], int n) {
   for (int i = 0; i < n; i++) {
      int count = 1;

      for (int j = i + 1; j < n; j++) {
         if (arr[i] == arr[j])
            count++;
      }

      if (count > n / 2)
         return i;
   }

   return -1;
}
 
// Efficient

static int findMajority(int arr[], int n)
{
   int res = 0, count = 1;

   for (int i = 1; i < n; i++) {
      if (arr[res] == arr[i])
         count++;
      else
         count--;

      if (count == 0) {
         res = i;
         count = 1;
      }
   }

   count = 0;

   for (int i = 0; i < n; i++)
      if (arr[res] == arr[i])
         count++;

   if (count <= n / 2)
      res = -1;

   return res;
}
    
// Minimum Consecutive flips

static void printGroups(int arr[], int n) {
   for (int i = 1; i < n; i++) {
      if (arr[i] != arr[i - 1]) {
         if (arr[i] != arr[0])
            System.out.print("From " + i + " to ");
         else
            System.out.println(i - 1);
      }
   }

   if (arr[n - 1] != arr[0])
      System.out.println(n - 1);
}

// Sliding Window technices

// Naive

static int maxSum(int arr[], int n, int k) {
   int max_sum = Integer.MIN_VALUE;
   for (int i = 0; i + k - 1 < n; i++) {
      int sum = 0;

      for (int j = 0; j < k; j++) {
         sum += arr[i + j];
      }

      max_sum = Math.max(max_sum, sum);
   }

   return max_sum;

}

// Efficient

static int maxSum(int arr[], int n, int k) {
   int curr_sum = 0;

   for (int i = 0; i < k; i++)
      curr_sum += arr[i];

   int max_sum = curr_sum;

   for (int i = k; i < n; i++) {
      curr_sum += (arr[i] - arr[i - k]);

      max_sum = Math.max(max_sum, curr_sum);
   }

   return max_sum;
}

// Find subarray with given sum

/*
 * Returns true if the there is a subarray of arr[] with sum equal to
 * 'sum' otherwise returns false. Also, prints the result
 */
int subArraySum(int arr[], int n, int sum) {
   int curr_sum = arr[0], start = 0, i;

   // Pick a starting point
   for (i = 1; i <= n; i++) {
      // If curr_sum exceeds the sum, then remove the starting elements
      while (curr_sum > sum && start < i - 1) {
         curr_sum = curr_sum - arr[start];
         start++;
      }

      // If curr_sum becomes equal to sum, then return true
      if (curr_sum == sum) {
         int p = i - 1;
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

public static void main(String[] args) {
   SubarraySum arraysum = new SubarraySum();
   int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
   int n = arr.length;
   int sum = 23;
   arraysum.subArraySum(arr, n, sum);
}

// N-Bonacci number

// Function to print bonacci series 
	static void bonacciseries(int n, int m) 
	{ 
	
		// Assuming m > n. 
		int a[] = new int[m]; 
		for(int i = 0; i < m; i++) 
			a[i] = 0; 
			
		a[n - 1] = 1; 
		a[n] = 1; 
	
		// Uses sliding window 
		for (int i = n + 1; i < m; i++) 
			a[i] = 2 * a[i - 1] - a[i - n - 1]; 
	
		// Printing result 
		for (int i = 0; i < m; i++) 
			System.out.print(a[i] + " "); 
	} 
	
	// Driver's Code 
	public static void main(String args[]) 
	{ 
		int N = 5, M = 15; 
		bonacciseries(N, M); 
	} 
} 

// Pefix Sum tech part-1

// 1.

static int[] preSum(int arr[], int n) {

   int prefix_sum[] = new int[n];

   prefix_sum[0] = arr[0];

   for (int i = 1; i < n; i++) {
      prefix_sum[i] = prefix_sum[i - 1] + arr[i];
   }

   return prefix_sum;
}

static int getSum(int prefix_sum[], int l, int r) {
   if (l != 0)
      return prefix_sum[r] - prefix_sum[l - 1];
   else
      return prefix_sum[r];
}

public static void main(String args[]) {
   int arr[] = { 2, 8, 3, 9, 6, 5, 4 }, n = 7;

   int prefix_sum[] = preSum(arr, n);

   System.out.println(getSum(prefix_sum, 1, 3));

   System.out.println(getSum(prefix_sum, 0, 2));

}

// 2. Equilibrium point Naive

static boolean checkEquilibrium(int arr[], int n) {
   for (int i = 0; i < n; i++) {
      int l_sum = 0, r_sum = 0;

      for (int j = 0; j < i; j++)
         l_sum += arr[j];

      for (int j = i + 1; j < n; j++)
         r_sum += arr[j];

      if (l_sum == r_sum)
         return true;
   }

   return false;
}

public static void main(String args[]) {
   int arr[] = { 3, 4, 8, -9, 20, 6 }, n = 6;

   System.out.println(checkEquilibrium(arr, n));

}

// 3. Equilibrium point Efficient

static boolean checkEquilibrium(int arr[], int n) {
   int sum = 0;

   for (int i = 0; i < n; i++) {
      sum += arr[i];
   }

   int l_sum = 0;

   for (int i = 0; i < n; i++) {
      if (l_sum == sum - arr[i])
         return true;

      l_sum += arr[i];

      sum -= arr[i];
   }

   return false;
}

public static void main(String args[]) {
   int arr[] = { 3, 4, 8, -9, 20, 6 }, n = 6;

   System.out.println(checkEquilibrium(arr, n));

}


// max occuring ele(prefix sum tech)

static int maxOcc(int L[], int R[], int n) {
   int arr[] = new int[1000];

   for (int i = 0; i < n; i++) {
      arr[L[i]]++;

      arr[R[i] + 1]--;
   }

   int maxm = arr[0], res = 0;

   for (int i = 1; i < 1000; i++) {
      arr[i] += arr[i - 1];

      if (maxm < arr[i]) {
         maxm = arr[i];

         res = i;
      }
   }

   return res;
}

public static void main(String args[]) {
   int L[] = { 1, 2, 3 }, R[] = { 3, 5, 7 }, n = 3;

   System.out.println(maxOcc(L, R, n));

}

}
