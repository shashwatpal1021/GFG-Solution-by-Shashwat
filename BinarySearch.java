public class BinarySearch {

   // Binary Search

   static int bSearch(int arr[], int n, int x) {
      int low = 0, high = n - 1;

      while (low <= high) {
         int mid = (low + high) / 2;

         if (arr[mid] == x)
            return mid;

         else if (arr[mid] > x)
            high = mid - 1;

         else
            low = mid + 1;
      }

      return -1;
   }

   // Binary Search Recursive

   static int bSearch(int arr[], int low, int high, int x) {
      if (low > high)
         return -1;

      int mid = (low + high) / 2;

      if (arr[mid] == x)
         return mid;

      else if (arr[mid] > x)
         return bSearch(arr, low, mid - 1, x);

      else
         return bSearch(arr, mid + 1, high, x);
   }

   // First occurrence in sorted

   // Naive

   static int firstOccurrence(int arr[], int n, int x) {
      for (int i = 0; i < n; i++)
         if (arr[i] == x)
            return i;

      return -1;
   }

   // Iterative

   static int firstOcc(int arr[], int n, int x) {
      int low = 0, high = n - 1;

      while (low <= high) {
         int mid = (low + high) / 2;

         if (x > arr[mid])
            low = mid + 1;

         else if (x < arr[mid])
            high = mid - 1;

         else {
            if (mid == 0 || arr[mid - 1] != arr[mid])
               return mid;

            else
               high = mid - 1;
         }

      }
      return -1;
   }

   // recursive 

   static int firstOcc(int arr[], int low, int high, int x) {
      if (low > high)
         return -1;

      int mid = (low + high) / 2;

      if (x > arr[mid])
         return firstOcc(arr, mid + 1, high, x);

      else if (x < arr[mid])
         return firstOcc(arr, low, mid - 1, x);

      else {
         if (mid == 0 || arr[mid - 1] != arr[mid])
            return mid;

         else
            return firstOcc(arr, low, mid - 1, x);
      }
   }

   // Last occurence in sorted

   static int lastOcc(int arr[], int n, int x) {
      int low = 0, high = n - 1;

      while (low <= high) {
         int mid = (low + high) / 2;

         if (x > arr[mid])
            low = mid + 1;

         else if (x < arr[mid])
            high = mid - 1;

         else {
            if (mid == n - 1 || arr[mid + 1] != arr[mid])
               return mid;

            else
               low = mid + 1;
         }

      }

      return -1;
   }

   // recursive

   static int lastOcc(int arr[], int low, int high, int x, int n) {
      if (low > high)
         return -1;

      int mid = (low + high) / 2;

      if (x > arr[mid])
         return lastOcc(arr, mid + 1, high, x, n);

      else if (x < arr[mid])
         return lastOcc(arr, low, mid - 1, x, n);

      else {
         if (mid == n - 1 || arr[mid + 1] != arr[mid])
            return mid;

         else
            return lastOcc(arr, mid + 1, high, x, n);
      }
   }

   // Count occurrence in sorted

   static int firstOcc(int arr[], int n, int x) {
      int low = 0, high = n - 1;

      while (low <= high) {
         int mid = (low + high) / 2;

         if (x > arr[mid])
            low = mid + 1;

         else if (x < arr[mid])
            high = mid - 1;

         else {
            if (mid == 0 || arr[mid - 1] != arr[mid])
               return mid;

            else
               high = mid - 1;
         }

      }

      return -1;
   }

   // Count 1s in a sorted Binary Array

   static int countOnes(int arr[], int n) {
      int low = 0, high = n - 1;

      while (low <= high) {
         int mid = (low + high) / 2;

         if (arr[mid] == 0)
            low = mid + 1;
         else {
            if (mid == 0 || arr[mid - 1] == 0)
               return (n - mid);
            else
               high = mid - 1;
         }
      }

      return 0;
   }

   // Square root

   // Naive

   static int sqRootFloor(int x) {
      int i = 1;

      while (i * i <= x)
         i++;

      return i - 1;
   }

   // Efficient

   static int sqRootFloor(int x) {
      int low = 1, high = x, ans = -1;

      while (low <= high) {
         int mid = (low + high) / 2;

         int mSq = mid * mid;

         if (mSq == x)
            return mid;
         else if (mSq > x)
            high = mid - 1;
         else {
            low = mid + 1;
            ans = mid;
         }
      }

      return ans;
   }

   // Search in infinite sized Array

   // Naive

   static int search(int arr[], int x) {
      int i = 0;

      while (true) {
         if (arr[i] == x)
            return i;

         if (arr[i] > x)
            return -1;

         i++;
      }
   }

   // Efficient

   static int bSearch(int arr[], int low, int high, int x) {
      if (low > high)
         return -1;

      int mid = (low + high) / 2;

      if (arr[mid] == x)
         return mid;

      else if (arr[mid] > x)
         return bSearch(arr, low, mid - 1, x);

      else
         return bSearch(arr, mid + 1, high, x);
   }

   static int search(int arr[], int x) {
      if (arr[0] == x)
         return 0;

      int i = 1;

      while (arr[i] < x)
         i = i * 2;

      if (arr[i] == x)
         return i;

      return bSearch(arr, i / 2 + 1, i - 1, x);
   }

   // Search in sorted rotated Array

   // Naive

   static int search(int arr[], int n, int x) {
      for (int i = 0; i < n; i++)
         if (arr[i] == x)
            return i;

      return -1;
   }

   // Efficient

   static int search(int arr[], int n, int x) {
      int low = 0, high = n - 1;

      while (low <= high) {
         int mid = (low + high) / 2;

         if (arr[mid] == x)
            return mid;
         if (arr[low] < arr[mid]) {
            if (x >= arr[low] && x < arr[mid])
               high = mid - 1;
            else
               low = mid + 1;
         } else {
            if (x > arr[mid] && x <= arr[high])
               low = mid + 1;
            else
               high = mid - 1;
         }
      }

      return -1;
   }

   // Find a Peak Element

   // Naive 

   static int getPeak(int arr[], int n) {
      if (n == 1)
         return arr[0];
      if (arr[0] >= arr[1])
         return arr[0];
      if (arr[n - 1] >= arr[n - 2])
         return arr[n - 1];

      for (int i = 1; i < n - 1; i++)
         if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
            return arr[i];

      return -1;
   }

   // Efficient

   static int getPeak(int arr[], int n) {
      int low = 0, high = n - 1;

      while (low <= high) {
         int mid = (low + high) / 2;

         if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
               (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;
         if (mid > 0 && arr[mid - 1] >= arr[mid])
            high = mid - 1;
         else
            low = mid + 1;
      }

      return -1;
   }

   // Two pointer approach

   // Find pair in unsorted array which gives sum x

   static void printpairs(int arr[], int sum) {
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
   public static void main(String[] args) {
      int A[] = { 1, 4, 45, 6, 10, 8 };
      int n = 16;
      printpairs(A, n);
   }

   // Find pair in sorted array which gives sum x

   static int isPresent(int arr[], int n, int sum) {
      int l = 0, h = n - 1;

      while (l <= h) {
         if (arr[l] + arr[h] == sum)
            return 1;
         else if (arr[l] + arr[h] > sum)
            h--;
         else
            l++;
      }

      return 0;
   }

   public static void main(String[] args) {
      int arr[] = new int[] { 2, 3, 7, 8, 11 };
      int n = arr.length;
      int sum = 14;

      System.out.println(isPresent(arr, n, sum));

   }

   // Find triplet in an Array which gives sum x

   boolean find3Numbers(int A[], int arr_size, int sum) {
      int l, r;

      /* Sort the elements */
      quickSort(A, 0, arr_size - 1);

      /*
       * Now fix the first element one by one and find the
       * other two elements
       */
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
            } else if (A[i] + A[l] + A[r] < sum)
               l++;

            else // A[i] + A[l] + A[r] > sum
               r--;
         }
      }

      // If we reach here, then no triplet was found
      return false;
   }

   int partition(int A[], int si, int ei) {
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

   /*
    * Implementation of Quick Sort
    * A[] --> Array to be sorted
    * si --> Starting index
    * ei --> Ending index
    */
   void quickSort(int A[], int si, int ei) {
      int pi;

      /* Partitioning index */
      if (si < ei) {
         pi = partition(A, si, ei);
         quickSort(A, si, pi - 1);
         quickSort(A, pi + 1, ei);
      }
   }

   // Driver program to test above functions
   public static void main(String[] args) {
      FindTriplet triplet = new FindTriplet();
      int A[] = { 1, 4, 45, 6, 10, 8 };
      int sum = 22;
      int arr_size = A.length;

      triplet.find3Numbers(A, arr_size, sum);
   }

   // Median of two sorted arrays

   static double getMed(int a1[], int a2[], int n1, int n2) {
      int begin1 = 0, end1 = n1;

      while (begin1 < end1) {
         int i1 = (begin1 + end1) / 2;
         int i2 = ((n1 + n2 + 1) / 2) - i1;

         int min1 = (i1 == n1) ? Integer.MAX_VALUE : a1[i1];
         int max1 = (i1 == 0) ? Integer.MIN_VALUE : a1[i1 - 1];

         int min2 = (i2 == n2) ? Integer.MAX_VALUE : a2[i2];
         int max2 = (i2 == 0) ? Integer.MIN_VALUE : a2[i2 - 1];

         if (max1 <= min2 && max2 <= min1) {
            if ((n1 + n2) % 2 == 0)
               return ((double) Math.max(max1, max2) + Math.min(min1, min2)) / 2;
            else
               return (double) Math.max(max1, max2);
         } else if (max1 > min2)
            end1 = i1 - 1;
         else
            begin1 = i1 + 1;
      }

      return -1;
   }

   public static void main(String args[]) {

      int a1[] = { 10, 20, 30, 40, 50 }, n1 = 5, a2[] = { 5, 15, 25, 35, 45 }, n2 = 5;

      System.out.println(getMed(a1, a2, n1, n2));

   }

   // Repeating elements

   static int repeat(int arr[], int n) {
      boolean visit[] = new boolean[n];

      for (int i = 0; i < n; i++) {
         if (visit[arr[i]])
            return arr[i];
         visit[arr[i]] = true;
      }

      return -1;
   }

   public static void main(String args[]) {

      int arr[] = { 0, 2, 1, 3, 2, 2 }, n = 6;

      System.out.println(repeat(arr, n));

   }

   // Repeating elements -2

   static int repeat(int arr[], int n) {
      int slow = arr[0], fast = arr[0];

      do {
         slow = arr[slow];
         fast = arr[arr[fast]];

      } while (slow != fast);

      slow = arr[0];

      while (slow != fast) {
         slow = arr[slow];
         fast = arr[fast];
      }
      return slow;
   }

   public static void main(String args[]) {

      int arr[] = { 1, 3, 2, 4, 6, 5, 7, 3 }, n = 8;

      System.out.println(repeat(arr, n));

   }

   // Allocate minimum number of pages

   public static void main(String args[]) {
      int arr[] = { 10, 20, 10, 30 };
      int n = arr.length;
      int k = 2;

      System.out.print(minPages(arr, n, k));
   }

   public static int sum(int arr[], int b, int e) {
      int s = 0;
      for (int i = b; i <= e; i++)
         s += arr[i];
      return s;
   }

   public static int minPages(int arr[], int n, int k) {
      if (k == 1)
         return sum(arr, 0, n - 1);
      if (n == 1)
         return arr[0];
      int res = Integer.MAX_VALUE;
      for (int i = 1; i < n; i++) {
         res = Math.min(res, Math.max(minPages(arr, i, k - 1), sum(arr, i, n - 1)));
      }
      return res;
   }

   // Allocate min num of pages with BS

   public static void main(String args[]) {
      int arr[] = { 10, 20, 10, 30 };
      int n = arr.length;
      int k = 2;

      System.out.print(minPages(arr, n, k));
   }

   public static boolean isFeasible(int arr[], int n, int k, int ans) {
      int req = 1, sum = 0;
      for (int i = 0; i < n; i++) {
         if (sum + arr[i] > ans) {
            req++;
            sum = arr[i];
         } else {
            sum += arr[i];
         }
      }
      return (req <= k);
   }

   public static int minPages(int arr[], int n, int k) {
      int sum = 0, mx = 0;
      for (int i = 0; i < n; i++) {
         sum += arr[i];
         mx = Math.max(mx, arr[i]);
      }
      int low = mx, high = sum, res = 0;

      while (low <= high) {
         int mid = (low + high) / 2;
         if (isFeasible(arr, n, k, mid)) {
            res = mid;
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return res;
   }
}
